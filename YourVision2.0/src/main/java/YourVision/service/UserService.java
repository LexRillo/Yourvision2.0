package YourVision.service;

import YourVision.domain.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
