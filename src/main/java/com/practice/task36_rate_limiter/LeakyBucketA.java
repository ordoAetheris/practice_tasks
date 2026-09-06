package com.practice.task36_rate_limiter;

/**
 * RATE LIMITER · LeakyBucket · ВАРИАНТ A: КЛАССИКА
 *
 * <p>CORE: FIFO-очередь запросов «протекает» с постоянной скоростью; переполнена → отклонять.
 * (У LeakyBucket базовой фабрики в {@link RateLimiterService} нет — этот файл и есть база «a».)</p>
 *
 * <p><b>ВАРИАНТ A — классический leaky bucket [prim: queue, constant-rate]:</b></p>
 * <ul>
 *   <li>«Вода» вытекает с фиксированной скоростью leakRate; входящий запрос добавляет объём.</li>
 *   <li>Если уровень превысил capacity — запрос отклонён (сглаживает всплески в ровный поток).</li>
 *   <li>Проверка: ровный выходной поток при бурстовом входе; переполнение отклоняется.</li>
 * </ul>
 */
public class LeakyBucketA implements RateLimiterService.RateLimiter {

    public LeakyBucketA(int capacity, double leakRatePerSec) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override public boolean tryAcquire(String clientId) {
        throw new UnsupportedOperationException("TODO: variant A — classic leaky bucket");
    }
    @Override public int getAvailablePermits(String clientId) { throw new UnsupportedOperationException("TODO"); }
    @Override public void reset(String clientId) { throw new UnsupportedOperationException("TODO"); }

    public static void main(String[] args) { System.out.println("=== LeakyBucketA (classic): Smoke ==="); }
}
