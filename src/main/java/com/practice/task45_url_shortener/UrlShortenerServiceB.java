package com.practice.task45_url_shortener;

/**
 * URL-SHORTENER — ВАРИАНТ B: КОЛЛИЗИИ
 *
 * <p>CORE = базовый {@link UrlShortenerService} (base62 short-code, shorten/resolve).</p>
 *
 * <p><b>ВАРИАНТ B — разрешение коллизий [prim: hashing, probing]:</b></p>
 * <ul>
 *   <li>При коллизии сгенерированного кода — перегенерация/пробинг; customShorten с занятым кодом → отказ/суффикс.</li>
 *   <li>Один longUrl → стабильно один код (или намеренно много — зафиксировать политику).</li>
 *   <li>Проверка: искусственная коллизия хэша разрешается, оба URL резолвятся корректно.</li>
 * </ul>
 */
public class UrlShortenerServiceB {
    public String shorten(String longUrl){ throw new UnsupportedOperationException("TODO: variant B — collision handling"); }
    public String customShorten(String longUrl, String customCode){ throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== UrlShortenerServiceB (collisions): Smoke ==="); }
}
