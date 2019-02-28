package com.example.courseBooking.repositories.BookingRepository;

import com.example.courseBooking.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {

    public List<Booking> getBookingsByDate(String date);

}
