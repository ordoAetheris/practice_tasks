package com.practice.task31_lru_cache;

import java.util.*;

/**
 * LRU КЭШ (LEAST RECENTLY USED)
 *
 * <p>Реализуйте LRU кэш фиксированного размера. При превышении ёмкости (capacity)
 * вытесняется наименее недавно использованный элемент. Операция get() обновляет
 * порядок использования (элемент становится самым недавно использованным).</p>
 *
 * <p>ВАЖНО: Реализовать НЕ используя LinkedHashMap. Необходимо использовать
 * собственную структуру данных: HashMap + двусвязный список (doubly linked list).</p>
 *
 * <p>Операции:</p>
 * <ul>
 *   <li>get(key) — получить значение по ключу, обновить порядок использования</li>
 *   <li>put(key, value) — добавить или обновить значение, при переполнении вытеснить LRU</li>
 *   <li>remove(key) — удалить элемент</li>
 *   <li>size() — текущий размер кэша</li>
 *   <li>clear() — очистить кэш</li>
 * </ul>
 *
 * <p>Требования к сложности:</p>
 * <ul>
 *   <li>get — O(1)</li>
 *   <li>put — O(1)</li>
 *   <li>remove — O(1)</li>
 * </ul>
 *
 * <p>Уровень: Средний</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task31_lru_cache/LRUCache.java
 * java -cp src/main/java com.practice.task31_lru_cache.LRUCache
 * </pre>
 */
public class LRUCache<K, V> {

    // TODO: реализовать внутренний класс Node для двусвязного списка
    // private static class Node<K, V> { ... }

    // TODO: реализовать поля:
    // - HashMap<K, Node<K, V>> для быстрого доступа по ключу
    // - head и tail — фиктивные узлы двусвязного списка
    // - capacity — максимальная ёмкость

    /**
     * Создаёт LRU кэш с указанной ёмкостью.
     *
     * @param capacity максимальное количество элементов
     * @throws IllegalArgumentException если capacity <= 0
     */
    public LRUCache(int capacity) {
        // TODO: implement
    }

    /**
     * Возвращает значение по ключу и обновляет порядок использования.
     * Элемент перемещается в начало списка (самый недавно использованный).
     *
     * @param key ключ
     * @return значение или null если ключ не найден
     */
    public V get(K key) {
        // TODO: implement
        return null;
    }

    /**
     * Добавляет или обновляет элемент в кэше.
     * Если кэш полон — вытесняет наименее недавно использованный элемент (tail).
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
     * @return количество элементов в кэше
     */
    public int size() {
        // TODO: implement
        return 0;
    }

    /**
     * Очищает кэш полностью.
     */
    public void clear() {
        // TODO: implement
    }

    public static void main(String[] args) {
        System.out.println("=== LRUCache: Smoke Test ===");
        // TODO: создать тестовые данные и проверить основные сценарии
    }
}
