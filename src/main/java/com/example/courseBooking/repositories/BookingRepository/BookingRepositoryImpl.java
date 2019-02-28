package com.example.courseBooking.repositories.BookingRepository;

import com.example.courseBooking.models.Booking;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class BookingRepositoryImpl implements BookingRepositoryCustom{



    @Autowired
    EntityManager entityManager;


    @Transactional
    public List<Booking> getBookingsByDate(String date){
        List<Booking> result = null;

        Session session = entityManager.unwrap(Session.class);

        Criteria cr = session.createCriteria(Booking.class);

        cr.add(Restrictions.eq("date", date));
        result = cr.list();
        return result;

    }
}
