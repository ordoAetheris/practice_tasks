package com.practice.task33_lru_cache;

/**
 * LRU — ВАРИАНТ D: BOUNDED-EDGE
 *
 * <p>CORE = базовый {@link LRUCache}.</p>
 *
 * <p><b>ВАРИАНТ D — edge/null-safety [prim: null-edge ⭐]:</b></p>
 * <ul>
 *   <li>capacity == 0 (ничего не хранит), capacity == 1 (каждый put вытесняет предыдущий).</li>
 *   <li>put существующего ключа (обновление значения + recency, размер не растёт), null-ключ/значение — правило.</li>
 *   <li>Проверка: границы ёмкости; повторный put не раздувает размер; эвикция ровно самого старого.</li>
 * </ul>
 */
public class LRUCacheD<K, V> {

    public LRUCacheD(int capacity) {
        throw new UnsupportedOperationException("TODO: variant D — handle capacity 0/1, update edge");
    }

    public void put(K key, V value) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        System.out.println("=== LRUCacheD (bounded-edge): Smoke ===");
    }
}
