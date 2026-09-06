package com.practice.task36_rate_limiter;

/**
 * RATE LIMITER · SlidingWindowLog · ВАРИАНТ C: LOG → COUNTER (аппроксимация)
 *
 * <p>CORE: см. базу sliding window.</p>
 *
 * <p><b>ВАРИАНТ C — память: точный лог → приблизительный счётчик [prim: algorithm]:</b></p>
 * <ul>
 *   <li>Точный лог меток = O(запросов) памяти. Заменить на sliding-window-COUNTER:
 *       взвешенная сумма текущего и предыдущего фиксированных окон (аппроксимация).</li>
 *   <li>Trade-off: константная память на клиента ценой небольшой погрешности на границе.</li>
 *   <li>Проверка: счётчик близок к точному логу; память не растёт с числом запросов.</li>
 * </ul>
 */
public class SlidingWindowC implements RateLimiterService.RateLimiter {

    public SlidingWindowC(int maxRequests, long windowSizeMs) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override public boolean tryAcquire(String clientId) {
        throw new UnsupportedOperationException("TODO: variant C — weighted two-window counter approximation");
    }
    @Override public int getAvailablePermits(String clientId) { throw new UnsupportedOperationException("TODO"); }
    @Override public void reset(String clientId) { throw new UnsupportedOperationException("TODO"); }

    public static void main(String[] args) { System.out.println("=== SlidingWindowC (log->counter): Smoke ==="); }
}
