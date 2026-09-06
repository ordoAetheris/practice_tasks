package com.practice.task37_event_scheduler;

/**
 * ШЕДУЛЕР — ВАРИАНТ E: MULTI-WORKER (head-of-line)
 *
 * <p>CORE: планировщик задач с задержкой (см. вариант B).</p>
 *
 * <p><b>ВАРИАНТ E — пул воркеров [prim: mutual-excl, bounded-parallelism]:</b></p>
 * <ul>
 *   <li>N воркеров тянут из общей delay-очереди; долгая задача НЕ блокирует остальные (нет head-of-line).</li>
 *   <li>Только один воркер извлекает «голову» по времени (атомарный poll); наступившие идут параллельно.</li>
 *   <li>Проверка: одна долгая задача не задерживает короткие; порядок по времени наступления соблюдён на извлечении.</li>
 * </ul>
 */
public class EventSchedulerServiceE {

    public EventSchedulerServiceE(int workers) {
        throw new UnsupportedOperationException("TODO");
    }

    public String schedule(Runnable task, long delayMillis) {
        throw new UnsupportedOperationException("TODO: variant E — N workers, no head-of-line blocking");
    }

    public static void main(String[] args) {
        System.out.println("=== EventSchedulerServiceE (multi-worker): Smoke ===");
    }
}
