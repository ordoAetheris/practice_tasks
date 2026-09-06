package com.practice.task25_delivery_tracker;

/**
 * ДОСТАВКА — ВАРИАНТ B: ГОНКА СТАТУСА
 *
 * <p>CORE = базовый {@link DeliveryTrackerService} (та же модель Parcel/TrackingEvent/ParcelStatus).</p>
 *
 * <p><b>ВАРИАНТ B — доменная гонка [prim: mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>Параллельные updateStatus → несогласованные текущий статус и история событий.</li>
 *   <li>ЗАДАЧА: смена статуса + запись события — под защитой, согласованно.</li>
 *   <li>Проверка: конкурентные updateStatus → история монотонна, текущий статус == последнему событию.</li>
 * </ul>
 */
public class DeliveryTrackerServiceB {

    public DeliveryTrackerService.TrackingEvent updateStatus(String parcelId, DeliveryTrackerService.ParcelStatus newStatus, String location) {
        throw new UnsupportedOperationException("TODO: variant B — status+event under lock");
    }

    public static void main(String[] args) {
        System.out.println("=== DeliveryTrackerServiceB (гонка статуса): Smoke ===");
    }
}
