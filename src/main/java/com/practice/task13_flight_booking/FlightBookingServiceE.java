package com.practice.task13_flight_booking;

/**
 * АВИАБИЛЕТЫ — ВАРИАНТ E: ГРАНУЛЯРНЫЙ ЛОК + HOLD-EXPIRY
 *
 * <p>CORE = базовый {@link FlightBookingService}.</p>
 *
 * <p><b>ВАРИАНТ E — гранулярность + резерв [prim: striping, per-key-eviction, shutdown ⭐]:</b></p>
 * <ul>
 *   <li>Лок на конкретный рейс, не глобальный: брони РАЗНЫХ рейсов идут параллельно.</li>
 *   <li>hold(): временно удержать место с TTL; не подтверждено вовремя → авто-release (сброс резерва).</li>
 *   <li>Проверка: параллельные брони разных рейсов не сериализуются; протухший hold освобождает место.</li>
 * </ul>
 */
public class FlightBookingServiceE {

    public void addFlight(FlightBookingService.Flight flight) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Удержать место на TTL (мс); по истечении без confirm — место возвращается в пул. */
    public String hold(String flightId, String passengerName, long ttlMillis) {
        throw new UnsupportedOperationException("TODO: variant E — hold with TTL + auto-release");
    }

    public FlightBookingService.Booking confirm(String holdId) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        System.out.println("=== FlightBookingServiceE (granular lock + hold): Smoke ===");
    }
}
