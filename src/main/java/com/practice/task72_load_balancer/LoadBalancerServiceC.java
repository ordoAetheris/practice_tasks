package com.practice.task72_load_balancer;

/**
 * БАЛАНСИРОВЩИК — ВАРИАНТ C: THREAD-SAFE PICK
 *
 * <p>CORE = базовый {@link LoadBalancerService}.</p>
 *
 * <p><b>ВАРИАНТ C — атомарный выбор [prim: atomicity ⭐]:</b></p>
 * <ul>
 *   <li>Round-robin индекс/счётчики соединений обновляются атомарно (AtomicInteger.getAndIncrement % n), без гонки на выборе.</li>
 *   <li>Проверка: N потоков pick одновременно → распределение равномерно, индекс не «прыгает» и не пропускает.</li>
 * </ul>
 */
public class LoadBalancerServiceC {
    public LoadBalancerService.Server pick(){ throw new UnsupportedOperationException("TODO: variant C — atomic round-robin pick"); }
    public static void main(String[] a){ System.out.println("=== LoadBalancerServiceC (thread-safe pick): Smoke ==="); }
}
