package com.practice.task88_linked_list_merge;

import java.util.List;

/**
 * MERGE СПИСКОВ — ВАРИАНТ B: K СПИСКОВ ЧЕРЕЗ КУЧУ
 *
 * <p>CORE = базовый {@link LinkedListMerge} (in-place merge двух отсортированных).</p>
 *
 * <p><b>ВАРИАНТ B — слияние K списков [prim: heap, k-way-merge]:</b></p>
 * <ul>
 *   <li>Слить k отсортированных списков через min-heap голов — O(N log k), а не попарно O(N·k).</li>
 *   <li>Проверка: k списков сливаются в один отсортированный; сравнить с попарным результатом.</li>
 * </ul>
 */
public class LinkedListMergeB {
    public static LinkedListMerge.Node mergeK(List<LinkedListMerge.Node> lists){ throw new UnsupportedOperationException("TODO: variant B — k-way merge via min-heap"); }
    public static void main(String[] a){ System.out.println("=== LinkedListMergeB (k-lists heap): Smoke ==="); }
}
