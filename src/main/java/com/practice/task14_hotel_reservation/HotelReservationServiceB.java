package com.practice.task14_hotel_reservation;

import java.time.LocalDate;

/**
 * ОТЕЛЬ — ВАРИАНТ B: DOUBLE-BOOKING ПЕРЕСЕКАЮЩИХСЯ ДАТ
 *
 * <p>CORE = базовый {@link HotelReservationService} (та же модель Room/Reservation).</p>
 *
 * <p><b>ВАРИАНТ B — доменная гонка [prim: mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>Два потока бронируют ОДИН номер на пересекающиеся даты → наивная «проверка занятости → вставка»
 *       под гонкой создаёт двойную бронь.</li>
 *   <li>ЗАДАЧА: под гонкой на одну комнату/интервал ровно одна бронь.</li>
 *   <li>Проверка: N потоков reserve одной комнаты на пересекающиеся даты → ровно 1 успех.</li>
 * </ul>
 */
public class HotelReservationServiceB {

    public void addRoom(HotelReservationService.Room room) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Потокобезопасная бронь: без двойного бронирования пересекающихся дат. */
    public HotelReservationService.Reservation reserve(String roomId, String guestName, LocalDate checkIn, LocalDate checkOut) {
        throw new UnsupportedOperationException("TODO: variant B — no overlapping double-booking");
    }

    public static void main(String[] args) {
        System.out.println("=== HotelReservationServiceB (double-booking дат): Smoke ===");
    }
}
