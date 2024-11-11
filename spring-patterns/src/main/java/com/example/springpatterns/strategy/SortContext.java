package com.example.springpatterns.strategy;

import java.util.List;

/*
    Strategy позволяет динамически выбирать или изменять алгоритмы в зависимости от условий. В данном примере можно
    изменить стратегию сортировки в зависимости от размера списка или других факторов, что делает код гибким и легко
    расширяемым.
 */
public class SortContext {
    private SortStrategy strategy;

    public SortContext(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(List<Integer> numbers) {
        strategy.sort(numbers);
    }
}
