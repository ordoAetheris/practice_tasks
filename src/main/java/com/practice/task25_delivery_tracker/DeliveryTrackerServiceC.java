package com.practice.task25_delivery_tracker;

/**
 * ДОСТАВКА — ВАРИАНТ C: АТОМАРНЫЙ ВАЛИДНЫЙ ПЕРЕХОД (FSM)
 *
 * <p>CORE = базовый {@link DeliveryTrackerService}.</p>
 *
 * <p><b>ВАРИАНТ C — атомарный переход [prim: FSM, CAS]:</b></p>
 * <ul>
 *   <li>Переход статуса разрешён только по матрице (CREATED→IN_TRANSIT→DELIVERED и т.п.);
 *       compareAndSet(expected→next). Назад/через ступень — запрет.</li>
 *   <li>Проверка: недопустимый переход отклонён; допустимый атомарен под гонкой.</li>
 * </ul>
 */
public class DeliveryTrackerServiceC {

    public DeliveryTrackerService.TrackingEvent updateStatus(String parcelId, DeliveryTrackerService.ParcelStatus newStatus, String location) {
        throw new UnsupportedOperationException("TODO: variant C — CAS valid FSM transition");
    }

    public static void main(String[] args) {
        System.out.println("=== DeliveryTrackerServiceC (atomic FSM): Smoke ===");
    }
}
