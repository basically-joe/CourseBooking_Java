package com.example.courseBooking.repositories.CustomerRepository;

import com.example.courseBooking.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom{
}
