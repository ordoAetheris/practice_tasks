package com.practice.task63_graph_traversal;

import java.util.List;

/**
 * ГРАФ — ВАРИАНТ D: ИТЕРАТИВНЫЙ DFS
 *
 * <p>CORE = базовый {@link GraphTraversalService}.</p>
 *
 * <p><b>ВАРИАНТ D — итеративный DFS [prim: iterative-stack ⭐]:</b></p>
 * <ul>
 *   <li>dfs через ЯВНЫЙ стек, не рекурсию — граф в сотни тысяч узлов/глубокая цепочка не роняют стек.</li>
 *   <li>Корректный порядок посещения и visited-множество на явном стеке.</li>
 *   <li>Проверка: dfs на цепочке длиной 100000 без StackOverflow; порядок совпадает с рекурсивным.</li>
 * </ul>
 */
public class GraphTraversalServiceD {
    public List<String> dfs(String startId){ throw new UnsupportedOperationException("TODO: variant D — iterative DFS (explicit stack)"); }
    public static void main(String[] a){ System.out.println("=== GraphTraversalServiceD (iterative DFS): Smoke ==="); }
}
