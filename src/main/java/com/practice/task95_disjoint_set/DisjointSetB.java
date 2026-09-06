package com.practice.task95_disjoint_set;

/**
 * DISJOINT SET — ВАРИАНТ B: CONCURRENT UNION-FIND + EDGE (§5)
 *
 * <p>CORE = базовый {@link DisjointSet} (union by rank + path compression).</p>
 * <p><b>ВАРИАНТ B [prim: mutual-excl ⭐, CAS]:</b> потокобезопасные union/find (CAS на parent, wait-free find),
 * edge: единичные множества, self-union, find несуществующего, устойчивость ранга под гонкой.</p>
 */
public class DisjointSetB {
    public DisjointSetB(int n){ throw new UnsupportedOperationException("TODO"); }
    public void union(int a, int b){ throw new UnsupportedOperationException("TODO: variant B — concurrent union (CAS)"); }
    public int find(int x){ throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== DisjointSetB (§5 concurrent/edge): Smoke ==="); }
}
