package com.practice.task45_metrics_collector;

import java.time.Instant;
import java.util.*;

/**
 * СБОРЩИК МЕТРИК СО СКОЛЬЗЯЩИМ ОКНОМ
 *
 * <p>Реализуйте сервис сбора и агрегации метрик со скользящим временным окном.
 * Каждая метрика идентифицируется именем и содержит набор значений с timestamp.</p>
 *
 * <p>Необходимо реализовать следующие операции:</p>
 * <ul>
 *   <li>record(metricName, value, timestamp) — записать значение метрики</li>
 *   <li>getAvg(metricName, windowMs) — среднее за последние windowMs миллисекунд</li>
 *   <li>getMin(metricName, windowMs) — минимум за окно</li>
 *   <li>getMax(metricName, windowMs) — максимум за окно</li>
 *   <li>getPercentile(metricName, percentile, windowMs) — перцентиль (p50, p95, p99)</li>
 *   <li>getCount(metricName, windowMs) — количество записей за окно</li>
 *   <li>getAllMetricNames() — список всех зарегистрированных метрик</li>
 * </ul>
 *
 * <p>Бизнес-правила:</p>
 * <ul>
 *   <li>Значения за пределами окна не учитываются при агрегации</li>
 *   <li>Ожидается эффективная реализация для частых записей</li>
 *   <li>percentile — значение от 0 до 100 (например, 95.0 для p95)</li>
 *   <li>Если за окно нет данных, getAvg/getMin/getMax бросают NoSuchElementException</li>
 * </ul>
 *
 * <p>Уровень: Средний</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task45_metrics_collector/MetricsCollectorService.java
 * java -cp src/main/java com.practice.task45_metrics_collector.MetricsCollectorService
 * </pre>
 */
public class MetricsCollectorService {

    public record DataPoint(
            double value,
            Instant timestamp
    ) {}

    /**
     * Записывает значение метрики.
     * @param metricName имя метрики
     * @param value значение
     * @param timestamp временная метка
     */
    public void record(String metricName, double value, Instant timestamp) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Вычисляет среднее значение метрики за последние windowMs миллисекунд.
     * @param metricName имя метрики
     * @param windowMs размер окна в миллисекундах
     * @return среднее значение
     * @throws NoSuchElementException если данных за окно нет
     */
    public double getAvg(String metricName, long windowMs) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Возвращает минимальное значение метрики за окно.
     * @param metricName имя метрики
     * @param windowMs размер окна в миллисекундах
     * @return минимальное значение
     * @throws NoSuchElementException если данных за окно нет
     */
    public double getMin(String metricName, long windowMs) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Возвращает максимальное значение метрики за окно.
     * @param metricName имя метрики
     * @param windowMs размер окна в миллисекундах
     * @return максимальное значение
     * @throws NoSuchElementException если данных за окно нет
     */
    public double getMax(String metricName, long windowMs) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Вычисляет перцентиль значений метрики за окно.
     * @param metricName имя метрики
     * @param percentile значение от 0 до 100 (например, 95.0 для p95)
     * @param windowMs размер окна в миллисекундах
     * @return значение перцентиля
     * @throws NoSuchElementException если данных за окно нет
     */
    public double getPercentile(String metricName, double percentile, long windowMs) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Возвращает количество записей метрики за окно.
     * @param metricName имя метрики
     * @param windowMs размер окна в миллисекундах
     * @return количество записей
     */
    public long getCount(String metricName, long windowMs) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Возвращает список имён всех зарегистрированных метрик.
     * @return набор имён метрик
     */
    public Set<String> getAllMetricNames() {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    public static void main(String[] args) {
        System.out.println("=== MetricsCollectorService: Smoke Test ===");
        // TODO: smoke test
    }
}
