package com.practice.task17_subscription_manager;

/**
 * ПОДПИСКИ — ВАРИАНТ D: ИДЕМПОТЕНТНОЕ ПРОДЛЕНИЕ (requestId)
 *
 * <p>CORE = базовый {@link SubscriptionManagerService}.</p>
 *
 * <p><b>ВАРИАНТ D — идемпотентность [prim: idempotency ⭐]:</b></p>
 * <ul>
 *   <li>renew с requestId (id платежа): ретрай с тем же requestId не продлевает второй раз.</li>
 *   <li>Проверка: renew(requestId) дважды → период продлён один раз.</li>
 * </ul>
 */
public class SubscriptionManagerServiceD {

    public void addPlan(SubscriptionManagerService.Plan plan) {
        throw new UnsupportedOperationException("TODO");
    }

    public SubscriptionManagerService.Subscription subscribe(String userId, String planId, boolean trial) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Идемпотентное продление по requestId. */
    public void renew(String requestId, String subscriptionId) {
        throw new UnsupportedOperationException("TODO: variant D — idempotent renew by requestId");
    }

    public static void main(String[] args) {
        System.out.println("=== SubscriptionManagerServiceD (идемпотентное продление): Smoke ===");
    }
}
