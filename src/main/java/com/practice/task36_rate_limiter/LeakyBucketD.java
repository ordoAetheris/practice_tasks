package com.practice.task36_rate_limiter;

/**
 * RATE LIMITER · LeakyBucket · ВАРИАНТ D: DRAIN-WORKER + SHUTDOWN
 *
 * <p>CORE: см. {@link LeakyBucketA}, но «утечка» реализована ФОНОВЫМ воркером (реальная обработка очереди).</p>
 *
 * <p><b>ВАРИАНТ D — фоновый дренаж [prim: shutdown ⭐, termination ⭐]:</b></p>
 * <ul>
 *   <li>Воркер-поток забирает из очереди с постоянной скоростью и «исполняет» заявки.</li>
 *   <li>КЛЮЧЕВОЕ: shutdown() останавливает воркера, сливает/бросает остаток по правилу, дожидается завершения потока.</li>
 *   <li>Проверка: под нагрузкой выход ровный; shutdown завершает воркера без утечки и без потери учёта.</li>
 * </ul>
 */
public class LeakyBucketD implements RateLimiterService.RateLimiter {

    public LeakyBucketD(int capacity, double leakRatePerSec) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override public boolean tryAcquire(String clientId) {
        throw new UnsupportedOperationException("TODO: variant D — enqueue; background drain worker");
    }
    @Override public int getAvailablePermits(String clientId) { throw new UnsupportedOperationException("TODO"); }
    @Override public void reset(String clientId) { throw new UnsupportedOperationException("TODO"); }

    /** Остановить фонового дренажёра и дождаться завершения. */
    public void shutdown() {
        throw new UnsupportedOperationException("TODO: variant D — graceful worker shutdown");
    }

    public static void main(String[] args) { System.out.println("=== LeakyBucketD (drain-worker + shutdown): Smoke ==="); }
}
