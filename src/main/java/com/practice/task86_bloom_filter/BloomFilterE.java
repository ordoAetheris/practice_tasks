package com.practice.task86_bloom_filter;

/**
 * BLOOM FILTER — ВАРИАНТ E: SCALABLE
 *
 * <p>CORE = базовый {@link BloomFilter}.</p>
 *
 * <p><b>ВАРИАНТ E — масштабируемый [prim: scalable-bloom]:</b></p>
 * <ul>
 *   <li>Когда фильтр насыщается (растёт fp-rate), добавлять НОВЫЙ слой с большим m и меньшим целевым p; mightContain = OR по слоям.</li>
 *   <li>Держит целевой суммарный false-positive при заранее неизвестном числе элементов.</li>
 *   <li>Проверка: при вставках сверх плана суммарный fp-rate не деградирует катастрофически (растут слои).</li>
 * </ul>
 */
public class BloomFilterE<T> {
    public BloomFilterE(int initialCapacity, double targetFpRate){ throw new UnsupportedOperationException("TODO: variant E — scalable layered bloom"); }
    public void add(T element){ throw new UnsupportedOperationException("TODO"); }
    public boolean mightContain(T element){ throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== BloomFilterE (scalable): Smoke ==="); }
}
