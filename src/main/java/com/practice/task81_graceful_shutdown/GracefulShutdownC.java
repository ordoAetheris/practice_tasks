package com.practice.task81_graceful_shutdown;

/**
 * GRACEFUL SHUTDOWN — ВАРИАНТ C: CHECKPOINT
 *
 * <p>CORE = базовый {@link GracefulShutdown}.</p>
 *
 * <p><b>ВАРИАНТ C — сохранение прогресса [prim: shutdown ⭐, checkpoint]:</b></p>
 * <ul>
 *   <li>Перед остановкой сохранить состояние/позицию обработки (checkpoint), чтобы после рестарта продолжить с него.</li>
 *   <li>Атомарность чекпоинта (не сохранить полусостояние).</li>
 *   <li>Проверка: shutdown в середине пакета → checkpoint фиксирует прогресс; «рестарт» продолжает без потерь/дублей.</li>
 * </ul>
 */
public class GracefulShutdownC {
    public void shutdownWithCheckpoint(long timeoutMillis) { throw new UnsupportedOperationException("TODO: variant C — persist progress checkpoint"); }
    public long lastCheckpoint() { throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== GracefulShutdown C (checkpoint): Smoke ==="); }
}
