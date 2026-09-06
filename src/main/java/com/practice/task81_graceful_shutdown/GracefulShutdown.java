package com.practice.task81_graceful_shutdown;

/**
 * GRACEFUL SHUTDOWN (перенос из concurrency) — ВАРИАНТ A: SHUTDOWN HOOK (база)
 *
 * <p>CORE: сервис принимает задачи; при остановке — перестать принимать, слить in-flight, уложиться в таймаут.</p>
 *
 * <p><b>ВАРИАНТ A — shutdown hook [prim: shutdown ⭐, termination ⭐]:</b></p>
 * <ul>
 *   <li>Runtime.addShutdownHook: по сигналу (SIGTERM/Ctrl-C) выполнить graceful-остановку — flush, close, дождаться воркеров с таймаутом.</li>
 *   <li>Идемпотентность хука (двойной вызов), лимит времени (не виснуть навсегда).</li>
 *   <li>Проверка: имитировать сигнал → in-flight задачи доработали, новые отклонены, ресурсы закрыты.</li>
 * </ul>
 */
public class GracefulShutdown {
    public void submit(Runnable task) { throw new UnsupportedOperationException("TODO"); }
    /** Мягкая остановка (то, что вызывает shutdown hook). */
    public void shutdown(long timeoutMillis) { throw new UnsupportedOperationException("TODO: variant A — hook-driven graceful stop"); }
    public static void main(String[] a){ System.out.println("=== GracefulShutdown A (hook): Smoke ==="); }
}
