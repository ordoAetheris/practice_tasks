package com.practice.task26_review_service;

/**
 * ОТЗЫВЫ — ВАРИАНТ B: ДВОЙНОЙ ОТЗЫВ (гонка)
 *
 * <p>CORE = базовый {@link ReviewService} (та же модель Review/ProductRating).</p>
 *
 * <p><b>ВАРИАНТ B — доменная гонка [prim: mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>Один userId шлёт отзыв на товар из двух потоков → наивная «проверка не-оставлял → добавить»
 *       создаёт два отзыва.</li>
 *   <li>ЗАДАЧА: один пользователь — один отзыв на товар, даже под гонкой.</li>
 *   <li>Проверка: N потоков addReview одним userId → ровно один отзыв.</li>
 * </ul>
 */
public class ReviewServiceB {

    public ReviewService.Review addReview(String productId, String userId, int rating, String text) {
        throw new UnsupportedOperationException("TODO: variant B — one review per (user,product)");
    }

    public static void main(String[] args) {
        System.out.println("=== ReviewServiceB (двойной отзыв): Smoke ===");
    }
}
