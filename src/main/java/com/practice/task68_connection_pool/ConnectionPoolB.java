package com.practice.task68_connection_pool;

/**
 * ПУЛ СОЕДИНЕНИЙ — ВАРИАНТ B: BOUNDED + BLOCK-ON-EXHAUST
 *
 * <p>CORE = базовый {@link ConnectionPool} (getConnection/releaseConnection, maxSize).</p>
 *
 * <p><b>ВАРИАНТ B — блокировка на исчерпании [prim: backpressure, mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>getConnection блокируется, если все maxSize заняты, пока кто-то не release'нёт (не создавать сверх лимита).</li>
 *   <li>release будит одного ожидающего; счётчики active/idle согласованы.</li>
 *   <li>Проверка: N+1-й запрос при пуле N блокируется до release; никогда не больше N живых соединений.</li>
 * </ul>
 */
public class ConnectionPoolB {
    public ConnectionPoolB(ConnectionPool.ConnectionFactory factory, int maxSize){ throw new UnsupportedOperationException("TODO"); }
    public ConnectionPool.Connection getConnection() throws InterruptedException { throw new UnsupportedOperationException("TODO: variant B — block when exhausted"); }
    public void releaseConnection(ConnectionPool.Connection c){ throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== ConnectionPoolB (bounded/block): Smoke ==="); }
}
