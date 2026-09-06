package com.practice.task43_search_engine;

import java.util.List;

/**
 * ПОИСК — ВАРИАНТ C: TOP-K ПО РЕЛЕВАНТНОСТИ (heap)
 *
 * <p>CORE = базовый {@link SearchEngineService}.</p>
 *
 * <p><b>ВАРИАНТ C — top-k [prim: heap, top-k]:</b></p>
 * <ul>
 *   <li>search возвращает top-k документов по релевантности через min-heap размера k — O(n log k), не полная сортировка.</li>
 *   <li>Проверка: top-5 из большого корпуса совпадает с полной сортировкой, но без сортировки всего.</li>
 * </ul>
 */
public class SearchEngineServiceC {
    public List<SearchEngineService.SearchResult> searchTopK(String query, int k) {
        throw new UnsupportedOperationException("TODO: variant C — top-k via heap");
    }
    public static void main(String[] a){ System.out.println("=== SearchEngineServiceC (top-k heap): Smoke ==="); }
}
