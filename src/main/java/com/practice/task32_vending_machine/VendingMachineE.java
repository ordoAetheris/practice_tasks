package com.practice.task32_vending_machine;

import java.util.List;

/**
 * ВЕНДИНГ — ВАРИАНТ E: СДАЧА-EDGE + THREAD-SAFE
 *
 * <p>CORE = базовый {@link VendingMachine}.</p>
 *
 * <p><b>ВАРИАНТ E — edge/null-safety [prim: null-edge ⭐, mutual-excl]:</b></p>
 * <ul>
 *   <li>Не хватает монет на точную сдачу → отказ и возврат внесённого (или запрос точной суммы).</li>
 *   <li>Ровно точная сумма (сдача 0), переплата, нет такого товара/кода, товар кончился.</li>
 *   <li>Потокобезопасный доступ к балансу/складу монет.</li>
 *   <li>Проверка: таблица сценариев сдачи; невозможная сдача не «съедает» деньги покупателя.</li>
 * </ul>
 */
public class VendingMachineE {

    public VendingMachineE(List<VendingMachine.Product> products) {
        throw new UnsupportedOperationException("TODO");
    }

    public List<VendingMachine.Coin> returnCoins() {
        throw new UnsupportedOperationException("TODO: variant E — change edge + thread-safe");
    }

    public VendingMachine.DispenseResult dispense() {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        System.out.println("=== VendingMachineE (сдача-edge + thread-safe): Smoke ===");
    }
}
