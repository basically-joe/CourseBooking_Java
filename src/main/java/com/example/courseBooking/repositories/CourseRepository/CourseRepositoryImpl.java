package com.example.courseBooking.repositories.CourseRepository;

import com.example.courseBooking.models.Course;
import com.example.courseBooking.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CourseRepositoryImpl implements CourseRepositoryCustom{


    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Course> getCoursesByCustomer(Long id){

        List<Course> result = null;

        Session session = entityManager.unwrap(Session.class);

        Criteria cr = session.createCriteria(Course.class);

        cr.createAlias("bookings", "bookingsAlias");
        cr.add(Restrictions.eq("bookingsAlias.customer.id", id ));

        result = cr.list();


        return result;


    }

}
