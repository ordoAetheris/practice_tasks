package com.practice.task79_bloom_filter;

/**
 * Bloom Filter.
 *
 * <p>Реализовать вероятностную структуру данных Bloom Filter.
 * false = точно нет, true = возможно есть.
 * Реализовать собственные хеш-функции (double hashing).
 * Не использовать Guava или другие готовые реализации.</p>
 *
 * <p>Уровень: Продвинутый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task79_bloom_filter/BloomFilter.java
 * java -cp src/main/java com.practice.task79_bloom_filter.BloomFilter
 * </pre>
 */
public class BloomFilter<T> {

    /**
     * Создать Bloom Filter
     * @param expectedInsertions ожидаемое количество элементов
     * @param falsePositiveRate допустимая вероятность ложного срабатывания (0..1)
     */
    public BloomFilter(int expectedInsertions, double falsePositiveRate) {
        //TODO implement — рассчитать оптимальное количество бит и хеш-функций
    }

    /** Добавить элемент */
    public void add(T element) {
        //TODO implement
    }

    /**
     * Проверить наличие элемента
     * @return false — точно нет, true — возможно есть
     */
    public boolean mightContain(T element) {
        //TODO implement
        return false;
    }

    /** Текущая оценка вероятности ложного срабатывания */
    public double expectedFalsePositiveRate() {
        //TODO implement
        return 0;
    }

    /** Количество добавленных элементов */
    public int size() {
        //TODO implement
        return 0;
    }

    /** Очистить фильтр */
    public void clear() {
        //TODO implement
    }

    public static void main(String[] args) {
        System.out.println("=== BloomFilter: Smoke Test ===");
        // TODO: создать фильтр, добавить элементы, проверить
    }
}
