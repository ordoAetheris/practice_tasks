package com.practice.task47_log_aggregator;

/**
 * ЛОГИ — ВАРИАНТ B: THREAD-SAFE INGEST
 *
 * <p>CORE = базовый {@link LogAggregatorService} (ingest/search/countByLevel/getErrorRate).</p>
 *
 * <p><b>ВАРИАНТ B — потокобезопасность [prim: mutual-excl ⭐, striping]:</b></p>
 * <ul>
 *   <li>Конкурентный ingest из многих источников не теряет записи; агрегаты по уровню/источнику согласованы.</li>
 *   <li>Проверка: K потоков ingest → суммарные счётчики точны, search видит согласованный набор.</li>
 * </ul>
 */
public class LogAggregatorServiceB {
    public void ingest(LogAggregatorService.LogEntry entry){ throw new UnsupportedOperationException("TODO: variant B — thread-safe ingest"); }
    public static void main(String[] a){ System.out.println("=== LogAggregatorServiceB (thread-safe): Smoke ==="); }
}
