package com.practice.task39_url_shortener;

import java.util.*;

/**
 * СОКРАЩАТЕЛЬ ССЫЛОК (URL SHORTENER)
 *
 * <p>Реализуйте сервис сокращения URL-адресов. Длинные URL преобразуются
 * в короткие коды, по которым можно восстановить оригинальный адрес.
 * Ведётся статистика переходов.</p>
 *
 * <p>Операции:</p>
 * <ul>
 *   <li>shorten(longUrl) — сгенерировать короткий код для URL</li>
 *   <li>resolve(shortCode) — получить оригинальный URL по короткому коду</li>
 *   <li>getStats(shortCode) — количество переходов (resolve) по коду</li>
 *   <li>deactivate(shortCode) — деактивировать код (resolve возвращает null)</li>
 *   <li>customShorten(longUrl, customCode) — создать пользовательский короткий код</li>
 * </ul>
 *
 * <p>Бизнес-правила:</p>
 * <ul>
 *   <li>Автоматический код: 6-8 символов (буквы латиницы + цифры)</li>
 *   <li>Один URL может иметь несколько коротких кодов</li>
 *   <li>Кастомный код должен быть уникальным</li>
 *   <li>Кастомный код: только буквы, цифры и дефис, длина 3-20</li>
 *   <li>URL должен быть валидным (начинаться с http:// или https://)</li>
 *   <li>Каждый вызов resolve увеличивает счётчик переходов</li>
 * </ul>
 *
 * <p>Уровень: Средний</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task39_url_shortener/UrlShortenerService.java
 * java -cp src/main/java com.practice.task39_url_shortener.UrlShortenerService
 * </pre>
 */
public class UrlShortenerService {

    public record ShortUrl(
            String shortCode,
            String longUrl,
            boolean active,
            long clickCount
    ) {}

    /**
     * Сокращает URL, генерируя случайный код длиной 6-8 символов.
     *
     * @param longUrl оригинальный URL
     * @return короткий код
     * @throws IllegalArgumentException если URL невалидный
     */
    public String shorten(String longUrl) {
        // TODO: implement
        return null;
    }

    /**
     * Возвращает оригинальный URL по короткому коду и увеличивает счётчик переходов.
     *
     * @param shortCode короткий код
     * @return оригинальный URL или null если код не найден или деактивирован
     */
    public String resolve(String shortCode) {
        // TODO: implement
        return null;
    }

    /**
     * Возвращает статистику по короткому коду.
     *
     * @param shortCode короткий код
     * @return информация о коротком URL
     * @throws IllegalArgumentException если код не найден
     */
    public ShortUrl getStats(String shortCode) {
        // TODO: implement
        return null;
    }

    /**
     * Деактивирует короткий код. После деактивации resolve возвращает null.
     *
     * @param shortCode короткий код
     * @throws IllegalArgumentException если код не найден
     */
    public void deactivate(String shortCode) {
        // TODO: implement
    }

    /**
     * Создаёт пользовательский короткий код для URL.
     *
     * @param longUrl    оригинальный URL
     * @param customCode пользовательский код (буквы, цифры, дефис; длина 3-20)
     * @return пользовательский код
     * @throws IllegalArgumentException если URL невалидный или код не соответствует формату
     * @throws IllegalStateException    если код уже занят
     */
    public String customShorten(String longUrl, String customCode) {
        // TODO: implement
        return null;
    }

    public static void main(String[] args) {
        System.out.println("=== UrlShortenerService: Smoke Test ===");
        // TODO: создать тестовые данные и проверить основные сценарии
    }
}
