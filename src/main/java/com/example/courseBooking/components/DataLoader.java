package com.example.courseBooking.components;


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

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }

    public DataLoader() {



    }


}
