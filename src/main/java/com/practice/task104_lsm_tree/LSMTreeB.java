package com.practice.task104_lsm_tree;

/**
 * LSM TREE — ВАРИАНТ B: CONCURRENT FLUSH/COMPACTION (§5)
 *
 * <p>CORE = базовый {@link LSMTree} (memtable → SSTable, слияние уровней).</p>
 * <p><b>ВАРИАНТ B [prim: mutual-excl ⭐, shutdown ⭐]:</b> потокобезопасные put/get во время фонового flush/compaction;
 * чтение проходит memtable→SSTable по свежести; shutdown фоновых воркеров; edge: tombstone, дубли ключей меж уровнями.</p>
 */
public class LSMTreeB {
    public LSMTreeB(int memTableMaxSize){ throw new UnsupportedOperationException("TODO"); }
    public void put(String key, String value){ throw new UnsupportedOperationException("TODO: variant B — concurrent put + background flush"); }
    public String get(String key){ throw new UnsupportedOperationException("TODO: variant B — read newest across levels"); }
    public void shutdown(){ throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== LSMTreeB (§5 concurrent flush): Smoke ==="); }
}
