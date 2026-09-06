package com.practice.task35_ttl_cache;

/**
 * TTL-КЭШ — ВАРИАНТ D: LAZY vs ACTIVE (сравнение стратегий)
 *
 * <p>CORE = базовый {@link TTLCache}.</p>
 *
 * <p><b>ВАРИАНТ D — стратегии истечения [prim: algorithm, strategy]:</b></p>
 * <ul>
 *   <li>Реализовать оба режима: LAZY (истёкшее удаляется только при обращении) и ACTIVE (reaper чистит фоном).</li>
 *   <li>Понять trade-off: LAZY экономит CPU, но держит память истёкших; ACTIVE наоборот.</li>
 *   <li>Проверка: в LAZY size() до обращения может включать истёкшие; в ACTIVE — освобождаются сами.</li>
 * </ul>
 */
public class TTLCacheD<K, V> {

    public enum ExpiryMode { LAZY, ACTIVE }

    public TTLCacheD(ExpiryMode mode) {
        throw new UnsupportedOperationException("TODO: variant D — lazy vs active mode");
    }

    public void put(K key, V value, long ttlMillis) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        System.out.println("=== TTLCacheD (lazy vs active): Smoke ===");
    }
}
