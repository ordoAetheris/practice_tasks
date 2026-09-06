package com.practice.task51_price_calculator;

import java.math.BigDecimal;
import java.util.List;

/**
 * ЦЕНА — ВАРИАНТ B: ТОЧНОСТЬ (BigDecimal)
 *
 * <p>CORE = базовый {@link PriceCalculatorService} (calculatePrice(items,discounts)).</p>
 *
 * <p><b>ВАРИАНТ B — денежная точность [prim: BigDecimal, rounding]:</b></p>
 * <ul>
 *   <li>Все расчёты в BigDecimal с явным scale и RoundingMode (HALF_UP), без double.</li>
 *   <li>Порядок применения скидок и округления фиксирован (округлять на каждой позиции или в конце — зафиксировать).</li>
 *   <li>Проверка: цена копейка-в-копейку; 0.1+0.2 == 0.3; проценты скидок без накопления ошибки.</li>
 * </ul>
 */
public class PriceCalculatorServiceB {
    public BigDecimal calculatePrice(List<PriceCalculatorService.OrderItem> items, List<PriceCalculatorService.Discount> discounts){ throw new UnsupportedOperationException("TODO: variant B — exact BigDecimal money math"); }
    public static void main(String[] a){ System.out.println("=== PriceCalculatorServiceB (precision): Smoke ==="); }
}
