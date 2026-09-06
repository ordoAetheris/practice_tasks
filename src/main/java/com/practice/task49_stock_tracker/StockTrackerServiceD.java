package com.practice.task49_stock_tracker;

import java.util.List;
import java.util.Map;

/**
 * АКЦИИ — ВАРИАНТ D: TOP-N GAINERS/LOSERS (heap)
 *
 * <p>CORE = базовый {@link StockTrackerService}.</p>
 *
 * <p><b>ВАРИАНТ D — top-n [prim: heap, top-k]:</b></p>
 * <ul>
 *   <li>getTopGainers/getTopLosers через кучу размера n по изменению цены, не сортируя все символы.</li>
 *   <li>Проверка: top-5 растущих/падающих совпадает с полным ранжированием.</li>
 * </ul>
 */
public class StockTrackerServiceD {
    public List<Map.Entry<String, Double>> getTopGainers(int n){ throw new UnsupportedOperationException("TODO: variant D — top-n via heap"); }
    public static void main(String[] a){ System.out.println("=== StockTrackerServiceD (top-n): Smoke ==="); }
}
