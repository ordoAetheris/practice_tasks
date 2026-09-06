package com.practice.task72_load_balancer;

/**
 * БАЛАНСИРОВЩИК — ВАРИАНТ B: HEALTH-CHECK
 *
 * <p>CORE = базовый {@link LoadBalancerService} (round-robin/weighted/least-connections).</p>
 *
 * <p><b>ВАРИАНТ B — проверка живости [prim: health-check]:</b></p>
 * <ul>
 *   <li>Нездоровые серверы (healthy=false) исключаются из выбора; периодический/по-сигналу health-check возвращает их обратно.</li>
 *   <li>Проверка: пометили сервер unhealthy → трафик на него не идёт; вернулся healthy → снова в ротации.</li>
 * </ul>
 */
public class LoadBalancerServiceB {
    public void setHealthy(String serverId, boolean healthy){ throw new UnsupportedOperationException("TODO"); }
    public LoadBalancerService.Server pick(){ throw new UnsupportedOperationException("TODO: variant B — skip unhealthy"); }
    public static void main(String[] a){ System.out.println("=== LoadBalancerServiceB (health-check): Smoke ==="); }
}
