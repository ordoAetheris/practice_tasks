package com.practice.task56_interval_scheduler;

/**
 * ИНТЕРВАЛЫ — ВАРИАНТ B: ОТМЕНА
 *
 * <p>CORE = базовый {@link IntervalSchedulerService} (addInterval/findOverlapping/mergeOverlapping).</p>
 *
 * <p><b>ВАРИАНТ B — отмена [prim: cancellation ⭐]:</b></p>
 * <ul>
 *   <li>removeInterval(id) безопасно отменяет запланированный интервал; повторная отмена — no-op.</li>
 *   <li>Отмена не должна ломать индекс наложений/структуру поиска.</li>
 *   <li>Проверка: после отмены интервал не участвует в findOverlapping/merge; двойная отмена без ошибки.</li>
 * </ul>
 */
public class IntervalSchedulerServiceB {
    public void removeInterval(String id){ throw new UnsupportedOperationException("TODO: variant B — safe cancel"); }
    public static void main(String[] a){ System.out.println("=== IntervalSchedulerServiceB (cancel): Smoke ==="); }
}
