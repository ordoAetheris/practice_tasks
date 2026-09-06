package com.practice.task16_order_management;

import java.util.List;

/**
 * ЗАКАЗЫ — ВАРИАНТ E: ГОНКА PAY vs CANCEL (ровно один терминал побеждает)
 *
 * <p>CORE = базовый {@link OrderManagementService}.</p>
 *
 * <p><b>ВАРИАНТ E — гонка на терминальный переход [prim: mutual-excl ⭐, FSM]:</b></p>
 * <ul>
 *   <li>payOrder и cancelOrder вызваны одновременно из статуса CREATED → должен победить РОВНО ОДИН
 *       (заказ либо PAID, либо CANCELLED), проигравший получает IllegalStateException.</li>
 *   <li>Никаких «оплачен И отменён»; переход через единый CAS/лок.</li>
 *   <li>Проверка: 1000 итераций гонки pay/cancel → всегда один терминал, второй отклонён.</li>
 * </ul>
 */
public class OrderManagementServiceE {

    public String createOrder(String customerId, List<OrderManagementService.OrderItem> items) {
        throw new UnsupportedOperationException("TODO");
    }

    public void payOrder(String orderId) {
        throw new UnsupportedOperationException("TODO: variant E — exactly one terminal wins");
    }

    public void cancelOrder(String orderId) {
        throw new UnsupportedOperationException("TODO: variant E — exactly one terminal wins");
    }

    public static void main(String[] args) {
        System.out.println("=== OrderManagementServiceE (pay vs cancel race): Smoke ===");
    }
}
