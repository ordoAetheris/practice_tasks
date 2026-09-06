package com.practice.task79_coroutine_scheduler;

/**
 * КОРУТИНЫ — ВАРИАНТ C: ПРИОРИТЕТЫ
 *
 * <p>CORE = базовый {@link CoroutineScheduler}.</p>
 *
 * <p><b>ВАРИАНТ C — приоритетное планирование [prim: priority-scheduling]:</b></p>
 * <ul>
 *   <li>schedule() выбирает готовую корутину с наивысшим приоритетом (priority-queue), а не FIFO.</li>
 *   <li>Защита от голодания низкоприоритетных (aging) — по желанию.</li>
 *   <li>Проверка: при равной готовности первым исполняется высокоприоритетный; порядок соответствует приоритетам.</li>
 * </ul>
 */
public class CoroutineSchedulerC {
    public String create(Runnable body, int priority){ throw new UnsupportedOperationException("TODO: variant C — priority scheduling"); }
    public void schedule(){ throw new UnsupportedOperationException("TODO: variant C — pick highest priority ready"); }
    public static void main(String[] a){ System.out.println("=== CoroutineSchedulerC (priority): Smoke ==="); }
}
