package com.practice.task30_text_analyzer;

import java.util.List;
import java.util.Map;

/**
 * АНАЛИЗ ТЕКСТА — ВАРИАНТ B: TOP-K ЧАСТОТ ЧЕРЕЗ КУЧУ
 *
 * <p>CORE = базовый {@link TextAnalyzerService}.</p>
 *
 * <p><b>ВАРИАНТ B — алго-углубление [prim: heap, top-k]:</b></p>
 * <ul>
 *   <li>topNWords через min-heap размера k → O(n log k), а не полная сортировка O(n log n).</li>
 *   <li>Стабильный tie-break при равных частотах (лексикографически) — зафиксировать.</li>
 *   <li>Проверка: top-3 на известном тексте; сравнить с полной сортировкой (тот же результат, но быстрее).</li>
 * </ul>
 */
public class TextAnalyzerServiceB {

    /** Top-N слов по частоте через кучу размера N (O(n log N)). */
    public List<Map.Entry<String, Integer>> topNWords(String text, int n) {
        throw new UnsupportedOperationException("TODO: variant B — top-k via min-heap");
    }

    public static void main(String[] args) {
        System.out.println("=== TextAnalyzerServiceB (top-k heap): Smoke ===");
    }
}
