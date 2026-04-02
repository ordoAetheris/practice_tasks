package com.practice.task70_recommendation_engine;

import java.util.*;

/**
 * РЕКОМЕНДАТЕЛЬНАЯ СИСТЕМА
 *
 * <p>Реализовать рекомендательную систему на основе коллаборативной фильтрации.
 * Система анализирует оценки пользователей и рекомендует товары на основе схожести
 * вкусов (user-based) и похожести товаров (item-based).</p>
 *
 * <h3>Основные операции:</h3>
 * <ul>
 *   <li>addRating(userId, itemId, score) — добавить оценку (1-5)</li>
 *   <li>getRecommendations(userId, topN) — collaborative filtering (user-based)</li>
 *   <li>getSimilarItems(itemId, topN) — item-based рекомендации</li>
 *   <li>getPersonalizedFeed(userId) — гибридная рекомендация</li>
 *   <li>computeSimilarity(userA, userB) — cosine similarity между пользователями</li>
 * </ul>
 *
 * <h3>Требования:</h3>
 * <ul>
 *   <li>Cosine similarity для вычисления схожести</li>
 *   <li>Не рекомендовать товары, которые пользователь уже оценил</li>
 *   <li>User-based: найти похожих пользователей, рекомендовать их высокооценённые товары</li>
 *   <li>Item-based: для товара найти похожие (по паттернам оценок)</li>
 *   <li>Гибрид: комбинация user-based и item-based подходов</li>
 *   <li>Оценка от 1 до 5 включительно</li>
 * </ul>
 *
 * <p>Уровень: Продвинутый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task70_recommendation_engine/RecommendationEngineService.java
 * java -cp src/main/java com.practice.task70_recommendation_engine.RecommendationEngineService
 * </pre>
 */
public class RecommendationEngineService {

    /**
     * Рекомендация с предсказанной оценкой.
     *
     * @param itemId идентификатор товара
     * @param predictedScore предсказанная оценка
     */
    public record Recommendation(String itemId, double predictedScore) {}

    /**
     * Добавляет или обновляет оценку пользователя для товара.
     *
     * @param userId идентификатор пользователя
     * @param itemId идентификатор товара
     * @param score оценка от 1 до 5
     * @throws IllegalArgumentException если score не в диапазоне [1, 5]
     */
    public void addRating(String userId, String itemId, int score) {
        // TODO: implement
    }

    /**
     * Рекомендует товары на основе коллаборативной фильтрации (user-based).
     * Находит пользователей с похожими оценками, рекомендует их высокооценённые товары.
     * Не включает товары, уже оценённые пользователем.
     *
     * @param userId идентификатор пользователя
     * @param topN максимальное количество рекомендаций
     * @return список рекомендаций, отсортированный по predictedScore (убывание)
     */
    public List<Recommendation> getRecommendations(String userId, int topN) {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Находит похожие товары на основе паттернов оценок (item-based).
     * Два товара похожи, если пользователи оценивают их одинаково.
     *
     * @param itemId идентификатор товара
     * @param topN максимальное количество похожих товаров
     * @return список похожих товаров с оценкой сходства
     */
    public List<Recommendation> getSimilarItems(String itemId, int topN) {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Персонализированная лента: гибрид user-based и item-based подходов.
     * Комбинирует оба метода для более точных рекомендаций.
     *
     * @param userId идентификатор пользователя
     * @return список рекомендаций
     */
    public List<Recommendation> getPersonalizedFeed(String userId) {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Вычисляет cosine similarity между двумя пользователями
     * на основе их общих оценок.
     *
     * <p>Формула: cos(A,B) = (A·B) / (||A|| * ||B||), где A и B — векторы оценок
     * по общим товарам.</p>
     *
     * @param userId1 id первого пользователя
     * @param userId2 id второго пользователя
     * @return значение от -1 до 1 (1 = полное совпадение, 0 = нет общих товаров)
     */
    public double computeSimilarity(String userId1, String userId2) {
        // TODO: implement
        return 0.0;
    }

    public static void main(String[] args) {
        System.out.println("=== RecommendationEngineService: Smoke Test ===");
        // TODO: smoke test
    }
}
