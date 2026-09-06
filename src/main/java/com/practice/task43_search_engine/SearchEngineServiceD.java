package com.practice.task43_search_engine;

import java.util.List;

/**
 * ПОИСК — ВАРИАНТ D: FUZZY / РАНЖИРОВАНИЕ
 *
 * <p>CORE = базовый {@link SearchEngineService}.</p>
 *
 * <p><b>ВАРИАНТ D — ранжирование/опечатки [prim: algorithm, ranking]:</b></p>
 * <ul>
 *   <li>Ранжирование по TF-IDF/частоте; fuzzy-поиск с расстоянием Левенштейна (толерантность к опечаткам).</li>
 *   <li>Проверка: запрос с опечаткой находит документ; более релевантные — выше.</li>
 * </ul>
 */
public class SearchEngineServiceD {
    public List<SearchEngineService.SearchResult> fuzzySearch(String query, int maxDistance) {
        throw new UnsupportedOperationException("TODO: variant D — fuzzy + ranking (TF-IDF/Levenshtein)");
    }
    public static void main(String[] a){ System.out.println("=== SearchEngineServiceD (fuzzy/rank): Smoke ==="); }
}
