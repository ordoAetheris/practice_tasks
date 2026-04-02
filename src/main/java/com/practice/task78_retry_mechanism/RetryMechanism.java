package com.practice.task78_retry_mechanism;

import java.util.*;
import java.util.function.*;

/**
 * МЕХАНИЗМ ПОВТОРНЫХ ПОПЫТОК (RETRY MECHANISM)
 *
 * <p>Реализовать универсальный механизм повторных попыток с настраиваемыми политиками
 * и стратегиями задержки (backoff). Поддерживает фильтрацию исключений (какие ретраить),
 * различные стратегии задержки и историю попыток.</p>
 *
 * <h3>Стратегии backoff:</h3>
 * <ul>
 *   <li>Fixed — фиксированная задержка между попытками</li>
 *   <li>Exponential — экспоненциально растущая задержка (delay * 2^attempt)</li>
 *   <li>ExponentialWithJitter — экспоненциальная + случайный разброс (предотвращает thundering herd)</li>
 * </ul>
 *
 * <h3>Основные операции:</h3>
 * <ul>
 *   <li>executeWithRetry(action, policy) — выполнить с повторами по политике</li>
 *   <li>getAttemptHistory() — история всех попыток с результатами и задержками</li>
 * </ul>
 *
 * <h3>Требования:</h3>
 * <ul>
 *   <li>Не ретраить исключения, которые не входят в retryableExceptions</li>
 *   <li>Максимальная задержка ограничена (maxDelayMs)</li>
 *   <li>Jitter добавляет случайный разброс ±50% к задержке</li>
 *   <li>После исчерпания попыток — бросить последнее исключение</li>
 *   <li>История попыток включает: номер, результат, время, задержку до следующей</li>
 * </ul>
 *
 * <p>Уровень: Продвинутый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task78_retry_mechanism/RetryMechanism.java
 * java -cp src/main/java com.practice.task78_retry_mechanism.RetryMechanism
 * </pre>
 */
public class RetryMechanism {

    /**
     * Стратегия задержки между попытками.
     */
    public interface BackoffStrategy {
        /**
         * Вычисляет задержку перед указанной попыткой.
         *
         * @param attemptNumber номер попытки (начиная с 1)
         * @return задержка в миллисекундах
         */
        long getDelay(int attemptNumber);
    }

    /**
     * Политика повторных попыток.
     *
     * @param maxAttempts максимальное количество попыток (включая первую)
     * @param backoffStrategy стратегия задержки
     * @param retryableExceptions множество исключений, которые можно ретраить
     * @param maxDelayMs максимально допустимая задержка
     */
    public record RetryPolicy(
            int maxAttempts,
            BackoffStrategy backoffStrategy,
            Set<Class<? extends Exception>> retryableExceptions,
            long maxDelayMs
    ) {}

    /**
     * Информация об одной попытке.
     *
     * @param attemptNumber номер попытки
     * @param success успешна ли попытка
     * @param exception исключение (null если успешно)
     * @param delayBeforeMs задержка перед этой попыткой (0 для первой)
     * @param timestampMs время попытки
     */
    public record AttemptInfo(
            int attemptNumber,
            boolean success,
            Exception exception,
            long delayBeforeMs,
            long timestampMs
    ) {}

    /**
     * Создаёт стратегию с фиксированной задержкой.
     *
     * @param delayMs задержка в миллисекундах
     * @return стратегия
     */
    public static BackoffStrategy fixedBackoff(long delayMs) {
        // TODO: implement
        return null;
    }

    /**
     * Создаёт стратегию с экспоненциальной задержкой.
     *
     * @param initialDelayMs начальная задержка
     * @param multiplier множитель (обычно 2)
     * @return стратегия
     */
    public static BackoffStrategy exponentialBackoff(long initialDelayMs, double multiplier) {
        // TODO: implement
        return null;
    }

    /**
     * Создаёт стратегию с экспоненциальной задержкой и jitter (случайный разброс ±50%).
     *
     * @param initialDelayMs начальная задержка
     * @param multiplier множитель
     * @return стратегия
     */
    public static BackoffStrategy exponentialWithJitterBackoff(long initialDelayMs, double multiplier) {
        // TODO: implement
        return null;
    }

    /**
     * Выполняет действие с повторными попытками согласно политике.
     * Если действие бросает retryable исключение — повторяет с задержкой.
     * Если не-retryable — сразу пробрасывает.
     * После исчерпания попыток — бросает последнее исключение.
     *
     * @param action действие для выполнения
     * @param policy политика повторных попыток
     * @param <T> тип результата
     * @return результат действия
     * @throws Exception если все попытки исчерпаны или исключение не-retryable
     */
    public <T> T executeWithRetry(Supplier<T> action, RetryPolicy policy) throws Exception {
        // TODO: implement
        return null;
    }

    /**
     * Возвращает историю попыток последнего вызова executeWithRetry.
     *
     * @return список попыток в хронологическом порядке
     */
    public List<AttemptInfo> getAttemptHistory() {
        // TODO: implement
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        System.out.println("=== RetryMechanism: Smoke Test ===");
        // TODO: smoke test
    }
}
