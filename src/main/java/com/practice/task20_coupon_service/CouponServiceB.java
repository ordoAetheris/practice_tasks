package com.practice.task20_coupon_service;

/**
 * КУПОНЫ — ВАРИАНТ B: OVERISSUE (гонка исчерпания лимита)
 *
 * <p>CORE = базовый {@link CouponService} (та же модель Coupon: maxUses/usedCount).</p>
 *
 * <p><b>ВАРИАНТ B — доменная гонка [prim: mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>Остался 1 использование, N потоков applyCoupon → наивная «проверка usedCount&lt;maxUses → ++»
 *       выдаёт больше, чем maxUses (overissue).</li>
 *   <li>ЗАДАЧА: под гонкой применений не больше maxUses.</li>
 *   <li>Проверка: maxUses=M, N&gt;M потоков → ровно M успешных применений.</li>
 * </ul>
 */
public class CouponServiceB {

    public void addCoupon(String code, int discountPercent, int maxUses) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Потокобезопасное применение: не превысить maxUses под гонкой. */
    public double applyCoupon(String code, String category, double originalPrice) {
        throw new UnsupportedOperationException("TODO: variant B — no overissue under contention");
    }

    public static void main(String[] args) {
        System.out.println("=== CouponServiceB (overissue): Smoke ===");
    }
}
