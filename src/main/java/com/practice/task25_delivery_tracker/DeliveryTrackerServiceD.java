package com.practice.task25_delivery_tracker;

/**
 * ДОСТАВКА — ВАРИАНТ D: ИДЕМПОТЕНТНОЕ ОБНОВЛЕНИЕ
 *
 * <p>CORE = базовый {@link DeliveryTrackerService}.</p>
 *
 * <p><b>ВАРИАНТ D — идемпотентность [prim: idempotency ⭐]:</b></p>
 * <ul>
 *   <li>Повторный updateStatus тем же статусом (дубль события трекинга) — no-op, второе событие не пишется.</li>
 *   <li>Проверка: updateStatus(DELIVERED) дважды → одно событие DELIVERED в истории.</li>
 * </ul>
 */
public class DeliveryTrackerServiceD {

    public DeliveryTrackerService.TrackingEvent updateStatus(String parcelId, DeliveryTrackerService.ParcelStatus newStatus, String location) {
        throw new UnsupportedOperationException("TODO: variant D — idempotent status update");
    }

    public static void main(String[] args) {
        System.out.println("=== DeliveryTrackerServiceD (идемпотентное обновление): Smoke ===");
    }
}
