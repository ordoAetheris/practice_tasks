package com.practice.task68_connection_pool;

/**
 * ПУЛ СОЕДИНЕНИЙ — ВАРИАНТ D: SHUTDOWN-DRAIN
 *
 * <p>CORE = базовый {@link ConnectionPool}.</p>
 *
 * <p><b>ВАРИАНТ D — корректное закрытие [prim: shutdown ⭐, termination ⭐]:</b></p>
 * <ul>
 *   <li>shutdown(): перестать выдавать, дождаться возврата всех выданных (или таймаут), закрыть все соединения, разбудить ожидающих (отказ).</li>
 *   <li>Проверка: после shutdown getConnection отклоняется; все физические соединения закрыты; ожидающие не зависли.</li>
 * </ul>
 */
public class ConnectionPoolD {
    public ConnectionPoolD(ConnectionPool.ConnectionFactory factory, int maxSize){ throw new UnsupportedOperationException("TODO"); }
    public void shutdown() throws InterruptedException { throw new UnsupportedOperationException("TODO: variant D — drain + close all + wake waiters"); }
    public static void main(String[] a){ System.out.println("=== ConnectionPoolD (shutdown-drain): Smoke ==="); }
}
