package com.payment.payment;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public interface PaymentServces {

    String filePath = "/Users/bimbo/Documents/payment/src/main/resources/paymentdetails.json";

     static List<Payment> getAllPayments(String filePath) {
        List<Payment> payments = new ArrayList<>();
        try {
            File sourceFile = Paths.get(filePath).toFile();
            ObjectMapper objectMapper = new ObjectMapper();
            payments = Arrays.asList(objectMapper.readValue(sourceFile, Payment[].class));
            payments.forEach(System.out::println);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } 
        return payments;

   } 

}
