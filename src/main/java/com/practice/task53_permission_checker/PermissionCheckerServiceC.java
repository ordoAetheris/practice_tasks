package com.practice.task53_permission_checker;

/**
 * ПРАВА — ВАРИАНТ C: THREAD-SAFE
 *
 * <p>CORE = базовый {@link PermissionCheckerService}.</p>
 *
 * <p><b>ВАРИАНТ C — потокобезопасность [prim: mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>Конкурентные grant/deny/check и изменения групп согласованы; кэш (если есть) инвалидируется атомарно.</li>
 *   <li>Проверка: параллельный grant и check не дают «полурешения»; после grant все потоки видят новое право.</li>
 * </ul>
 */
public class PermissionCheckerServiceC {
    public boolean check(String path, String userId, PermissionCheckerService.Action action){ throw new UnsupportedOperationException("TODO: variant C — thread-safe grants/checks"); }
    public static void main(String[] a){ System.out.println("=== PermissionCheckerServiceC (thread-safe): Smoke ==="); }
}
