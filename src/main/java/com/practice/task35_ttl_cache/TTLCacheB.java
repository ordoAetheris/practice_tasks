package com.practice.task35_ttl_cache;

/**
 * TTL-КЭШ — ВАРИАНТ B: ACTIVE-EVICTION + SHUTDOWN
 *
 * <p>CORE = базовый {@link TTLCache} (HashMap + expiry, ленивое истечение).</p>
 *
 * <p><b>ВАРИАНТ B — фоновая эвикция [prim: shutdown ⭐, termination ⭐]:</b></p>
 * <ul>
 *   <li>Фоновый reaper-поток периодически удаляет истёкшие записи (не ждать get).</li>
 *   <li>КЛЮЧЕВОЕ: корректный shutdown() — остановить reaper, дождаться завершения (join/awaitTermination),
 *       без утечки потока и без «висящего» демона.</li>
 *   <li>Проверка: после TTL память освобождается без обращения; shutdown реально завершает поток.</li>
 * </ul>
 */
public class TTLCacheB<K, V> {

    public void put(K key, V value, long ttlMillis) {
        throw new UnsupportedOperationException("TODO");
    }

    public V get(K key) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Остановить фоновый reaper и дождаться его завершения (без утечки потока). */
    public void shutdown() {
        throw new UnsupportedOperationException("TODO: variant B — graceful reaper shutdown");
    }

    public static void main(String[] args) {
        System.out.println("=== TTLCacheB (active-eviction + shutdown): Smoke ===");
    }
}
