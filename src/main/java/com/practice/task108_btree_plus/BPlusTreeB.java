package com.practice.task108_btree_plus;

import java.util.List;

/**
 * B+ TREE — ВАРИАНТ B: RANGE-SCAN + THREAD-SAFE (§5)
 *
 * <p>CORE = базовый {@link BPlusTree} (данные в листьях, связанные листья).</p>
 * <p><b>ВАРИАНТ B [prim: mutual-excl ⭐, range]:</b> range-scan по связному списку листьев за O(log n + k);
 * lock-coupling при спуске; edge: сканирование пустого/одного листа, split листа во время скана, границы диапазона.</p>
 */
public class BPlusTreeB {
    public BPlusTreeB(int order){ throw new UnsupportedOperationException("TODO"); }
    public void insert(int key, String value){ throw new UnsupportedOperationException("TODO"); }
    public List<String> rangeScan(int fromKey, int toKey){ throw new UnsupportedOperationException("TODO: variant B — leaf-linked range scan"); }
    public static void main(String[] a){ System.out.println("=== BPlusTreeB (§5 range/thread-safe): Smoke ==="); }
}
