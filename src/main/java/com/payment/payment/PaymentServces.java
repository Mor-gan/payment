package com.payment.payment;

import java.util.List;
import java.util.UUID;

public interface PaymentServces {

     static List<Payment> getAllPayments() {
      return null;
   } 
   static boolean cancelPayment(UUID id) {
      return true;

   }
}
