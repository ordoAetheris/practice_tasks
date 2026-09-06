package com.practice.task82_bulkhead;

import java.util.concurrent.Callable;

/**
 * BULKHEAD (перенос из concurrency) — ВАРИАНТ A: THREAD-POOL ISOLATION (база)
 *
 * <p>CORE: изоляция ресурсов по «отсекам» — сбой/перегрузка одного не топит остальные (принцип переборок судна).</p>
 *
 * <p><b>ВАРИАНТ A — изоляция пулами [prim: bounded-parallelism, isolation]:</b></p>
 * <ul>
 *   <li>На каждый partition — свой ограниченный thread-pool; исчерпание пула одного не влияет на другие.</li>
 *   <li>Переполнение отсека → отказ/таймаут, а не блокировка всей системы.</li>
 *   <li>Проверка: «залипший» partition упирается в свой пул; вызовы других partition проходят свободно.</li>
 * </ul>
 */
public class Bulkhead {
    public Bulkhead(int partitions, int poolSizePerPartition) { throw new UnsupportedOperationException("TODO"); }
    public <T> T execute(String partition, Callable<T> call) throws Exception { throw new UnsupportedOperationException("TODO: variant A — per-partition thread-pool isolation"); }
    public static void main(String[] a){ System.out.println("=== Bulkhead A (thread-pool isolation): Smoke ==="); }
}
