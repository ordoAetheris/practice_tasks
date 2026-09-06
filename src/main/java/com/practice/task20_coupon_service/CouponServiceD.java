package com.practice.task20_coupon_service;

/**
 * КУПОНЫ — ВАРИАНТ D: ИДЕМПОТЕНТНОЕ ПРИМЕНЕНИЕ (на пользователя)
 *
 * <p>CORE = базовый {@link CouponService}.</p>
 *
 * <p><b>ВАРИАНТ D — идемпотентность [prim: idempotency ⭐, dedup]:</b></p>
 * <ul>
 *   <li>applyCoupon с userId: один пользователь применяет купон один раз; ретрай — тот же результат,
 *       usedCount не растёт повторно.</li>
 *   <li>Проверка: applyCoupon(user) дважды → скидка та же, usedCount +1, не +2.</li>
 * </ul>
 */
public class CouponServiceD {

    public void addCoupon(String code, int discountPercent, int maxUses) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Идемпотентное применение по (code,userId): повтор — тот же результат без роста usedCount. */
    public double applyCoupon(String code, String userId, String category, double originalPrice) {
        throw new UnsupportedOperationException("TODO: variant D — idempotent per-user apply");
    }

    public static void main(String[] args) {
        System.out.println("=== CouponServiceD (идемпотентное применение): Smoke ===");
    }
}
