package com.practice.task32_vending_machine;

import java.util.List;

/**
 * ВЕНДИНГ — ВАРИАНТ C: ГОНКА НА ПОСЛЕДНИЙ ТОВАР
 *
 * <p>CORE = базовый {@link VendingMachine}.</p>
 *
 * <p><b>ВАРИАНТ C — доменная гонка [prim: mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>Остался 1 экземпляр товара, два покупателя dispense одновременно → наивно оба получают товар.</li>
 *   <li>ЗАДАЧА: атомарное «есть в наличии → выдать и списать»; ровно один успех.</li>
 *   <li>Проверка: quantity=1, N потоков dispense → 1 выдача, quantity==0, минуса нет.</li>
 * </ul>
 */
public class VendingMachineC {

    public VendingMachineC(List<VendingMachine.Product> products) {
        throw new UnsupportedOperationException("TODO");
    }

    public VendingMachine.DispenseResult dispense() {
        throw new UnsupportedOperationException("TODO: variant C — atomic last-item dispense");
    }

    public static void main(String[] args) {
        System.out.println("=== VendingMachineC (гонка на последний товар): Smoke ===");
    }
}
