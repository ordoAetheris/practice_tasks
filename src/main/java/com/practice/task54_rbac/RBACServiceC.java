package com.practice.task54_rbac;

/**
 * RBAC — ВАРИАНТ C: КЭШ РАЗРЕШЕНИЙ
 *
 * <p>CORE = базовый {@link RBACService}.</p>
 *
 * <p><b>ВАРИАНТ C — кэш [prim: cache, invalidation]:</b></p>
 * <ul>
 *   <li>Кэшировать разрешённый набор прав пользователя (сплющенная иерархия); инвалидировать при assign/revoke/setParent.</li>
 *   <li>Проверка: повторный hasPermission из кэша; изменение роли инвалидирует и меняет решение.</li>
 * </ul>
 */
public class RBACServiceC {
    public boolean hasPermission(String userId, String resource, RBACService.Action action){ throw new UnsupportedOperationException("TODO: variant C — cached resolved permissions + invalidation"); }
    public static void main(String[] a){ System.out.println("=== RBACServiceC (cache): Smoke ==="); }
}
