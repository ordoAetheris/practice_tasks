package com.practice.task63_graph_traversal;

import java.util.List;

/**
 * ГРАФ — ВАРИАНТ B: ДЕТЕКЦИЯ ЦИКЛОВ
 *
 * <p>CORE = базовый {@link GraphTraversalService} (addNode/addEdge/bfs/dfs/findCycles).</p>
 *
 * <p><b>ВАРИАНТ B — циклы [prim: cycle-detect]:</b></p>
 * <ul>
 *   <li>findCycles: три цвета (white/gray/black) для орграфа; для неориентированного — через parent.</li>
 *   <li>Проверка: обнаруживает все циклы; ацикличный граф — пусто.</li>
 * </ul>
 */
public class GraphTraversalServiceB {
    public List<List<String>> findCycles(){ throw new UnsupportedOperationException("TODO: variant B — cycle detection (3-color)"); }
    public static void main(String[] a){ System.out.println("=== GraphTraversalServiceB (cycle-detect): Smoke ==="); }
}
