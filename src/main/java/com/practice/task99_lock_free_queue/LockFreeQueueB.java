package com.practice.task99_lock_free_queue;

/**
 * LOCK-FREE QUEUE — ВАРИАНТ B: ABA-GUARD + EDGE (§5)
 *
 * <p>CORE = базовый {@link LockFreeQueue} (Michael-Scott, CAS на head/tail).</p>
 * <p><b>ВАРИАНТ B [prim: CAS, null-edge ⭐]:</b> защита от ABA (счётчик версий / AtomicStampedReference);
 * edge: пустая очередь (dequeue→null), гонка на последнем элементе, «хвост отстаёт» (helping).</p>
 */
public class LockFreeQueueB<T> {
    public void enqueue(T item){ throw new UnsupportedOperationException("TODO: variant B — CAS enqueue with ABA guard"); }
    public T dequeue(){ throw new UnsupportedOperationException("TODO: variant B — empty returns null"); }
    public static void main(String[] a){ System.out.println("=== LockFreeQueueB (§5 ABA/edge): Smoke ==="); }
}
