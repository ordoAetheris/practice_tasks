package com.practice.task86_bloom_filter;

/**
 * BLOOM FILTER — ВАРИАНТ D: COUNTING BLOOM (поддержка remove)
 *
 * <p>CORE = базовый {@link BloomFilter}.</p>
 *
 * <p><b>ВАРИАНТ D — счётчики вместо битов [prim: counting-bloom]:</b></p>
 * <ul>
 *   <li>Каждая позиция — маленький счётчик (например, 4 бита): add инкрементит, remove декрементит → возможно удаление.</li>
 *   <li>Осторожно с переполнением счётчика (насыщение) и ложным remove.</li>
 *   <li>Проверка: add затем remove → mightContain может стать false; насыщенный счётчик не декрементится ниже.</li>
 * </ul>
 */
public class BloomFilterD<T> {
    public BloomFilterD(int expectedInsertions, double falsePositiveRate){ throw new UnsupportedOperationException("TODO"); }
    public void add(T element){ throw new UnsupportedOperationException("TODO: variant D — counting increment"); }
    public void remove(T element){ throw new UnsupportedOperationException("TODO: variant D — counting decrement"); }
    public boolean mightContain(T element){ throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== BloomFilterD (counting): Smoke ==="); }
}
