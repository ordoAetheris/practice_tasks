package com.practice.task70_task_executor;

import java.util.concurrent.TimeUnit;

/**
 * ПУЛ ЗАДАЧ — ВАРИАНТ B: SHUTDOWN + awaitTermination
 *
 * <p>CORE = базовый {@link TaskExecutorService} (submit/Future, пул потоков).</p>
 *
 * <p><b>ВАРИАНТ B — корректная остановка [prim: shutdown ⭐, termination ⭐]:</b></p>
 * <ul>
 *   <li>shutdown(): не принимать новые, доработать принятые; awaitTermination(timeout) блокирует до завершения всех воркеров.</li>
 *   <li>Воркеры выходят из цикла при пустой очереди + флаге shutdown (не крутить busy-wait).</li>
 *   <li>Проверка: после shutdown submit отклоняется; awaitTermination возвращает true когда все задачи доделаны и потоки мертвы.</li>
 * </ul>
 */
public class TaskExecutorServiceB {
    public TaskExecutorServiceB(int threadCount){ throw new UnsupportedOperationException("TODO"); }
    public void shutdown(){ throw new UnsupportedOperationException("TODO: variant B — stop accepting, finish queued"); }
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException { throw new UnsupportedOperationException("TODO: variant B — block until all workers done"); }
    public static void main(String[] a){ System.out.println("=== TaskExecutorServiceB (shutdown+await): Smoke ==="); }
}
