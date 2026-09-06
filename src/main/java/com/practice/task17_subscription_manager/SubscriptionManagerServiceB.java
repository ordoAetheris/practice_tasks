package com.practice.task17_subscription_manager;

/**
 * ПОДПИСКИ — ВАРИАНТ B: ДВОЙНОЕ ПРОДЛЕНИЕ (гонка renew)
 *
 * <p>CORE = базовый {@link SubscriptionManagerService} (та же модель Plan/Subscription).</p>
 *
 * <p><b>ВАРИАНТ B — доменная гонка [prim: mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>Два потока renew одной подписки → период продлевается дважды / списание дважды (double renewal).</li>
 *   <li>ЗАДАЧА: продление атомарно, ровно один эффект под гонкой.</li>
 *   <li>Проверка: N потоков renew → период +1 раз (если бизнес-правило «один активный renew»), не +N.</li>
 * </ul>
 */
public class SubscriptionManagerServiceB {

    public void addPlan(SubscriptionManagerService.Plan plan) {
        throw new UnsupportedOperationException("TODO");
    }

    public SubscriptionManagerService.Subscription subscribe(String userId, String planId, boolean trial) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Потокобезопасное продление без двойного эффекта под гонкой. */
    public void renew(String subscriptionId) {
        throw new UnsupportedOperationException("TODO: variant B — no double renewal under contention");
    }

    public static void main(String[] args) {
        System.out.println("=== SubscriptionManagerServiceB (двойное продление): Smoke ===");
    }
}
