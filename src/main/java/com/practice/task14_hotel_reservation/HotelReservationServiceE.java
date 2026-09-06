package com.practice.task14_hotel_reservation;

import java.time.LocalDate;

/**
 * ОТЕЛЬ — ВАРИАНТ E: ГРАНУЛЯРНЫЙ ЛОК НА КОМНАТУ
 *
 * <p>CORE = базовый {@link HotelReservationService}.</p>
 *
 * <p><b>ВАРИАНТ E — гранулярность [prim: striping]:</b></p>
 * <ul>
 *   <li>Лок на конкретную комнату, а не на весь отель: брони РАЗНЫХ комнат идут параллельно.</li>
 *   <li>Проверка: N потоков на N разных комнат бронируют параллельно (нет глобальной сериализации);
 *       конкуренты на одну комнату — сериализуются.</li>
 * </ul>
 */
public class HotelReservationServiceE {

    public void addRoom(HotelReservationService.Room room) {
        throw new UnsupportedOperationException("TODO");
    }

    public HotelReservationService.Reservation reserve(String roomId, String guestName, LocalDate checkIn, LocalDate checkOut) {
        throw new UnsupportedOperationException("TODO: variant E — per-room lock striping");
    }

    public static void main(String[] args) {
        System.out.println("=== HotelReservationServiceE (per-room lock): Smoke ===");
    }
}
