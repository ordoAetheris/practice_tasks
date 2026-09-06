package com.practice.task80_web_crawler;

import java.util.List;
import java.util.Map;

/**
 * WEB CRAWLER — ВАРИАНТ C: ⭐⭐ ДЕТЕКЦИЯ ЗАВЕРШЕНИЯ (termination)
 *
 * <p>CORE = базовый {@link WebCrawler}.</p>
 *
 * <p><b>ВАРИАНТ C — completion detection [prim: termination ⭐⭐]:</b></p>
 * <ul>
 *   <li>ГЛАВНАЯ ловушка параллельного crawl: воркеры не должны завершиться, пока очередь ВРЕМЕННО пуста,
 *       но кто-то ещё обрабатывает (и может добавить ссылки). Условие останова: очередь пуста И все воркеры idle.</li>
 *   <li>Реализация: счётчик «активных» задач (in-flight) + пустота очереди; либо Phaser/CountDownLatch на завершение.</li>
 *   <li>Проверка: краулер завершается РОВНО когда всё обойдено (не раньше на временно пустой очереди, не виснет).</li>
 * </ul>
 */
public class WebCrawlerC {
    public WebCrawlerC(WebCrawler.PageFetcher fetcher, int workers) { throw new UnsupportedOperationException("TODO"); }
    public Map<String, List<String>> crawl(String seedUrl) { throw new UnsupportedOperationException("TODO: variant C — terminate when queue empty AND all workers idle (in-flight counter)"); }
    public static void main(String[] a){ System.out.println("=== WebCrawler C (termination): Smoke ==="); }
}
