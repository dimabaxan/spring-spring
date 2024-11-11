package com.example.springpatterns.strategy;

import java.util.List;

/*
    Паттерн Strategy используется, чтобы определить семейство алгоритмов и инкапсулировать каждый из них, что позволяет
    заменять алгоритмы независимо. В Spring Boot Strategy паттерн может быть полезен для выбора различных вариантов
    поведения, таких как методы аутентификации или логгирования.
 */
public interface SortStrategy {
    void sort(List<Integer> numbers);
}
