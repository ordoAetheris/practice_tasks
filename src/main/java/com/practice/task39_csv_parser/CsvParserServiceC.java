package com.practice.task39_csv_parser;

import java.util.List;
import java.util.Map;

/**
 * CSV — ВАРИАНТ C: EDGE / КАВЫЧКИ / ПЕРЕНОСЫ
 *
 * <p>CORE = базовый {@link CsvParserService}.</p>
 *
 * <p><b>ВАРИАНТ C — edge/невалид [prim: null-edge ⭐]:</b></p>
 * <ul>
 *   <li>Запятая внутри кавычек ("a,b"), экранированная кавычка ("" внутри поля), перенос строки внутри поля.</li>
 *   <li>Пустые поля, хвостовой разделитель, разное число колонок в строках, пустой ввод.</li>
 *   <li>Проверка: таблица «злых» строк разбирается по RFC-семантике, не рвётся на запятой в кавычках.</li>
 * </ul>
 */
public class CsvParserServiceC {

    public List<Map<String, String>> parse(String csv) {
        throw new UnsupportedOperationException("TODO: variant C — quotes/embedded commas/newlines");
    }

    public static void main(String[] args) {
        System.out.println("=== CsvParserServiceC (edge/кавычки): Smoke ===");
    }
}
