package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{

}
