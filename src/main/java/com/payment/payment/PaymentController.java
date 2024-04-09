package com.payment.payment;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @GetMapping()
    public ResponseEntity<List<Payment>> getAllPayments() {
        List<Payment> payments = PaymentServces.getAllPayments(PaymentServces.filePath);
        return new ResponseEntity<>(payments, HttpStatus.OK);
    }
}