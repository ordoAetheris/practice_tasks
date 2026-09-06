package com.practice.task74_retry_mechanism;

import java.util.concurrent.Callable;

/**
 * RETRY — ВАРИАНТ B: ЭКСПОНЕНТА + JITTER
 *
 * <p>CORE = базовый {@link RetryMechanism} (повтор при сбое; fixed backoff = база).</p>
 *
 * <p><b>ВАРИАНТ B — экспоненциальная задержка с дрожанием [prim: backoff, jitter]:</b></p>
 * <ul>
 *   <li>Задержка = base * multiplier^attempt, с random jitter (full/equal) — чтобы клиенты не ретраили синхронно (thundering herd).</li>
 *   <li>Верхний потолок задержки (cap).</li>
 *   <li>Проверка: задержки растут экспоненциально, разбросаны jitter'ом, не превышают cap.</li>
 * </ul>
 */
public class RetryMechanismB {
    public <T> T execute(Callable<T> action, int maxAttempts) throws Exception { throw new UnsupportedOperationException("TODO: variant B — exponential backoff + jitter"); }
    public static void main(String[] a){ System.out.println("=== RetryMechanismB (expo+jitter): Smoke ==="); }
}
