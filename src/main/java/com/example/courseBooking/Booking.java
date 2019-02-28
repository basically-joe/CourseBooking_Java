package com.example.courseBooking;


import javax.persistence.*;

@Entity
@Table(name = "bookings" )
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String date;


    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;


    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;


    public Booking(String date, Course course, Customer customer) {
        this.date = date;
        this.course = course;
        this.customer = customer;
    }


}
