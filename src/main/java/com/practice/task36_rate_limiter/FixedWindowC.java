package com.practice.task36_rate_limiter;

/**
 * RATE LIMITER · FixedWindowCounter · ВАРИАНТ C: BOUNDARY-FIX → SLIDING-COUNTER
 *
 * <p>CORE: см. базу fixed window.</p>
 *
 * <p><b>ВАРИАНТ C — почему fixed «протекает» на стыке [prim: algorithm]:</b></p>
 * <ul>
 *   <li>Проблема: fixed window допускает до 2×maxRequests на стыке двух окон (burst на границе).</li>
 *   <li>Починка: sliding-window-counter — взвесить предыдущее окно долей перекрытия текущего.</li>
 *   <li>Проверка: тест «половина запросов в конце окна N, половина в начале N+1» — fixed пропускает 2×,
 *       sliding-counter — режет до лимита.</li>
 * </ul>
 */
public class FixedWindowC implements RateLimiterService.RateLimiter {

    public FixedWindowC(int maxRequests, long windowSizeMs) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override public boolean tryAcquire(String clientId) {
        throw new UnsupportedOperationException("TODO: variant C — fix boundary burst via sliding counter");
    }
    @Override public int getAvailablePermits(String clientId) { throw new UnsupportedOperationException("TODO"); }
    @Override public void reset(String clientId) { throw new UnsupportedOperationException("TODO"); }

    public static void main(String[] args) { System.out.println("=== FixedWindowC (boundary fix): Smoke ==="); }
}
