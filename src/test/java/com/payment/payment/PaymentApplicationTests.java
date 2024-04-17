package com.payment.payment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.payment.payment.filehandler.InsufficientBalanceException;
import com.payment.payment.listofpayment.CardPayment;

@SpringBootTest
class PaymentApplicationTests {

	// @Test
	// public void testGetAllPayments() {
	// 	List<Payment> payments = PaymentServces.getAllPayments();
	// 	assertNotNull(payments);
	// 	assertFalse(payments.isEmpty());
	// }
}
	//   @Test
    // void testProcessPaymentWithSufficientBalance() {

    //     BigDecimal initialBalance = BigDecimal.valueOf(500.0);
    //     Payment createPayment = new Payment(BigDecimal.valueOf(50.0), initialBalance, null, null, "999");
    //     try {
    //         Payment result = CardPayment.processPayment(createPayment);
    //         assertNotNull(result);
    //         assertEquals(createPayment, result);
    //         assertTrue(CardPayment.getAllPayments().contains(result));
    //     } catch (InsufficientBalanceException e) {
    //         fail("Unexpected InsufficientBalanceException");
    //     }
    // }

