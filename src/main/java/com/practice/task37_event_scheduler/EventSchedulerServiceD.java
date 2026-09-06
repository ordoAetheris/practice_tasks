package com.practice.task37_event_scheduler;

/**
 * ШЕДУЛЕР — ВАРИАНТ D: SHUTDOWN + DRAIN
 *
 * <p>CORE: планировщик задач с задержкой (см. вариант B).</p>
 *
 * <p><b>ВАРИАНТ D — корректная остановка [prim: shutdown ⭐, termination ⭐]:</b></p>
 * <ul>
 *   <li>shutdown(): перестать принимать новые задачи, дать доработать текущим/просроченным (drain),
 *       дождаться завершения воркера (awaitTermination с таймаутом), затем остановить.</li>
 *   <li>shutdownNow(): отменить ожидающие, прервать воркер; вернуть невыполненные.</li>
 *   <li>Проверка: после shutdown новые schedule отклоняются; уже наступившие задачи доработали; поток завершён.</li>
 * </ul>
 */
public class EventSchedulerServiceD {

    public String schedule(Runnable task, long delayMillis) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Мягкая остановка: не принимать новые, слить наступившие, дождаться воркера. */
    public void shutdown() {
        throw new UnsupportedOperationException("TODO: variant D — graceful shutdown + drain");
    }

    public boolean awaitTermination(long timeoutMillis) {
        throw new UnsupportedOperationException("TODO: variant D — await worker termination");
    }

    public static void main(String[] args) {
        System.out.println("=== EventSchedulerServiceD (shutdown + drain): Smoke ===");
    }
}
