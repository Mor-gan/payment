package com.payment.payment.filehandler;

    public class InsufficientBalanceException extends RuntimeException {

        public InsufficientBalanceException(String message) {
            super(message);
        }
}
