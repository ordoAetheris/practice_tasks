package com.practice.task73_vending_machine;

import java.util.*;

/**
 * ВЕНДИНГОВЫЙ АВТОМАТ (VENDING MACHINE)
 *
 * <p>Реализовать вендинговый автомат как конечный автомат состояний (State Machine).
 * Автомат принимает монеты, позволяет выбрать товар, выдаёт товар и сдачу.
 * Расчёт сдачи — жадный алгоритм (максимально крупные монеты).</p>
 *
 * <h3>Состояния:</h3>
 * <ul>
 *   <li>IDLE — ожидание (ни монет, ни выбора товара)</li>
 *   <li>COIN_INSERTED — внесены монеты, ожидание выбора товара</li>
 *   <li>DISPENSING — выдача товара и сдачи</li>
 * </ul>
 *
 * <h3>Основные операции:</h3>
 * <ul>
 *   <li>insertCoin(denomination) — внести монету</li>
 *   <li>selectProduct(code) — выбрать товар по коду</li>
 *   <li>dispense() — выдать товар и сдачу</li>
 *   <li>returnCoins() — вернуть все внесённые монеты</li>
 *   <li>getBalance() — текущий баланс внесённых монет</li>
 *   <li>getProducts() — список доступных товаров</li>
 *   <li>refill(code, quantity) — пополнить запас товара</li>
 * </ul>
 *
 * <h3>Требования:</h3>
 * <ul>
 *   <li>Строгий конечный автомат: операции допустимы только в определённых состояниях</li>
 *   <li>Жадный алгоритм расчёта сдачи: максимально крупные номиналы</li>
 *   <li>Нельзя выдать товар, если недостаточно денег или товар закончился</li>
 *   <li>returnCoins возвращает точные внесённые монеты</li>
 * </ul>
 *
 * <p>Уровень: Продвинутый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task73_vending_machine/VendingMachine.java
 * java -cp src/main/java com.practice.task73_vending_machine.VendingMachine
 * </pre>
 */
public class VendingMachine {

    /**
     * Состояние автомата.
     */
    public enum State {
        IDLE, COIN_INSERTED, DISPENSING
    }

    /**
     * Номинал монеты (в условных единицах).
     */
    public enum Coin {
        ONE(1), FIVE(5), TEN(10), TWENTY_FIVE(25), FIFTY(50);

        private final int value;

        Coin(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    /**
     * Товар в автомате.
     *
     * @param code код товара (например, "A1", "B2")
     * @param name название
     * @param price цена в условных единицах
     * @param quantity количество в наличии
     */
    public record Product(String code, String name, int price, int quantity) {}

    /**
     * Результат выдачи товара.
     *
     * @param product выданный товар
     * @param change список монет сдачи
     */
    public record DispenseResult(Product product, List<Coin> change) {}

    /**
     * Создаёт вендинговый автомат с указанными товарами.
     *
     * @param products начальный ассортимент товаров
     */
    public VendingMachine(List<Product> products) {
        // TODO: implement
    }

    /**
     * Вносит монету в автомат. Переводит состояние из IDLE в COIN_INSERTED.
     *
     * @param coin монета
     * @throws IllegalStateException если автомат в состоянии DISPENSING
     */
    public void insertCoin(Coin coin) {
        // TODO: implement
    }

    /**
     * Выбирает товар по коду. Проверяет наличие товара и достаточность средств.
     *
     * @param code код товара
     * @throws IllegalStateException если не в состоянии COIN_INSERTED
     * @throws IllegalArgumentException если товар не найден, закончился или недостаточно средств
     */
    public void selectProduct(String code) {
        // TODO: implement
    }

    /**
     * Выдаёт выбранный товар и рассчитывает сдачу (жадный алгоритм).
     * Переводит автомат обратно в IDLE.
     *
     * @return результат выдачи (товар + сдача)
     * @throws IllegalStateException если автомат не в состоянии DISPENSING
     */
    public DispenseResult dispense() {
        // TODO: implement
        return null;
    }

    /**
     * Возвращает все внесённые монеты. Переводит автомат в IDLE.
     *
     * @return список возвращённых монет
     */
    public List<Coin> returnCoins() {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Возвращает текущий баланс внесённых монет.
     *
     * @return сумма в условных единицах
     */
    public int getBalance() {
        // TODO: implement
        return 0;
    }

    /**
     * Возвращает текущее состояние автомата.
     *
     * @return состояние
     */
    public State getState() {
        // TODO: implement
        return State.IDLE;
    }

    /**
     * Возвращает список всех товаров с текущим количеством.
     *
     * @return список товаров
     */
    public List<Product> getProducts() {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Пополняет запас указанного товара.
     *
     * @param code код товара
     * @param quantity количество для добавления
     */
    public void refill(String code, int quantity) {
        // TODO: implement
    }

    public static void main(String[] args) {
        System.out.println("=== VendingMachine: Smoke Test ===");
        // TODO: smoke test
    }
}
