package com.practice.task76_time_series_db;

/**
 * TIME-SERIES — ВАРИАНТ D: RETENTION
 *
 * <p>CORE = базовый {@link TimeSeriesDB}.</p>
 *
 * <p><b>ВАРИАНТ D — усечение по времени [prim: per-key-eviction, retention]:</b></p>
 * <ul>
 *   <li>Точки старше retention-периода удаляются (лениво на write/query или фоновым проходом); память не растёт вечно.</li>
 *   <li>Проверка: после истечения retention старые точки не возвращаются query и освобождены.</li>
 * </ul>
 */
public class TimeSeriesDBD {
    public TimeSeriesDBD(long retentionMs){ throw new UnsupportedOperationException("TODO"); }
    public int evictExpired(long now){ throw new UnsupportedOperationException("TODO: variant D — retention eviction"); }
    public static void main(String[] a){ System.out.println("=== TimeSeriesDBD (retention): Smoke ==="); }
}
