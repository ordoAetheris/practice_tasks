package com.practice.task68_connection_pool;

/**
 * ПУЛ СОЕДИНЕНИЙ — ВАРИАНТ C: HEALTH-CHECK + EVICTION
 *
 * <p>CORE = базовый {@link ConnectionPool}.</p>
 *
 * <p><b>ВАРИАНТ C — проверка живости [prim: health-check, per-key-eviction]:</b></p>
 * <ul>
 *   <li>Перед выдачей — проверить соединение (isValid); битое — закрыть и создать новое. Простаивающие сверх idle-timeout — вытеснять.</li>
 *   <li>Проверка: «умершее» соединение не выдаётся, заменяется; после простоя лишние закрываются.</li>
 * </ul>
 */
public class ConnectionPoolC {
    public ConnectionPoolC(ConnectionPool.ConnectionFactory factory, int maxSize){ throw new UnsupportedOperationException("TODO"); }
    public ConnectionPool.Connection getConnection() throws InterruptedException { throw new UnsupportedOperationException("TODO: variant C — validate before handout + evict idle"); }
    public static void main(String[] a){ System.out.println("=== ConnectionPoolC (health/evict): Smoke ==="); }
}
