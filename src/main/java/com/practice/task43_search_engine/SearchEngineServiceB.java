package com.practice.task43_search_engine;

import java.util.List;

/**
 * ПОИСК — ВАРИАНТ B: THREAD-SAFE ИНДЕКС
 *
 * <p>CORE = базовый {@link SearchEngineService} (инвертированный индекс/trie, addDocument/search).</p>
 *
 * <p><b>ВАРИАНТ B — потокобезопасность [prim: mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>Конкурентные addDocument/removeDocument и search не рвут индекс и не теряют документы.</li>
 *   <li>Запись в постинг-листы атомарна; чтение видит согласованный снимок.</li>
 *   <li>Проверка: K потоков индексируют + ищут параллельно → результаты консистентны.</li>
 * </ul>
 */
public class SearchEngineServiceB {
    public SearchEngineService.Document addDocument(String id, String title, String content) {
        throw new UnsupportedOperationException("TODO: variant B — thread-safe index");
    }
    public List<SearchEngineService.SearchResult> search(String query) { throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== SearchEngineServiceB (thread-safe): Smoke ==="); }
}
