package com.practice.task37_event_scheduler;

/**
 * ШЕДУЛЕР — ВАРИАНТ C: RECURRING / RESCHEDULE
 *
 * <p>CORE: планировщик задач с задержкой (см. вариант B).</p>
 *
 * <p><b>ВАРИАНТ C — периодические задачи [prim: reschedule]:</b></p>
 * <ul>
 *   <li>scheduleAtFixedRate(task, period): после выполнения задача переenqueue'ится на next = now+period.</li>
 *   <li>Не накапливать дрейф; отменяемость периодической задачи (перестать перепланировать).</li>
 *   <li>Проверка: периодическая задача исполняется ~N раз за N периодов; cancel останавливает цикл.</li>
 * </ul>
 */
public class EventSchedulerServiceC {

    public String scheduleAtFixedRate(Runnable task, long periodMillis) {
        throw new UnsupportedOperationException("TODO: variant C — recurring reschedule");
    }

    public void cancel(String taskId) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        System.out.println("=== EventSchedulerServiceC (recurring): Smoke ===");
    }
}
