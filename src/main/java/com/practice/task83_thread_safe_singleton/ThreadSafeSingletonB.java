package com.practice.task83_thread_safe_singleton;

/**
 * SINGLETON — ВАРИАНТ B: HOLDER IDIOM (lazy holder)
 *
 * <p>CORE = базовый {@link ThreadSafeSingleton}.</p>
 *
 * <p><b>ВАРИАНТ B — initialization-on-demand holder [prim: class-init-safety]:</b></p>
 * <ul>
 *   <li>Ленивая инициализация через вложенный статический класс-holder: JVM гарантирует потокобезопасность инициализации класса — без volatile/лока.</li>
 *   <li>Экземпляр создаётся при первом обращении к holder'у, не при загрузке внешнего класса.</li>
 *   <li>Проверка: instance не создан до первого getInstance(); под гонкой — один экземпляр.</li>
 * </ul>
 */
public class ThreadSafeSingletonB {
    private ThreadSafeSingletonB() { throw new UnsupportedOperationException("TODO"); }
    public static ThreadSafeSingletonB getInstance() { throw new UnsupportedOperationException("TODO: variant B — holder idiom (static nested class)"); }
    public static void main(String[] a){ System.out.println("=== Singleton B (holder): Smoke ==="); }
}
