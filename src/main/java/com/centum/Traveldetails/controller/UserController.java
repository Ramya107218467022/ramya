package com.centum.Traveldetails.controller;

import com.centum.Traveldetails.entity.User;
import com.centum.Traveldetails.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Users")
public class UserController {

        @Autowired
        private UserRepository userRepository;

        @PostMapping("/saveuserdetails")
    public ResponseEntity<String>saveuserdetails(@RequestBody List<User> users){
            return ResponseEntity.ok("User details saved");

        }

        @GetMapping
        public List<User> findAllusers(){
            return userRepository.findAll();

        }

        // Get user by ID
        @GetMapping("/{id}")
        public ResponseEntity<User> getUserById(@PathVariable Long id) {
            Optional<User> optionalUser = userRepository.findById(id);
            return optionalUser.map(user -> new ResponseEntity<>(user, HttpStatus.OK))
                    .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }


    }

}
