package com.practice.task59_recommendation_engine;

/**
 * РЕКОМЕНДАЦИИ — ВАРИАНТ C: THREAD-SAFE
 *
 * <p>CORE = базовый {@link RecommendationEngineService}.</p>
 *
 * <p><b>ВАРИАНТ C — потокобезопасность [prim: mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>Конкурентные addRating и getRecommendations согласованы; матрица co-occurrence обновляется атомарно.</li>
 *   <li>Проверка: K потоков добавляют оценки + запрашивают рекомендации → без гонок, счётчики точны.</li>
 * </ul>
 */
public class RecommendationEngineServiceC {
    public void addRating(String userId, String itemId, int score){ throw new UnsupportedOperationException("TODO: variant C — thread-safe rating updates"); }
    public static void main(String[] a){ System.out.println("=== RecommendationEngineServiceC (thread-safe): Smoke ==="); }
}
