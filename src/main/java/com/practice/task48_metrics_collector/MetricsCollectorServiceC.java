package com.practice.task48_metrics_collector;

/**
 * МЕТРИКИ — ВАРИАНТ C: ОКНО (кольцевой буфер)
 *
 * <p>CORE = базовый {@link MetricsCollectorService}.</p>
 *
 * <p><b>ВАРИАНТ C — окно [prim: ring-buffer, running-aggregate]:</b></p>
 * <ul>
 *   <li>Хранить точки в кольцевом буфере/бакетах по времени; агрегаты за окно — по живым бакетам, старые выпадают.</li>
 *   <li>Проверка: avg/min/max за окно не учитывают протухшие точки; память ограничена размером окна.</li>
 * </ul>
 */
public class MetricsCollectorServiceC {
    public double getAvg(String metricName, long windowMs){ throw new UnsupportedOperationException("TODO: variant C — ring-buffer window"); }
    public static void main(String[] a){ System.out.println("=== MetricsCollectorServiceC (window): Smoke ==="); }
}
