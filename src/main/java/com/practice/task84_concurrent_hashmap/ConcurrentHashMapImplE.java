package com.practice.task84_concurrent_hashmap;

/**
 * CONCURRENT HASHMAP — ВАРИАНТ E: CAS-BUCKET (lock-free insert)
 *
 * <p>CORE = базовый {@link ConcurrentHashMapImpl}.</p>
 *
 * <p><b>ВАРИАНТ E — CAS на бакете [prim: CAS ⭐, lock-free]:</b></p>
 * <ul>
 *   <li>Вставка в пустой бакет — атомарным CAS (без лока); коллизия/непустой бакет — синхронизация на голове бакета.</li>
 *   <li>Проверка: конкурентные вставки в один бакет не теряются (CAS-петля/лок головы); в разные — полностью параллельны.</li>
 * </ul>
 */
public class ConcurrentHashMapImplE<K, V> {
    public V put(K key, V value) { throw new UnsupportedOperationException("TODO: variant E — CAS on empty bucket + lock on collision"); }
    public static void main(String[] a){ System.out.println("=== ConcurrentHashMap E (CAS-bucket): Smoke ==="); }
}
