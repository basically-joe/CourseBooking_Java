package com.example.courseBooking.controllers;


import com.example.courseBooking.models.Course;
import com.example.courseBooking.models.Customer;
import com.example.courseBooking.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;


    @GetMapping
    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }



    @GetMapping(value= "/course/{id}")
    public List<Customer> getAllCustomersForAGivenCourse(@PathVariable Long id){
        return customerRepository.getCustomerForCourseId(id);
    }


}
