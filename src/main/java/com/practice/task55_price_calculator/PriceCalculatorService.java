package com.practice.task55_price_calculator;

import java.math.BigDecimal;
import java.util.*;

/**
 * КАЛЬКУЛЯТОР ЦЕН СО СКИДКАМИ
 *
 * <p>Реализуйте калькулятор цен с поддержкой различных типов скидок.
 * Товар (Product) содержит: id, name, basePrice.
 * Скидка (Discount) содержит: type (PERCENTAGE/FIXED/BUY_N_GET_M), value,
 * applicableProducts (для каких товаров), minQuantity, stackable (можно ли суммировать).</p>
 *
 * <p>Необходимо реализовать следующие операции:</p>
 * <ul>
 *   <li>calculatePrice(items, discounts) — рассчитать итоговую цену с учётом скидок</li>
 *   <li>findBestDiscount(item, quantity, discounts) — найти лучшую скидку для товара</li>
 *   <li>applyPromoCodes(items, codes) — применить промокоды</li>
 *   <li>calculateTotal(items, discounts, taxPercent) — итоговая сумма с налогом</li>
 * </ul>
 *
 * <p>Бизнес-правила:</p>
 * <ul>
 *   <li>Нестекаемые скидки не суммируются — берётся лучшая (максимальная выгода)</li>
 *   <li>Стекаемые скидки применяются последовательно к уже скидочной цене</li>
 *   <li>Цена не может быть отрицательной (минимум 0)</li>
 *   <li>BUY_N_GET_M — купи N штук, получи M бесплатно (value = N, дополнительный параметр = M)</li>
 *   <li>minQuantity — минимальное количество для активации скидки</li>
 * </ul>
 *
 * <p>Уровень: Средний</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task55_price_calculator/PriceCalculatorService.java
 * java -cp src/main/java com.practice.task55_price_calculator.PriceCalculatorService
 * </pre>
 */
public class PriceCalculatorService {

    public enum DiscountType {
        PERCENTAGE, FIXED, BUY_N_GET_M
    }

    public record Product(
            String id,
            String name,
            BigDecimal basePrice
    ) {}

    public record OrderItem(
            Product product,
            int quantity
    ) {}

    public record Discount(
            String id,
            DiscountType type,
            BigDecimal value,
            int freeQuantity,
            Set<String> applicableProductIds,
            int minQuantity,
            boolean stackable
    ) {}

    public record PriceBreakdown(
            BigDecimal subtotal,
            BigDecimal totalDiscount,
            BigDecimal tax,
            BigDecimal total
    ) {}

    /**
     * Рассчитывает итоговую цену для списка товаров с учётом скидок.
     * @param items список товаров с количествами
     * @param discounts доступные скидки
     * @return итоговая цена
     */
    public BigDecimal calculatePrice(List<OrderItem> items, List<Discount> discounts) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Находит лучшую скидку для конкретного товара с учётом количества.
     * @param item товар
     * @param quantity количество
     * @param discounts доступные скидки
     * @return лучшая скидка или Optional.empty()
     */
    public Optional<Discount> findBestDiscount(Product item, int quantity, List<Discount> discounts) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Применяет промокоды к заказу.
     * @param items список товаров
     * @param promoCodes список промокодов
     * @return итоговая цена после применения промокодов
     */
    public BigDecimal applyPromoCodes(List<OrderItem> items, List<String> promoCodes) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Рассчитывает полную стоимость: цена со скидками + налог.
     * @param items список товаров
     * @param discounts доступные скидки
     * @param taxPercent процент налога
     * @return разбивка цены (подитог, скидка, налог, итого)
     */
    public PriceBreakdown calculateTotal(List<OrderItem> items, List<Discount> discounts,
                                          BigDecimal taxPercent) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    public static void main(String[] args) {
        System.out.println("=== PriceCalculatorService: Smoke Test ===");
        // TODO: smoke test
    }
}
