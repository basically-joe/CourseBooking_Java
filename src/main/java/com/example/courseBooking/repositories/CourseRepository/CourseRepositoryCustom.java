package com.example.courseBooking.repositories.CourseRepository;

import com.example.courseBooking.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> getCoursesByCustomer(Long id);

}
