package com.practice.task36_rate_limiter;

/**
 * RATE LIMITER · TokenBucket · ВАРИАНТ C: THREAD-SAFE PER-CLIENT + EVICTION
 *
 * <p>CORE: token bucket на каждого clientId.</p>
 *
 * <p><b>ВАРИАНТ C — корректность под конкурентой [prim: atomicity ⭐, per-key-eviction ⭐]:</b></p>
 * <ul>
 *   <li>Для лимитера thread-safety — это КОРРЕКТНОСТЬ, не опция: без атомарного «проверить+забрать токен»
 *       два потока на один clientId дают over-admit. CAS/лок на bucket клиента.</li>
 *   <li>Карта clientId→bucket НЕ должна расти бесконечно: eviction неактивных клиентов (TTL/размер).</li>
 *   <li>Проверка: N потоков на один clientId при capacity=M → ровно M пропущено; неактивные клиенты вычищаются.</li>
 * </ul>
 */
public class TokenBucketC implements RateLimiterService.RateLimiter {

    public TokenBucketC(int capacity, double refillRate) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override public boolean tryAcquire(String clientId) {
        throw new UnsupportedOperationException("TODO: variant C — atomic per-client + map eviction");
    }
    @Override public int getAvailablePermits(String clientId) { throw new UnsupportedOperationException("TODO"); }
    @Override public void reset(String clientId) { throw new UnsupportedOperationException("TODO"); }

    public static void main(String[] args) { System.out.println("=== TokenBucketC (thread-safe + eviction): Smoke ==="); }
}
