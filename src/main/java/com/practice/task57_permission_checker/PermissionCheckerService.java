package com.practice.task57_permission_checker;

import java.util.*;

/**
 * ПРОВЕРКА ПРАВ С НАСЛЕДОВАНИЕМ РЕСУРСОВ
 *
 * <p>Реализуйте систему проверки прав доступа с иерархией ресурсов и группами пользователей.
 * Ресурс идентифицируется путём (например, "/org/team/project").
 * Разрешение (Permission) содержит: resourcePath, userId или groupId, action, allow/deny.</p>
 *
 * <p>Необходимо реализовать следующие операции:</p>
 * <ul>
 *   <li>grant(path, userId, action) — дать разрешение на действие</li>
 *   <li>deny(path, userId, action) — запретить действие</li>
 *   <li>check(path, userId, action) — проверить право с учётом наследования</li>
 *   <li>getEffectivePermissions(path, userId) — все эффективные права для ресурса и пользователя</li>
 *   <li>addToGroup(userId, groupId) — добавить пользователя в группу</li>
 *   <li>grantToGroup(path, groupId, action) — дать разрешение группе</li>
 *   <li>denyToGroup(path, groupId, action) — запретить действие для группы</li>
 * </ul>
 *
 * <p>Бизнес-правила:</p>
 * <ul>
 *   <li>deny приоритетнее allow на одном уровне</li>
 *   <li>Более конкретный путь приоритетнее родительского ("/a/b" > "/a")</li>
 *   <li>Права группы наследуются пользователем</li>
 *   <li>Права на родительском пути распространяются на дочерние ("/org" -> "/org/team")</li>
 *   <li>Индивидуальные права пользователя приоритетнее групповых</li>
 * </ul>
 *
 * <p>Уровень: Средний</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task57_permission_checker/PermissionCheckerService.java
 * java -cp src/main/java com.practice.task57_permission_checker.PermissionCheckerService
 * </pre>
 */
public class PermissionCheckerService {

    public enum Action {
        READ, WRITE, DELETE, ADMIN
    }

    public enum PermissionType {
        ALLOW, DENY
    }

    /**
     * Выдаёт разрешение пользователю на действие с ресурсом.
     * @param path путь ресурса (например, "/org/team/project")
     * @param userId идентификатор пользователя
     * @param action действие
     */
    public void grant(String path, String userId, Action action) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Запрещает пользователю действие с ресурсом.
     * @param path путь ресурса
     * @param userId идентификатор пользователя
     * @param action действие
     */
    public void deny(String path, String userId, Action action) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Проверяет, имеет ли пользователь право на действие с ресурсом.
     * Учитывает наследование от родительских путей, группы, приоритет deny.
     * @param path путь ресурса
     * @param userId идентификатор пользователя
     * @param action действие
     * @return true если действие разрешено
     */
    public boolean check(String path, String userId, Action action) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Возвращает все эффективные права пользователя для указанного ресурса.
     * @param path путь ресурса
     * @param userId идентификатор пользователя
     * @return карта: действие -> разрешено/запрещено
     */
    public Map<Action, PermissionType> getEffectivePermissions(String path, String userId) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Добавляет пользователя в группу.
     * @param userId идентификатор пользователя
     * @param groupId идентификатор группы
     */
    public void addToGroup(String userId, String groupId) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Выдаёт разрешение группе на действие с ресурсом.
     * @param path путь ресурса
     * @param groupId идентификатор группы
     * @param action действие
     */
    public void grantToGroup(String path, String groupId, Action action) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Запрещает группе действие с ресурсом.
     * @param path путь ресурса
     * @param groupId идентификатор группы
     * @param action действие
     */
    public void denyToGroup(String path, String groupId, Action action) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    public static void main(String[] args) {
        System.out.println("=== PermissionCheckerService: Smoke Test ===");
        // TODO: smoke test
    }
}
