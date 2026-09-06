package com.practice.task83_thread_safe_singleton;

/**
 * SINGLETON — ВАРИАНТ E: JMM / VOLATILE (почему DCL без volatile сломан)
 *
 * <p>CORE = базовый {@link ThreadSafeSingleton}.</p>
 *
 * <p><b>ВАРИАНТ E — модель памяти [prim: memory-visibility ⭐, happens-before]:</b></p>
 * <ul>
 *   <li>Показать/объяснить: без volatile DCL допускает публикацию частично сконструированного объекта
 *       (переупорядочивание записи ссылки до завершения конструктора) → другой поток видит «полу-объект».</li>
 *   <li>volatile даёт happens-before: запись полей в конструкторе видна до записи ссылки.</li>
 *   <li>Проверка: сформулировать инвариант видимости; корректная версия с volatile не отдаёт недостроенный объект.</li>
 * </ul>
 */
public class ThreadSafeSingletonE {
    private ThreadSafeSingletonE() { throw new UnsupportedOperationException("TODO"); }
    /** Корректный DCL с обоснованием роли volatile (happens-before). */
    public static ThreadSafeSingletonE getInstance() { throw new UnsupportedOperationException("TODO: variant E — safe publication via volatile (JMM)"); }
    public static void main(String[] a){ System.out.println("=== Singleton E (JMM/volatile): Smoke ==="); }
}
