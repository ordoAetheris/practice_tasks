package com.practice.task84_concurrent_hashmap;

/**
 * CONCURRENT HASHMAP — ВАРИАНТ D: LOCK-FREE READS
 *
 * <p>CORE = базовый {@link ConcurrentHashMapImpl}.</p>
 *
 * <p><b>ВАРИАНТ D — чтения без локов [prim: memory-visibility ⭐, volatile]:</b></p>
 * <ul>
 *   <li>get не берёт лок: volatile-ссылки на таблицу/узлы дают видимость (как CHM Java 8); пишут — под локом бакета/CAS.</li>
 *   <li>Проверка: get не блокируется параллельными put; читатель видит либо старое, либо новое значение, не мусор.</li>
 * </ul>
 */
public class ConcurrentHashMapImplD<K, V> {
    public V get(K key) { throw new UnsupportedOperationException("TODO: variant D — lock-free read (volatile visibility)"); }
    public V put(K key, V value) { throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== ConcurrentHashMap D (lock-free reads): Smoke ==="); }
}
