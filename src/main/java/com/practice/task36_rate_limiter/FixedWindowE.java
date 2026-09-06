package com.practice.task36_rate_limiter;

/**
 * RATE LIMITER · FixedWindowCounter · ВАРИАНТ E: EDGE (сброс/переполнение)
 *
 * <p>CORE: см. базу fixed window.</p>
 *
 * <p><b>ВАРИАНТ E — edge/null-safety [prim: null-edge ⭐]:</b></p>
 * <ul>
 *   <li>maxRequests=0 (всё запрещено), очень маленькое/большое окно, часы «скакнули» (clock skew).</li>
 *   <li>Переполнение счётчика на длинном окне; null/пустой clientId; первый запрос ровно на границе окна.</li>
 *   <li>Проверка: таблица граничных случаев не даёт over/under-admit и не роняет лимитер.</li>
 * </ul>
 */
public class FixedWindowE implements RateLimiterService.RateLimiter {

    public FixedWindowE(int maxRequests, long windowSizeMs) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override public boolean tryAcquire(String clientId) {
        throw new UnsupportedOperationException("TODO: variant E — edge (reset/overflow/clock/null)");
    }
    @Override public int getAvailablePermits(String clientId) { throw new UnsupportedOperationException("TODO"); }
    @Override public void reset(String clientId) { throw new UnsupportedOperationException("TODO"); }

    public static void main(String[] args) { System.out.println("=== FixedWindowE (edge): Smoke ==="); }
}
