package com.practice.task16_order_management;

import java.util.List;

/**
 * ЗАКАЗЫ — ВАРИАНТ D: ИДЕМПОТЕНТНАЯ ОПЛАТА
 *
 * <p>CORE = базовый {@link OrderManagementService}.</p>
 *
 * <p><b>ВАРИАНТ D — идемпотентность [prim: idempotency ⭐]:</b></p>
 * <ul>
 *   <li>Повторный payOrder того же заказа (двойной клик/ретрай) не переводит статус второй раз
 *       и не списывает деньги дважды — no-op, если уже оплачен.</li>
 *   <li>Под гонкой двух payOrder — ровно один эффект.</li>
 *   <li>Проверка: payOrder дважды → статус PAID один раз, эффект один.</li>
 * </ul>
 */
public class OrderManagementServiceD {

    public String createOrder(String customerId, List<OrderManagementService.OrderItem> items) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Идемпотентная оплата: если уже PAID — no-op. */
    public void payOrder(String orderId) {
        throw new UnsupportedOperationException("TODO: variant D — idempotent pay");
    }

    public static void main(String[] args) {
        System.out.println("=== OrderManagementServiceD (идемпотентная оплата): Smoke ===");
    }
}
