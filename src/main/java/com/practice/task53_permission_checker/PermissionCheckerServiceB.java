package com.practice.task53_permission_checker;

/**
 * ПРАВА — ВАРИАНТ B: КЭШ РЕШЕНИЙ
 *
 * <p>CORE = базовый {@link PermissionCheckerService} (grant/deny/check + группы).</p>
 *
 * <p><b>ВАРИАНТ B — кэширование [prim: cache, invalidation]:</b></p>
 * <ul>
 *   <li>Кэшировать результат check(path,user,action); инвалидировать при grant/deny/изменении групп.</li>
 *   <li>Ключ кэша учитывает путь+пользователя+действие; протухание при изменении прав.</li>
 *   <li>Проверка: повторный check берётся из кэша; после grant/deny кэш инвалидируется, решение меняется.</li>
 * </ul>
 */
public class PermissionCheckerServiceB {
    public boolean check(String path, String userId, PermissionCheckerService.Action action){ throw new UnsupportedOperationException("TODO: variant B — cached decisions + invalidation"); }
    public static void main(String[] a){ System.out.println("=== PermissionCheckerServiceB (cache): Smoke ==="); }
}
