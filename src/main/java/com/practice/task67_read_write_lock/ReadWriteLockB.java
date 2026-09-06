package com.practice.task67_read_write_lock;

/**
 * RW-LOCK — ВАРИАНТ B: FAIR vs UNFAIR (анти-голодание писателей)
 *
 * <p>CORE = базовый {@link ReadWriteLock} (много читателей ИЛИ один писатель).</p>
 *
 * <p><b>ВАРИАНТ B — политика справедливости [prim: rw-lock, fairness]:</b></p>
 * <ul>
 *   <li>Unfair: читатели могут голодать писателя (постоянный поток читателей). Fair: ожидающий писатель блокирует НОВЫХ читателей.</li>
 *   <li>Реализовать оба режима; считать waitingWriters, чтобы читатели уступали.</li>
 *   <li>Проверка: в fair-режиме писатель получает лок за конечное время при потоке читателей.</li>
 * </ul>
 */
public class ReadWriteLockB {
    public ReadWriteLockB(boolean fair){ throw new UnsupportedOperationException("TODO"); }
    public void acquireRead() throws InterruptedException { throw new UnsupportedOperationException("TODO: variant B — fair/unfair read"); }
    public void acquireWrite() throws InterruptedException { throw new UnsupportedOperationException("TODO: variant B — writer no starvation in fair mode"); }
    public void releaseRead(){ throw new UnsupportedOperationException("TODO"); }
    public void releaseWrite(){ throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== ReadWriteLockB (fair/unfair): Smoke ==="); }
}
