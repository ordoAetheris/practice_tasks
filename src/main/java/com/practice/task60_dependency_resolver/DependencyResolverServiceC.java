package com.practice.task60_dependency_resolver;

import java.util.List;

/**
 * ЗАВИСИМОСТИ — ВАРИАНТ C: TOPO-SORT
 *
 * <p>CORE = базовый {@link DependencyResolverService}.</p>
 *
 * <p><b>ВАРИАНТ C — топологическая сортировка [prim: topo-sort, Kahn]:</b></p>
 * <ul>
 *   <li>resolve() = порядок сборки: топосорт (Kahn по in-degree или DFS-postorder). При цикле — ошибка.</li>
 *   <li>Проверка: для DAG порядок валиден (зависимость раньше зависящего); детерминирован при равных вариантах.</li>
 * </ul>
 */
public class DependencyResolverServiceC {
    public List<String> resolveAll(){ throw new UnsupportedOperationException("TODO: variant C — topological order (Kahn/DFS)"); }
    public static void main(String[] a){ System.out.println("=== DependencyResolverServiceC (topo-sort): Smoke ==="); }
}
