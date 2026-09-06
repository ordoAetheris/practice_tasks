package com.practice.task34_lfu_cache;

/**
 * LFU — ВАРИАНТ E: BOUNDED-EDGE
 *
 * <p>CORE = базовый {@link LFUCache}.</p>
 *
 * <p><b>ВАРИАНТ E — edge/null-safety [prim: null-edge ⭐]:</b></p>
 * <ul>
 *   <li>capacity 0/1; put существующего ключа (обновить значение + инкремент freq, размер не растёт).</li>
 *   <li>Эвикция при первом же переполнении; корректный minFreq после удалений.</li>
 *   <li>Проверка: границы ёмкости; повторный put не раздувает размер; правильный кандидат на вытеснение.</li>
 * </ul>
 */
public class LFUCacheE<K, V> {

    public LFUCacheE(int capacity) {
        throw new UnsupportedOperationException("TODO: variant E — capacity 0/1, update edge, minFreq");
    }

    public void put(K key, V value) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        System.out.println("=== LFUCacheE (bounded-edge): Smoke ===");
    }
}
