package com.practice.task26_review_service;

/**
 * ОТЗЫВЫ — ВАРИАНТ C: ГОНКА СРЕДНЕГО (running-average)
 *
 * <p>CORE = базовый {@link ReviewService}.</p>
 *
 * <p><b>ВАРИАНТ C — согласованный агрегат [prim: running-aggregate, atomicity]:</b></p>
 * <ul>
 *   <li>getAverageRating под конкурентными addReview/deleteReview не должен «рвать» sum и count
 *       (иначе среднее скачет/неверно). Поддерживать sum+count атомарно/консистентно.</li>
 *   <li>Проверка: K потоков add с известными оценками → среднее == точному; параллельный delete согласован.</li>
 * </ul>
 */
public class ReviewServiceC {

    public ReviewService.Review addReview(String productId, String userId, int rating, String text) {
        throw new UnsupportedOperationException("TODO: variant C — consistent running average");
    }

    public double getAverageRating(String productId) {
        throw new UnsupportedOperationException("TODO: variant C");
    }

    public static void main(String[] args) {
        System.out.println("=== ReviewServiceC (гонка среднего): Smoke ===");
    }
}
