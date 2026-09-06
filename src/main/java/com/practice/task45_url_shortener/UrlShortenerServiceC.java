package com.practice.task45_url_shortener;

/**
 * URL-SHORTENER — ВАРИАНТ C: КОНКУРЕНТНЫЙ СЧЁТЧИК
 *
 * <p>CORE = базовый {@link UrlShortenerService}.</p>
 *
 * <p><b>ВАРИАНТ C — атомарная генерация id [prim: atomicity ⭐, CAS]:</b></p>
 * <ul>
 *   <li>Монотонный счётчик id → base62-код генерируется атомарно (AtomicLong/getAndIncrement),
 *       чтобы два потока не получили один код.</li>
 *   <li>Проверка: N потоков shorten разных URL → N уникальных кодов, нет дублей/пропусков.</li>
 * </ul>
 */
public class UrlShortenerServiceC {
    public String shorten(String longUrl){ throw new UnsupportedOperationException("TODO: variant C — atomic counter -> base62"); }
    public static void main(String[] a){ System.out.println("=== UrlShortenerServiceC (concurrent counter): Smoke ==="); }
}
