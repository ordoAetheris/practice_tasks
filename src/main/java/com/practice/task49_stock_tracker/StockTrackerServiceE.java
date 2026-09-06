package com.practice.task49_stock_tracker;

/**
 * АКЦИИ — ВАРИАНТ E: EDGE
 *
 * <p>CORE = базовый {@link StockTrackerService}.</p>
 *
 * <p><b>ВАРИАНТ E — edge/null-safety [prim: null-edge ⭐]:</b></p>
 * <ul>
 *   <li>Пустая история символа, одна цена (moving average = она сама), окно больше истории.</li>
 *   <li>Неизвестный символ, одинаковые цены (изменение 0), некорректный порядок timestamp.</li>
 *   <li>Проверка: границы не роняют; getCurrentPrice/movingAverage на пустом → осмысленно.</li>
 * </ul>
 */
public class StockTrackerServiceE {
    public double getMovingAverage(String symbol, int windowSize){ throw new UnsupportedOperationException("TODO: variant E — edge (empty/single/window>history)"); }
    public static void main(String[] a){ System.out.println("=== StockTrackerServiceE (edge): Smoke ==="); }
}
