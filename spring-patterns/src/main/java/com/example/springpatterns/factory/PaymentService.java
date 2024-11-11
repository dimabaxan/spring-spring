package com.example.springpatterns.factory;

/*
    Паттерн Factory используется для создания объектов, когда конкретный тип создаваемого объекта зависит от условий.
    В Spring Boot это полезно при работе с зависимостями, которые могут варьироваться в зависимости от профиля или
    конфигурации.
 */
public interface PaymentService {
    void processPayment(double amount);
}
