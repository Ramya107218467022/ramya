package com.centum.Traveldetails.controller;

import com.centum.Traveldetails.entity.Payment;
import com.centum.Traveldetails.entity.User;
import com.centum.Traveldetails.repository.PaymentRepository;
import com.centum.Traveldetails.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/payment")

public class PaymentController {
    @Autowired
    private PaymentController payment;


    @PostMapping("/savepaymentdetails")
    public ResponseEntity<String> savepaymentdetails(@RequestBody List<Payment> payments){
        return ResponseEntity.ok("Payment details saved");

    }

    @GetMapping
    public List<Payment> findAllPayments(){
        return PaymentRepository.findAll();

    }

    // Get user by ID
    @GetMapping("/{id}")
    public ResponseEntity<Payment> getPaymentById(@PathVariable Long id) {
        Optional<Payment> optionalPayment = PaymentRepository.findById(id);
        return optionalPayment.map(payment -> new ResponseEntity<>(payment, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


}

}
}
