package com.example.courseBooking.repositories.CourseRepository;

import com.example.courseBooking.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {

    List<Course> getCoursesByRating(double rating);
    List<Course> getCoursesByCustomer(Long id);


}
