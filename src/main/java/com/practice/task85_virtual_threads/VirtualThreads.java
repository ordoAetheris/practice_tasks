package com.practice.task85_virtual_threads;

import java.util.List;

/**
 * VIRTUAL THREADS (перенос из concurrency, бордерлайн) — ВАРИАНТ A: POOL → VIRTUAL (база)
 *
 * <p>CORE: миграция блокирующей нагрузки с пула платформенных потоков на виртуальные (Java 21).</p>
 *
 * <p><b>ВАРИАНТ A — pool→virtual [prim: virtual-threads]:</b></p>
 * <ul>
 *   <li>Executors.newVirtualThreadPerTaskExecutor вместо fixed pool: тысячи блокирующих задач без исчерпания ОС-потоков.</li>
 *   <li>Проверка: 10k блокирующих (sleep/IO-стаб) задач исполняются без OOM/исчерпания; быстрее, чем маленький платформенный пул.</li>
 * </ul>
 */
public class VirtualThreads {
    /** Исполнить блокирующие задачи на виртуальных потоках. */
    public void runTasks(List<Runnable> tasks) { throw new UnsupportedOperationException("TODO: variant A — virtual-thread-per-task"); }
    public static void main(String[] a){ System.out.println("=== VirtualThreads A (pool->virtual): Smoke ==="); }
}
