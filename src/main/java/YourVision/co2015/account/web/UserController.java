package YourVision.co2015.account.web;

import YourVision.co2015.account.model.User;
import YourVision.co2015.account.service.SecurityService;
import YourVision.co2015.account.service.UserService;
import YourVision.co2015.account.validator.UserValidator;
import YourVision.co2015.account.model.GoogleAuth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;
    
    private GoogleAuth totp;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
    	User user = new User();
    	
        model.addAttribute("userForm", user);
        
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }
        
        userForm.setfaCode(totp.getRandomSecretKey());
        userService.save(userForm);

        securityService.autologin(userForm.getUsername(), userForm.getPasswordConfirm());

        return "redirect:/favalidation";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }

    @RequestMapping(value = {"/", "/favalidation"}, method = RequestMethod.GET)
    public String favalidation(Model model) {
       	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	String name = auth.getName();    	
    	String facode = userService.findByUsername(name).getfaCode();
    	
    	model.addAttribute("qrcode", totp.getGoogleAuthenticatorBarCode(facode, name));
        return "favalidation";
    }
    
    @RequestMapping(value = "/favalidation", method = RequestMethod.POST)
    public String favalidation(@ModelAttribute("code") String code, Model model) {
    	code = code.replace(" ", "");
    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	String name = auth.getName();    	
    	String facode = userService.findByUsername(name).getfaCode();
        if (!code.equals(totp.getTOTPCode(facode))) {
        	model.addAttribute("wrongvalidation", "Wrong code. Try again");
            return "favalidation";
        }
        
        return "redirect:/profile";
    }
    
    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String profile(Model model) {
        return "profile";
    }
    
//    @RequestMapping(value = "/")
//    public String index() {
//        return "index";
//    }
}
