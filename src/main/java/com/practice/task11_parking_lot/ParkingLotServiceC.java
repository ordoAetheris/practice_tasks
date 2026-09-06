package com.practice.task11_parking_lot;

/**
 * ПАРКОВКА — ВАРИАНТ C: АТОМАРНЫЙ ЗАХВАТ МЕСТА (CAS / лок на spot)
 *
 * <p>CORE = базовый {@link ParkingLotService}. Углубление механизма из B: КАК именно
 * сделать «занять место» атомарным.</p>
 *
 * <p><b>ВАРИАНТ C — атомарный переход [prim: atomicity, CAS]:</b></p>
 * <ul>
 *   <li>occupied: false → true как единая атомарная операция на конкретном месте
 *       (AtomicBoolean.compareAndSet / лок на spot / ConcurrentHashMap.compute).</li>
 *   <li>Проигравший CAS идёт искать следующее свободное место (retry-петля), а не падает сразу.</li>
 *   <li>Проверка: M мест, N&gt;M потоков → ровно M успешных парковок, ни одно место не выдано дважды.</li>
 * </ul>
 */
public class ParkingLotServiceC {

    public void init(int floors, int spotsPerFloor) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Захват места атомарным переходом occupied false→true; при проигрыше CAS — следующее свободное. */
    public ParkingLotService.ParkingTicket park(ParkingLotService.Vehicle vehicle) {
        throw new UnsupportedOperationException("TODO: variant C — atomic spot claim via CAS/lock");
    }

    public static void main(String[] args) {
        System.out.println("=== ParkingLotServiceC (атомарный захват): Smoke ===");
        // TODO: M мест, N>M потоков → ровно M парковок
    }
}
