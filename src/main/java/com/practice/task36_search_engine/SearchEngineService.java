package com.practice.task36_search_engine;

import java.util.*;

/**
 * ПОЛНОТЕКСТОВЫЙ ПОИСКОВЫЙ ДВИЖОК (INVERTED INDEX)
 *
 * <p>Реализуйте упрощённый поисковый движок на основе инвертированного индекса.
 * Документы индексируются при добавлении, поиск выполняется по ключевым словам.</p>
 *
 * <p>Сущности:</p>
 * <ul>
 *   <li>Document — документ (id, title, content)</li>
 * </ul>
 *
 * <p>Операции:</p>
 * <ul>
 *   <li>addDocument — добавить и проиндексировать документ</li>
 *   <li>removeDocument — удалить документ из индекса</li>
 *   <li>search(query) — найти документы, содержащие ВСЕ слова запроса (AND)</li>
 *   <li>searchAny(query) — найти документы, содержащие ЛЮБОЕ слово запроса (OR)</li>
 *   <li>highlight(documentId, query) — вернуть фрагменты текста с подсветкой совпадений</li>
 * </ul>
 *
 * <p>Ранжирование результатов:</p>
 * <ul>
 *   <li>Результаты ранжируются по TF (Term Frequency) — чем чаще слово встречается
 *       в документе, тем выше документ в результатах</li>
 *   <li>Для multi-word запроса TF суммируется по всем словам запроса</li>
 * </ul>
 *
 * <p>Бизнес-правила:</p>
 * <ul>
 *   <li>Поиск регистронезависимый</li>
 *   <li>Знаки препинания игнорируются при индексации</li>
 *   <li>Подсветка: слова из запроса оборачиваются в [слово]</li>
 * </ul>
 *
 * <p>Уровень: Средний</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task36_search_engine/SearchEngineService.java
 * java -cp src/main/java com.practice.task36_search_engine.SearchEngineService
 * </pre>
 */
public class SearchEngineService {

    public record Document(
            String id,
            String title,
            String content
    ) {}

    public record SearchResult(
            Document document,
            double relevance
    ) {}

    /**
     * Добавляет документ и индексирует его содержимое и заголовок.
     *
     * @param id      идентификатор документа
     * @param title   заголовок
     * @param content содержимое
     * @return добавленный документ
     * @throws IllegalArgumentException если id уже существует
     */
    public Document addDocument(String id, String title, String content) {
        // TODO: implement
        return null;
    }

    /**
     * Удаляет документ из индекса.
     *
     * @param documentId идентификатор документа
     * @throws IllegalArgumentException если документ не найден
     */
    public void removeDocument(String documentId) {
        // TODO: implement
    }

    /**
     * Ищет документы, содержащие ВСЕ слова запроса (AND-семантика).
     * Результаты ранжированы по суммарному TF (убывание).
     *
     * @param query поисковый запрос (одно или несколько слов)
     * @return список результатов поиска
     */
    public List<SearchResult> search(String query) {
        // TODO: implement
        return List.of();
    }

    /**
     * Ищет документы, содержащие ЛЮБОЕ слово запроса (OR-семантика).
     * Результаты ранжированы по суммарному TF (убывание).
     *
     * @param query поисковый запрос
     * @return список результатов поиска
     */
    public List<SearchResult> searchAny(String query) {
        // TODO: implement
        return List.of();
    }

    /**
     * Возвращает содержимое документа с подсветкой слов из запроса.
     * Слова из запроса оборачиваются в квадратные скобки: слово -> [слово]
     *
     * @param documentId идентификатор документа
     * @param query      поисковый запрос
     * @return текст с подсветкой
     * @throws IllegalArgumentException если документ не найден
     */
    public String highlight(String documentId, String query) {
        // TODO: implement
        return null;
    }

    public static void main(String[] args) {
        System.out.println("=== SearchEngineService: Smoke Test ===");
        // TODO: создать тестовые данные и проверить основные сценарии
    }
}
