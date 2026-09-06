package com.practice.task11_parking_lot;

/**
 * ПАРКОВКА — ВАРИАНТ D: ИДЕМПОТЕНТНЫЙ ВЪЕЗД (repeat park → same ticket)
 *
 * <p>CORE = базовый {@link ParkingLotService}.</p>
 *
 * <p><b>ВАРИАНТ D — идемпотентность [prim: idempotency ⭐, dedup]:</b></p>
 * <ul>
 *   <li>Повторный park того же авто (по licensePlate, оно уже внутри) НЕ выдаёт второй ticket
 *       и не занимает второе место — возвращает существующий ticket.</li>
 *   <li>Под гонкой двух park одного авто — ровно один ticket.</li>
 *   <li>Проверка: park(plate) дважды → один и тот же ticket, occupied-мест +1, не +2.</li>
 * </ul>
 */
public class ParkingLotServiceD {

    public void init(int floors, int spotsPerFloor) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Идемпотентный въезд: авто уже внутри → вернуть его ticket, нового места не занимать. */
    public ParkingLotService.ParkingTicket park(ParkingLotService.Vehicle vehicle) {
        throw new UnsupportedOperationException("TODO: variant D — idempotent park by licensePlate");
    }

    public static void main(String[] args) {
        System.out.println("=== ParkingLotServiceD (идемпотентный въезд): Smoke ===");
    }
}
