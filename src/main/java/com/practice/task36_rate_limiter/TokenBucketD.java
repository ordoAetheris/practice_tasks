package com.practice.task36_rate_limiter;

/**
 * RATE LIMITER · TokenBucket · ВАРИАНТ D: «РАСПРЕДЕЛЁННО» ЧЕРЕЗ ИНТЕРФЕЙС-СТАБ
 *
 * <p>CORE: token bucket, но состояние клиента живёт во «внешнем» координационном хранилище.</p>
 *
 * <p><b>ВАРИАНТ D — распределённость без внешних систем [prim: interface-stub, atomicity]:</b></p>
 * <ul>
 *   <li>Хранилище состояния за интерфейсом {@code CoordinationStore} (атомарный compareAndSet/getAndAdd).
 *       In-memory реализация = стаб (роль Redis+Lua), N инстансов лимитера в одном процессе.</li>
 *   <li>Атомарность операции с токенами обеспечивается КОНТРАКТОМ store (как Lua-скрипт в Redis).</li>
 *   <li>Проверка: два инстанса лимитера с общим in-mem store соблюдают единый лимит (без Redis).</li>
 * </ul>
 */
public class TokenBucketD implements RateLimiterService.RateLimiter {

    /** Абстракция общего атомарного стораджа (in-mem стаб вместо Redis). */
    public interface CoordinationStore {
        long addAndGet(String key, long delta);
        long get(String key);
        boolean compareAndSet(String key, long expected, long update);
    }

    public TokenBucketD(int capacity, double refillRate, CoordinationStore store) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override public boolean tryAcquire(String clientId) {
        throw new UnsupportedOperationException("TODO: variant D — atomicity via CoordinationStore contract");
    }
    @Override public int getAvailablePermits(String clientId) { throw new UnsupportedOperationException("TODO"); }
    @Override public void reset(String clientId) { throw new UnsupportedOperationException("TODO"); }

    public static void main(String[] args) { System.out.println("=== TokenBucketD (distributed via stub): Smoke ==="); }
}
