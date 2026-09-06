package com.practice.task74_retry_mechanism;

import java.util.concurrent.Callable;

/**
 * RETRY — ВАРИАНТ F: FAILOVER + ОТМЕНА ПО КОНТЕКСТУ
 *
 * <p>CORE = базовый {@link RetryMechanism}.</p>
 *
 * <p><b>ВАРИАНТ F — переключение + отмена [prim: cancellation ⭐, failover]:</b></p>
 * <ul>
 *   <li>При сбое повторять на АЛЬТЕРНАТИВНОМ ресурсе (failover), а не том же; уважать сигнал отмены (deadline/context) — прекратить ретраи.</li>
 *   <li>Отменённый вызов не должен продолжать ретраить после дедлайна.</li>
 *   <li>Проверка: провал основного → уходит на резервный; при отмене/дедлайне ретраи прекращаются немедленно.</li>
 * </ul>
 */
public class RetryMechanismF {
    public <T> T executeWithFailover(java.util.List<Callable<T>> targets, long deadlineMs) throws Exception { throw new UnsupportedOperationException("TODO: variant F — failover + cancellation on deadline"); }
    public static void main(String[] a){ System.out.println("=== RetryMechanismF (failover+cancel): Smoke ==="); }
}
