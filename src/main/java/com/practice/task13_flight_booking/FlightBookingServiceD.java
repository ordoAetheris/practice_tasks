package com.practice.task13_flight_booking;

/**
 * АВИАБИЛЕТЫ — ВАРИАНТ D: ИДЕМПОТЕНТНАЯ БРОНЬ (requestId)
 *
 * <p>CORE = базовый {@link FlightBookingService}.</p>
 *
 * <p><b>ВАРИАНТ D — идемпотентность [prim: idempotency ⭐, dedup]:</b></p>
 * <ul>
 *   <li>bookFlight с requestId: повтор с тем же requestId возвращает ту же бронь, второе место не занимает.</li>
 *   <li>Под гонкой двух одинаковых requestId — ровно одна бронь.</li>
 *   <li>Проверка: bookFlight(requestId) дважды → один Booking, свободных мест −1, не −2.</li>
 * </ul>
 */
public class FlightBookingServiceD {

    public void addFlight(FlightBookingService.Flight flight) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Идемпотентная бронь по requestId. */
    public FlightBookingService.Booking bookFlight(String requestId, String flightId, String passengerName) {
        throw new UnsupportedOperationException("TODO: variant D — idempotent booking by requestId");
    }

    public static void main(String[] args) {
        System.out.println("=== FlightBookingServiceD (идемпотентная бронь): Smoke ===");
    }
}
