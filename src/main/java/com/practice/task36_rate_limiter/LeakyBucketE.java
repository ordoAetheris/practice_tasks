package com.practice.task36_rate_limiter;

/**
 * RATE LIMITER · LeakyBucket · ВАРИАНТ E: AS-METER (GCRA-подобный)
 *
 * <p>CORE: leaky bucket «как счётчик» — без реальной очереди, только виртуальный уровень по времени.</p>
 *
 * <p><b>ВАРИАНТ E — meter [prim: algorithm]:</b></p>
 * <ul>
 *   <li>Вместо хранения заявок — вычислять допустимость по «теоретическому времени прибытия» (TAT/GCRA):
 *       уровень = f(now, lastTime, rate). Константная память на клиента.</li>
 *   <li>Проверка: поведение совпадает с очередным leaky bucket, но без хранения элементов.</li>
 * </ul>
 */
public class LeakyBucketE implements RateLimiterService.RateLimiter {

    public LeakyBucketE(int capacity, double leakRatePerSec) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override public boolean tryAcquire(String clientId) {
        throw new UnsupportedOperationException("TODO: variant E — GCRA/meter, no stored queue");
    }
    @Override public int getAvailablePermits(String clientId) { throw new UnsupportedOperationException("TODO"); }
    @Override public void reset(String clientId) { throw new UnsupportedOperationException("TODO"); }

    public static void main(String[] args) { System.out.println("=== LeakyBucketE (as-meter/GCRA): Smoke ==="); }
}
