package com.practice.task72_load_balancer;

import java.util.function.Function;

/**
 * БАЛАНСИРОВЩИК — ВАРИАНТ D: RETRY + FAILOVER
 *
 * <p>CORE = базовый {@link LoadBalancerService}.</p>
 *
 * <p><b>ВАРИАНТ D — переключение при сбое [prim: cancellation, failover]:</b></p>
 * <ul>
 *   <li>Запрос упал на выбранном сервере → повторить на следующем здоровом (failover), с ограничением попыток.</li>
 *   <li>Не долбить один и тот же упавший; временно понизить его вес/пометить.</li>
 *   <li>Проверка: при отказе первого сервера запрос успешно уходит на второй; попытки ограничены числом серверов.</li>
 * </ul>
 */
public class LoadBalancerServiceD {
    public <R> R execute(Function<LoadBalancerService.Server, R> call, int maxAttempts){ throw new UnsupportedOperationException("TODO: variant D — retry-failover across servers"); }
    public static void main(String[] a){ System.out.println("=== LoadBalancerServiceD (retry-failover): Smoke ==="); }
}
