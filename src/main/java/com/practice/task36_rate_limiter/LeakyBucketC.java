package com.practice.task36_rate_limiter;

/**
 * RATE LIMITER · LeakyBucket · ВАРИАНТ C: BOUNDED + DROP-POLICY
 *
 * <p>CORE: см. {@link LeakyBucketA}.</p>
 *
 * <p><b>ВАРИАНТ C — переполнение и политика сброса [prim: backpressure]:</b></p>
 * <ul>
 *   <li>Очередь ограничена; при переполнении — политика: drop-new (отклонить входящий) или drop-oldest.</li>
 *   <li>Зафиксировать политику и её последствия для латентности/справедливости.</li>
 *   <li>Проверка: при заполнении новая заявка отклоняется (drop-new) либо вытесняет старейшую (drop-oldest).</li>
 * </ul>
 */
public class LeakyBucketC implements RateLimiterService.RateLimiter {

    public enum DropPolicy { DROP_NEW, DROP_OLDEST }

    public LeakyBucketC(int capacity, double leakRatePerSec, DropPolicy policy) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override public boolean tryAcquire(String clientId) {
        throw new UnsupportedOperationException("TODO: variant C — bounded + drop policy");
    }
    @Override public int getAvailablePermits(String clientId) { throw new UnsupportedOperationException("TODO"); }
    @Override public void reset(String clientId) { throw new UnsupportedOperationException("TODO"); }

    public static void main(String[] args) { System.out.println("=== LeakyBucketC (bounded + drop): Smoke ==="); }
}
