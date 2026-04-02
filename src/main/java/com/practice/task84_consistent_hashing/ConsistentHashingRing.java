package com.practice.task84_consistent_hashing;

import java.util.*;

/**
 * CONSISTENT HASHING RING
 *
 * <p>Реализовать кольцо консистентного хеширования — алгоритм распределения ключей по узлам
 * кластера, обеспечивающий минимальное перераспределение данных при добавлении/удалении узлов.
 * Используется в распределённых системах: Cassandra, DynamoDB, Memcached, CDN.</p>
 *
 * <p>Ключевая идея: узлы и ключи отображаются на кольцо [0, 2^32). Ключ обслуживается
 * ближайшим узлом по часовой стрелке. Виртуальные узлы (vnodes) обеспечивают равномерное
 * распределение нагрузки.</p>
 *
 * <h3>Основные операции:</h3>
 * <ul>
 *   <li>addNode(nodeId, virtualNodes) — добавить узел с заданным числом виртуальных копий на кольце</li>
 *   <li>removeNode(nodeId) — удалить узел и все его виртуальные копии</li>
 *   <li>getNode(key) — определить, какой узел обслуживает данный ключ</li>
 *   <li>getDistribution() — распределение ключей по узлам (Map: nodeId -> count)</li>
 *   <li>rebalance() — при добавлении/удалении показать, какие ключи переместились</li>
 * </ul>
 *
 * <h3>Требования:</h3>
 * <ul>
 *   <li>Виртуальные узлы для равномерного распределения (каждый физический узел имеет N точек на кольце)</li>
 *   <li>При добавлении/удалении узла перемещается минимальное количество ключей (~1/N от общего числа)</li>
 *   <li>Кольцо на основе TreeMap для O(log n) поиска ближайшего узла</li>
 *   <li>Детерминированная хеш-функция (одинаковый ввод — одинаковый результат)</li>
 *   <li>getNode для пустого кольца — Optional.empty() или исключение</li>
 * </ul>
 *
 * <p>Уровень: Продвинутый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task84_consistent_hashing/ConsistentHashingRing.java
 * java -cp src/main/java com.practice.task84_consistent_hashing.ConsistentHashingRing
 * </pre>
 */
public class ConsistentHashingRing {

    /**
     * Создаёт пустое кольцо консистентного хеширования.
     */
    public ConsistentHashingRing() {
        // TODO: implement
    }

    /**
     * Добавляет узел на кольцо с заданным количеством виртуальных узлов.
     * Каждый виртуальный узел размещается в своей точке кольца (hash от "nodeId#i").
     *
     * @param nodeId       идентификатор физического узла
     * @param virtualNodes количество виртуальных копий на кольце (рекомендуется 100-200)
     * @throws IllegalArgumentException если nodeId уже существует или virtualNodes <= 0
     */
    public void addNode(String nodeId, int virtualNodes) {
        // TODO: implement
    }

    /**
     * Удаляет узел и все его виртуальные копии с кольца.
     * Ключи, ранее обслуживаемые этим узлом, автоматически переходят к следующему
     * по часовой стрелке.
     *
     * @param nodeId идентификатор узла для удаления
     * @throws IllegalArgumentException если узел не найден
     */
    public void removeNode(String nodeId) {
        // TODO: implement
    }

    /**
     * Определяет, какой узел обслуживает данный ключ.
     * Хеширует ключ, находит ближайшую точку по часовой стрелке на кольце.
     *
     * @param key ключ для маршрутизации
     * @return Optional с идентификатором узла или пустой Optional если кольцо пусто
     */
    public Optional<String> getNode(String key) {
        // TODO: implement
        return Optional.empty();
    }

    /**
     * Возвращает текущее распределение набора ключей по узлам.
     *
     * @param keys набор ключей для анализа распределения
     * @return Map: nodeId -> количество ключей, обслуживаемых этим узлом
     */
    public Map<String, Integer> getDistribution(Collection<String> keys) {
        // TODO: implement
        return Map.of();
    }

    /**
     * Показывает, какие ключи переместятся при изменении топологии.
     * Сравнивает маршрутизацию до и после добавления/удаления узла.
     *
     * @param keys           набор ключей для анализа
     * @param previousMapping предыдущее отображение ключей на узлы
     * @return Map: ключ -> новый узел (только для перемещённых ключей)
     */
    public Map<String, String> getRebalancedKeys(Collection<String> keys, Map<String, String> previousMapping) {
        // TODO: implement
        return Map.of();
    }

    /**
     * Возвращает количество физических узлов на кольце.
     *
     * @return количество узлов
     */
    public int getNodeCount() {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("=== ConsistentHashingRing: Smoke Test ===");
        // TODO: smoke test — добавить узлы, распределить ключи, удалить узел,
        // проверить перераспределение
    }
}
