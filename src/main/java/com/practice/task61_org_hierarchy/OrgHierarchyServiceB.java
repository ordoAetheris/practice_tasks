package com.practice.task61_org_hierarchy;

/**
 * ОРГСТРУКТУРА — ВАРИАНТ B: ДЕТЕКЦИЯ ЦИКЛА
 *
 * <p>CORE = базовый {@link OrgHierarchyService} (иерархия сотрудников/менеджеров).</p>
 *
 * <p><b>ВАРИАНТ B — цикл [prim: cycle-detect]:</b></p>
 * <ul>
 *   <li>moveEmployee не должен создавать цикл (сотрудник не может стать начальником своего начальника): проверить перед перемещением.</li>
 *   <li>Проверка: попытка переместить менеджера под собственного подчинённого → отказ (цикл предотвращён).</li>
 * </ul>
 */
public class OrgHierarchyServiceB {
    public void moveEmployee(String empId, String newManagerId){ throw new UnsupportedOperationException("TODO: variant B — prevent cycle on move"); }
    public static void main(String[] a){ System.out.println("=== OrgHierarchyServiceB (cycle-detect): Smoke ==="); }
}
