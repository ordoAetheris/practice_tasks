package com.practice.task76_time_series_db;

import java.util.List;

/**
 * TIME-SERIES — ВАРИАНТ C: THREAD-SAFE
 *
 * <p>CORE = базовый {@link TimeSeriesDB}.</p>
 *
 * <p><b>ВАРИАНТ C — потокобезопасность [prim: mutual-excl ⭐, striping]:</b></p>
 * <ul>
 *   <li>Конкурентный write (много источников) + query согласованы; записи по метрике не теряются, порядок по времени соблюдён.</li>
 *   <li>Striping по метрике: запись разных метрик параллельна.</li>
 *   <li>Проверка: K потоков write одной метрики → все точки на месте; query видит согласованный набор.</li>
 * </ul>
 */
public class TimeSeriesDBC {
    public void write(TimeSeriesDB.DataPoint dataPoint){ throw new UnsupportedOperationException("TODO: variant C — thread-safe write (per-metric striping)"); }
    public List<TimeSeriesDB.DataPoint> query(String metric, long from, long to){ throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== TimeSeriesDBC (thread-safe): Smoke ==="); }
}
