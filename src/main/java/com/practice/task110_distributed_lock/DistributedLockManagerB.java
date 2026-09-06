package com.practice.task110_distributed_lock;

/**
 * DISTRIBUTED LOCK — ВАРИАНТ B: FENCING TOKEN + TTL/REENTRANCY (§5)
 *
 * <p>CORE = базовый {@link DistributedLockManager} (acquire с TTL, владелец, авто-истечение).</p>
 * <p><b>ВАРИАНТ B [prim: mutual-excl ⭐, idempotency ⭐]:</b> монотонный fencing-token против «зомби»-владельца
 * после паузы; авто-истечение TTL; реентрантность одного владельца; edge: release чужого/истёкшего лока, двойной acquire.</p>
 */
public class DistributedLockManagerB {
    public long acquire(String resource, String owner, long ttlMillis){ throw new UnsupportedOperationException("TODO: variant B — return monotonic fencing token"); }
    public boolean release(String resource, String owner, long fencingToken){ throw new UnsupportedOperationException("TODO: variant B — validate owner + token"); }
    public static void main(String[] a){ System.out.println("=== DistributedLockManagerB (§5 fencing/TTL): Smoke ==="); }
}
