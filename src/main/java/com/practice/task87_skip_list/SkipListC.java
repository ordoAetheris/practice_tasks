package com.practice.task87_skip_list;

import java.util.List;
import java.util.Map;

/**
 * SKIP LIST — ВАРИАНТ C: RANGE-QUERY
 *
 * <p>CORE = базовый {@link SkipList}.</p>
 *
 * <p><b>ВАРИАНТ C — диапазонные запросы [prim: range, ordered-scan]:</b></p>
 * <ul>
 *   <li>range(from,to) за O(log n + k): найти нижнюю границу, идти по нижнему уровню до верхней. floor/ceiling эффективно.</li>
 *   <li>Проверка: range возвращает отсортированные пары в [from,to]; floor/ceiling на границах верны.</li>
 * </ul>
 */
public class SkipListC<K extends Comparable<K>, V> {
    public List<Map.Entry<K, V>> range(K fromKey, K toKey){ throw new UnsupportedOperationException("TODO: variant C — range scan O(log n + k)"); }
    public K floor(K key){ throw new UnsupportedOperationException("TODO"); }
    public K ceiling(K key){ throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== SkipListC (range-query): Smoke ==="); }
}
