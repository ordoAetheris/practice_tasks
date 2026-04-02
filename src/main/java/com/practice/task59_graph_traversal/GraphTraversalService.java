package com.practice.task59_graph_traversal;

import java.util.*;

/**
 * ОБХОД ГРАФА
 *
 * <p>Реализуйте сервис для работы с графами: построение, обход, поиск путей.
 * Узел (Node) содержит: id, data (Map).
 * Ребро (Edge) содержит: from, to, weight (опционально), directed (ориентированное).</p>
 *
 * <p>Необходимо реализовать следующие операции:</p>
 * <ul>
 *   <li>addNode(id, data) — добавить узел</li>
 *   <li>addEdge(from, to, weight, directed) — добавить ребро</li>
 *   <li>bfs(startId) — обход в ширину, вернуть список узлов в порядке посещения</li>
 *   <li>dfs(startId) — обход в глубину, вернуть список узлов в порядке посещения</li>
 *   <li>shortestPath(fromId, toId) — кратчайший путь (алгоритм Дейкстры)</li>
 *   <li>hasPath(fromId, toId) — существует ли путь между узлами</li>
 *   <li>findCycles() — найти все циклы в графе</li>
 *   <li>getConnectedComponents() — получить компоненты связности</li>
 * </ul>
 *
 * <p>Бизнес-правила:</p>
 * <ul>
 *   <li>Поддержка ориентированных и неориентированных графов (через флаг directed у ребра)</li>
 *   <li>Вес ребра >= 0 (для корректности Дейкстры)</li>
 *   <li>Если вес не указан, считается равным 1</li>
 *   <li>Добавление ребра с несуществующим узлом — ошибка</li>
 * </ul>
 *
 * <p>Уровень: Средний</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task59_graph_traversal/GraphTraversalService.java
 * java -cp src/main/java com.practice.task59_graph_traversal.GraphTraversalService
 * </pre>
 */
public class GraphTraversalService {

    public record Node(
            String id,
            Map<String, Object> data
    ) {}

    public record Edge(
            String from,
            String to,
            double weight,
            boolean directed
    ) {}

    /**
     * Добавляет узел в граф.
     * @param id идентификатор узла
     * @param data данные узла
     * @throws IllegalArgumentException если узел с таким id уже существует
     */
    public void addNode(String id, Map<String, Object> data) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Добавляет ребро в граф. Для неориентированного ребра добавляется связь в обе стороны.
     * @param from идентификатор начального узла
     * @param to идентификатор конечного узла
     * @param weight вес ребра (>= 0)
     * @param directed true если ребро ориентированное
     * @throws IllegalArgumentException если узлы не существуют или weight < 0
     */
    public void addEdge(String from, String to, double weight, boolean directed) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Обход графа в ширину (BFS) начиная с указанного узла.
     * @param startId идентификатор стартового узла
     * @return список идентификаторов узлов в порядке посещения
     */
    public List<String> bfs(String startId) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Обход графа в глубину (DFS) начиная с указанного узла.
     * @param startId идентификатор стартового узла
     * @return список идентификаторов узлов в порядке посещения
     */
    public List<String> dfs(String startId) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Находит кратчайший путь между двумя узлами (алгоритм Дейкстры).
     * @param fromId начальный узел
     * @param toId конечный узел
     * @return список узлов кратчайшего пути (включая оба конца), или пустой список если пути нет
     */
    public List<String> shortestPath(String fromId, String toId) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Проверяет, существует ли путь между двумя узлами.
     * @param fromId начальный узел
     * @param toId конечный узел
     * @return true если путь существует
     */
    public boolean hasPath(String fromId, String toId) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Находит все циклы в графе.
     * @return список циклов (каждый цикл — список идентификаторов узлов)
     */
    public List<List<String>> findCycles() {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Возвращает компоненты связности графа (для неориентированных рёбер).
     * @return список компонент, каждая — множество идентификаторов узлов
     */
    public List<Set<String>> getConnectedComponents() {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    public static void main(String[] args) {
        System.out.println("=== GraphTraversalService: Smoke Test ===");
        // TODO: smoke test
    }
}
