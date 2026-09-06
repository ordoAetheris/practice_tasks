package com.practice.task39_csv_parser;

import java.util.List;
import java.util.Map;

/**
 * CSV — ВАРИАНТ D: ИТЕРАТИВНЫЙ КОНЕЧНЫЙ АВТОМАТ (без рекурсии)
 *
 * <p>CORE = базовый {@link CsvParserService}.</p>
 *
 * <p><b>ВАРИАНТ D — посимвольный FSM [prim: iterative-stack ⭐, FSM]:</b></p>
 * <ul>
 *   <li>Разбор одним проходом по символам через явный автомат состояний
 *       (FIELD_START / IN_FIELD / IN_QUOTES / QUOTE_IN_QUOTES), без рекурсии и без regex-хаков.</li>
 *   <li>Константная память на строку, корректная обработка кавычек внутри автомата.</li>
 *   <li>Проверка: большой CSV парсится потоково; кавычки/переносы разобраны автоматом.</li>
 * </ul>
 */
public class CsvParserServiceD {

    public List<Map<String, String>> parse(String csv) {
        throw new UnsupportedOperationException("TODO: variant D — char-by-char state machine");
    }

    public static void main(String[] args) {
        System.out.println("=== CsvParserServiceD (итеративный FSM): Smoke ===");
    }
}
