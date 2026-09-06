package com.practice.task82_bulkhead;

import java.util.concurrent.Callable;

/**
 * BULKHEAD — ВАРИАНТ B: SEMAPHORE ISOLATION
 *
 * <p>CORE = базовый {@link Bulkhead}.</p>
 *
 * <p><b>ВАРИАНТ B — изоляция семафором [prim: bounded-parallelism, semaphore]:</b></p>
 * <ul>
 *   <li>Вместо отдельных пулов — семафор на partition (лимит одновременных вызовов), исполнение в вызывающем потоке.</li>
 *   <li>Дешевле по потокам; tryAcquire с таймаутом → быстрый отказ при переполнении.</li>
 *   <li>Проверка: сверх лимита семафора вызовы отклоняются/ждут; другие partition независимы.</li>
 * </ul>
 */
public class BulkheadB {
    public BulkheadB(int permitsPerPartition) { throw new UnsupportedOperationException("TODO"); }
    public <T> T execute(String partition, Callable<T> call) throws Exception { throw new UnsupportedOperationException("TODO: variant B — semaphore isolation"); }
    public static void main(String[] a){ System.out.println("=== Bulkhead B (semaphore): Smoke ==="); }
}
