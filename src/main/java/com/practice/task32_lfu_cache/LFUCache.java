package com.practice.task32_lfu_cache;

import java.util.*;

/**
 * LFU КЭШ (LEAST FREQUENTLY USED)
 *
 * <p>Реализуйте LFU кэш фиксированного размера. При превышении ёмкости вытесняется
 * наименее часто используемый элемент. При одинаковой частоте использования —
 * вытесняется наименее недавно использованный (LRU как tiebreaker).</p>
 *
 * <p>Каждая операция get() и put() (для существующего ключа) увеличивает счётчик
 * частоты использования на 1.</p>
 *
 * <p>Операции:</p>
 * <ul>
 *   <li>get(key) — получить значение, увеличить частоту</li>
 *   <li>put(key, value) — добавить/обновить, при переполнении вытеснить LFU</li>
 *   <li>remove(key) — удалить элемент</li>
 *   <li>size() — текущий размер</li>
 * </ul>
 *
 * <p>Требования к сложности: все операции за O(1).</p>
 *
 * <p>Подсказка по структуре данных:</p>
 * <ul>
 *   <li>HashMap key -> Node (значение + частота)</li>
 *   <li>HashMap frequency -> LinkedHashSet/DoublyLinkedList ключей с этой частотой</li>
 *   <li>Переменная minFrequency для быстрого нахождения LFU-элемента</li>
 * </ul>
 *
 * <p>Уровень: Средний</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task32_lfu_cache/LFUCache.java
 * java -cp src/main/java com.practice.task32_lfu_cache.LFUCache
 * </pre>
 */
public class LFUCache<K, V> {

    // TODO: реализовать внутренние структуры данных
    // - Map<K, V> values — значения по ключу
    // - Map<K, Integer> frequencies — частота по ключу
    // - Map<Integer, LinkedHashSet<K>> frequencyBuckets — ключи по частоте
    // - int minFrequency — текущая минимальная частота

    /**
     * Создаёт LFU кэш с указанной ёмкостью.
     *
     * @param capacity максимальное количество элементов
     * @throws IllegalArgumentException если capacity <= 0
     */
    public LFUCache(int capacity) {
        // TODO: implement
    }

    /**
     * Возвращает значение по ключу и увеличивает счётчик частоты использования.
     *
     * @param key ключ
     * @return значение или null если ключ не найден
     */
    public V get(K key) {
        // TODO: implement
        return null;
    }

    /**
     * Добавляет или обновляет элемент.
     * При переполнении вытесняет элемент с минимальной частотой.
     * При одинаковой частоте — наименее недавно использованный.
     *
     * @param key   ключ
     * @param value значение
     */
    public void put(K key, V value) {
        // TODO: implement
    }

    /**
     * Удаляет элемент из кэша.
     *
     * @param key ключ
     * @return true если элемент был удалён
     */
    public boolean remove(K key) {
        // TODO: implement
        return false;
    }

    /**
     * Возвращает текущий размер кэша.
     *
     * @return количество элементов
     */
    public int size() {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("=== LFUCache: Smoke Test ===");
        // TODO: создать тестовые данные и проверить основные сценарии
    }
}
