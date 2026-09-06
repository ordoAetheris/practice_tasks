package com.practice.task81_graceful_shutdown;

import java.util.List;

/**
 * GRACEFUL SHUTDOWN — ВАРИАНТ D: COORDINATED (несколько компонентов)
 *
 * <p>CORE = базовый {@link GracefulShutdown}.</p>
 *
 * <p><b>ВАРИАНТ D — координированная остановка [prim: shutdown ⭐, ordering]:</b></p>
 * <ul>
 *   <li>Останавливать компоненты в ПРАВИЛЬНОМ порядке (сначала приём/API, потом обработчики, потом хранилище) — обратный порядку старта.</li>
 *   <li>Зависимости между компонентами; таймаут на каждый; сбой одного не блокирует остальные.</li>
 *   <li>Проверка: порядок остановки обратен старту; downstream не получает работу после остановки upstream.</li>
 * </ul>
 */
public class GracefulShutdownD {
    public interface Component { void start(); void stop(long timeoutMillis); }
    public GracefulShutdownD(List<Component> componentsInStartOrder) { throw new UnsupportedOperationException("TODO"); }
    public void shutdownAll(long perComponentTimeoutMillis) { throw new UnsupportedOperationException("TODO: variant D — reverse-order coordinated stop"); }
    public static void main(String[] a){ System.out.println("=== GracefulShutdown D (coordinated): Smoke ==="); }
}
