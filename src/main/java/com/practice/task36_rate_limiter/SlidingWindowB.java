package com.practice.task36_rate_limiter;

/**
 * RATE LIMITER · SlidingWindowLog · ВАРИАНТ B: THREAD-SAFE
 *
 * <p>CORE: лог меток времени запросов; чистим старше окна; допускаем если count &lt; maxRequests.
 * (Вариант «a» = базовая фабрика {@link RateLimiterService#slidingWindow}.)</p>
 *
 * <p><b>ВАРИАНТ B — потокобезопасность [prim: mutual-excl]:</b></p>
 * <ul>
 *   <li>Очистка старых меток + подсчёт + добавление новой — атомарны на клиента (иначе over-admit).</li>
 *   <li>Проверка: N потоков в окне при лимите M → пропущено ровно M.</li>
 * </ul>
 */
public class SlidingWindowB implements RateLimiterService.RateLimiter {

    public SlidingWindowB(int maxRequests, long windowSizeMs) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override public boolean tryAcquire(String clientId) {
        throw new UnsupportedOperationException("TODO: variant B — atomic evict-count-add");
    }
    @Override public int getAvailablePermits(String clientId) { throw new UnsupportedOperationException("TODO"); }
    @Override public void reset(String clientId) { throw new UnsupportedOperationException("TODO"); }

    public static void main(String[] args) { System.out.println("=== SlidingWindowB (thread-safe): Smoke ==="); }
}
