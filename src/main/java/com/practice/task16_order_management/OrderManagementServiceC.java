package com.practice.task16_order_management;

import java.util.List;

/**
 * ЗАКАЗЫ — ВАРИАНТ C: АТОМАРНЫЙ ВАЛИДНЫЙ ПЕРЕХОД FSM (CAS статуса)
 *
 * <p>CORE = базовый {@link OrderManagementService}.</p>
 *
 * <p><b>ВАРИАНТ C — атомарный переход [prim: FSM, CAS]:</b></p>
 * <ul>
 *   <li>Переход разрешён только из ожидаемого статуса: compareAndSet(expected→next) атомарно;
 *       иначе IllegalStateException (недопустимый переход).</li>
 *   <li>Матрица переходов: CREATED→PAID→SHIPPED→DELIVERED; CANCEL из не-терминальных.</li>
 *   <li>Проверка: нельзя shipOrder из CREATED; из PAID можно; двойной payOrder не проходит второй раз.</li>
 * </ul>
 */
public class OrderManagementServiceC {

    public String createOrder(String customerId, List<OrderManagementService.OrderItem> items) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Атомарный переход статуса compareAndSet(expected, next); недопустимый — исключение. */
    public void payOrder(String orderId) {
        throw new UnsupportedOperationException("TODO: variant C — CAS status transition");
    }

    public void shipOrder(String orderId) {
        throw new UnsupportedOperationException("TODO: variant C — CAS status transition");
    }

    public static void main(String[] args) {
        System.out.println("=== OrderManagementServiceC (atomic FSM transition): Smoke ===");
    }
}
