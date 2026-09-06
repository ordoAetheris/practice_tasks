package com.practice.task26_review_service;

/**
 * ОТЗЫВЫ — ВАРИАНТ E: ГРАНУЛЯРНЫЙ ЛОК НА ТОВАР
 *
 * <p>CORE = базовый {@link ReviewService}.</p>
 *
 * <p><b>ВАРИАНТ E — гранулярность [prim: striping]:</b></p>
 * <ul>
 *   <li>Лок/агрегат на конкретный productId: отзывы на РАЗНЫЕ товары идут параллельно, не через общий лок.</li>
 *   <li>Проверка: N потоков на N разных товаров добавляют отзывы параллельно; средние независимы и корректны.</li>
 * </ul>
 */
public class ReviewServiceE {

    public ReviewService.Review addReview(String productId, String userId, int rating, String text) {
        throw new UnsupportedOperationException("TODO: variant E — per-product lock striping");
    }

    public static void main(String[] args) {
        System.out.println("=== ReviewServiceE (granular lock): Smoke ===");
    }
}
