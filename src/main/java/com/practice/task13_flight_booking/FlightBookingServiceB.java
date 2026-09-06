package com.practice.task13_flight_booking;

/**
 * АВИАБИЛЕТЫ — ВАРИАНТ B: DOUBLE-BOOKING (гонка на последнее место)
 *
 * <p>CORE = базовый {@link FlightBookingService} (та же модель Flight/Booking).</p>
 *
 * <p><b>ВАРИАНТ B — доменная гонка [prim: mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>Свободно 1 место, 2+ потока bookFlight() → наивная «проверка мест → бронь» продаёт больше,
 *       чем есть (oversell).</li>
 *   <li>ЗАДАЧА: под гонкой ровно столько броней, сколько мест.</li>
 *   <li>Проверка: seats=1, N потоков → ровно 1 Booking, getAvailableSeats()==0.</li>
 * </ul>
 */
public class FlightBookingServiceB {

    public void addFlight(FlightBookingService.Flight flight) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Потокобезопасная бронь: без oversell под гонкой на последнее место. */
    public FlightBookingService.Booking bookFlight(String flightId, String passengerName) {
        throw new UnsupportedOperationException("TODO: variant B — no oversell under contention");
    }

    public int getAvailableSeats(String flightId) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        System.out.println("=== FlightBookingServiceB (double-booking): Smoke ===");
    }
}
