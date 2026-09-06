package com.practice.task48_metrics_collector;

import java.time.Instant;

/**
 * МЕТРИКИ — ВАРИАНТ B: THREAD-SAFE RECORD
 *
 * <p>CORE = базовый {@link MetricsCollectorService} (record + getAvg/Min/Max/Percentile за окно).</p>
 *
 * <p><b>ВАРИАНТ B — потокобезопасность [prim: mutual-excl ⭐, striping]:</b></p>
 * <ul>
 *   <li>Конкурентный record одной метрики не теряет точки; агрегаты согласованы под гонкой.</li>
 *   <li>Проверка: K потоков record → count точен, avg корректен.</li>
 * </ul>
 */
public class MetricsCollectorServiceB {
    public void record(String metricName, double value, Instant timestamp){ throw new UnsupportedOperationException("TODO: variant B — thread-safe record"); }
    public double getAvg(String metricName, long windowMs){ throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== MetricsCollectorServiceB (thread-safe): Smoke ==="); }
}
