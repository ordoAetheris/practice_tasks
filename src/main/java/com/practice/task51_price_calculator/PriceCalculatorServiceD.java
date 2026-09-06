package com.practice.task51_price_calculator;

import java.math.BigDecimal;
import java.util.List;

/**
 * ЦЕНА — ВАРИАНТ D: РАСШИРЯЕМОСТЬ (strategy скидок)
 *
 * <p>CORE = базовый {@link PriceCalculatorService}.</p>
 *
 * <p><b>ВАРИАНТ D — открытость к расширению [prim: strategy, open-closed]:</b></p>
 * <ul>
 *   <li>Типы скидок (процент, фикс, N+1, порог суммы) — стратегии, регистрируются без правки ядра расчёта.</li>
 *   <li>Композиция/приоритет скидок; findBestDiscount выбирает выгоднейшую по стратегии.</li>
 *   <li>Проверка: добавил новый тип скидки регистрацией → работает; ядро не менялось.</li>
 * </ul>
 */
public class PriceCalculatorServiceD {
    public interface DiscountStrategy { BigDecimal apply(BigDecimal base); }
    public void registerDiscount(String name, DiscountStrategy strategy){ throw new UnsupportedOperationException("TODO: variant D — pluggable discount strategies"); }
    public static void main(String[] a){ System.out.println("=== PriceCalculatorServiceD (extensibility): Smoke ==="); }
}
