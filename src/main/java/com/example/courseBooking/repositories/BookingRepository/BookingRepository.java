package com.example.courseBooking.repositories.BookingRepository;

import com.example.courseBooking.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {
}
