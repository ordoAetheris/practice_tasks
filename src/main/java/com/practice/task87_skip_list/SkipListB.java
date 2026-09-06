package com.practice.task87_skip_list;

/**
 * SKIP LIST — ВАРИАНТ B: CONCURRENT (optimistic)
 *
 * <p>CORE = базовый {@link SkipList} (упорядоченный, вероятностные уровни, add/get/remove O(log n)).</p>
 *
 * <p><b>ВАРИАНТ B — конкурентность [prim: mutual-excl ⭐, CAS, optimistic]:</b></p>
 * <ul>
 *   <li>Потокобезопасные add/remove/get: оптимистичный поиск + локи узлов при линковке (как ConcurrentSkipListMap), либо lock-free CAS на next-указателях.</li>
 *   <li>Проверка: K потоков add/remove → структура остаётся отсортированной и связной, size корректен.</li>
 * </ul>
 */
public class SkipListB<K extends Comparable<K>, V> {
    public void add(K key, V value){ throw new UnsupportedOperationException("TODO: variant B — concurrent add (optimistic + node locks)"); }
    public boolean remove(K key){ throw new UnsupportedOperationException("TODO: variant B"); }
    public V get(K key){ throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== SkipListB (concurrent): Smoke ==="); }
}
