package com.practice.task47_log_aggregator;

import java.util.List;
import java.util.Map;

/**
 * ЛОГИ — ВАРИАНТ D: TOP-N ИСТОЧНИКОВ (heap)
 *
 * <p>CORE = базовый {@link LogAggregatorService}.</p>
 *
 * <p><b>ВАРИАНТ D — top-n [prim: heap, top-k]:</b></p>
 * <ul>
 *   <li>Top-N самых «шумных» источников/паттернов ошибок через кучу размера N.</li>
 *   <li>Проверка: top-5 источников по числу ошибок совпадает с полным подсчётом.</li>
 * </ul>
 */
public class LogAggregatorServiceD {
    public List<Map.Entry<String, Long>> getTopSources(int n){ throw new UnsupportedOperationException("TODO: variant D — top-n sources via heap"); }
    public static void main(String[] a){ System.out.println("=== LogAggregatorServiceD (top-n): Smoke ==="); }
}
