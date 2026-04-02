package com.practice.task13_flight_booking;

import java.util.*;
import java.time.*;

/**
 * Бронирование авиабилетов.
 *
 * <p>Реализовать in-memory сервис бронирования авиабилетов.
 * Поддержка рейсов, бронирования мест, отмены, поиска рейсов.</p>
 *
 * <p>Уровень: Базовый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task13_flight_booking/FlightBookingService.java
 * java -cp src/main/java com.practice.task13_flight_booking.FlightBookingService
 * </pre>
 */
public class FlightBookingService {

    public enum BookingStatus { CONFIRMED, CANCELLED }

    public record Flight(String id, String from, String to,
                         LocalDateTime departureTime, LocalDateTime arrivalTime,
                         int totalSeats, double price) {}
    public record Booking(String id, String flightId, String passengerName,
                          int seatNumber, BookingStatus status) {}

    /** Добавить рейс */
    public void addFlight(Flight flight) {
        //TODO implement
    }

    /**
     * Забронировать место на рейс
     * @param flightId идентификатор рейса
     * @param passengerName имя пассажира
     * @return бронь
     * @throws IllegalStateException если нет свободных мест
     */
    public Booking bookFlight(String flightId, String passengerName) {
        //TODO implement
        return null;
    }

    /**
     * Отменить бронирование
     * @throws IllegalStateException если уже отменено
     */
    public void cancelBooking(String bookingId) {
        //TODO implement
    }

    /** Найти рейсы по маршруту */
    public List<Flight> findFlights(String from, String to) {
        //TODO implement
        return Collections.emptyList();
    }

    /** Найти рейсы на дату */
    public List<Flight> findFlightsByDate(LocalDate date) {
        //TODO implement
        return Collections.emptyList();
    }

    /** Количество свободных мест на рейс */
    public int getAvailableSeats(String flightId) {
        //TODO implement
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("=== FlightBookingService: Smoke Test ===");
        // TODO: создать рейсы, забронировать, проверить
    }
}
