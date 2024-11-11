package com.example.springpatterns.factory;

public class CreditCardPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        // Логика оплаты кредитной картой
    }
}