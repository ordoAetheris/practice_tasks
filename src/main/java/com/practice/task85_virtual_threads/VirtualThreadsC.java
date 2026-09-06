package com.practice.task85_virtual_threads;

/**
 * VIRTUAL THREADS — ВАРИАНТ C: PINNING (подводные камни)
 *
 * <p>CORE = базовый {@link VirtualThreads}.</p>
 *
 * <p><b>ВАРИАНТ C — pinning [prim: virtual-threads, pitfalls]:</b></p>
 * <ul>
 *   <li>Виртуальный поток «прибивается» (pinned) к несущему при synchronized-блоке вокруг блокирующего вызова или в native — теряется выигрыш (несущий поток занят).</li>
 *   <li>Починка: заменить synchronized на ReentrantLock вокруг блокирующих участков.</li>
 *   <li>Проверка: воспроизвести pinning (synchronized + блокировка) → деградация; после замены на Lock — параллелизм восстановлен.</li>
 * </ul>
 */
public class VirtualThreadsC {
    public void blockingUnderSynchronized() { throw new UnsupportedOperationException("TODO: variant C — reproduce pinning (synchronized+block)"); }
    public void blockingUnderLock() { throw new UnsupportedOperationException("TODO: variant C — fix via ReentrantLock"); }
    public static void main(String[] a){ System.out.println("=== VirtualThreads C (pinning): Smoke ==="); }
}
