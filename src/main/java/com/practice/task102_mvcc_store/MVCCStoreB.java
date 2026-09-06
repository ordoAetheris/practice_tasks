package com.practice.task102_mvcc_store;

/**
 * MVCC STORE — ВАРИАНТ B: SNAPSHOT ISOLATION + VERSION GC (§5)
 *
 * <p>CORE = базовый {@link MVCCStore} (версии значений по txId).</p>
 * <p><b>ВАРИАНТ B [prim: mutual-excl ⭐, per-key-eviction]:</b> чтение видит снимок на момент старта транзакции
 * (snapshot isolation); GC старых версий, невидимых ни одной живой транзакции; edge: write-write конфликт, tombstone.</p>
 */
public class MVCCStoreB {
    public String read(long txId, String key){ throw new UnsupportedOperationException("TODO: variant B — snapshot read"); }
    public void write(long txId, String key, String value){ throw new UnsupportedOperationException("TODO"); }
    public int gc(long oldestActiveTxId){ throw new UnsupportedOperationException("TODO: variant B — reclaim invisible versions"); }
    public static void main(String[] a){ System.out.println("=== MVCCStoreB (§5 snapshot/GC): Smoke ==="); }
}
