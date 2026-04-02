package com.practice.task14_hotel_reservation;

import java.util.*;
import java.time.*;

/**
 * Бронирование отелей.
 *
 * <p>Реализовать in-memory сервис бронирования отелей.
 * Отели имеют комнаты разных типов. Нельзя бронировать на пересекающиеся даты.</p>
 *
 * <p>Уровень: Базовый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task14_hotel_reservation/HotelReservationService.java
 * java -cp src/main/java com.practice.task14_hotel_reservation.HotelReservationService
 * </pre>
 */
public class HotelReservationService {

    public enum RoomType { SINGLE, DOUBLE, SUITE }
    public enum ReservationStatus { CONFIRMED, CANCELLED }

    public record Room(String id, String hotelId, RoomType type, double pricePerNight) {}
    public record Reservation(String id, String roomId, String guestName,
                              LocalDate checkIn, LocalDate checkOut,
                              ReservationStatus status) {}

    /** Добавить отель */
    public String addHotel(String name) {
        //TODO implement
        return null;
    }

    /** Добавить комнату к отелю */
    public void addRoom(Room room) {
        //TODO implement
    }

    /**
     * Забронировать комнату
     * @throws IllegalStateException если даты пересекаются с существующей бронью
     */
    public Reservation reserve(String roomId, String guestName, LocalDate checkIn, LocalDate checkOut) {
        //TODO implement
        return null;
    }

    /** Отменить бронирование */
    public void cancelReservation(String reservationId) {
        //TODO implement
    }

    /** Свободные комнаты на даты */
    public List<Room> findAvailableRooms(String hotelId, LocalDate checkIn, LocalDate checkOut) {
        //TODO implement
        return Collections.emptyList();
    }

    /** Доход отеля за период */
    public double getRevenue(String hotelId, LocalDate from, LocalDate to) {
        //TODO implement
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("=== HotelReservationService: Smoke Test ===");
        // TODO: создать отель, комнаты, забронировать, проверить пересечения
    }
}
