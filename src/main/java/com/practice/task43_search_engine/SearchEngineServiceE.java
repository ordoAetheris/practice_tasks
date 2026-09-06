package com.practice.task43_search_engine;

import java.util.List;

/**
 * ПОИСК — ВАРИАНТ E: EDGE
 *
 * <p>CORE = базовый {@link SearchEngineService}.</p>
 *
 * <p><b>ВАРИАНТ E — edge/null-safety [prim: null-edge ⭐]:</b></p>
 * <ul>
 *   <li>Пустой/null запрос, спецсимволы, стоп-слова, поиск в пустом индексе, документ без совпадений.</li>
 *   <li>Проверка: граничные запросы не роняют поиск и дают пустой/осмысленный результат.</li>
 * </ul>
 */
public class SearchEngineServiceE {
    public List<SearchEngineService.SearchResult> search(String query) {
        throw new UnsupportedOperationException("TODO: variant E — edge (empty/special/stopwords)");
    }
    public static void main(String[] a){ System.out.println("=== SearchEngineServiceE (edge): Smoke ==="); }
}
