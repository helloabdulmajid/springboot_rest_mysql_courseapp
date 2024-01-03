package in.abdulmajid.service;

import java.util.List;

import in.abdulmajid.entity.Course;


public interface CourseService {
	
  public String upsert(Course course);
  
  public Course getById(Integer cid);
  
  List<Course> getAllCourses();
  
  public String deleteById(Integer cid);
}
