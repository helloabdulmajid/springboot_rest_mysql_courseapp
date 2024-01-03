package in.abdulmajid.repo;



import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.abdulmajid.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Serializable>{
	

 }
