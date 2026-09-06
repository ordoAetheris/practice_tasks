package com.practice.task70_task_executor;

/**
 * ПУЛ ЗАДАЧ — ВАРИАНТ C: BOUNDED QUEUE + REJECT POLICY
 *
 * <p>CORE = базовый {@link TaskExecutorService}.</p>
 *
 * <p><b>ВАРИАНТ C — ограниченная очередь [prim: backpressure, bounded]:</b></p>
 * <ul>
 *   <li>Очередь задач ограничена; при переполнении — политика: reject (исключение), caller-runs (выполнить в вызывающем), или block.</li>
 *   <li>Проверка: при заполнении очереди submit ведёт себя по выбранной политике (напр., бросает RejectedExecutionException).</li>
 * </ul>
 */
public class TaskExecutorServiceC {
    public enum RejectPolicy { ABORT, CALLER_RUNS, BLOCK }
    public TaskExecutorServiceC(int threadCount, int queueCapacity, RejectPolicy policy){ throw new UnsupportedOperationException("TODO: variant C — bounded queue + reject policy"); }
    public static void main(String[] a){ System.out.println("=== TaskExecutorServiceC (bounded/reject): Smoke ==="); }
}
