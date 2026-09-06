package com.practice.task74_retry_mechanism;

import java.util.concurrent.Callable;

/**
 * RETRY — ВАРИАНТ E: HEDGED REQUESTS
 *
 * <p>CORE = базовый {@link RetryMechanism}.</p>
 *
 * <p><b>ВАРИАНТ E — hedging [prim: bounded-parallelism, cancellation ⭐]:</b></p>
 * <ul>
 *   <li>Если ответ не пришёл за P95, запустить ВТОРОЙ (hedge) запрос параллельно; взять первый успешный, остальные отменить.</li>
 *   <li>Ограничение числа hedge'ей; отмена проигравших (не ждать/не тратить ресурс).</li>
 *   <li>Проверка: медленный первый запрос компенсируется hedge'ем; лишние отменяются.</li>
 * </ul>
 */
public class RetryMechanismE {
    public <T> T executeHedged(Callable<T> action, long hedgeDelayMs, int maxHedges) throws Exception { throw new UnsupportedOperationException("TODO: variant E — hedged requests + cancel losers"); }
    public static void main(String[] a){ System.out.println("=== RetryMechanismE (hedged): Smoke ==="); }
}
