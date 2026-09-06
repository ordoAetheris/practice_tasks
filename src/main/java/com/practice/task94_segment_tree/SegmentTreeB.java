package com.practice.task94_segment_tree;

/**
 * SEGMENT TREE — ВАРИАНТ B: LAZY PROPAGATION + THREAD-SAFE (§5)
 *
 * <p>CORE = базовый {@link SegmentTree} (сумма/мин на отрезке, точечное обновление).</p>
 * <p><b>ВАРИАНТ B [prim: lazy-propagation, mutual-excl]:</b> range-update за O(log n) через ленивые метки (push-down);
 * потокобезопасные запросы vs обновления; edge: одиночный отрезок, полное перекрытие/непересечение.</p>
 */
public class SegmentTreeB {
    public SegmentTreeB(long[] initial){ throw new UnsupportedOperationException("TODO"); }
    public void updateRange(int l, int r, long delta){ throw new UnsupportedOperationException("TODO: variant B — lazy range update"); }
    public long queryRange(int l, int r){ throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== SegmentTreeB (§5 lazy/thread-safe): Smoke ==="); }
}
