package com.example.springpatterns.factory;

public class PaypalPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        // Логика оплаты через PayPal
    }
}
