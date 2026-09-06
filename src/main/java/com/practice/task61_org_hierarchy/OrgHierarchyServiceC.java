package com.practice.task61_org_hierarchy;

import java.util.List;

/**
 * ОРГСТРУКТУРА — ВАРИАНТ C: TOPO / ПО УРОВНЯМ
 *
 * <p>CORE = базовый {@link OrgHierarchyService}.</p>
 *
 * <p><b>ВАРИАНТ C — обход по уровням [prim: topo-sort, BFS-levels]:</b></p>
 * <ul>
 *   <li>Вывести сотрудников по уровням иерархии (BFS от CEO); topo-порядок «сверху вниз».</li>
 *   <li>Проверка: уровень 0 = верх, дети на уровень ниже; порядок согласован с управленческой цепочкой.</li>
 * </ul>
 */
public class OrgHierarchyServiceC {
    public List<OrgHierarchyService.Employee> getByLevels(String rootId){ throw new UnsupportedOperationException("TODO: variant C — level-order (BFS) / topo"); }
    public static void main(String[] a){ System.out.println("=== OrgHierarchyServiceC (levels/topo): Smoke ==="); }
}
