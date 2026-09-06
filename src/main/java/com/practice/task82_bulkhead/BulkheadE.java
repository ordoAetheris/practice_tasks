package com.practice.task82_bulkhead;

import java.util.concurrent.Callable;

/**
 * BULKHEAD — ВАРИАНТ E: + CIRCUIT BREAKER
 *
 * <p>CORE = базовый {@link Bulkhead}.</p>
 *
 * <p><b>ВАРИАНТ E — комбо с брейкером [prim: bounded-parallelism, FSM]:</b></p>
 * <ul>
 *   <li>Отсек + circuit breaker на partition: при серии ошибок отсек «открывается» (fast-fail), не тратя лимит на заведомо битый ресурс.</li>
 *   <li>Взаимодействие лимита допуска и состояния брейкера (open → мгновенный отказ, минуя семафор).</li>
 *   <li>Проверка: серия сбоев открывает брейкер отсека → вызовы отклоняются мгновенно; half-open пробует восстановление.</li>
 * </ul>
 */
public class BulkheadE {
    public BulkheadE(int permitsPerPartition, int failureThreshold, long resetTimeoutMs) { throw new UnsupportedOperationException("TODO"); }
    public <T> T execute(String partition, Callable<T> call) throws Exception { throw new UnsupportedOperationException("TODO: variant E — bulkhead + circuit breaker per partition"); }
    public static void main(String[] a){ System.out.println("=== Bulkhead E (+circuit breaker): Smoke ==="); }
}
