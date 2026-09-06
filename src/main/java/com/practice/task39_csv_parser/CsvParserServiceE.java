package com.practice.task39_csv_parser;

/**
 * CSV — ВАРИАНТ E: КАВЫЧКИ / ЭКРАНИРОВАНИЕ (RFC 4180) + round-trip
 *
 * <p>CORE = базовый {@link CsvParserService}.</p>
 *
 * <p><b>ВАРИАНТ E — специфика домена [prim: quoting, escaping]:</b></p>
 * <ul>
 *   <li>Сериализация обратно в CSV с корректным квотингом: поля с разделителем/кавычкой/переносом
 *       оборачиваются в кавычки, внутренние кавычки удваиваются.</li>
 *   <li>Round-trip: parse(toCsv(data)) == data.</li>
 *   <li>Проверка: поле 'a,"b"\nc' сериализуется и парсится обратно без потерь.</li>
 * </ul>
 */
public class CsvParserServiceE {

    public String toCsv(java.util.List<java.util.Map<String, String>> data) {
        throw new UnsupportedOperationException("TODO: variant E — RFC4180 quoting + round-trip");
    }

    public static void main(String[] args) {
        System.out.println("=== CsvParserServiceE (RFC4180 quoting): Smoke ===");
    }
}
