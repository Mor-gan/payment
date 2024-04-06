package com.payment.payment;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PaymentApplicationTests {

	@Test
	public void testGetAllPayments() {
		List<Payment> payments = PaymentServces.getAllPayments(PaymentServces.filePath);

        assertNotNull(payments);
        assertFalse(payments.isEmpty());

    }
    }
   

