package com.practice.task73_circuit_breaker;

import java.util.function.Supplier;

/**
 * CIRCUIT BREAKER — ВАРИАНТ C: МЕТРИКИ СКОЛЬЗЯЩЕГО ОКНА
 *
 * <p>CORE = базовый {@link CircuitBreaker}.</p>
 *
 * <p><b>ВАРИАНТ C — окно ошибок [prim: ring-buffer, running-aggregate]:</b></p>
 * <ul>
 *   <li>Открытие по ДОЛЕ ошибок в скользящем окне (например, &gt;50% за последние N вызовов/секунд), а не по абсолютному счётчику.</li>
 *   <li>Кольцевой буфер результатов/бакетов времени.</li>
 *   <li>Проверка: одиночные сбои среди массы успехов не открывают; всплеск ошибок в окне — открывает.</li>
 * </ul>
 */
public class CircuitBreakerC {
    public CircuitBreakerC(double errorRateThreshold, int windowSize, long resetTimeoutMs){ throw new UnsupportedOperationException("TODO"); }
    public <T> T call(Supplier<T> action){ throw new UnsupportedOperationException("TODO: variant C — sliding-window error rate"); }
    public static void main(String[] a){ System.out.println("=== CircuitBreakerC (window metrics): Smoke ==="); }
}
