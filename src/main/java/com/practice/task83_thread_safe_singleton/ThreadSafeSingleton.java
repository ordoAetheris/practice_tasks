package com.practice.task83_thread_safe_singleton;

/**
 * SINGLETON (перенос из concurrency) — ВАРИАНТ A: DOUBLE-CHECKED LOCKING (база)
 *
 * <p>CORE: ровно один экземпляр на JVM, потокобезопасная ленивая инициализация.</p>
 *
 * <p><b>ВАРИАНТ A — DCL [prim: memory-visibility ⭐, mutual-excl]:</b></p>
 * <ul>
 *   <li>Double-checked locking: проверка null без лока, затем под локом ещё раз; поле ОБЯЗАТЕЛЬНО volatile
 *       (иначе гонка публикации — частично сконструированный объект виден другому потоку).</li>
 *   <li>Проверка: N потоков getInstance() одновременно → один и тот же экземпляр, конструктор вызван 1 раз.</li>
 * </ul>
 */
public class ThreadSafeSingleton {
    private ThreadSafeSingleton() { throw new UnsupportedOperationException("TODO"); }
    /** DCL + volatile-поле. */
    public static ThreadSafeSingleton getInstance() { throw new UnsupportedOperationException("TODO: variant A — double-checked locking (volatile)"); }
    public static void main(String[] a){ System.out.println("=== Singleton A (DCL): Smoke ==="); }
}
