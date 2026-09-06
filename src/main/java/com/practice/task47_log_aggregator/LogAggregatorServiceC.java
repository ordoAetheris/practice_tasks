package com.practice.task47_log_aggregator;

/**
 * ЛОГИ — ВАРИАНТ C: СКОЛЬЗЯЩЕЕ ОКНО ERROR-RATE
 *
 * <p>CORE = базовый {@link LogAggregatorService}.</p>
 *
 * <p><b>ВАРИАНТ C — окно [prim: ring-buffer, running-aggregate]:</b></p>
 * <ul>
 *   <li>getErrorRate за последние N минут через кольцевой буфер бакетов времени (O(1) на сдвиг), не пересчёт всего лога.</li>
 *   <li>Проверка: error-rate обновляется при сдвиге окна; старые бакеты выпадают.</li>
 * </ul>
 */
public class LogAggregatorServiceC {
    public double getErrorRate(int windowMinutes){ throw new UnsupportedOperationException("TODO: variant C — sliding window via ring buffer"); }
    public static void main(String[] a){ System.out.println("=== LogAggregatorServiceC (window): Smoke ==="); }
}
