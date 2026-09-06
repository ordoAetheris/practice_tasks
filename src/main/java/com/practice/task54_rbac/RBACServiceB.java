package com.practice.task54_rbac;

/**
 * RBAC — ВАРИАНТ B: ПРОВЕРКА ОБХОДОМ ИЕРАРХИИ ИТЕРАТИВНО
 *
 * <p>CORE = базовый {@link RBACService} (роли/иерархия, hasPermission).</p>
 *
 * <p><b>ВАРИАНТ B — обход иерархии ролей [prim: iterative-stack ⭐, cycle-detect]:</b></p>
 * <ul>
 *   <li>hasPermission поднимается по родительским ролям ИТЕРАТИВНО (явный стек/очередь), не рекурсией.</li>
 *   <li>Защита от циклов в иерархии (visited-set), анти-StackOverflow на глубокой иерархии.</li>
 *   <li>Проверка: право унаследовано через N уровней; цикл ролей не зацикливает проверку.</li>
 * </ul>
 */
public class RBACServiceB {
    public boolean hasPermission(String userId, String resource, RBACService.Action action){ throw new UnsupportedOperationException("TODO: variant B — iterative role-hierarchy traversal + cycle guard"); }
    public static void main(String[] a){ System.out.println("=== RBACServiceB (iterative check): Smoke ==="); }
}
