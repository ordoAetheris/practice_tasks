package com.practice.task32_vending_machine;

import java.util.List;

/**
 * ВЕНДИНГ — ВАРИАНТ D: ИДЕМПОТЕНТНАЯ ОПЛАТА/ВЫДАЧА
 *
 * <p>CORE = базовый {@link VendingMachine}.</p>
 *
 * <p><b>ВАРИАНТ D — идемпотентность [prim: idempotency ⭐]:</b></p>
 * <ul>
 *   <li>Повторный dispense после уже выданного (двойное нажатие) не выдаёт второй товар и не списывает деньги дважды.</li>
 *   <li>Проверка: dispense дважды за одну «сессию оплаты» → один товар, баланс/сдача корректны.</li>
 * </ul>
 */
public class VendingMachineD {

    public VendingMachineD(List<VendingMachine.Product> products) {
        throw new UnsupportedOperationException("TODO");
    }

    public VendingMachine.DispenseResult dispense() {
        throw new UnsupportedOperationException("TODO: variant D — idempotent dispense");
    }

    public static void main(String[] args) {
        System.out.println("=== VendingMachineD (идемпотентная выдача): Smoke ===");
    }
}
