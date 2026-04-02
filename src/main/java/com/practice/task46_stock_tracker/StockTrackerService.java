package com.practice.task46_stock_tracker;

import java.time.LocalDateTime;
import java.util.*;

/**
 * ТРЕКЕР ЦЕН АКЦИЙ
 *
 * <p>Реализуйте сервис отслеживания цен акций.
 * Запись цены (StockPrice) содержит: symbol (тикер), price, timestamp.</p>
 *
 * <p>Необходимо реализовать следующие операции:</p>
 * <ul>
 *   <li>recordPrice(symbol, price, timestamp) — записать цену акции</li>
 *   <li>getCurrentPrice(symbol) — получить последнюю цену</li>
 *   <li>getMinMax(symbol, fromTime, toTime) — минимальная и максимальная цена за период</li>
 *   <li>getMovingAverage(symbol, windowSize) — скользящее среднее по последним windowSize записям</li>
 *   <li>getPriceHistory(symbol, fromTime, toTime) — история цен за период</li>
 *   <li>getTopGainers(n) — n акций с наибольшим ростом за последний день</li>
 *   <li>getTopLosers(n) — n акций с наибольшим падением за последний день</li>
 * </ul>
 *
 * <p>Бизнес-правила:</p>
 * <ul>
 *   <li>Цена должна быть > 0</li>
 *   <li>Данные хранятся хронологически</li>
 *   <li>Рост/падение считается как (текущая - первая за день) / первая за день * 100%</li>
 *   <li>Если у акции нет данных за день, она не попадает в gainers/losers</li>
 * </ul>
 *
 * <p>Уровень: Средний</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task46_stock_tracker/StockTrackerService.java
 * java -cp src/main/java com.practice.task46_stock_tracker.StockTrackerService
 * </pre>
 */
public class StockTrackerService {

    public record StockPrice(
            String symbol,
            double price,
            LocalDateTime timestamp
    ) {}

    public record MinMaxResult(
            double min,
            double max
    ) {}

    /**
     * Записывает цену акции.
     * @param symbol тикер акции
     * @param price цена (> 0)
     * @param timestamp временная метка
     * @throws IllegalArgumentException если price <= 0
     */
    public void recordPrice(String symbol, double price, LocalDateTime timestamp) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Возвращает последнюю записанную цену акции.
     * @param symbol тикер акции
     * @return последняя цена
     * @throws NoSuchElementException если нет данных по акции
     */
    public double getCurrentPrice(String symbol) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Возвращает минимальную и максимальную цену акции за период.
     * @param symbol тикер акции
     * @param fromTime начало периода
     * @param toTime конец периода
     * @return пара (min, max)
     */
    public MinMaxResult getMinMax(String symbol, LocalDateTime fromTime, LocalDateTime toTime) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Вычисляет скользящее среднее по последним windowSize записям для акции.
     * @param symbol тикер акции
     * @param windowSize количество последних записей для расчёта
     * @return скользящее среднее
     */
    public double getMovingAverage(String symbol, int windowSize) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Возвращает историю цен акции за указанный период.
     * @param symbol тикер акции
     * @param fromTime начало периода
     * @param toTime конец периода
     * @return список записей цен, отсортированный хронологически
     */
    public List<StockPrice> getPriceHistory(String symbol, LocalDateTime fromTime, LocalDateTime toTime) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Возвращает n акций с наибольшим процентным ростом за текущий день.
     * @param n количество акций
     * @return список тикеров и процентов роста
     */
    public List<Map.Entry<String, Double>> getTopGainers(int n) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Возвращает n акций с наибольшим процентным падением за текущий день.
     * @param n количество акций
     * @return список тикеров и процентов падения
     */
    public List<Map.Entry<String, Double>> getTopLosers(int n) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    public static void main(String[] args) {
        System.out.println("=== StockTrackerService: Smoke Test ===");
        // TODO: smoke test
    }
}
