package com.practice.task44_autocomplete;

import java.util.List;

/**
 * АВТОДОПОЛНЕНИЕ — ВАРИАНТ C: TOP-K ПО ВЕСУ (heap)
 *
 * <p>CORE = базовый {@link AutocompleteService}.</p>
 *
 * <p><b>ВАРИАНТ C — top-k [prim: heap, top-k]:</b></p>
 * <ul>
 *   <li>searchTopK(prefix,k) — k самых «весомых» дополнений через min-heap размера k, не сортируя всё поддерево.</li>
 *   <li>Проверка: top-3 подсказки по префиксу с известными весами верны и в правильном порядке.</li>
 * </ul>
 */
public class AutocompleteServiceC {
    public List<String> searchTopK(String prefix, int k){ throw new UnsupportedOperationException("TODO: variant C — top-k by weight (heap)"); }
    public static void main(String[] a){ System.out.println("=== AutocompleteServiceC (top-k heap): Smoke ==="); }
}
