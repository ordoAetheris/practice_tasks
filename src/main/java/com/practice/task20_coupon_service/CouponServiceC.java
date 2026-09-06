package com.practice.task20_coupon_service;

/**
 * КУПОНЫ — ВАРИАНТ C: АТОМАРНЫЙ ИНКРЕМЕНТ В ПРЕДЕЛАХ ЛИМИТА
 *
 * <p>CORE = базовый {@link CouponService}.</p>
 *
 * <p><b>ВАРИАНТ C — атомарный переход [prim: atomicity, CAS]:</b></p>
 * <ul>
 *   <li>usedCount увеличивать через CAS-петлю только если usedCount&lt;maxUses; иначе отказ.</li>
 *   <li>Проверка: maxUses=M, N&gt;M потоков → ровно M успешных CAS; usedCount==M.</li>
 * </ul>
 */
public class CouponServiceC {

    public void addCoupon(String code, int discountPercent, int maxUses) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Применение через CAS usedCount в пределах maxUses. */
    public double applyCoupon(String code, String category, double originalPrice) {
        throw new UnsupportedOperationException("TODO: variant C — atomic bounded increment (CAS)");
    }

    public static void main(String[] args) {
        System.out.println("=== CouponServiceC (atomic bounded increment): Smoke ===");
    }
}
