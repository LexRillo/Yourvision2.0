package YourVision.co2015.account.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
