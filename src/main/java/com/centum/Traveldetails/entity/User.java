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
@NoArgsConstructor @AllArgsConstructor @Data @Table(name="Userdetails")
public class User {
    @Id
    public long Userid;
    public String username;
    public String useremail;
    public String usermobile;
    public String useraddress;
    @OneToMany(mappedBy = "User")
    private List<Booking> bookings;

}
