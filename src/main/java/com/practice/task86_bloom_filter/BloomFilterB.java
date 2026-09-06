package com.practice.task86_bloom_filter;

/**
 * BLOOM FILTER — ВАРИАНТ B: ОПТИМАЛЬНЫЕ k и m
 *
 * <p>CORE = базовый {@link BloomFilter} (битовый массив + k хэшей, mightContain).</p>
 *
 * <p><b>ВАРИАНТ B — расчёт параметров [prim: bit-manip, math]:</b></p>
 * <ul>
 *   <li>По n (ожидаемое число) и p (желаемый false-positive) вычислить оптимальные m = -n·ln(p)/(ln2)² и k = (m/n)·ln2.</li>
 *   <li>Проверка: фактический false-positive rate близок к целевому p на n вставках.</li>
 * </ul>
 */
public class BloomFilterB<T> {
    public BloomFilterB(int expectedInsertions, double falsePositiveRate){ throw new UnsupportedOperationException("TODO: variant B — optimal m,k from n,p"); }
    public void add(T element){ throw new UnsupportedOperationException("TODO"); }
    public boolean mightContain(T element){ throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== BloomFilterB (optimal k,m): Smoke ==="); }
}
