package com.centum.Traveldetails.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="Userdetails")

public class Trip {
    @Id
    public Long tripid;
    public String destination;
    public String date;
    public String durationdays;
    public double price;
    @OneToMany(mappedBy = "tripDetails")
    private List<Booking> bookingDetails;


}
