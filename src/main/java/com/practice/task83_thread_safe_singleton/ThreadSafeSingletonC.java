package com.practice.task83_thread_safe_singleton;

/**
 * SINGLETON — ВАРИАНТ C: ENUM SINGLETON
 *
 * <p>CORE = базовый {@link ThreadSafeSingleton}.</p>
 *
 * <p><b>ВАРИАНТ C — enum [prim: class-init-safety, serialization-safe]:</b></p>
 * <ul>
 *   <li>Синглтон через enum с единственной константой INSTANCE: потокобезопасно, защищено от рефлексии и сериализации (Effective Java).</li>
 *   <li>Проверка: INSTANCE один; сериализация/десериализация не создаёт второй; рефлексия не ломает.</li>
 * </ul>
 */
public class ThreadSafeSingletonC {
    /** Enum-синглтон. */
    public enum Singleton {
        INSTANCE;
        public void doWork() { throw new UnsupportedOperationException("TODO: variant C — enum singleton method"); }
    }
    public static void main(String[] a){ System.out.println("=== Singleton C (enum): Smoke ==="); }
}
