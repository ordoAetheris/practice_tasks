package com.practice.task84_concurrent_hashmap;

/**
 * CONCURRENT HASHMAP — ВАРИАНТ B: STRIPE LOCKING (тонкая гранулярность)
 *
 * <p>CORE = базовый {@link ConcurrentHashMapImpl}.</p>
 *
 * <p><b>ВАРИАНТ B — lock striping [prim: striping ⭐, mutual-excl]:</b></p>
 * <ul>
 *   <li>Фиксированный массив из M локов (stripes); бакет i лочится stripe[i % M] — больше параллелизма, чем крупные сегменты, при фикс. памяти на локи.</li>
 *   <li>Проверка: высокая конкуренция на разные ключи слабо конфликтует; на один ключ — сериализуется.</li>
 * </ul>
 */
public class ConcurrentHashMapImplB<K, V> {
    public ConcurrentHashMapImplB(int stripes) { throw new UnsupportedOperationException("TODO: variant B — lock striping"); }
    public V put(K key, V value) { throw new UnsupportedOperationException("TODO"); }
    public V get(K key) { throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== ConcurrentHashMap B (stripe locking): Smoke ==="); }
}
