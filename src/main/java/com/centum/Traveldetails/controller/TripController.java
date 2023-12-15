package com.centum.Traveldetails.controller;

import com.centum.Traveldetails.entity.Trip;
import com.centum.Traveldetails.entity.User;
import com.centum.Traveldetails.repository.TripRepository;
import com.centum.Traveldetails.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/trip")
public class TripController {
    @Autowired
    private Trip trip;

    @PostMapping("/savetripdetails")
    public ResponseEntity<String> saveuserdetails(@RequestBody List<Trip> trips){
        return ResponseEntity.ok("trip details saved");

    }

    @GetMapping
    public List<Trip> findAlltrips(){
        return TripRepository.findAll();

    }

    // Get user by ID
    @GetMapping("/{id}")
    public ResponseEntity<Trip> gettripById(@PathVariable Long id) {
        Optional<Trip> optionalTrip = TripRepository.findById(id);
        return optionalTrip.map(user -> new ResponseEntity<>(user, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


}

}
}
