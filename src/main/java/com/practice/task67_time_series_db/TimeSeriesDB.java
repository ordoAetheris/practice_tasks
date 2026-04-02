package com.practice.task67_time_series_db;

import java.util.*;

/**
 * IN-MEMORY БАЗА ДАННЫХ ВРЕМЕННЫХ РЯДОВ
 *
 * <p>Реализовать in-memory хранилище временных рядов (time series) с поддержкой записи,
 * запросов по диапазону времени, агрегации и даунсэмплинга. Оптимизировать хранение
 * и поиск для работы с большими объёмами данных.</p>
 *
 * <h3>Основные операции:</h3>
 * <ul>
 *   <li>write(dataPoint) — записать точку данных</li>
 *   <li>query(metric, from, to) — все точки метрики в диапазоне времени</li>
 *   <li>queryWithTags(metric, tags, from, to) — фильтрация по тегам</li>
 *   <li>aggregate(metric, from, to, function) — агрегация (AVG, SUM, MIN, MAX, COUNT)</li>
 *   <li>downsample(metric, from, to, intervalMs, function) — агрегация по интервалам</li>
 *   <li>getMetrics() — список всех метрик</li>
 * </ul>
 *
 * <h3>Требования:</h3>
 * <ul>
 *   <li>Эффективное хранение: данные упорядочены по времени для быстрого range-запроса</li>
 *   <li>Быстрый поиск по диапазону (O(log n) начало поиска, не полный перебор)</li>
 *   <li>Даунсэмплинг: разбить диапазон на интервалы, для каждого применить функцию агрегации</li>
 *   <li>Теги (tags) — произвольные key-value для фильтрации</li>
 * </ul>
 *
 * <p>Уровень: Продвинутый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task67_time_series_db/TimeSeriesDB.java
 * java -cp src/main/java com.practice.task67_time_series_db.TimeSeriesDB
 * </pre>
 */
public class TimeSeriesDB {

    /**
     * Точка данных временного ряда.
     *
     * @param metric имя метрики (например, "cpu.usage", "memory.free")
     * @param value числовое значение
     * @param timestamp время измерения (эпоха миллисекунды)
     * @param tags дополнительные теги для фильтрации (host, region, etc.)
     */
    public record DataPoint(String metric, double value, long timestamp, Map<String, String> tags) {}

    /**
     * Функция агрегации.
     */
    public enum AggregateFunction {
        AVG, SUM, MIN, MAX, COUNT
    }

    /**
     * Результат даунсэмплинга — агрегированная точка за интервал.
     *
     * @param intervalStart начало интервала (timestamp)
     * @param value агрегированное значение
     */
    public record DownsampledPoint(long intervalStart, double value) {}

    /**
     * Записывает точку данных в хранилище.
     *
     * @param dataPoint точка данных
     */
    public void write(DataPoint dataPoint) {
        // TODO: implement
    }

    /**
     * Возвращает все точки указанной метрики в заданном диапазоне времени.
     *
     * @param metric имя метрики
     * @param from начало диапазона (включительно)
     * @param to конец диапазона (включительно)
     * @return список точек данных, отсортированных по времени
     */
    public List<DataPoint> query(String metric, long from, long to) {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Возвращает точки метрики, отфильтрованные по тегам и диапазону времени.
     * Точка проходит фильтр, если все указанные теги совпадают.
     *
     * @param metric имя метрики
     * @param tags теги для фильтрации (все должны совпасть)
     * @param from начало диапазона (включительно)
     * @param to конец диапазона (включительно)
     * @return отфильтрованный список точек
     */
    public List<DataPoint> queryWithTags(String metric, Map<String, String> tags, long from, long to) {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Выполняет агрегацию всех точек метрики в заданном диапазоне.
     *
     * @param metric имя метрики
     * @param from начало диапазона
     * @param to конец диапазона
     * @param function функция агрегации
     * @return результат агрегации
     */
    public double aggregate(String metric, long from, long to, AggregateFunction function) {
        // TODO: implement
        return 0.0;
    }

    /**
     * Даунсэмплинг: разбивает диапазон времени на интервалы заданной длины
     * и для каждого интервала применяет функцию агрегации.
     *
     * @param metric имя метрики
     * @param from начало диапазона
     * @param to конец диапазона
     * @param intervalMs длина интервала в миллисекундах
     * @param function функция агрегации для каждого интервала
     * @return список агрегированных точек по интервалам
     */
    public List<DownsampledPoint> downsample(String metric, long from, long to, long intervalMs,
                                              AggregateFunction function) {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Возвращает список всех уникальных имён метрик в хранилище.
     *
     * @return множество имён метрик
     */
    public Set<String> getMetrics() {
        // TODO: implement
        return Collections.emptySet();
    }

    public static void main(String[] args) {
        System.out.println("=== TimeSeriesDB: Smoke Test ===");
        // TODO: smoke test
    }
}
