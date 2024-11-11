package com.example.springpatterns.builder;
/*
    Паттерн Builder полезен, когда нужно создать сложный объект с множеством параметров. В Spring Boot можно
    использовать этот паттерн при конфигурации сервисов или моделей с большим количеством опциональных параметров.

    Этот паттерн особенно полезен для объектов с множеством опциональных параметров. Использование Builder улучшает
    читаемость кода и позволяет легко управлять большим количеством параметров, предотвращая перегруженные конструкторы.
 */
public class User {
    private String name;
    private String email;
    private String phoneNumber;

    private User(UserBuilder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
    }

    public static class UserBuilder {
        private String name;
        private String email;
        private String phoneNumber;

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
