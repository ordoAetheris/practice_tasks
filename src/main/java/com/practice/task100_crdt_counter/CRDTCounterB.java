package com.practice.task100_crdt_counter;

/**
 * CRDT COUNTER — ВАРИАНТ B: PN-COUNTER + THREAD-SAFE MERGE (§5)
 *
 * <p>CORE = базовый {@link CRDTCounter} (G-Counter: per-node инкременты, value = сумма).</p>
 * <p><b>ВАРИАНТ B [prim: mutual-excl ⭐, idempotency]:</b> PN-Counter (inc+dec как две G-карты); merge — поэлементный
 * max (идемпотентно/коммутативно/ассоциативно); потокобезопасные increment/merge; edge: конкурентный merge реплик.</p>
 */
public class CRDTCounterB {
    public CRDTCounterB(String nodeId){ throw new UnsupportedOperationException("TODO"); }
    public void increment(){ throw new UnsupportedOperationException("TODO"); }
    public void decrement(){ throw new UnsupportedOperationException("TODO: variant B — PN-counter"); }
    public void merge(CRDTCounterB other){ throw new UnsupportedOperationException("TODO: variant B — element-wise max merge"); }
    public long value(){ throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== CRDTCounterB (§5 PN/merge): Smoke ==="); }
}
