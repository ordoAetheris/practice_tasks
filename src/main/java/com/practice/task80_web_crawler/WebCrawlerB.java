package com.practice.task80_web_crawler;

import java.util.List;
import java.util.Map;

/**
 * WEB CRAWLER — ВАРИАНТ B: ПАРАЛЛЕЛЬ N ВОРКЕРОВ
 *
 * <p>CORE = базовый {@link WebCrawler}.</p>
 *
 * <p><b>ВАРИАНТ B — параллельный обход [prim: bounded-parallelism, mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>N воркеров тянут URL из общей потокобезопасной очереди; visited-set потокобезопасен (см. вариант D).</li>
 *   <li>Проверка: результат идентичен однопоточному; ускорение на «медленном» fetch; без гонок на visited/результате.</li>
 * </ul>
 */
public class WebCrawlerB {
    public WebCrawlerB(WebCrawler.PageFetcher fetcher, int workers) { throw new UnsupportedOperationException("TODO"); }
    public Map<String, List<String>> crawl(String seedUrl) { throw new UnsupportedOperationException("TODO: variant B — N parallel workers"); }
    public static void main(String[] a){ System.out.println("=== WebCrawler B (parallel N): Smoke ==="); }
}
