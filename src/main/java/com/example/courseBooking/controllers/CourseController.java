package com.example.courseBooking.controllers;

import com.example.courseBooking.models.Course;
import com.example.courseBooking.repositories.CourseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;


    @GetMapping
    public List<Course> getAllCoures(){
        return courseRepository.findAll();
    }



    @GetMapping(value = "/rating/{rating}")
    public List<Course> getCoursesByRating(@PathVariable double rating){
        return courseRepository.getCoursesByRating(rating);
    }

}
