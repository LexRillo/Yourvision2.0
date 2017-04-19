package YourVision.co2015.account.repository;

import YourVision.co2015.account.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>{
	Course findByName(String name);
}
