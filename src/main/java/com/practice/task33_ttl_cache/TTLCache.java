package com.practice.task33_ttl_cache;

import java.util.*;

/**
 * KEY-VALUE STORE С TTL (TIME TO LIVE)
 *
 * <p>Реализуйте кэш, в котором каждый элемент имеет ограниченное время жизни (TTL).
 * После истечения TTL элемент считается невалидным и не возвращается при запросе.</p>
 *
 * <p>Стратегии удаления истёкших элементов:</p>
 * <ul>
 *   <li>Lazy eviction — проверка при get(), если элемент истёк — удалить и вернуть null</li>
 *   <li>Active eviction — метод cleanup() удаляет все истёкшие элементы</li>
 * </ul>
 *
 * <p>Операции:</p>
 * <ul>
 *   <li>put(key, value, ttlMillis) — сохранить значение с указанным TTL в миллисекундах</li>
 *   <li>get(key) — получить значение (null если истёк или не существует)</li>
 *   <li>remove(key) — удалить элемент</li>
 *   <li>size() — количество НЕ истёкших элементов</li>
 *   <li>cleanup() — удалить все истёкшие элементы</li>
 * </ul>
 *
 * <p>Бизнес-правила:</p>
 * <ul>
 *   <li>TTL должен быть положительным</li>
 *   <li>put с существующим ключом обновляет и значение, и TTL</li>
 *   <li>Время отсчитывается от момента put (System.currentTimeMillis или System.nanoTime)</li>
 * </ul>
 *
 * <p>Уровень: Средний</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task33_ttl_cache/TTLCache.java
 * java -cp src/main/java com.practice.task33_ttl_cache.TTLCache
 * </pre>
 */
public class TTLCache<K, V> {

    // TODO: реализовать внутреннюю структуру для хранения значения и времени истечения
    // private static class Entry<V> { V value; long expiresAt; }

    /**
     * Сохраняет значение с указанным временем жизни.
     *
     * @param key       ключ
     * @param value     значение
     * @param ttlMillis время жизни в миллисекундах
     * @throws IllegalArgumentException если ttlMillis <= 0
     */
    public void put(K key, V value, long ttlMillis) {
        // TODO: implement
    }

    /**
     * Возвращает значение по ключу. Если элемент истёк — удаляет его и возвращает null.
     * (Lazy eviction)
     *
     * @param key ключ
     * @return значение или null если не найден или истёк
     */
    public V get(K key) {
        // TODO: implement
        return null;
    }

    /**
     * Удаляет элемент по ключу.
     *
     * @param key ключ
     * @return true если элемент был удалён
     */
    public boolean remove(K key) {
        // TODO: implement
        return false;
    }

    /**
     * Возвращает количество НЕ истёкших элементов.
     *
     * @return количество валидных элементов
     */
    public int size() {
        // TODO: implement
        return 0;
    }

    /**
     * Удаляет все истёкшие элементы из кэша. (Active eviction)
     *
     * @return количество удалённых элементов
     */
    public int cleanup() {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("=== TTLCache: Smoke Test ===");
        // TODO: создать тестовые данные и проверить основные сценарии
    }
}
