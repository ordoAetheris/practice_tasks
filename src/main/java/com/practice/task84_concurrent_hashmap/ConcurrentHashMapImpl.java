package com.practice.task84_concurrent_hashmap;

/**
 * CONCURRENT HASHMAP (перенос из concurrency) — ВАРИАНТ A: SEGMENT LOCKING (база)
 *
 * <p>CORE: потокобезопасная хэш-карта put/get/remove без единого глобального лока.</p>
 *
 * <p><b>ВАРИАНТ A — сегментные локи [prim: mutual-excl ⭐, striping]:</b></p>
 * <ul>
 *   <li>Карта разбита на N сегментов, у каждого свой лок (как ConcurrentHashMap до Java 8): операции разных сегментов параллельны.</li>
 *   <li>Хэш → номер сегмента → лок только его.</li>
 *   <li>Проверка: конкурентные put в разные сегменты не сериализуются; size корректен под гонкой.</li>
 * </ul>
 */
public class ConcurrentHashMapImpl<K, V> {
    public ConcurrentHashMapImpl(int segments) { throw new UnsupportedOperationException("TODO"); }
    public V put(K key, V value) { throw new UnsupportedOperationException("TODO: variant A — segment-locked put"); }
    public V get(K key) { throw new UnsupportedOperationException("TODO"); }
    public V remove(K key) { throw new UnsupportedOperationException("TODO"); }
    public int size() { throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== ConcurrentHashMap A (segment locking): Smoke ==="); }
}
