package com.practice.task80_web_crawler;

import java.util.List;
import java.util.Map;

/**
 * WEB CRAWLER (перенос из concurrency) — ВАРИАНТ A: ОДИН ПОТОК (база)
 *
 * <p>CORE: обойти граф страниц от seed: fetch(url) → список ссылок → обойти новые.
 * Сеть НЕ трогаем — источник страниц за интерфейсом {@link PageFetcher} (in-memory карта url→ссылки).</p>
 *
 * <p><b>ВАРИАНТ A — однопоточный BFS/DFS [prim: graph-traversal]:</b></p>
 * <ul>
 *   <li>Очередь URL + visited-set; на каждый — fetch ссылок, новые в очередь.</li>
 *   <li>Проверка: обходит все достижимые страницы ровно один раз; циклы ссылок не зацикливают.</li>
 * </ul>
 */
public class WebCrawler {
    /** Источник ссылок страницы (in-mem стаб вместо реальной сети). */
    public interface PageFetcher { List<String> fetchLinks(String url); }

    public WebCrawler(PageFetcher fetcher) { throw new UnsupportedOperationException("TODO"); }

    /** Обойти граф от seed, вернуть карту url → исходящие ссылки. */
    public Map<String, List<String>> crawl(String seedUrl) {
        throw new UnsupportedOperationException("TODO: variant A — single-thread crawl");
    }
    public static void main(String[] a){ System.out.println("=== WebCrawler A (single-thread): Smoke ==="); }
}
