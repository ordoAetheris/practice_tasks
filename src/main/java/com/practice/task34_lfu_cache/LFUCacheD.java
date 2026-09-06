package com.practice.task34_lfu_cache;

/**
 * LFU — ВАРИАНТ D: +TTL
 *
 * <p>CORE = базовый {@link LFUCache}.</p>
 *
 * <p><b>ВАРИАНТ D — истечение по времени [prim: per-key-eviction, lazy-delete]:</b></p>
 * <ul>
 *   <li>Истёкшая запись — miss на get (ленивое удаление) и не мешает freq-учёту живых.</li>
 *   <li>Проверка: истёкший ключ не отдаётся и не «держит» частоту; эвикция по-прежнему min-freq.</li>
 * </ul>
 */
public class LFUCacheD<K, V> {

    public LFUCacheD(int capacity) {
        throw new UnsupportedOperationException("TODO");
    }

    public void put(K key, V value, long ttlMillis) {
        throw new UnsupportedOperationException("TODO: variant D — LFU + per-entry TTL");
    }

    public V get(K key) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        System.out.println("=== LFUCacheD (+TTL): Smoke ===");
    }
}
