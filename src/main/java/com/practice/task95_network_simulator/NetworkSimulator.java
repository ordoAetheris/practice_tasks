package com.practice.task95_network_simulator;

import java.util.*;

/**
 * СИМУЛЯТОР КОМПЬЮТЕРНОЙ СЕТИ
 *
 * <p>Реализовать симулятор пакетной сети с узлами, каналами связи, маршрутизацией,
 * TTL, потерей пакетов и сбором статистики. Моделирует основные принципы работы
 * компьютерных сетей (IP/routing).</p>
 *
 * <h3>Компоненты:</h3>
 * <ul>
 *   <li>Node — узел сети (id, address, таблица маршрутизации)</li>
 *   <li>Link — канал связи (from, to, bandwidth, latency, packetLoss)</li>
 *   <li>Packet — пакет (src, dst, payload, size, ttl, hops)</li>
 * </ul>
 *
 * <h3>Основные операции:</h3>
 * <ul>
 *   <li>addNode(id, address) — добавить узел в сеть</li>
 *   <li>addLink(from, to, bandwidth, latency, packetLoss) — добавить канал связи</li>
 *   <li>sendPacket(src, dst, payload) — отправить пакет</li>
 *   <li>step() — один шаг симуляции (продвинуть пакеты по сети)</li>
 *   <li>simulate(steps) — выполнить N шагов симуляции</li>
 *   <li>getRoutingTable(nodeId) — таблица маршрутизации узла</li>
 *   <li>getStats() — статистика: sent/received/dropped/avgLatency</li>
 * </ul>
 *
 * <h3>Правила:</h3>
 * <ul>
 *   <li>Маршрутизация: кратчайший путь (Dijkstra по latency)</li>
 *   <li>TTL: уменьшается на 1 на каждом хопе, при TTL=0 пакет сбрасывается</li>
 *   <li>packetLoss: вероятностный сброс (например, 0.1 = 10% потерь на каждом канале)</li>
 *   <li>bandwidth: ограничение на количество пакетов/байт в единицу времени</li>
 *   <li>Таблицы маршрутизации строятся автоматически при изменении топологии</li>
 * </ul>
 *
 * <p>Уровень: Продвинутый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task95_network_simulator/NetworkSimulator.java
 * java -cp src/main/java com.practice.task95_network_simulator.NetworkSimulator
 * </pre>
 */
public class NetworkSimulator {

    /**
     * Узел сети.
     */
    public record Node(String id, String address) {}

    /**
     * Канал связи между узлами.
     *
     * @param from       id узла-источника
     * @param to         id узла-назначения
     * @param bandwidth  пропускная способность (пакетов/шаг)
     * @param latency    задержка (в шагах симуляции)
     * @param packetLoss вероятность потери пакета (0.0-1.0)
     */
    public record Link(String from, String to, int bandwidth, int latency, double packetLoss) {}

    /**
     * Пакет в сети.
     */
    // TODO: implement Packet class (src, dst, payload, size, ttl, hops, createdAtStep)

    /**
     * Статистика симуляции.
     */
    public record NetworkStats(int totalSent, int totalReceived, int totalDropped,
                                int totalTTLExpired, double avgLatency) {}

    /**
     * Создаёт пустой симулятор с настройками по умолчанию.
     *
     * @param defaultTTL TTL по умолчанию для новых пакетов
     */
    public NetworkSimulator(int defaultTTL) {
        // TODO: implement
    }

    /**
     * Добавляет узел в сеть.
     *
     * @param id      уникальный идентификатор узла
     * @param address сетевой адрес
     * @throws IllegalArgumentException если id уже существует
     */
    public void addNode(String id, String address) {
        // TODO: implement
    }

    /**
     * Добавляет канал связи между узлами (двунаправленный).
     * Автоматически перестраивает таблицы маршрутизации.
     *
     * @param from       id узла-источника
     * @param to         id узла-назначения
     * @param bandwidth  пропускная способность
     * @param latency    задержка в шагах
     * @param packetLoss вероятность потери (0.0-1.0)
     */
    public void addLink(String from, String to, int bandwidth, int latency, double packetLoss) {
        // TODO: implement
    }

    /**
     * Отправляет пакет от src к dst.
     * Пакет помещается в очередь отправки узла src.
     *
     * @param src     id узла-отправителя
     * @param dst     id узла-получателя
     * @param payload данные пакета
     * @return id пакета для отслеживания
     */
    public int sendPacket(String src, String dst, String payload) {
        // TODO: implement
        return 0;
    }

    /**
     * Выполняет один шаг симуляции:
     * 1. Продвинуть пакеты в каналах (учесть latency)
     * 2. Применить packetLoss
     * 3. Уменьшить TTL, сбросить пакеты с TTL=0
     * 4. На каждом узле определить next hop и переслать
     */
    public void step() {
        // TODO: implement
    }

    /**
     * Выполняет N шагов симуляции.
     *
     * @param steps количество шагов
     */
    public void simulate(int steps) {
        // TODO: implement
    }

    /**
     * Возвращает таблицу маршрутизации узла.
     * Формат: Map destination → nextHop.
     *
     * @param nodeId id узла
     * @return таблица маршрутизации
     */
    public Map<String, String> getRoutingTable(String nodeId) {
        // TODO: implement
        return Map.of();
    }

    /**
     * Возвращает статистику симуляции.
     *
     * @return статистика сети
     */
    public NetworkStats getStats() {
        // TODO: implement
        return new NetworkStats(0, 0, 0, 0, 0.0);
    }

    public static void main(String[] args) {
        System.out.println("=== NetworkSimulator: Smoke Test ===");
        // TODO: smoke test — создать топологию из 4-5 узлов, отправить пакеты,
        // simulate, проверить доставку, статистику
    }
}
