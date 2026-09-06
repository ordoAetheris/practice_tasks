package com.practice.task25_delivery_tracker;

/**
 * ДОСТАВКА — ВАРИАНТ E: ГРАНУЛЯРНЫЙ ЛОК НА ПОСЫЛКУ
 *
 * <p>CORE = базовый {@link DeliveryTrackerService}.</p>
 *
 * <p><b>ВАРИАНТ E — гранулярность [prim: striping]:</b></p>
 * <ul>
 *   <li>Лок на конкретную посылку: обновления РАЗНЫХ посылок идут параллельно.</li>
 *   <li>Проверка: N потоков обновляют N разных посылок параллельно (нет общей сериализации).</li>
 * </ul>
 */
public class DeliveryTrackerServiceE {

    public DeliveryTrackerService.TrackingEvent updateStatus(String parcelId, DeliveryTrackerService.ParcelStatus newStatus, String location) {
        throw new UnsupportedOperationException("TODO: variant E — per-parcel lock striping");
    }

    public static void main(String[] args) {
        System.out.println("=== DeliveryTrackerServiceE (granular lock): Smoke ===");
    }
}
