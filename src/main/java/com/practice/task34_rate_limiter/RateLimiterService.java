package com.practice.task34_rate_limiter;

import java.util.*;

/**
 * RATE LIMITER (ОГРАНИЧИТЕЛЬ ЧАСТОТЫ ЗАПРОСОВ)
 *
 * <p>Реализуйте систему ограничения частоты запросов (Rate Limiter) с поддержкой
 * нескольких алгоритмов. Каждый клиент (clientId) имеет свой лимит.</p>
 *
 * <p>Алгоритмы:</p>
 * <ul>
 *   <li>Token Bucket — корзина токенов с постоянным пополнением (capacity, refillRate токенов/сек)</li>
 *   <li>Sliding Window — скользящее окно (maxRequests за windowSizeMs)</li>
 *   <li>Fixed Window — фиксированное окно (maxRequests за windowSizeMs)</li>
 * </ul>
 *
 * <p>Общий интерфейс RateLimiter:</p>
 * <ul>
 *   <li>tryAcquire(clientId) — попытка выполнить запрос (true/false)</li>
 *   <li>getAvailablePermits(clientId) — сколько запросов доступно</li>
 *   <li>reset(clientId) — сбросить состояние для клиента</li>
 * </ul>
 *
 * <p>Бизнес-правила:</p>
 * <ul>
 *   <li>capacity и maxRequests должны быть положительными</li>
 *   <li>Token Bucket: пополняется с refillRate, максимум capacity</li>
 *   <li>Sliding Window: учитывает все запросы за последние windowSizeMs</li>
 *   <li>Fixed Window: окно фиксировано от начала периода</li>
 * </ul>
 *
 * <p>Уровень: Средний</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task34_rate_limiter/RateLimiterService.java
 * java -cp src/main/java com.practice.task34_rate_limiter.RateLimiterService
 * </pre>
 */
public class RateLimiterService {

    /**
     * Интерфейс ограничителя частоты запросов.
     */
    public interface RateLimiter {
        /**
         * Попытка выполнить запрос. Возвращает true если запрос разрешён.
         */
        boolean tryAcquire(String clientId);

        /**
         * Возвращает количество доступных запросов для клиента.
         */
        int getAvailablePermits(String clientId);

        /**
         * Сбрасывает состояние для клиента.
         */
        void reset(String clientId);
    }

    /**
     * Token Bucket: корзина заполняется токенами с постоянной скоростью.
     * Каждый запрос забирает один токен. Если токенов нет — запрос отклоняется.
     *
     * @param capacity   максимальное количество токенов
     * @param refillRate скорость пополнения (токенов в секунду)
     * @return реализация RateLimiter
     */
    public static RateLimiter tokenBucket(int capacity, double refillRate) {
        // TODO: implement
        return null;
    }

    /**
     * Sliding Window: подсчитывает количество запросов за последние windowSizeMs миллисекунд.
     * Если количество >= maxRequests — запрос отклоняется.
     *
     * @param maxRequests  максимум запросов в окне
     * @param windowSizeMs размер окна в миллисекундах
     * @return реализация RateLimiter
     */
    public static RateLimiter slidingWindow(int maxRequests, long windowSizeMs) {
        // TODO: implement
        return null;
    }

    /**
     * Fixed Window: окно фиксировано по временным границам.
     * В начале каждого нового окна счётчик сбрасывается.
     *
     * @param maxRequests  максимум запросов в окне
     * @param windowSizeMs размер окна в миллисекундах
     * @return реализация RateLimiter
     */
    public static RateLimiter fixedWindow(int maxRequests, long windowSizeMs) {
        // TODO: implement
        return null;
    }

    public static void main(String[] args) {
        System.out.println("=== RateLimiterService: Smoke Test ===");
        // TODO: создать тестовые данные и проверить основные сценарии
    }
}
