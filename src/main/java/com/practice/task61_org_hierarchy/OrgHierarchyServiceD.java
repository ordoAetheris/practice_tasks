package com.practice.task61_org_hierarchy;

import java.util.List;

/**
 * ОРГСТРУКТУРА — ВАРИАНТ D: ИТЕРАТИВНЫЙ ОБХОД ПОДЧИНЁННЫХ
 *
 * <p>CORE = базовый {@link OrgHierarchyService}.</p>
 *
 * <p><b>ВАРИАНТ D — итеративно [prim: iterative-stack ⭐]:</b></p>
 * <ul>
 *   <li>getAllSubordinates через явный стек/очередь (BFS/DFS), не рекурсию — глубокая оргструктура не роняет стек.</li>
 *   <li>Проверка: все подчинённые на N уровней вниз собраны итеративно; getTeamSize == их числу.</li>
 * </ul>
 */
public class OrgHierarchyServiceD {
    public List<OrgHierarchyService.Employee> getAllSubordinates(String employeeId){ throw new UnsupportedOperationException("TODO: variant D — iterative subtree traversal"); }
    public static void main(String[] a){ System.out.println("=== OrgHierarchyServiceD (iterative): Smoke ==="); }
}
