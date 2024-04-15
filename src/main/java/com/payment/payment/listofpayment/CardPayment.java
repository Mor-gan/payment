package com.payment.payment.listofpayment;

import java.util.ArrayList;
import java.util.List;
import com.payment.payment.Payment;
import com.payment.payment.PaymentServces;

public class CardPayment implements PaymentServces {

    private List<Payment> payments = new ArrayList<>();

    @Override
    public List<Payment> getAllPayments() {
        return payments;
    }
}
