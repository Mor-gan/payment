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

    static List<Payment> getAllPayments(String filepath) {
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

    public static void savePayment(Payment payment, String filePath) {
        try {
            File outputFileObj = Paths.get(filePath).toFile();
            if (!outputFileObj.exists()) {
                ObjectMapper objectMapper = new ObjectMapper();
                objectMapper.writeValue(outputFileObj, payment);
                System.out.println("Payment saved successfully to " + filePath);
            } else {
                System.out.println("File already exists: " + filePath);
            }
        } catch (IOException e) {
            System.err.println("Error saving payment: " + e.getMessage());
        }
    }

}