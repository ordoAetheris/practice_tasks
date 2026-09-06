package com.practice.task74_retry_mechanism;

import java.util.concurrent.Callable;

/**
 * RETRY — ВАРИАНТ D: RETRY BUDGET
 *
 * <p>CORE = базовый {@link RetryMechanism}.</p>
 *
 * <p><b>ВАРИАНТ D — бюджет повторов [prim: backpressure, budget]:</b></p>
 * <ul>
 *   <li>Общий бюджет ретраев (например, не более 10% сверх основных запросов в окне) — чтобы ретраи не устроили retry-storm при массовом сбое.</li>
 *   <li>Исчерпан бюджет → не ретраить, вернуть ошибку сразу.</li>
 *   <li>Проверка: при массовых сбоях доля ретраев ограничена бюджетом, лавины нет.</li>
 * </ul>
 */
public class RetryMechanismD {
    public RetryMechanismD(double retryRatioBudget, long windowMs){ throw new UnsupportedOperationException("TODO"); }
    public <T> T execute(Callable<T> action, int maxAttempts) throws Exception { throw new UnsupportedOperationException("TODO: variant D — retry budget cap"); }
    public static void main(String[] a){ System.out.println("=== RetryMechanismD (budget): Smoke ==="); }
}
