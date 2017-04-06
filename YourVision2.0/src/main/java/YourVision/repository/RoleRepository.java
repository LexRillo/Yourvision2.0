package YourVision.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import YourVision.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
