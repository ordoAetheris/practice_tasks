package com.practice.task76_time_series_db;

import java.util.List;

/**
 * TIME-SERIES — ВАРИАНТ B: ОКОННЫЙ ЗАПРОС / DOWNSAMPLE
 *
 * <p>CORE = базовый {@link TimeSeriesDB} (write/query).</p>
 *
 * <p><b>ВАРИАНТ B — агрегирующий запрос [prim: window, downsample]:</b></p>
 * <ul>
 *   <li>Downsample: агрегировать точки по интервалам (avg/min/max/sum) за диапазон — не отдавать сырьё.</li>
 *   <li>Проверка: запрос за час с интервалом 5м даёт 12 агрегированных точек; функция агрегации применяется верно.</li>
 * </ul>
 */
public class TimeSeriesDBB {
    public List<TimeSeriesDB.DownsampledPoint> downsample(String metric, long from, long to, long intervalMs, TimeSeriesDB.AggregateFunction fn){ throw new UnsupportedOperationException("TODO: variant B — windowed downsample query"); }
    public static void main(String[] a){ System.out.println("=== TimeSeriesDBB (window query): Smoke ==="); }
}
