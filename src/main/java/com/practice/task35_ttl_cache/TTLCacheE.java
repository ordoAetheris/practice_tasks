package com.practice.task35_ttl_cache;

/**
 * TTL-КЭШ — ВАРИАНТ E: +LRU ПРИ ПЕРЕПОЛНЕНИИ
 *
 * <p>CORE = базовый {@link TTLCache}.</p>
 *
 * <p><b>ВАРИАНТ E — bounded + LRU [prim: per-key-eviction]:</b></p>
 * <ul>
 *   <li>Bounded по capacity: помимо TTL при переполнении вытеснять LRU-запись.</li>
 *   <li>Две независимые причины удаления: истечение (TTL) и переполнение (LRU).</li>
 *   <li>Проверка: переполнение вытесняет наименее недавнюю; истечение — по времени; обе не конфликтуют.</li>
 * </ul>
 */
public class TTLCacheE<K, V> {

    public TTLCacheE(int capacity) {
        throw new UnsupportedOperationException("TODO: variant E — bounded TTL + LRU eviction");
    }

    public void put(K key, V value, long ttlMillis) {
        throw new UnsupportedOperationException("TODO");
    }

    public V get(K key) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        System.out.println("=== TTLCacheE (+LRU): Smoke ===");
    }
}
