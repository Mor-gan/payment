package com.payment.payment;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
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


    public static void save(Payment payments, String outputFile) {

        try {
            File outputFileObj = Paths.get(outputFile).toFile();
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(outputFileObj, payments);
            System.out.println("Employee saved successfully to " + outputFile);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

}
