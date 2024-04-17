package com.payment.payment.listofpayment;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.payment.payment.Payment;
import com.payment.payment.PaymentServces;
import com.payment.payment.filehandler.InsufficientBalanceException;

@Service
public class CardPayment extends PaymentServces {

    private List<Payment> payments = new ArrayList<>();
     
    public List<Payment> getAllPayments() {
        return payments;
    }

    public Payment processPayment(Payment createPayment) throws InsufficientBalanceException {
        BigDecimal paymentAmount = createPayment.getAmount();
        BigDecimal cardBalance = createPayment.getBalance();
        if (cardBalance.compareTo(paymentAmount) >= 0) {
            payments.add(createPayment);
        } else {
            throw new InsufficientBalanceException("Insufficient Payment amount");
        }
        return createPayment; // Return the created Payment on success
    }

}

