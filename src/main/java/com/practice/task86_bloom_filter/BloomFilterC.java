package com.practice.task86_bloom_filter;

/**
 * BLOOM FILTER — ВАРИАНТ C: THREAD-SAFE
 *
 * <p>CORE = базовый {@link BloomFilter}.</p>
 *
 * <p><b>ВАРИАНТ C — потокобезопасность [prim: mutual-excl ⭐, bit-manip]:</b></p>
 * <ul>
 *   <li>Конкурентные add/mightContain: биты выставляются атомарно (AtomicLongArray/CAS или синхронизация), без потери установки.</li>
 *   <li>Проверка: K потоков add → все элементы дают mightContain==true; нет «потерянных» битов из-за гонки.</li>
 * </ul>
 */
public class BloomFilterC<T> {
    public BloomFilterC(int expectedInsertions, double falsePositiveRate){ throw new UnsupportedOperationException("TODO"); }
    public void add(T element){ throw new UnsupportedOperationException("TODO: variant C — atomic bit set"); }
    public boolean mightContain(T element){ throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== BloomFilterC (thread-safe): Smoke ==="); }
}
