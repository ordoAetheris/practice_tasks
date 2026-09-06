package com.practice.task20_coupon_service;

/**
 * КУПОНЫ — ВАРИАНТ E: ГРАНУЛЯРНЫЙ ЛОК НА КУПОН
 *
 * <p>CORE = базовый {@link CouponService}.</p>
 *
 * <p><b>ВАРИАНТ E — гранулярность [prim: striping]:</b></p>
 * <ul>
 *   <li>Лок/атомарность на конкретный код купона: применения РАЗНЫХ купонов идут параллельно,
 *       не через один глобальный лок.</li>
 *   <li>Проверка: N потоков применяют N разных купонов параллельно (нет общей сериализации).</li>
 * </ul>
 */
public class CouponServiceE {

    public void addCoupon(String code, int discountPercent, int maxUses) {
        throw new UnsupportedOperationException("TODO");
    }

    public double applyCoupon(String code, String category, double originalPrice) {
        throw new UnsupportedOperationException("TODO: variant E — per-coupon lock striping");
    }

    public static void main(String[] args) {
        System.out.println("=== CouponServiceE (granular lock): Smoke ===");
    }
}
