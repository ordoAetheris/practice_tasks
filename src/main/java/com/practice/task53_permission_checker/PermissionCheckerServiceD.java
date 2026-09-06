package com.practice.task53_permission_checker;

/**
 * ПРАВА — ВАРИАНТ D: EDGE (deny-overrides / иерархия путей)
 *
 * <p>CORE = базовый {@link PermissionCheckerService}.</p>
 *
 * <p><b>ВАРИАНТ D — edge/null-safety [prim: null-edge ⭐]:</b></p>
 * <ul>
 *   <li>Конфликт grant vs deny (правило приоритета: deny побеждает — зафиксировать); наследование прав по иерархии путей.</li>
 *   <li>Нет ни одного правила (default deny?), пользователь в нескольких группах с разными правами.</li>
 *   <li>Проверка: deny перекрывает groupe-grant; путь-потомок наследует; отсутствие правил → определённый дефолт.</li>
 * </ul>
 */
public class PermissionCheckerServiceD {
    public boolean check(String path, String userId, PermissionCheckerService.Action action){ throw new UnsupportedOperationException("TODO: variant D — edge (deny-overrides/path hierarchy/default)"); }
    public static void main(String[] a){ System.out.println("=== PermissionCheckerServiceD (edge): Smoke ==="); }
}
