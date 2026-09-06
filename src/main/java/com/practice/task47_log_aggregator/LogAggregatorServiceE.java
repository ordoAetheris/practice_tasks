package com.practice.task47_log_aggregator;

/**
 * ЛОГИ — ВАРИАНТ E: EDGE (пустое окно / out-of-order)
 *
 * <p>CORE = базовый {@link LogAggregatorService}.</p>
 *
 * <p><b>ВАРИАНТ E — edge/null-safety [prim: null-edge ⭐]:</b></p>
 * <ul>
 *   <li>Пустое окно (error-rate=0, без деления на ноль), логи с меткой из будущего/прошлого (out-of-order).</li>
 *   <li>Окно больше истории, нулевая длительность окна, null-поля записи.</li>
 *   <li>Проверка: пустое окно → 0, не NaN; out-of-order не ломает агрегаты.</li>
 * </ul>
 */
public class LogAggregatorServiceE {
    public double getErrorRate(int windowMinutes){ throw new UnsupportedOperationException("TODO: variant E — edge (empty/out-of-order)"); }
    public static void main(String[] a){ System.out.println("=== LogAggregatorServiceE (edge): Smoke ==="); }
}
