package com.practice.task51_price_calculator;

import java.math.BigDecimal;
import java.util.List;

/**
 * ЦЕНА — ВАРИАНТ C: EDGE
 *
 * <p>CORE = базовый {@link PriceCalculatorService}.</p>
 *
 * <p><b>ВАРИАНТ C — edge/null-safety [prim: null-edge ⭐]:</b></p>
 * <ul>
 *   <li>Пустая корзина (0.00), количество/цена 0, скидка &gt;100%, стакинг скидок в минус (не уходить ниже нуля).</li>
 *   <li>Неизвестный промокод, дублирующиеся скидки, null-позиция.</li>
 *   <li>Проверка: таблица границ; итог не отрицательный; скидка не превращает цену в минус.</li>
 * </ul>
 */
public class PriceCalculatorServiceC {
    public BigDecimal calculatePrice(List<PriceCalculatorService.OrderItem> items, List<PriceCalculatorService.Discount> discounts){ throw new UnsupportedOperationException("TODO: variant C — edge (empty/zero/over-discount)"); }
    public static void main(String[] a){ System.out.println("=== PriceCalculatorServiceC (edge): Smoke ==="); }
}
