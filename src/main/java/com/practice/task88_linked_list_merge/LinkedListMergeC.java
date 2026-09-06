package com.practice.task88_linked_list_merge;

/**
 * MERGE СПИСКОВ — ВАРИАНТ C: ДЕТЕКЦИЯ ЦИКЛА
 *
 * <p>CORE = базовый {@link LinkedListMerge}.</p>
 *
 * <p><b>ВАРИАНТ C — цикл в списке [prim: two-pointer, Floyd]:</b></p>
 * <ul>
 *   <li>Обнаружить цикл (Floyd: медленный/быстрый указатели) и найти УЗЕЛ начала цикла.</li>
 *   <li>Проверка: список с циклом → найден вход в цикл; ацикличный → null; корректно на length 0/1.</li>
 * </ul>
 */
public class LinkedListMergeC {
    public static LinkedListMerge.Node detectCycleStart(LinkedListMerge.Node head){ throw new UnsupportedOperationException("TODO: variant C — Floyd cycle detection + entry node"); }
    public static void main(String[] a){ System.out.println("=== LinkedListMergeC (cycle-detect): Smoke ==="); }
}
