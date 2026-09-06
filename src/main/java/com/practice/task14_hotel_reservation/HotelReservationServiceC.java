package com.practice.task14_hotel_reservation;

import java.time.LocalDate;

/**
 * ОТЕЛЬ — ВАРИАНТ C: АТОМАРНАЯ ПРОВЕРКА-И-ВСТАВКА ИНТЕРВАЛА
 *
 * <p>CORE = базовый {@link HotelReservationService}.</p>
 *
 * <p><b>ВАРИАНТ C — атомарный переход [prim: atomicity, mutual-excl]:</b></p>
 * <ul>
 *   <li>Проверка «нет пересечения с существующими бронями» и вставка новой — под одним локом на КОМНАТУ
 *       (единая критическая секция), а не два раздельных шага.</li>
 *   <li>Проверка: конкурентные брони на пересекающиеся/непересекающиеся интервалы — пересекающиеся
 *       отсекаются, непересекающиеся проходят.</li>
 * </ul>
 */
public class HotelReservationServiceC {

    public void addRoom(HotelReservationService.Room room) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Атомарная (под локом комнаты) проверка пересечения интервалов и вставка. */
    public HotelReservationService.Reservation reserve(String roomId, String guestName, LocalDate checkIn, LocalDate checkOut) {
        throw new UnsupportedOperationException("TODO: variant C — atomic interval check-then-insert");
    }

    public static void main(String[] args) {
        System.out.println("=== HotelReservationServiceC (atomic interval): Smoke ===");
    }
}
