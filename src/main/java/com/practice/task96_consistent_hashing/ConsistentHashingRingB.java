package com.practice.task96_consistent_hashing;

/**
 * CONSISTENT HASHING — ВАРИАНТ B: VIRTUAL NODES + THREAD-SAFE (§5)
 *
 * <p>CORE = базовый {@link ConsistentHashingRing} (кольцо хэшей, getNode для ключа).</p>
 * <p><b>ВАРИАНТ B [prim: mutual-excl, null-edge ⭐]:</b> виртуальные узлы для равномерности; потокобезопасные
 * add/removeNode (перестройка кольца) vs getNode; edge: пустое кольцо, один узел, коллизии позиций.</p>
 */
public class ConsistentHashingRingB {
    public ConsistentHashingRingB(int virtualNodesPerNode){ throw new UnsupportedOperationException("TODO"); }
    public void addNode(String nodeId){ throw new UnsupportedOperationException("TODO: variant B — vnodes + thread-safe ring update"); }
    public String getNode(String key){ throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== ConsistentHashingRingB (§5 vnodes/thread-safe): Smoke ==="); }
}
