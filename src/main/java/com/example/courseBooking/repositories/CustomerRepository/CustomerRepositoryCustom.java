package com.example.courseBooking.repositories.CustomerRepository;

import com.example.courseBooking.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    public List<Customer> getCustomerForCourseId(Long id);
}
