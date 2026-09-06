package com.practice.task11_parking_lot;

/**
 * ПАРКОВКА — ВАРИАНТ B: ГОНКА НА ПОСЛЕДНЕЕ МЕСТО (two cars → one spot)
 *
 * <p>CORE = базовый {@link ParkingLotService} (та же модель ParkingSpot/Vehicle/ParkingTicket).
 * Здесь дрилим ТОЛЬКО механику варианта.</p>
 *
 * <p><b>ВАРИАНТ B — доменная гонка [prim: mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>Свободно 1 место, 2+ потока park() одновременно → наивный «нашёл свободное → занял»
 *       отдаёт ОБОИМ один spot (overbook).</li>
 *   <li>ЗАДАЧА: под гонкой ровно один паркуется, остальные получают отказ (мест нет).</li>
 *   <li>Проверка: N потоков park при 1 месте → ровно 1 ticket, getAvailableCount()==0.</li>
 * </ul>
 */
public class ParkingLotServiceB {

    public void init(int floors, int spotsPerFloor) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Потокобезопасная парковка: под гонкой на последнее место — ровно один успех. */
    public ParkingLotService.ParkingTicket park(ParkingLotService.Vehicle vehicle) {
        throw new UnsupportedOperationException("TODO: variant B — no double-assign under contention");
    }

    public int getAvailableCount() {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        System.out.println("=== ParkingLotServiceB (гонка на место): Smoke ===");
        // TODO: 1 место, N потоков park → ровно 1 ticket
    }
}
