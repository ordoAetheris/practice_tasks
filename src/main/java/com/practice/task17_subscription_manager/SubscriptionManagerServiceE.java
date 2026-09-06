package com.practice.task17_subscription_manager;

/**
 * ПОДПИСКИ — ВАРИАНТ E: ГРАНУЛЯРНЫЙ ЛОК НА ПОДПИСКУ
 *
 * <p>CORE = базовый {@link SubscriptionManagerService}.</p>
 *
 * <p><b>ВАРИАНТ E — гранулярность [prim: striping]:</b></p>
 * <ul>
 *   <li>Лок на конкретную подписку, не глобальный: операции над РАЗНЫМИ подписками параллельны.</li>
 *   <li>Проверка: N потоков renew N разных подписок идут параллельно (нет общей сериализации).</li>
 * </ul>
 */
public class SubscriptionManagerServiceE {

    public void addPlan(SubscriptionManagerService.Plan plan) {
        throw new UnsupportedOperationException("TODO");
    }

    public SubscriptionManagerService.Subscription subscribe(String userId, String planId, boolean trial) {
        throw new UnsupportedOperationException("TODO");
    }

    public void renew(String subscriptionId) {
        throw new UnsupportedOperationException("TODO: variant E — per-subscription lock striping");
    }

    public static void main(String[] args) {
        System.out.println("=== SubscriptionManagerServiceE (granular lock): Smoke ===");
    }
}
