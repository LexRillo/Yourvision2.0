package YourVision.co2015.account.web;

import YourVision.co2015.account.model.Course;
import YourVision.co2015.account.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseRepository courserepo;

    @RequestMapping(value = "/createCourse", method = RequestMethod.GET)
    public String createCourse(Model model) {
        return "newcourse";
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String productMaster(@ModelAttribute("course") Course course, Model model) {
	    courserepo.save(course);
	    return "profile";
    }

    @RequestMapping(value = {"/", "/profile"}, method = RequestMethod.GET)
    public String profile(Model model) {
        return "profile";
    }
}
