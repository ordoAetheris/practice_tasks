package com.practice.task45_url_shortener;

/**
 * URL-SHORTENER — ВАРИАНТ D: EDGE
 *
 * <p>CORE = базовый {@link UrlShortenerService}.</p>
 *
 * <p><b>ВАРИАНТ D — edge/null-safety [prim: null-edge ⭐]:</b></p>
 * <ul>
 *   <li>Невалидный/пустой URL, resolve несуществующего/деактивированного кода, повторный shorten того же URL.</li>
 *   <li>customCode: пустой/невалидные символы/слишком длинный/занятый.</li>
 *   <li>Проверка: таблица граничных входов даёт осмысленную ошибку, не NPE; резолв деактивированного — отказ.</li>
 * </ul>
 */
public class UrlShortenerServiceD {
    public String shorten(String longUrl){ throw new UnsupportedOperationException("TODO: variant D — edge/invalid"); }
    public String resolve(String shortCode){ throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== UrlShortenerServiceD (edge): Smoke ==="); }
}
