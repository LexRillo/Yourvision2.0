package YourVision.co2015.account.service;

import YourVision.co2015.account.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
