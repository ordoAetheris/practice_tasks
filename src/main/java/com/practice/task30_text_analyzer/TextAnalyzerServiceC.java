package com.practice.task30_text_analyzer;

import java.io.Reader;
import java.util.Map;

/**
 * АНАЛИЗ ТЕКСТА — ВАРИАНТ C: ПОТОКОВЫЙ БОЛЬШОЙ ВХОД
 *
 * <p>CORE = базовый {@link TextAnalyzerService}.</p>
 *
 * <p><b>ВАРИАНТ C — потоковая обработка [prim: streaming, bounded-memory]:</b></p>
 * <ul>
 *   <li>Считать частоты по Reader/чанкам, НЕ загружая весь текст в память (вход не влезает в heap).</li>
 *   <li>Аккуратно со словами на границе чанков (буфер «хвоста»).</li>
 *   <li>Проверка: большой поток → частоты совпадают с in-memory версией; память ограничена.</li>
 * </ul>
 */
public class TextAnalyzerServiceC {

    /** Потоковый подсчёт частот из Reader без загрузки всего текста в память. */
    public Map<String, Integer> wordFrequency(Reader source) {
        throw new UnsupportedOperationException("TODO: variant C — streaming word frequency");
    }

    public static void main(String[] args) {
        System.out.println("=== TextAnalyzerServiceC (streaming): Smoke ===");
    }
}
