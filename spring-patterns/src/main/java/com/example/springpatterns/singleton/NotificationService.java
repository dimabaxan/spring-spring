package com.example.springpatterns.singleton;

import org.springframework.stereotype.Service;

/*
    Паттерн Singleton используется для создания единственного экземпляра класса в приложении. В Spring Boot, компоненты
    с аннотацией @Service, @Repository, @Component или @Bean по умолчанию создаются как Singleton. Это помогает
    сэкономить ресурсы и управлять состоянием в течение всего жизненного цикла приложения.

    Singleton обеспечивает то, что NotificationService будет существовать в единственном экземпляре, что полезно для
    сервисов, предоставляющих инфраструктурные функции, такие как отправка уведомлений. Это помогает сэкономить память
    и упрощает управление состоянием.
*/

@Service
public class NotificationService {
    public void sendNotification(String message) {
        // Логика отправки уведомления
    }
}
