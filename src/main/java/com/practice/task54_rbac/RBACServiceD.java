package com.practice.task54_rbac;

/**
 * RBAC — ВАРИАНТ D: THREAD-SAFE
 *
 * <p>CORE = базовый {@link RBACService}.</p>
 *
 * <p><b>ВАРИАНТ D — потокобезопасность [prim: mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>Конкурентные assignRole/revokeRole/setRoleParent и hasPermission согласованы; кэш инвалидируется атомарно.</li>
 *   <li>Проверка: параллельные изменение роли и проверка не дают «полурешения»; после revoke все видят отзыв.</li>
 * </ul>
 */
public class RBACServiceD {
    public boolean hasPermission(String userId, String resource, RBACService.Action action){ throw new UnsupportedOperationException("TODO: variant D — thread-safe role changes + checks"); }
    public static void main(String[] a){ System.out.println("=== RBACServiceD (thread-safe): Smoke ==="); }
}
