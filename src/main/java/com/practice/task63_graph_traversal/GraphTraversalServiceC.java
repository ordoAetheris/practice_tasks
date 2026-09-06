package com.practice.task63_graph_traversal;

import java.util.List;

/**
 * ГРАФ — ВАРИАНТ C: TOPO-SORT
 *
 * <p>CORE = базовый {@link GraphTraversalService}.</p>
 *
 * <p><b>ВАРИАНТ C — топосорт [prim: topo-sort, Kahn]:</b></p>
 * <ul>
 *   <li>Топологическая сортировка орграфа (Kahn по in-degree); при цикле — сигнал невозможности.</li>
 *   <li>Проверка: для DAG порядок валиден; на графе с циклом topo невозможен (пусто/ошибка).</li>
 * </ul>
 */
public class GraphTraversalServiceC {
    public List<String> topologicalSort(){ throw new UnsupportedOperationException("TODO: variant C — Kahn topological sort"); }
    public static void main(String[] a){ System.out.println("=== GraphTraversalServiceC (topo-sort): Smoke ==="); }
}
