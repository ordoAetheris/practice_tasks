package com.practice.task36_rate_limiter;

/**
 * RATE LIMITER · FixedWindowCounter · ВАРИАНТ B: THREAD-SAFE ATOMIC
 *
 * <p>CORE: счётчик + начало окна; на новом окне сброс; допуск если счётчик &lt; maxRequests.
 * (Вариант «a» = базовая фабрика {@link RateLimiterService#fixedWindow}.)</p>
 *
 * <p><b>ВАРИАНТ B — атомарный счётчик [prim: atomicity ⭐]:</b></p>
 * <ul>
 *   <li>Инкремент-с-проверкой и сброс окна — атомарны (AtomicLong/CAS), иначе over-admit на границе.</li>
 *   <li>Гонка сброса окна: ровно один поток «переоткрывает» окно, счётчик не теряется/не задваивается.</li>
 *   <li>Проверка: N потоков в одном окне при лимите M → пропущено ровно M.</li>
 * </ul>
 */
public class FixedWindowB implements RateLimiterService.RateLimiter {

    public FixedWindowB(int maxRequests, long windowSizeMs) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override public boolean tryAcquire(String clientId) {
        throw new UnsupportedOperationException("TODO: variant B — atomic counter + window reset");
    }
    @Override public int getAvailablePermits(String clientId) { throw new UnsupportedOperationException("TODO"); }
    @Override public void reset(String clientId) { throw new UnsupportedOperationException("TODO"); }

    public static void main(String[] args) { System.out.println("=== FixedWindowB (atomic): Smoke ==="); }
}
