package com.example.springpatterns.factory;

import org.springframework.stereotype.Component;

/*
    Factory позволяет абстрагировать процесс создания объектов, делая код более гибким. Мы можем легко добавить новый
    способ оплаты, не изменяя основной код.
 */

@Component
public class PaymentServiceFactory {
    public PaymentService createPaymentService(String type) {
        return switch (type) {
            case "creditcard" -> new CreditCardPaymentService();
            case "paypal" -> new PaypalPaymentService();
            default -> throw new IllegalArgumentException("Unknown payment type");
        };
    }
}
