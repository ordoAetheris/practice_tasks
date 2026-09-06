package com.practice.task85_virtual_threads;

import java.util.List;
import java.util.concurrent.Callable;

/**
 * VIRTUAL THREADS — ВАРИАНТ B: STRUCTURED CONCURRENCY
 *
 * <p>CORE = базовый {@link VirtualThreads}.</p>
 *
 * <p><b>ВАРИАНТ B — структурная конкурентность [prim: structured-concurrency, cancellation ⭐]:</b></p>
 * <ul>
 *   <li>StructuredTaskScope: запустить подзадачи как единицу — при провале одной отменить остальные (shutdownOnFailure), при первой успешной — остальные не нужны (shutdownOnSuccess).</li>
 *   <li>Родитель ждёт всех; исключения агрегируются; нет «утёкших» потоков.</li>
 *   <li>Проверка: провал одной подзадачи отменяет сестёр; scope закрывается детерминированно.</li>
 * </ul>
 */
public class VirtualThreadsB {
    public <T> T raceFirstSuccess(List<Callable<T>> tasks) throws Exception { throw new UnsupportedOperationException("TODO: variant B — StructuredTaskScope shutdownOnSuccess"); }
    public <T> List<T> allOrCancel(List<Callable<T>> tasks) throws Exception { throw new UnsupportedOperationException("TODO: variant B — shutdownOnFailure"); }
    public static void main(String[] a){ System.out.println("=== VirtualThreads B (structured concurrency): Smoke ==="); }
}
