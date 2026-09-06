package com.practice.task80_web_crawler;

import java.util.List;
import java.util.Map;

/**
 * WEB CRAWLER — ВАРИАНТ D: DEDUP VISITED (thread-safe)
 *
 * <p>CORE = базовый {@link WebCrawler}.</p>
 *
 * <p><b>ВАРИАНТ D — идемпотентность обхода [prim: idempotency ⭐, mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>Каждый URL обрабатывается РОВНО один раз даже под гонкой N воркеров: атомарная «застолбить URL»
 *       (ConcurrentHashMap.newKeySet + add() как claim, или putIfAbsent).</li>
 *   <li>Проверка: страница с несколькими входящими ссылками fetch'ится один раз; N воркеров не дублируют обход.</li>
 * </ul>
 */
public class WebCrawlerD {
    public WebCrawlerD(WebCrawler.PageFetcher fetcher, int workers) { throw new UnsupportedOperationException("TODO"); }
    public Map<String, List<String>> crawl(String seedUrl) { throw new UnsupportedOperationException("TODO: variant D — atomic visited-claim (dedup)"); }
    public static void main(String[] a){ System.out.println("=== WebCrawler D (dedup visited): Smoke ==="); }
}
