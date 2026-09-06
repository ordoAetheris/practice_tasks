package com.practice.task83_thread_safe_singleton;

/**
 * SINGLETON — ВАРИАНТ D: EAGER vs LAZY
 *
 * <p>CORE = базовый {@link ThreadSafeSingleton}.</p>
 *
 * <p><b>ВАРИАНТ D — сравнение стратегий [prim: trade-off]:</b></p>
 * <ul>
 *   <li>Eager: instance = new при загрузке класса (просто и потокобезопасно, но создаётся всегда, даже если не нужен).</li>
 *   <li>Lazy: создаётся при первом обращении (экономно, но требует синхронизации/holder).</li>
 *   <li>Реализовать оба; понять когда что: дорогой в создании/не всегда нужный → lazy; дешёвый/всегда нужный → eager.</li>
 *   <li>Проверка: eager создан до первого getInstance(); lazy — только после.</li>
 * </ul>
 */
public class ThreadSafeSingletonD {
    /** Eager. */
    public static ThreadSafeSingletonD getEager() { throw new UnsupportedOperationException("TODO: variant D — eager"); }
    /** Lazy. */
    public static ThreadSafeSingletonD getLazy() { throw new UnsupportedOperationException("TODO: variant D — lazy"); }
    public static void main(String[] a){ System.out.println("=== Singleton D (eager vs lazy): Smoke ==="); }
}
