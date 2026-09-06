package com.practice.task61_org_hierarchy;

/**
 * ОРГСТРУКТУРА — ВАРИАНТ E: LCA + SNAPSHOT
 *
 * <p>CORE = базовый {@link OrgHierarchyService}.</p>
 *
 * <p><b>ВАРИАНТ E — общий менеджер + снимок [prim: aux-index, LCA]:</b></p>
 * <ul>
 *   <li>findCommonManager = наименьший общий предок (LCA) двух сотрудников через управленческие цепочки/подъём.</li>
 *   <li>Потокобезопасный снимок для консистентности при конкурентных moveEmployee.</li>
 *   <li>Проверка: LCA двух сотрудников корректен; snapshot не рвётся при параллельном перемещении.</li>
 * </ul>
 */
public class OrgHierarchyServiceE {
    public OrgHierarchyService.Employee findCommonManager(String empId1, String empId2){ throw new UnsupportedOperationException("TODO: variant E — LCA + thread-safe snapshot"); }
    public static void main(String[] a){ System.out.println("=== OrgHierarchyServiceE (LCA/snapshot): Smoke ==="); }
}
