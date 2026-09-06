package com.practice.task74_retry_mechanism;

import java.util.concurrent.Callable;

/**
 * RETRY — ВАРИАНТ C: ИДЕМПОТЕНТНОСТЬ (idempotency key)
 *
 * <p>CORE = базовый {@link RetryMechanism}.</p>
 *
 * <p><b>ВАРИАНТ C — безопасный повтор [prim: idempotency ⭐]:</b></p>
 * <ul>
 *   <li>Ретраить можно только идемпотентную операцию: с idempotencyKey сервер (стаб) распознаёт дубль и не применяет дважды.</li>
 *   <li>Различать retriable-ошибки (сеть/5xx) от non-retriable (4xx/валидация — не повторять).</li>
 *   <li>Проверка: повтор с тем же ключом не даёт двойного эффекта; 4xx не ретраится.</li>
 * </ul>
 */
public class RetryMechanismC {
    public <T> T execute(String idempotencyKey, Callable<T> action, int maxAttempts) throws Exception { throw new UnsupportedOperationException("TODO: variant C — idempotency key + retriable classification"); }
    public static void main(String[] a){ System.out.println("=== RetryMechanismC (idempotency): Smoke ==="); }
}
