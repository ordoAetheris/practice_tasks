package com.practice.task48_metrics_collector;

/**
 * МЕТРИКИ — ВАРИАНТ D: ПЕРЦЕНТИЛИ (heap/приближение)
 *
 * <p>CORE = базовый {@link MetricsCollectorService}.</p>
 *
 * <p><b>ВАРИАНТ D — top-n/перцентили [prim: heap, sketch]:</b></p>
 * <ul>
 *   <li>getPercentile(p) через кучи (два heap для медианы) или приближённый sketch (t-digest-подобно) при большом потоке.</li>
 *   <li>Проверка: p50/p95/p99 близки к точным на известном распределении; память ограничена.</li>
 * </ul>
 */
public class MetricsCollectorServiceD {
    public double getPercentile(String metricName, double percentile, long windowMs){ throw new UnsupportedOperationException("TODO: variant D — percentile via heaps/sketch"); }
    public static void main(String[] a){ System.out.println("=== MetricsCollectorServiceD (percentiles): Smoke ==="); }
}
