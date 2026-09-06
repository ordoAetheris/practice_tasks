package com.practice.task49_stock_tracker;

import java.time.LocalDateTime;

/**
 * АКЦИИ — ВАРИАНТ B: THREAD-SAFE ЗАПИСЬ ЦЕН
 *
 * <p>CORE = базовый {@link StockTrackerService} (recordPrice/getMinMax/getMovingAverage).</p>
 *
 * <p><b>ВАРИАНТ B — потокобезопасность [prim: mutual-excl ⭐, striping]:</b></p>
 * <ul>
 *   <li>Конкурентный recordPrice по символу не теряет тиков; агрегаты (avg/min/max) согласованы.</li>
 *   <li>Проверка: K потоков пишут цены → история полна, moving average корректен.</li>
 * </ul>
 */
public class StockTrackerServiceB {
    public void recordPrice(String symbol, double price, LocalDateTime timestamp){ throw new UnsupportedOperationException("TODO: variant B — thread-safe price writes"); }
    public static void main(String[] a){ System.out.println("=== StockTrackerServiceB (thread-safe): Smoke ==="); }
}
