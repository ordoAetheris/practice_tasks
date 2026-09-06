package com.practice.task87_skip_list;

/**
 * SKIP LIST — ВАРИАНТ D: EDGE
 *
 * <p>CORE = базовый {@link SkipList}.</p>
 *
 * <p><b>ВАРИАНТ D — edge/null-safety [prim: null-edge ⭐]:</b></p>
 * <ul>
 *   <li>Пустой список (get/floor/ceiling → null), один элемент, дубликаты ключей (обновление значения), удаление отсутствующего.</li>
 *   <li>floor/ceiling за пределами диапазона; null-ключ (запрет); стабильность уровней при массовых remove.</li>
 *   <li>Проверка: границы не роняют; floor(min-1)==null, ceiling(max+1)==null.</li>
 * </ul>
 */
public class SkipListD<K extends Comparable<K>, V> {
    public void add(K key, V value){ throw new UnsupportedOperationException("TODO: variant D — edge (dup/null/empty)"); }
    public K floor(K key){ throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== SkipListD (edge): Smoke ==="); }
}
