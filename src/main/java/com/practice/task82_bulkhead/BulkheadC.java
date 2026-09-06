package com.practice.task82_bulkhead;

import java.util.concurrent.Callable;

/**
 * BULKHEAD — ВАРИАНТ C: VIRTUAL-THREAD ISOLATION
 *
 * <p>CORE = базовый {@link Bulkhead}.</p>
 *
 * <p><b>ВАРИАНТ C — виртуальные потоки [prim: bounded-parallelism, virtual-threads]:</b></p>
 * <ul>
 *   <li>Отсек на виртуальных потоках (Java 21): много блокирующих вызовов дёшево, лимит — через семафор допуска, а не размер пула ОС-потоков.</li>
 *   <li>Проверка: тысячи одновременных блокирующих вызовов в отсеке без исчерпания ОС-потоков; лимит соблюдён.</li>
 * </ul>
 */
public class BulkheadC {
    public BulkheadC(int concurrencyLimitPerPartition) { throw new UnsupportedOperationException("TODO"); }
    public <T> T execute(String partition, Callable<T> call) throws Exception { throw new UnsupportedOperationException("TODO: variant C — virtual-thread isolation + admission limit"); }
    public static void main(String[] a){ System.out.println("=== Bulkhead C (virtual-thread): Smoke ==="); }
}
