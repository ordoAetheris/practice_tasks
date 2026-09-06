package com.practice.task36_rate_limiter;

/**
 * RATE LIMITER · FixedWindowCounter · ВАРИАНТ D: PER-CLIENT MAP + EVICTION
 *
 * <p>CORE: см. базу fixed window.</p>
 *
 * <p><b>ВАРИАНТ D — память клиентов [prim: per-key-eviction ⭐]:</b></p>
 * <ul>
 *   <li>Карта clientId→(окно,счётчик) не должна расти бесконечно: вычищать неактивных (TTL/размер).</li>
 *   <li>Проверка: после простоя запись клиента удаляется; активные не задеты.</li>
 * </ul>
 */
public class FixedWindowD implements RateLimiterService.RateLimiter {

    public FixedWindowD(int maxRequests, long windowSizeMs) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override public boolean tryAcquire(String clientId) {
        throw new UnsupportedOperationException("TODO: variant D — per-client map + eviction");
    }
    @Override public int getAvailablePermits(String clientId) { throw new UnsupportedOperationException("TODO"); }
    @Override public void reset(String clientId) { throw new UnsupportedOperationException("TODO"); }

    public static void main(String[] args) { System.out.println("=== FixedWindowD (per-client + eviction): Smoke ==="); }
}
