package com.practice.task88_linked_list_merge;

/**
 * MERGE СПИСКОВ — ВАРИАНТ D: EDGE
 *
 * <p>CORE = базовый {@link LinkedListMerge}.</p>
 *
 * <p><b>ВАРИАНТ D — edge/null-safety [prim: null-edge ⭐, two-pointer]:</b></p>
 * <ul>
 *   <li>Один или оба списка пусты (null), один элемент, списки разной длины, все элементы одного списка меньше.</li>
 *   <li>Дубли значений между списками; стабильность порядка при равных.</li>
 *   <li>Проверка: merge(null, b)==b; merge(a, null)==a; merge(null,null)==null; без потери узлов.</li>
 * </ul>
 */
public class LinkedListMergeD {
    public static LinkedListMerge.Node merge(LinkedListMerge.Node a, LinkedListMerge.Node b){ throw new UnsupportedOperationException("TODO: variant D — edge (empty/one/uneven)"); }
    public static void main(String[] a){ System.out.println("=== LinkedListMergeD (edge): Smoke ==="); }
}
