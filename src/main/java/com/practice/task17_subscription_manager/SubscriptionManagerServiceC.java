package com.practice.task17_subscription_manager;

/**
 * ПОДПИСКИ — ВАРИАНТ C: АТОМАРНОЕ ПРОДЛЕНИЕ
 *
 * <p>CORE = базовый {@link SubscriptionManagerService}.</p>
 *
 * <p><b>ВАРИАНТ C — атомарный переход [prim: atomicity, CAS]:</b></p>
 * <ul>
 *   <li>Продление = атомарный сдвиг даты окончания на длительность плана (compute/лок на подписку),
 *       без гонки чтение-запись даты.</li>
 *   <li>Проверка: последовательные renew суммируются корректно; конкурентные не теряются и не двоятся.</li>
 * </ul>
 */
public class SubscriptionManagerServiceC {

    public void addPlan(SubscriptionManagerService.Plan plan) {
        throw new UnsupportedOperationException("TODO");
    }

    public SubscriptionManagerService.Subscription subscribe(String userId, String planId, boolean trial) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Атомарный сдвиг даты окончания (compute/лок). */
    public void renew(String subscriptionId) {
        throw new UnsupportedOperationException("TODO: variant C — atomic period extension");
    }

    public static void main(String[] args) {
        System.out.println("=== SubscriptionManagerServiceC (atomic renew): Smoke ===");
    }
}
