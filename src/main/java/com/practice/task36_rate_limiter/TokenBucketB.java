package com.practice.task36_rate_limiter;

/**
 * RATE LIMITER · TokenBucket · ВАРИАНТ B: BURST-ДОПУСК
 *
 * <p>CORE: корзина токенов, ёмкость capacity, пополнение refillRate ток/сек, tryAcquire забирает токен.
 * (Вариант «a» = базовая фабрика {@link RateLimiterService#tokenBucket}.)</p>
 *
 * <p><b>ВАРИАНТ B — burst [prim: algorithm]:</b></p>
 * <ul>
 *   <li>Накопленные токены позволяют кратковременный всплеск до capacity после простоя.</li>
 *   <li>Ленивое пополнение по nanoTime: min(capacity, tokens + elapsed*rate) на каждый вызов.</li>
 *   <li>Проверка: после паузы доступно до capacity запросов подряд, затем — по refillRate.</li>
 * </ul>
 */
public class TokenBucketB implements RateLimiterService.RateLimiter {

    public TokenBucketB(int capacity, double refillRate) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override public boolean tryAcquire(String clientId) {
        throw new UnsupportedOperationException("TODO: variant B — lazy refill + burst up to capacity");
    }
    @Override public int getAvailablePermits(String clientId) { throw new UnsupportedOperationException("TODO"); }
    @Override public void reset(String clientId) { throw new UnsupportedOperationException("TODO"); }

    public static void main(String[] args) { System.out.println("=== TokenBucketB (burst): Smoke ==="); }
}
