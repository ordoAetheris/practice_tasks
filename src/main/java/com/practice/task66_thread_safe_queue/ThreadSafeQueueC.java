package com.practice.task66_thread_safe_queue;

/**
 * BLOCKING QUEUE — ВАРИАНТ C: ReentrantLock + ДВА Condition
 *
 * <p>CORE = базовый {@link ThreadSafeQueue}.</p>
 *
 * <p><b>ВАРИАНТ C — раздельные условия [prim: Condition await/signal]:</b></p>
 * <ul>
 *   <li>ReentrantLock + notFull/notEmpty Condition: producer ждёт notFull, consumer — notEmpty; сигналим точечно (signal, не signalAll).</li>
 *   <li>Меньше ложных пробуждений, чем один монитор; корректная передача сигнала под lock.</li>
 *   <li>Проверка: та же семантика, что B, но через Lock/Condition; нет потерянных сигналов.</li>
 * </ul>
 */
public class ThreadSafeQueueC<T> {
    public ThreadSafeQueueC(int capacity){ throw new UnsupportedOperationException("TODO"); }
    public void put(T item) throws InterruptedException { throw new UnsupportedOperationException("TODO: variant C — Lock + notFull/notEmpty conditions"); }
    public T take() throws InterruptedException { throw new UnsupportedOperationException("TODO: variant C"); }
    public static void main(String[] a){ System.out.println("=== ThreadSafeQueueC (Condition): Smoke ==="); }
}
