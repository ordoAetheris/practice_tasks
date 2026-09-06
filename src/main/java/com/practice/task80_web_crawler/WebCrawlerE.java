package com.practice.task80_web_crawler;

/**
 * WEB CRAWLER — ВАРИАНТ E: SHUTDOWN + CANCEL
 *
 * <p>CORE = базовый {@link WebCrawler}.</p>
 *
 * <p><b>ВАРИАНТ E — остановка/отмена [prim: shutdown ⭐, cancellation ⭐]:</b></p>
 * <ul>
 *   <li>crawl можно отменить извне (stop()/дедлайн): воркеры реагируют на interrupt/флаг, корректно завершаются, пул закрывается.</li>
 *   <li>После отмены — частичный результат, никаких висящих потоков.</li>
 *   <li>Проверка: stop() во время обхода → все воркеры завершились быстро; возвращён обойдённый на момент отмены набор.</li>
 * </ul>
 */
public class WebCrawlerE {
    public WebCrawlerE(WebCrawler.PageFetcher fetcher, int workers) { throw new UnsupportedOperationException("TODO"); }
    public void startCrawl(String seedUrl) { throw new UnsupportedOperationException("TODO: variant E — cancellable crawl"); }
    public void stop() { throw new UnsupportedOperationException("TODO: variant E — shutdown workers + cancel"); }
    public static void main(String[] a){ System.out.println("=== WebCrawler E (shutdown+cancel): Smoke ==="); }
}
