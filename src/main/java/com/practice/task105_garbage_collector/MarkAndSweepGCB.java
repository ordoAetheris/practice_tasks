package com.practice.task105_garbage_collector;

/**
 * MARK-AND-SWEEP GC — ВАРИАНТ B: TRI-COLOR / CONCURRENT + EDGE (§5)
 *
 * <p>CORE = базовый {@link MarkAndSweepGC} (mark от корней, sweep недостижимых).</p>
 * <p><b>ВАРИАНТ B [prim: mutual-excl ⭐, null-edge ⭐]:</b> трёхцветная маркировка (white/gray/black) с write-barrier
 * для конкурентного GC; edge: циклические ссылки (не должны «спасать» мусор), самоссылки, пустая куча.</p>
 */
public class MarkAndSweepGCB {
    public void collect(){ throw new UnsupportedOperationException("TODO: variant B — tri-color mark (write-barrier) + sweep"); }
    public static void main(String[] a){ System.out.println("=== MarkAndSweepGCB (§5 tri-color/edge): Smoke ==="); }
}
