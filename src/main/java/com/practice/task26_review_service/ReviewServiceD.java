package com.practice.task26_review_service;

/**
 * ОТЗЫВЫ — ВАРИАНТ D: ИДЕМПОТЕНТНЫЙ ОТЗЫВ
 *
 * <p>CORE = базовый {@link ReviewService}.</p>
 *
 * <p><b>ВАРИАНТ D — идемпотентность [prim: idempotency ⭐]:</b></p>
 * <ul>
 *   <li>Повтор addReview тем же (userId,productId) — обновление существующего, не второй отзыв;
 *       среднее пересчитать корректно (заменить старую оценку на новую).</li>
 *   <li>Проверка: addReview дважды одним userId с разными оценками → один отзыв, среднее по новой оценке.</li>
 * </ul>
 */
public class ReviewServiceD {

    public ReviewService.Review addReview(String productId, String userId, int rating, String text) {
        throw new UnsupportedOperationException("TODO: variant D — idempotent/upsert review");
    }

    public static void main(String[] args) {
        System.out.println("=== ReviewServiceD (идемпотентный отзыв): Smoke ===");
    }
}
