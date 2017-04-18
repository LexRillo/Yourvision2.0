package com.hellokoding.account.repository;

import com.hellokoding.account.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>{
	Course findByName(String name);
}
