package com.practice.task66_thread_safe_queue;

/**
 * BLOCKING QUEUE — ВАРИАНТ E: MULTI-PROD/CONS + POISON-PILL SHUTDOWN
 *
 * <p>CORE = базовый {@link ThreadSafeQueue}.</p>
 *
 * <p><b>ВАРИАНТ E — завершение [prim: shutdown ⭐, termination ⭐, poison-pill]:</b></p>
 * <ul>
 *   <li>Несколько producer/consumer; корректное завершение через poison-pill (по одному на consumer) ИЛИ флаг+сигнал всем.</li>
 *   <li>Consumer'ы выходят, слив остаток; никто не виснет на take после shutdown (notifyAll/сигнал всем).</li>
 *   <li>Проверка: shutdown → все consumer завершаются, оставшиеся элементы обработаны, потоки не зависли.</li>
 * </ul>
 */
public class ThreadSafeQueueE<T> {
    public ThreadSafeQueueE(int capacity){ throw new UnsupportedOperationException("TODO"); }
    public void put(T item) throws InterruptedException { throw new UnsupportedOperationException("TODO"); }
    public T take() throws InterruptedException { throw new UnsupportedOperationException("TODO: variant E — returns null/sentinel on shutdown"); }
    public void shutdown(){ throw new UnsupportedOperationException("TODO: variant E — poison-pill / wake all"); }
    public static void main(String[] a){ System.out.println("=== ThreadSafeQueueE (poison-pill shutdown): Smoke ==="); }
}
