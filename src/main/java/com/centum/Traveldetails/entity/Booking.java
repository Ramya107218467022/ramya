package com.centum.Traveldetails.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="Userdetails")
public class Booking {
    @Id
    public long bookingid;
    public String destination, from, date, time;
    public String travellingmode;
    public int noofbookings;
    public double price;
    @ManyToOne
    private User user;
    @ManyToOne
    private Trip tripDetails;
    @OneToOne(mappedBy = "bookingDetails")
    private Payment paymentDetails;


}
