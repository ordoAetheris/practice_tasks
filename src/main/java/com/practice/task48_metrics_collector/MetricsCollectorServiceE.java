package com.practice.task48_metrics_collector;

/**
 * МЕТРИКИ — ВАРИАНТ E: EDGE
 *
 * <p>CORE = базовый {@link MetricsCollectorService}.</p>
 *
 * <p><b>ВАРИАНТ E — edge/null-safety [prim: null-edge ⭐]:</b></p>
 * <ul>
 *   <li>Пустое окно (avg/percentile без точек → определённое поведение, не NaN/деление на ноль), одна точка.</li>
 *   <li>Неизвестное имя метрики, окно=0, все значения равны, перцентиль 0/100.</li>
 *   <li>Проверка: границы дают осмысленный результат; пустая метрика не роняет.</li>
 * </ul>
 */
public class MetricsCollectorServiceE {
    public double getPercentile(String metricName, double percentile, long windowMs){ throw new UnsupportedOperationException("TODO: variant E — edge (empty/single/bounds)"); }
    public static void main(String[] a){ System.out.println("=== MetricsCollectorServiceE (edge): Smoke ==="); }
}
