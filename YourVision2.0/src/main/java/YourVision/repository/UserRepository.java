package YourVision.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import YourVision.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
