package com.practice.task80_web_crawler;

import java.util.List;
import java.util.Map;

/**
 * WEB CRAWLER — ВАРИАНТ F: ТИПИЗАЦИЯ ОШИБОК
 *
 * <p>CORE = базовый {@link WebCrawler}.</p>
 *
 * <p><b>ВАРИАНТ F — устойчивость к ошибкам fetch [prim: typed-errors, error-isolation]:</b></p>
 * <ul>
 *   <li>fetch страницы может упасть (timeout/404/parse): различать типы, НЕ ронять весь обход из-за одной страницы.</li>
 *   <li>Собирать отчёт: успешные + список ошибок с типом на URL; ретрай retriable (по желанию).</li>
 *   <li>Проверка: битые страницы не прерывают обход; в результате виден статус/тип ошибки по каждому URL.</li>
 * </ul>
 */
public class WebCrawlerF {
    public enum FetchErrorType { TIMEOUT, NOT_FOUND, PARSE_ERROR, OTHER }
    public WebCrawlerF(WebCrawler.PageFetcher fetcher, int workers) { throw new UnsupportedOperationException("TODO"); }
    public Map<String, List<String>> crawl(String seedUrl) { throw new UnsupportedOperationException("TODO: variant F — per-URL typed error isolation"); }
    public static void main(String[] a){ System.out.println("=== WebCrawler F (typed errors): Smoke ==="); }
}
