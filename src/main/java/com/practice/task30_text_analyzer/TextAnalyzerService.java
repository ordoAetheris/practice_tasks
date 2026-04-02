package com.practice.task30_text_analyzer;

import java.util.*;

/**
 * АНАЛИЗАТОР ТЕКСТА
 *
 * <p>Реализуйте сервис анализа текста. Сервис принимает текст как String и предоставляет
 * различные метрики и аналитику по содержимому.</p>
 *
 * <p>Операции:</p>
 * <ul>
 *   <li>Подсчитать частоту каждого слова</li>
 *   <li>Найти топ-N самых частых слов</li>
 *   <li>Подсчитать количество предложений</li>
 *   <li>Средняя длина слова</li>
 *   <li>Найти все уникальные слова</li>
 *   <li>Найти слова длиннее N символов</li>
 *   <li>Подсчитать количество символов, слов, строк</li>
 * </ul>
 *
 * <p>Определение слова:</p>
 * <ul>
 *   <li>Слово — непрерывная последовательность букв (Character.isLetter)</li>
 *   <li>Регистр не важен (все слова приводятся к нижнему регистру)</li>
 *   <li>Знаки препинания, цифры, пробелы не считаются частью слова</li>
 * </ul>
 *
 * <p>Определение предложения:</p>
 * <ul>
 *   <li>Предложение заканчивается символом '.', '!' или '?'</li>
 * </ul>
 *
 * <p>Уровень: Базовый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task30_text_analyzer/TextAnalyzerService.java
 * java -cp src/main/java com.practice.task30_text_analyzer.TextAnalyzerService
 * </pre>
 */
public class TextAnalyzerService {

    public record TextStats(
            int characters,
            int words,
            int lines
    ) {}

    /**
     * Подсчитывает частоту каждого слова в тексте.
     *
     * @param text исходный текст
     * @return карта: слово (в нижнем регистре) -> количество вхождений
     */
    public Map<String, Integer> wordFrequency(String text) {
        // TODO: implement
        return Map.of();
    }

    /**
     * Возвращает топ-N самых частых слов, отсортированных по убыванию частоты.
     * При одинаковой частоте — в алфавитном порядке.
     *
     * @param text исходный текст
     * @param n    количество слов в топе
     * @return список пар (слово, частота)
     */
    public List<Map.Entry<String, Integer>> topNWords(String text, int n) {
        // TODO: implement
        return List.of();
    }

    /**
     * Подсчитывает количество предложений в тексте.
     * Предложение заканчивается '.', '!' или '?'.
     *
     * @param text исходный текст
     * @return количество предложений
     */
    public int countSentences(String text) {
        // TODO: implement
        return 0;
    }

    /**
     * Вычисляет среднюю длину слова в тексте.
     *
     * @param text исходный текст
     * @return средняя длина слова или 0.0 если слов нет
     */
    public double averageWordLength(String text) {
        // TODO: implement
        return 0.0;
    }

    /**
     * Возвращает множество уникальных слов в тексте (в нижнем регистре).
     *
     * @param text исходный текст
     * @return множество уникальных слов
     */
    public Set<String> uniqueWords(String text) {
        // TODO: implement
        return Set.of();
    }

    /**
     * Находит все слова длиннее указанного количества символов.
     *
     * @param text      исходный текст
     * @param minLength минимальная длина слова (не включительно)
     * @return множество слов длиннее minLength
     */
    public Set<String> wordsLongerThan(String text, int minLength) {
        // TODO: implement
        return Set.of();
    }

    /**
     * Подсчитывает общую статистику текста: символы, слова, строки.
     *
     * @param text исходный текст
     * @return статистика текста
     */
    public TextStats getStats(String text) {
        // TODO: implement
        return null;
    }

    public static void main(String[] args) {
        System.out.println("=== TextAnalyzerService: Smoke Test ===");
        // TODO: создать тестовые данные и проверить основные сценарии
    }
}
