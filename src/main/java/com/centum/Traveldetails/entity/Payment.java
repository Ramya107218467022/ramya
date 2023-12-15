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

public class Payment {
    @Id
    public long bookingid;
    public double amount;
    public String modeofpayment;
    public String paymentstatus; //payment failed or successfull
    @OneToOne
    @JoinColumn(name = "booking_details_id")
    private Booking bookingDetails;
}
