package com.practice.task37_event_scheduler;

/**
 * ШЕДУЛЕР — ВАРИАНТ B: ОТМЕНА (lazy-flag + skip)
 *
 * <p>CORE: планировщик задач с задержкой — schedule(task, delayMs) → id; воркер берёт задачи по времени.
 * (Самодостаточный delay-queue дрилл; базовый {@link EventSchedulerService} — календарного типа, здесь дрилим планировщик.)</p>
 *
 * <p><b>ВАРИАНТ B — отмена [prim: cancellation ⭐, safe-delete ⭐]:</b></p>
 * <ul>
 *   <li>cancel(id) помечает задачу отменённой (lazy-флаг); воркер при извлечении СКИПАЕТ отменённую,
 *       не пытаясь дорого удалять из середины очереди.</li>
 *   <li>Гонка: отмена ровно в момент запуска — задача либо не стартует, либо помечена, но эффект согласован.</li>
 *   <li>Проверка: запланировал, отменил до срабатывания → задача не выполнилась.</li>
 * </ul>
 */
public class EventSchedulerServiceB {

    public String schedule(Runnable task, long delayMillis) {
        throw new UnsupportedOperationException("TODO: variant B — schedule with cancellable handle");
    }

    /** Ленивая отмена: пометить, воркер пропустит при извлечении. */
    public void cancel(String taskId) {
        throw new UnsupportedOperationException("TODO: variant B — lazy cancel + skip");
    }

    public static void main(String[] args) {
        System.out.println("=== EventSchedulerServiceB (cancellation): Smoke ===");
    }
}
