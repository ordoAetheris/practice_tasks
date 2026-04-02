package com.practice.task11_parking_lot;

import java.util.*;

/**
 * Система парковки.
 *
 * <p>Реализовать in-memory систему управления парковкой.
 * Парковка имеет несколько этажей, каждый этаж содержит парковочные места разных типов.
 * Транспортные средства разных типов могут занимать только подходящие места.</p>
 *
 * <p>Уровень: Базовый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task11_parking_lot/ParkingLotService.java
 * java -cp src/main/java com.practice.task11_parking_lot.ParkingLotService
 * </pre>
 */
public class ParkingLotService {

    public enum SpotType { REGULAR, HANDICAPPED, LARGE }
    public enum VehicleType { MOTORCYCLE, CAR, TRUCK }

    public record ParkingSpot(String id, int floor, SpotType type, boolean occupied) {}
    public record Vehicle(String licensePlate, VehicleType type) {}
    public record ParkingTicket(String id, String spotId, String licensePlate, long entryTime) {}

    /**
     * Инициализировать парковку
     * @param floors количество этажей
     * @param spotsPerFloor количество мест на этаж (распределение типов на усмотрение)
     */
    public void init(int floors, int spotsPerFloor) {
        //TODO implement
    }

    /**
     * Припарковать транспортное средство
     * @param vehicle транспортное средство
     * @return парковочный билет или null если нет подходящих мест
     */
    public ParkingTicket park(Vehicle vehicle) {
        //TODO implement
        return null;
    }

    /**
     * Выезд с парковки
     * @param ticketId идентификатор билета
     * @return true если выезд успешен
     */
    public boolean leave(String ticketId) {
        //TODO implement
        return false;
    }

    /**
     * Найти свободные места по типу
     * @param type тип места (null — все типы)
     * @return список свободных мест
     */
    public List<ParkingSpot> findAvailableSpots(SpotType type) {
        //TODO implement
        return Collections.emptyList();
    }

    /**
     * Количество свободных мест
     */
    public int getAvailableCount() {
        //TODO implement
        return 0;
    }

    /**
     * Найти машину по номеру
     * @param licensePlate номер машины
     * @return место где припаркована или null
     */
    public ParkingSpot findVehicle(String licensePlate) {
        //TODO implement
        return null;
    }

    public static void main(String[] args) {
        System.out.println("=== ParkingLotService: Smoke Test ===");
        // TODO: создать парковку, припарковать несколько машин, проверить поиск
    }
}
