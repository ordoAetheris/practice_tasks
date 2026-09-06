package com.practice.task33_lru_cache;

/**
 * LRU — ВАРИАНТ C: +TTL
 *
 * <p>CORE = базовый {@link LRUCache}.</p>
 *
 * <p><b>ВАРИАНТ C — истечение по времени [prim: per-key-eviction, lazy-delete]:</b></p>
 * <ul>
 *   <li>У записи TTL: истёкшая считается отсутствующей (ленивое удаление на get) поверх LRU-порядка.</li>
 *   <li>Эвикция при переполнении — по LRU; независимо истечение — по TTL.</li>
 *   <li>Проверка: get истёкшего ключа → miss; свежий → hit + обновление recency.</li>
 * </ul>
 */
public class LRUCacheC<K, V> {

    public LRUCacheC(int capacity) {
        throw new UnsupportedOperationException("TODO");
    }

    public void put(K key, V value, long ttlMillis) {
        throw new UnsupportedOperationException("TODO: variant C — LRU + per-entry TTL");
    }

    public V get(K key) {
        throw new UnsupportedOperationException("TODO: variant C — lazy expiry on get");
    }

    public static void main(String[] args) {
        System.out.println("=== LRUCacheC (+TTL): Smoke ===");
    }
}
