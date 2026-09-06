package com.practice.task39_csv_parser;

import java.util.List;
import java.util.Map;

/**
 * CSV — ВАРИАНТ B: РАСШИРЯЕМОСТЬ (dialect/strategy)
 *
 * <p>CORE = базовый {@link CsvParserService} (parse(csv) → список строк-map по заголовку).</p>
 *
 * <p><b>ВАРИАНТ B — конфигурируемый диалект [prim: strategy, open-closed]:</b></p>
 * <ul>
 *   <li>Настраиваемые разделитель (',' ';' '\t'), символ кавычки, признак заголовка — как «диалект».</li>
 *   <li>Ядро парсера одно, поведение задаётся конфигом (не хардкод запятой).</li>
 *   <li>Проверка: тот же ввод с ';' и '\t' парсится корректно при смене диалекта.</li>
 * </ul>
 */
public class CsvParserServiceB {

    public record Dialect(char delimiter, char quote, boolean header) {}

    public List<Map<String, String>> parse(String csv, Dialect dialect) {
        throw new UnsupportedOperationException("TODO: variant B — configurable dialect");
    }

    public static void main(String[] args) {
        System.out.println("=== CsvParserServiceB (dialect/strategy): Smoke ===");
    }
}
