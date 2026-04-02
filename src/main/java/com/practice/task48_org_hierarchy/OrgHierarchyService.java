package com.practice.task48_org_hierarchy;

import java.util.*;

/**
 * ОРГАНИЗАЦИОННАЯ ИЕРАРХИЯ
 *
 * <p>Реализуйте сервис управления организационной иерархией сотрудников.
 * Сотрудник (Employee) содержит: id, name, managerId (nullable — для CEO),
 * title, department.</p>
 *
 * <p>Необходимо реализовать следующие операции:</p>
 * <ul>
 *   <li>addEmployee(employee) — добавить сотрудника</li>
 *   <li>getDirectReports(employeeId) — получить прямых подчинённых</li>
 *   <li>getAllSubordinates(employeeId) — получить всех подчинённых рекурсивно</li>
 *   <li>getManagementChain(employeeId) — путь от сотрудника до CEO</li>
 *   <li>findCommonManager(empId1, empId2) — найти ближайшего общего менеджера</li>
 *   <li>getTeamSize(managerId) — размер всей команды (включая вложенных подчинённых)</li>
 *   <li>moveEmployee(empId, newManagerId) — перевести сотрудника к другому менеджеру</li>
 * </ul>
 *
 * <p>Бизнес-правила:</p>
 * <ul>
 *   <li>CEO — единственный сотрудник без менеджера (managerId = null)</li>
 *   <li>Нельзя создать второго сотрудника без менеджера</li>
 *   <li>Нельзя стать подчинённым своего подчинённого (защита от циклов)</li>
 *   <li>moveEmployee не может переместить CEO</li>
 * </ul>
 *
 * <p>Уровень: Средний</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task48_org_hierarchy/OrgHierarchyService.java
 * java -cp src/main/java com.practice.task48_org_hierarchy.OrgHierarchyService
 * </pre>
 */
public class OrgHierarchyService {

    public record Employee(
            String id,
            String name,
            String managerId,
            String title,
            String department
    ) {}

    /**
     * Добавляет сотрудника в иерархию.
     * @param employee данные сотрудника
     * @throws IllegalArgumentException если managerId не null и менеджер не найден
     * @throws IllegalStateException если пытаемся добавить второго CEO
     */
    public void addEmployee(Employee employee) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Возвращает список прямых подчинённых сотрудника.
     * @param employeeId идентификатор менеджера
     * @return список прямых подчинённых
     */
    public List<Employee> getDirectReports(String employeeId) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Возвращает всех подчинённых рекурсивно (прямые + подчинённые подчинённых).
     * @param employeeId идентификатор менеджера
     * @return список всех подчинённых
     */
    public List<Employee> getAllSubordinates(String employeeId) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Возвращает цепочку менеджеров от сотрудника до CEO (включая обоих).
     * @param employeeId идентификатор сотрудника
     * @return список от сотрудника до CEO
     */
    public List<Employee> getManagementChain(String employeeId) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Находит ближайшего общего менеджера двух сотрудников.
     * @param empId1 идентификатор первого сотрудника
     * @param empId2 идентификатор второго сотрудника
     * @return общий менеджер
     */
    public Employee findCommonManager(String empId1, String empId2) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Возвращает размер команды менеджера (все подчинённые рекурсивно).
     * @param managerId идентификатор менеджера
     * @return количество всех подчинённых
     */
    public int getTeamSize(String managerId) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Перемещает сотрудника к другому менеджеру.
     * @param empId идентификатор сотрудника
     * @param newManagerId идентификатор нового менеджера
     * @throws IllegalArgumentException если это создаст цикл в иерархии
     * @throws IllegalStateException если пытаемся переместить CEO
     */
    public void moveEmployee(String empId, String newManagerId) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    public static void main(String[] args) {
        System.out.println("=== OrgHierarchyService: Smoke Test ===");
        // TODO: smoke test
    }
}
