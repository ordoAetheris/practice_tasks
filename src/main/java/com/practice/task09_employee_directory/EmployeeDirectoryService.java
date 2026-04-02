package com.practice.task09_employee_directory;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

/**
 * СПРАВОЧНИК СОТРУДНИКОВ
 *
 * <p>Реализуйте справочник сотрудников компании с поддержкой кадровых операций:
 * приём, увольнение, перевод между отделами, изменение зарплаты.
 * Поддерживается поиск и аналитика по отделам.</p>
 *
 * <p>Сущности:</p>
 * <ul>
 *   <li>Employee — сотрудник: id, name, department, position, salary, hireDate</li>
 * </ul>
 *
 * <p>Бизнес-правила:</p>
 * <ul>
 *   <li>Зарплата должна быть положительной</li>
 *   <li>Нельзя уволить уже уволенного сотрудника</li>
 *   <li>Нельзя менять данные уволенного сотрудника</li>
 * </ul>
 *
 * <p>Уровень: Базовый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task09_employee_directory/EmployeeDirectoryService.java
 * java -cp src/main/java com.practice.task09_employee_directory.EmployeeDirectoryService
 * </pre>
 */
public class EmployeeDirectoryService {

    public record Employee(Long id, String name, String department, String position,
                           BigDecimal salary, LocalDate hireDate, boolean fired) {}

    /**
     * Принять сотрудника на работу.
     * @param name имя
     * @param department отдел
     * @param position должность
     * @param salary зарплата (> 0)
     * @param hireDate дата приёма
     * @return созданный сотрудник
     * @throws IllegalArgumentException если зарплата <= 0 или имя пустое
     */
    public Employee hire(String name, String department, String position,
                         BigDecimal salary, LocalDate hireDate) {
        // TODO: implement
        return null;
    }

    /**
     * Уволить сотрудника.
     * @param employeeId идентификатор сотрудника
     * @return обновлённый сотрудник с флагом fired=true
     * @throws IllegalArgumentException если сотрудник не найден
     * @throws IllegalStateException если сотрудник уже уволен
     */
    public Employee fire(Long employeeId) {
        // TODO: implement
        return null;
    }

    /**
     * Перевести сотрудника в другой отдел.
     * @param employeeId идентификатор сотрудника
     * @param newDepartment новый отдел
     * @return обновлённый сотрудник
     * @throws IllegalStateException если сотрудник уволен
     */
    public Employee transferDepartment(Long employeeId, String newDepartment) {
        // TODO: implement
        return null;
    }

    /**
     * Изменить зарплату сотрудника.
     * @param employeeId идентификатор сотрудника
     * @param newSalary новая зарплата (> 0)
     * @return обновлённый сотрудник
     * @throws IllegalStateException если сотрудник уволен
     * @throws IllegalArgumentException если зарплата <= 0
     */
    public Employee changeSalary(Long employeeId, BigDecimal newSalary) {
        // TODO: implement
        return null;
    }

    /**
     * Найти активных (не уволенных) сотрудников по отделу.
     * @param department отдел
     * @return список сотрудников отдела
     */
    public List<Employee> findByDepartment(String department) {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Найти активных сотрудников по должности.
     * @param position должность
     * @return список сотрудников
     */
    public List<Employee> findByPosition(String position) {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Средняя зарплата по отделу (среди активных сотрудников).
     * @param department отдел
     * @return средняя зарплата или BigDecimal.ZERO если отдел пуст
     */
    public BigDecimal getAverageSalary(String department) {
        // TODO: implement
        return BigDecimal.ZERO;
    }

    /**
     * Сотрудники со стажем больше N лет (от hireDate до referenceDate).
     * @param years минимальный стаж в годах
     * @param referenceDate дата, на которую считается стаж
     * @return список сотрудников
     */
    public List<Employee> getEmployeesWithExperience(int years, LocalDate referenceDate) {
        // TODO: implement
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        System.out.println("=== EmployeeDirectoryService: Smoke Test ===");
        // TODO: создать тестовые данные и проверить основные сценарии
    }
}
