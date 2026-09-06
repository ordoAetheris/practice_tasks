package com.practice.task14_hotel_reservation;

import java.time.LocalDate;

/**
 * ОТЕЛЬ — ВАРИАНТ D: ИДЕМПОТЕНТНАЯ БРОНЬ (requestId)
 *
 * <p>CORE = базовый {@link HotelReservationService}.</p>
 *
 * <p><b>ВАРИАНТ D — идемпотентность [prim: idempotency ⭐, dedup]:</b></p>
 * <ul>
 *   <li>reserve с requestId: повтор с тем же requestId возвращает ту же бронь.</li>
 *   <li>Под гонкой одинаковых requestId — одна бронь.</li>
 *   <li>Проверка: reserve(requestId) дважды → один Reservation.</li>
 * </ul>
 */
public class HotelReservationServiceD {

    public void addRoom(HotelReservationService.Room room) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Идемпотентная бронь по requestId. */
    public HotelReservationService.Reservation reserve(String requestId, String roomId, String guestName, LocalDate checkIn, LocalDate checkOut) {
        throw new UnsupportedOperationException("TODO: variant D — idempotent reserve by requestId");
    }

    public static void main(String[] args) {
        System.out.println("=== HotelReservationServiceD (идемпотентная бронь): Smoke ===");
    }
}
