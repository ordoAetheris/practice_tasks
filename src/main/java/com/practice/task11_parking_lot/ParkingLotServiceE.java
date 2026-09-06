package com.practice.task11_parking_lot;

/**
 * ПАРКОВКА — ВАРИАНТ E: ГРАНУЛЯРНЫЙ ЛОК / LOCK-ORDERING
 *
 * <p>CORE = базовый {@link ParkingLotService}.</p>
 *
 * <p><b>ВАРИАНТ E — гранулярность локов [prim: lock-ordering ⭐, striping]:</b></p>
 * <ul>
 *   <li>Не один глобальный лок на всю парковку: параллельная парковка на РАЗНЫЕ места
 *       не должна сериализоваться (лок на место/этаж — striping).</li>
 *   <li>Перемещение авто между этажами захватывает 2 ресурса → единый порядок захвата,
 *       чтобы не словить deadlock.</li>
 *   <li>Проверка: N потоков на N разных мест паркуются параллельно (без общей сериализации);
 *       перекрёстные relocate не зависают.</li>
 * </ul>
 */
public class ParkingLotServiceE {

    public void init(int floors, int spotsPerFloor) {
        throw new UnsupportedOperationException("TODO");
    }

    public ParkingLotService.ParkingTicket park(ParkingLotService.Vehicle vehicle) {
        throw new UnsupportedOperationException("TODO: variant E — per-spot lock (striping)");
    }

    /** Переставить авто на другое место: захват 2 локов в едином порядке (анти-deadlock). */
    public void relocate(String ticketId, String targetSpotId) {
        throw new UnsupportedOperationException("TODO: variant E — lock-ordering on relocate");
    }

    public static void main(String[] args) {
        System.out.println("=== ParkingLotServiceE (гранулярный лок / ordering): Smoke ===");
    }
}
