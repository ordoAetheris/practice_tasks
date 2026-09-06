package com.practice.task98_custom_thread_pool;

/**
 * WORK-STEALING POOL — ВАРИАНТ B: SHUTDOWN + TERMINATION (§5)
 *
 * <p>CORE = базовый {@link WorkStealingThreadPool} (per-worker deque, кража задач).</p>
 * <p><b>ВАРИАНТ B [prim: shutdown ⭐, termination ⭐]:</b> корректная остановка — перестать принимать, доработать
 * очереди воркеров и украденное, awaitTermination; edge: пустой пул, задача плодит подзадачи при shutdown.</p>
 */
public class WorkStealingThreadPoolB {
    public WorkStealingThreadPoolB(int workers){ throw new UnsupportedOperationException("TODO"); }
    public void submit(Runnable task){ throw new UnsupportedOperationException("TODO"); }
    public void shutdown(){ throw new UnsupportedOperationException("TODO: variant B — drain worker deques + await termination"); }
    public static void main(String[] a){ System.out.println("=== WorkStealingThreadPoolB (§5 shutdown): Smoke ==="); }
}
