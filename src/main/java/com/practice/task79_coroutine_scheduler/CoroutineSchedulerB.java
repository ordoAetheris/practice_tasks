package com.practice.task79_coroutine_scheduler;

/**
 * КОРУТИНЫ — ВАРИАНТ B: ОТМЕНА
 *
 * <p>CORE = базовый {@link CoroutineScheduler} (кооперативные корутины: create/resume/yield/schedule).</p>
 *
 * <p><b>ВАРИАНТ B — отмена [prim: cancellation ⭐]:</b></p>
 * <ul>
 *   <li>cancel(id): пометить корутину отменённой; при следующем resume/yield она завершается (кооперативно, проверяет флаг).</li>
 *   <li>Отменённая не планируется дальше; ресурсы освобождаются.</li>
 *   <li>Проверка: cancel во время SUSPENDED → корутина не возобновляется, статус COMPLETED/CANCELLED.</li>
 * </ul>
 */
public class CoroutineSchedulerB {
    public void cancel(String id){ throw new UnsupportedOperationException("TODO: variant B — cooperative cancellation"); }
    public static void main(String[] a){ System.out.println("=== CoroutineSchedulerB (cancel): Smoke ==="); }
}
