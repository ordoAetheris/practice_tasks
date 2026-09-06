package com.practice.task59_recommendation_engine;

import java.util.List;

/**
 * РЕКОМЕНДАЦИИ — ВАРИАНТ B: TOP-K (heap)
 *
 * <p>CORE = базовый {@link RecommendationEngineService} (co-occurrence, getRecommendations).</p>
 *
 * <p><b>ВАРИАНТ B — top-k [prim: heap, top-k]:</b></p>
 * <ul>
 *   <li>getRecommendations(topN) через min-heap размера N по предсказанному скору — без полной сортировки кандидатов.</li>
 *   <li>Проверка: top-10 рекомендаций совпадает с полным ранжированием.</li>
 * </ul>
 */
public class RecommendationEngineServiceB {
    public List<RecommendationEngineService.Recommendation> getRecommendations(String userId, int topN){ throw new UnsupportedOperationException("TODO: variant B — top-k via heap"); }
    public static void main(String[] a){ System.out.println("=== RecommendationEngineServiceB (top-k): Smoke ==="); }
}
