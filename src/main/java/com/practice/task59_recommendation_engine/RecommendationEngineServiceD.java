package com.practice.task59_recommendation_engine;

import java.util.List;

/**
 * РЕКОМЕНДАЦИИ — ВАРИАНТ D: COLD-START
 *
 * <p>CORE = базовый {@link RecommendationEngineService}.</p>
 *
 * <p><b>ВАРИАНТ D — холодный старт / edge [prim: null-edge ⭐, fallback]:</b></p>
 * <ul>
 *   <li>Новый пользователь без оценок / новый товар без взаимодействий → fallback (популярное/тренды), не пусто и не NPE.</li>
 *   <li>Все оценки одинаковы, один пользователь, запрос topN больше числа кандидатов.</li>
 *   <li>Проверка: холодный юзер получает осмысленные (популярные) рекомендации; границы не роняют.</li>
 * </ul>
 */
public class RecommendationEngineServiceD {
    public List<RecommendationEngineService.Recommendation> getRecommendations(String userId, int topN){ throw new UnsupportedOperationException("TODO: variant D — cold-start fallback + edge"); }
    public static void main(String[] a){ System.out.println("=== RecommendationEngineServiceD (cold-start): Smoke ==="); }
}
