package com.practice.task36_rate_limiter;

/**
 * RATE LIMITER · SlidingWindowLog · ВАРИАНТ E: FAIRNESS МЕЖ-КЛИЕНТАМИ
 *
 * <p>CORE: см. базу sliding window.</p>
 *
 * <p><b>ВАРИАНТ E — справедливость [prim: mutual-excl, fairness]:</b></p>
 * <ul>
 *   <li>Один «шумный» клиент не должен голодать остальных; лимит per-client независим,
 *       общий ресурс (если есть глобальный потолок) делится справедливо.</li>
 *   <li>Проверка: агрессивный клиент упирается в свой лимит, не влияя на пропуск других.</li>
 * </ul>
 */
public class SlidingWindowE implements RateLimiterService.RateLimiter {

    public SlidingWindowE(int maxRequestsPerClient, long windowSizeMs) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override public boolean tryAcquire(String clientId) {
        throw new UnsupportedOperationException("TODO: variant E — per-client isolation / fairness");
    }
    @Override public int getAvailablePermits(String clientId) { throw new UnsupportedOperationException("TODO"); }
    @Override public void reset(String clientId) { throw new UnsupportedOperationException("TODO"); }

    public static void main(String[] args) { System.out.println("=== SlidingWindowE (fairness): Smoke ==="); }
}
