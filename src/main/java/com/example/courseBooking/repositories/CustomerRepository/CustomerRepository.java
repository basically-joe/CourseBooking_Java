package com.example.courseBooking.repositories.CustomerRepository;

import com.example.courseBooking.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom{


    public List<Customer> getCustomerForCourseId(Long id);
}
