package com.example.courseBooking.components;


import com.example.courseBooking.models.Course;
import com.example.courseBooking.repositories.BookingRepository.BookingRepository;
import com.example.courseBooking.repositories.CourseRepository.CourseRepository;
import com.example.courseBooking.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {


    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;



    public DataLoader() {

    }

    @Override
    public void run(ApplicationArguments args) {


        Course course1 = new Course("Html", "Edinburgh", 3);
        courseRepository

    }


}
