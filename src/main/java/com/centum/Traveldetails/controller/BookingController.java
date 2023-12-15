package com.centum.Traveldetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Bookings")
public class BookingController {
    @Autowired
    private BookingController booking;
}
