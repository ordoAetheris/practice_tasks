package com.practice.task36_rate_limiter;

/**
 * RATE LIMITER · LeakyBucket · ВАРИАНТ B: THREAD-SAFE
 *
 * <p>CORE: см. {@link LeakyBucketA}.</p>
 *
 * <p><b>ВАРИАНТ B — потокобезопасность [prim: mutual-excl]:</b></p>
 * <ul>
 *   <li>Пересчёт «утечки» по времени + добавление объёма — атомарны (иначе уровень считается неверно под гонкой).</li>
 *   <li>Проверка: N потоков на один клиент → суммарно пропущено не больше, чем допускает leakRate/capacity.</li>
 * </ul>
 */
public class LeakyBucketB implements RateLimiterService.RateLimiter {

    public LeakyBucketB(int capacity, double leakRatePerSec) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override public boolean tryAcquire(String clientId) {
        throw new UnsupportedOperationException("TODO: variant B — atomic leak-and-add");
    }
    @Override public int getAvailablePermits(String clientId) { throw new UnsupportedOperationException("TODO"); }
    @Override public void reset(String clientId) { throw new UnsupportedOperationException("TODO"); }

    public static void main(String[] args) { System.out.println("=== LeakyBucketB (thread-safe): Smoke ==="); }
}
