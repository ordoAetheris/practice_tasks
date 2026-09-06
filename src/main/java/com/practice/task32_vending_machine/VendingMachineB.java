package com.practice.task32_vending_machine;

import java.util.List;

/**
 * ВЕНДИНГ — ВАРИАНТ B: FSM СОСТОЯНИЙ
 *
 * <p>CORE = базовый {@link VendingMachine} (та же модель State/Coin/Product/DispenseResult).</p>
 *
 * <p><b>ВАРИАНТ B — конечный автомат [prim: FSM]:</b></p>
 * <ul>
 *   <li>Состояния IDLE → HAS_MONEY → DISPENSING и валидные переходы: нельзя dispense без денег/товара,
 *       нельзя вставлять монеты во время выдачи.</li>
 *   <li>Проверка: недопустимые операции в неверном состоянии отклоняются; корректный сценарий проходит цикл.</li>
 * </ul>
 */
public class VendingMachineB {

    public VendingMachineB(List<VendingMachine.Product> products) {
        throw new UnsupportedOperationException("TODO");
    }

    public void insertCoin(VendingMachine.Coin coin) {
        throw new UnsupportedOperationException("TODO: variant B — guarded by state");
    }

    public VendingMachine.DispenseResult dispense() {
        throw new UnsupportedOperationException("TODO: variant B — valid FSM transition");
    }

    public static void main(String[] args) {
        System.out.println("=== VendingMachineB (FSM): Smoke ===");
    }
}
