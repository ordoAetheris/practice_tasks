package com.practice.task66_thread_safe_queue;

/**
 * BLOCKING QUEUE — ВАРИАНТ B: wait/notify + WHILE-GUARD
 *
 * <p>CORE = базовый {@link ThreadSafeQueue} (bounded put/take).</p>
 *
 * <p><b>ВАРИАНТ B — классика мониторов [prim: wait-notify, spurious-wakeup]:</b></p>
 * <ul>
 *   <li>put блокируется пока полна, take — пока пуста; ожидание в цикле WHILE (не if!) — защита от spurious wakeup и потерянных сигналов.</li>
 *   <li>notifyAll после изменения; синхронизация на одном мониторе.</li>
 *   <li>Проверка: producer быстрее consumer → put ждёт; ни один элемент не потерян/не задвоен.</li>
 * </ul>
 */
public class ThreadSafeQueueB<T> {
    public ThreadSafeQueueB(int capacity){ throw new UnsupportedOperationException("TODO"); }
    public void put(T item) throws InterruptedException { throw new UnsupportedOperationException("TODO: variant B — wait/notify with while-guard"); }
    public T take() throws InterruptedException { throw new UnsupportedOperationException("TODO: variant B"); }
    public static void main(String[] a){ System.out.println("=== ThreadSafeQueueB (wait/notify): Smoke ==="); }
}
