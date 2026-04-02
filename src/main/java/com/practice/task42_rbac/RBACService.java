package com.practice.task42_rbac;

import java.util.*;

/**
 * СИСТЕМА РОЛЕЙ И ПРАВ ДОСТУПА (RBAC)
 *
 * <p>Реализуйте систему управления ролями и правами доступа.
 * Пользователь (User) содержит: id, name.
 * Роль (Role) содержит: id, name, набор разрешений (permissions), родительская роль (опционально).
 * Разрешение (Permission) содержит: resource (строка), action (READ/WRITE/DELETE/ADMIN).</p>
 *
 * <p>Необходимо реализовать следующие операции:</p>
 * <ul>
 *   <li>createRole(name, permissions) — создать роль с набором разрешений</li>
 *   <li>setRoleParent(roleId, parentRoleId) — установить наследование роли</li>
 *   <li>assignRole(userId, roleId) — назначить роль пользователю</li>
 *   <li>revokeRole(userId, roleId) — отозвать роль у пользователя</li>
 *   <li>hasPermission(userId, resource, action) — проверить наличие права</li>
 *   <li>getUserPermissions(userId) — получить все разрешения пользователя</li>
 *   <li>getRoleHierarchy(roleId) — получить цепочку наследования роли</li>
 * </ul>
 *
 * <p>Бизнес-правила:</p>
 * <ul>
 *   <li>ADMIN-действие на ресурс даёт все остальные действия (READ, WRITE, DELETE)</li>
 *   <li>Права накапливаются из всех назначенных ролей пользователя</li>
 *   <li>Роль наследует все разрешения родительской роли (и далее по цепочке)</li>
 *   <li>Циклическое наследование ролей запрещено</li>
 * </ul>
 *
 * <p>Уровень: Средний</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task42_rbac/RBACService.java
 * java -cp src/main/java com.practice.task42_rbac.RBACService
 * </pre>
 */
public class RBACService {

    public enum Action {
        READ, WRITE, DELETE, ADMIN
    }

    public record Permission(
            String resource,
            Action action
    ) {}

    public record Role(
            String id,
            String name,
            Set<Permission> permissions,
            String parentRoleId
    ) {}

    public record User(
            String id,
            String name
    ) {}

    /**
     * Создаёт новую роль с указанными разрешениями.
     * @param name имя роли
     * @param permissions набор разрешений
     * @return созданная роль
     */
    public Role createRole(String name, Set<Permission> permissions) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Устанавливает родительскую роль для наследования.
     * @param roleId идентификатор дочерней роли
     * @param parentRoleId идентификатор родительской роли
     * @throws IllegalArgumentException если это создаёт циклическое наследование
     */
    public void setRoleParent(String roleId, String parentRoleId) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Назначает роль пользователю.
     * @param userId идентификатор пользователя
     * @param roleId идентификатор роли
     */
    public void assignRole(String userId, String roleId) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Отзывает роль у пользователя.
     * @param userId идентификатор пользователя
     * @param roleId идентификатор роли
     */
    public void revokeRole(String userId, String roleId) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Проверяет наличие права у пользователя на указанный ресурс и действие.
     * Учитывает все роли пользователя, наследование ролей и ADMIN-привилегию.
     * @param userId идентификатор пользователя
     * @param resource имя ресурса
     * @param action действие
     * @return true если право есть
     */
    public boolean hasPermission(String userId, String resource, Action action) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Возвращает все эффективные разрешения пользователя (с учётом наследования ролей и ADMIN).
     * @param userId идентификатор пользователя
     * @return набор всех разрешений
     */
    public Set<Permission> getUserPermissions(String userId) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Возвращает цепочку наследования роли (от текущей до корневой).
     * @param roleId идентификатор роли
     * @return список ролей в цепочке наследования
     */
    public List<Role> getRoleHierarchy(String roleId) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    public static void main(String[] args) {
        System.out.println("=== RBACService: Smoke Test ===");
        // TODO: smoke test
    }
}
