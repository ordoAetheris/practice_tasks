package com.practice.task36_rate_limiter;

/**
 * RATE LIMITER · SlidingWindowLog · ВАРИАНТ D: PER-CLIENT + EVICTION
 *
 * <p>CORE: см. базу sliding window.</p>
 *
 * <p><b>ВАРИАНТ D — управление памятью клиентов [prim: per-key-eviction ⭐]:</b></p>
 * <ul>
 *   <li>Карта clientId→лог не должна расти вечно: вычищать клиентов, чьи окна давно пусты (TTL/размер+LRU).</li>
 *   <li>Гонка «клиент вычищается ↔ клиент снова активен» — согласована.</li>
 *   <li>Проверка: после простоя запись клиента удаляется; повторная активность создаёт заново корректно.</li>
 * </ul>
 */
public class SlidingWindowD implements RateLimiterService.RateLimiter {

    public SlidingWindowD(int maxRequests, long windowSizeMs) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override public boolean tryAcquire(String clientId) {
        throw new UnsupportedOperationException("TODO: variant D — per-client log + idle eviction");
    }
    @Override public int getAvailablePermits(String clientId) { throw new UnsupportedOperationException("TODO"); }
    @Override public void reset(String clientId) { throw new UnsupportedOperationException("TODO"); }

    public static void main(String[] args) { System.out.println("=== SlidingWindowD (per-client + eviction): Smoke ==="); }
}
