package com.practice.task16_order_management;

import java.util.List;

/**
 * ЗАКАЗЫ — ВАРИАНТ B: ГОНКА СТАТУСА (FSM под конкурентой)
 *
 * <p>CORE = базовый {@link OrderManagementService} (та же модель Order/OrderItem, статусы FSM).</p>
 *
 * <p><b>ВАРИАНТ B — доменная гонка [prim: mutual-excl ⭐, FSM]:</b></p>
 * <ul>
 *   <li>Наивные payOrder и shipOrder/cancelOrder параллельно читают-проверяют-пишут статус
 *       → несогласованный переход (например, статус «оплачен» затирается «отменён»).</li>
 *   <li>ЗАДАЧА: изменение статуса — критическая секция на заказ; переходы согласованы.</li>
 *   <li>Проверка: конкурентные payOrder/cancelOrder → финальный статус валиден и один.</li>
 * </ul>
 */
public class OrderManagementServiceB {

    public String createOrder(String customerId, List<OrderManagementService.OrderItem> items) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Потокобезопасная оплата (критическая секция на заказ). */
    public void payOrder(String orderId) {
        throw new UnsupportedOperationException("TODO: variant B — status change under lock");
    }

    public void cancelOrder(String orderId) {
        throw new UnsupportedOperationException("TODO: variant B — status change under lock");
    }

    public static void main(String[] args) {
        System.out.println("=== OrderManagementServiceB (гонка статуса): Smoke ===");
    }
}
