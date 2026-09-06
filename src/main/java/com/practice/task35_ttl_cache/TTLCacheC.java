package com.practice.task35_ttl_cache;

/**
 * TTL-КЭШ — ВАРИАНТ C: THREAD-SAFE
 *
 * <p>CORE = базовый {@link TTLCache}.</p>
 *
 * <p><b>ВАРИАНТ C — потокобезопасность [prim: mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>put/get/remove/cleanup согласованы под конкурентой; проверка-истечения-и-удаление атомарны
 *       (не отдать значение, которое параллельно истекло и удаляется).</li>
 *   <li>Проверка: K потоков put/get с короткими TTL → без гонок; cleanup не конфликтует с чтением.</li>
 * </ul>
 */
public class TTLCacheC<K, V> {

    public void put(K key, V value, long ttlMillis) {
        throw new UnsupportedOperationException("TODO: variant C — thread-safe");
    }

    public V get(K key) {
        throw new UnsupportedOperationException("TODO: variant C — atomic check-expiry-and-read");
    }

    public static void main(String[] args) {
        System.out.println("=== TTLCacheC (thread-safe): Smoke ===");
    }
}
