package com.example.courseBooking.components;


import com.example.courseBooking.models.Booking;
import com.example.courseBooking.models.Course;
import com.example.courseBooking.models.Customer;
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
        courseRepository.save(course1);

        Course course2 = new Course("CSS", "Berlin", 1);
        courseRepository.save(course2);


        Customer customer1 = new Customer("Adolf", "Austria", 92);
        customerRepository.save(customer1);


        Customer customer2 = new Customer("Stalin", "Russia", 10000);
        customerRepository.save(customer2);



        Booking booking1 = new Booking("14-02-1939", course1, customer1);
        bookingRepository.save(booking1);


        Booking booking2 = new Booking("14-02-1945", course2, customer1);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("14-02-1939", course1, customer2);
        bookingRepository.save(booking3);

    }


}
