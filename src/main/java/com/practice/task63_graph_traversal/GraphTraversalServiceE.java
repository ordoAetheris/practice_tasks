package com.practice.task63_graph_traversal;

import java.util.List;

/**
 * ГРАФ — ВАРИАНТ E: ОБРАТНЫЙ ИНДЕКС + SNAPSHOT
 *
 * <p>CORE = базовый {@link GraphTraversalService}.</p>
 *
 * <p><b>ВАРИАНТ E — обратный индекс [prim: aux-index, mutual-excl]:</b></p>
 * <ul>
 *   <li>Обратные рёбра (incoming) индексируются для O(1) «кто указывает на узел»; снимок графа для консистентного обхода.</li>
 *   <li>Проверка: reverse-соседи мгновенны; snapshot не рвётся при параллельном addEdge.</li>
 * </ul>
 */
public class GraphTraversalServiceE {
    public List<String> incoming(String nodeId){ throw new UnsupportedOperationException("TODO: variant E — reverse index + snapshot"); }
    public static void main(String[] a){ System.out.println("=== GraphTraversalServiceE (reverse index): Smoke ==="); }
}
