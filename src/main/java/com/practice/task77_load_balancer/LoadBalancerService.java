package com.practice.task77_load_balancer;

import java.util.*;

/**
 * БАЛАНСИРОВЩИК НАГРУЗКИ (LOAD BALANCER)
 *
 * <p>Реализовать балансировщик нагрузки с несколькими алгоритмами распределения запросов.
 * Нездоровые серверы автоматически исключаются из ротации. Каждый алгоритм —
 * отдельная реализация интерфейса LoadBalancer.</p>
 *
 * <h3>Алгоритмы:</h3>
 * <ul>
 *   <li>RoundRobin — циклический обход серверов по порядку</li>
 *   <li>WeightedRoundRobin — с учётом весов (больший вес = больше запросов)</li>
 *   <li>LeastConnections — выбор сервера с наименьшим числом активных соединений</li>
 *   <li>RandomWithWeights — случайный выбор с учётом весов</li>
 * </ul>
 *
 * <h3>Основные операции:</h3>
 * <ul>
 *   <li>addServer(server) — добавить сервер</li>
 *   <li>removeServer(serverId) — удалить сервер</li>
 *   <li>getNextServer() — получить следующий сервер по алгоритму</li>
 *   <li>markHealthy(serverId) / markUnhealthy(serverId) — управление здоровьем</li>
 *   <li>getStats(serverId) — статистика: количество запросов, активные соединения</li>
 *   <li>releaseConnection(serverId) — уменьшить счётчик активных соединений</li>
 * </ul>
 *
 * <h3>Требования:</h3>
 * <ul>
 *   <li>Нездоровые серверы исключаются из выбора</li>
 *   <li>Интерфейс LoadBalancer с разными реализациями</li>
 *   <li>Потокобезопасность</li>
 *   <li>Если нет доступных серверов — исключение</li>
 * </ul>
 *
 * <p>Уровень: Продвинутый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task77_load_balancer/LoadBalancerService.java
 * java -cp src/main/java com.practice.task77_load_balancer.LoadBalancerService
 * </pre>
 */
public class LoadBalancerService {

    /**
     * Сервер.
     *
     * @param id уникальный идентификатор
     * @param address адрес сервера
     * @param weight вес (для взвешенных алгоритмов)
     * @param healthy здоров ли сервер
     */
    public record Server(String id, String address, int weight, boolean healthy) {}

    /**
     * Статистика сервера.
     *
     * @param serverId идентификатор сервера
     * @param totalRequests общее количество запросов
     * @param activeConnections текущие активные соединения
     */
    public record ServerStats(String serverId, long totalRequests, int activeConnections) {}

    /**
     * Интерфейс балансировщика нагрузки.
     */
    public interface LoadBalancer {
        /**
         * Добавляет сервер в пул.
         */
        void addServer(Server server);

        /**
         * Удаляет сервер из пула.
         */
        void removeServer(String serverId);

        /**
         * Возвращает следующий сервер по алгоритму. Нездоровые серверы пропускаются.
         *
         * @return сервер для обработки запроса
         * @throws IllegalStateException если нет доступных серверов
         */
        Server getNextServer();

        /**
         * Отмечает сервер как здоровый.
         */
        void markHealthy(String serverId);

        /**
         * Отмечает сервер как нездоровый.
         */
        void markUnhealthy(String serverId);

        /**
         * Освобождает одно активное соединение сервера.
         */
        void releaseConnection(String serverId);

        /**
         * Возвращает статистику сервера.
         */
        ServerStats getStats(String serverId);
    }

    /**
     * Создаёт RoundRobin балансировщик.
     *
     * @return реализация RoundRobin
     */
    public static LoadBalancer createRoundRobin() {
        // TODO: implement
        return null;
    }

    /**
     * Создаёт WeightedRoundRobin балансировщик.
     *
     * @return реализация WeightedRoundRobin
     */
    public static LoadBalancer createWeightedRoundRobin() {
        // TODO: implement
        return null;
    }

    /**
     * Создаёт LeastConnections балансировщик.
     *
     * @return реализация LeastConnections
     */
    public static LoadBalancer createLeastConnections() {
        // TODO: implement
        return null;
    }

    /**
     * Создаёт RandomWithWeights балансировщик.
     *
     * @return реализация RandomWithWeights
     */
    public static LoadBalancer createRandomWithWeights() {
        // TODO: implement
        return null;
    }

    public static void main(String[] args) {
        System.out.println("=== LoadBalancerService: Smoke Test ===");
        // TODO: smoke test — проверить каждый алгоритм
    }
}
