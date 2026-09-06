package com.practice.task56_interval_scheduler;

/**
 * ИНТЕРВАЛЫ — ВАРИАНТ C: RECURRING
 *
 * <p>CORE = базовый {@link IntervalSchedulerService}.</p>
 *
 * <p><b>ВАРИАНТ C — повторяющиеся интервалы [prim: recurrence]:</b></p>
 * <ul>
 *   <li>Периодические интервалы (каждый день/неделю) разворачиваются в конкретные вхождения в заданном диапазоне.</li>
 *   <li>Наложения считаются уже с учётом разворота повторов.</li>
 *   <li>Проверка: ежедневный интервал за неделю даёт 7 вхождений; наложения с разовыми находятся.</li>
 * </ul>
 */
public class IntervalSchedulerServiceC {
    public void addRecurring(IntervalSchedulerService.Interval base, long periodMs, int count){ throw new UnsupportedOperationException("TODO: variant C — expand recurring occurrences"); }
    public static void main(String[] a){ System.out.println("=== IntervalSchedulerServiceC (recurring): Smoke ==="); }
}
