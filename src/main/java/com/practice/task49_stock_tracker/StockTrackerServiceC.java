package com.practice.task49_stock_tracker;

/**
 * АКЦИИ — ВАРИАНТ C: ОКНО (moving average / монотонный deque для min-max)
 *
 * <p>CORE = базовый {@link StockTrackerService}.</p>
 *
 * <p><b>ВАРИАНТ C — окно [prim: ring-buffer, running-aggregate, monotonic-deque]:</b></p>
 * <ul>
 *   <li>Скользящее среднее по окну — кольцевой буфер (O(1) на тик); min/max в окне — монотонный deque.</li>
 *   <li>Проверка: moving average размера W корректен на потоке; getMinMax окна O(1) амортизированно.</li>
 * </ul>
 */
public class StockTrackerServiceC {
    public double getMovingAverage(String symbol, int windowSize){ throw new UnsupportedOperationException("TODO: variant C — ring buffer + monotonic deque"); }
    public static void main(String[] a){ System.out.println("=== StockTrackerServiceC (window): Smoke ==="); }
}
