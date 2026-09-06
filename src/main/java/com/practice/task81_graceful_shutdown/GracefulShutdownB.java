package com.practice.task81_graceful_shutdown;

/**
 * GRACEFUL SHUTDOWN — ВАРИАНТ B: TWO-PHASE
 *
 * <p>CORE = базовый {@link GracefulShutdown}.</p>
 *
 * <p><b>ВАРИАНТ B — двухфазная остановка [prim: shutdown ⭐, termination ⭐]:</b></p>
 * <ul>
 *   <li>Фаза 1 (drain): перестать принимать новое, дать доработать текущему в мягкий таймаут.</li>
 *   <li>Фаза 2 (force): по истечении — прервать оставшееся (interrupt), вернуть/залогировать невыполненное.</li>
 *   <li>Проверка: быстрые задачи успевают в фазе 1; зависшая прерывается в фазе 2; метод завершается за &le; сумма таймаутов.</li>
 * </ul>
 */
public class GracefulShutdownB {
    public void shutdown(long drainMillis, long forceMillis) { throw new UnsupportedOperationException("TODO: variant B — drain then force"); }
    public static void main(String[] a){ System.out.println("=== GracefulShutdown B (two-phase): Smoke ==="); }
}
