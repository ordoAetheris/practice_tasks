package com.practice.task13_flight_booking;

/**
 * АВИАБИЛЕТЫ — ВАРИАНТ C: АТОМАРНОЕ СПИСАНИЕ МЕСТА
 *
 * <p>CORE = базовый {@link FlightBookingService}.</p>
 *
 * <p><b>ВАРИАНТ C — атомарный переход [prim: atomicity, CAS]:</b></p>
 * <ul>
 *   <li>availableSeats уменьшать атомарно: check(&gt;0)-and-decrement как единая операция
 *       (AtomicInteger + CAS-петля / лок на рейс / compute).</li>
 *   <li>Проверка: seats=M, N&gt;M потоков → ровно M броней, счётчик мест не уходит в минус.</li>
 * </ul>
 */
public class FlightBookingServiceC {

    public void addFlight(FlightBookingService.Flight flight) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Бронь через атомарный check-and-decrement свободных мест. */
    public FlightBookingService.Booking bookFlight(String flightId, String passengerName) {
        throw new UnsupportedOperationException("TODO: variant C — atomic seat decrement");
    }

    public static void main(String[] args) {
        System.out.println("=== FlightBookingServiceC (atomic seat decrement): Smoke ===");
    }
}
