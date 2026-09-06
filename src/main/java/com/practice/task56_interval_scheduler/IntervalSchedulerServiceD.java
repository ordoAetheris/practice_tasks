package com.practice.task56_interval_scheduler;

import java.util.List;

/**
 * ИНТЕРВАЛЫ — ВАРИАНТ D: EDGE
 *
 * <p>CORE = базовый {@link IntervalSchedulerService}.</p>
 *
 * <p><b>ВАРИАНТ D — edge/null-safety [prim: null-edge ⭐]:</b></p>
 * <ul>
 *   <li>Соприкасающиеся интервалы [1,2)/[2,3) — наложение или нет? (зафиксировать границы). Нулевая длина, start&gt;end.</li>
 *   <li>Пустой набор, полностью вложенные интервалы, дубликаты.</li>
 *   <li>Проверка: граничные случаи наложения/merge детерминированы; mergeOverlapping корректен на вложенных.</li>
 * </ul>
 */
public class IntervalSchedulerServiceD {
    public List<IntervalSchedulerService.Interval> mergeOverlapping(){ throw new UnsupportedOperationException("TODO: variant D — edge (touching/zero-length/nested)"); }
    public static void main(String[] a){ System.out.println("=== IntervalSchedulerServiceD (edge): Smoke ==="); }
}
