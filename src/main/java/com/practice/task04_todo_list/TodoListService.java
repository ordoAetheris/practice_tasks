package com.practice.task04_todo_list;

import java.time.LocalDateTime;
import java.util.*;

/**
 * СПИСОК ЗАДАЧ С ПРИОРИТЕТАМИ
 *
 * <p>Реализуйте сервис управления списком задач (To-Do List) с поддержкой приоритетов
 * и статусов. Задачи можно создавать, обновлять статус, удалять и фильтровать.</p>
 *
 * <p>Сущности:</p>
 * <ul>
 *   <li>Task — задача: id, title, description, priority (HIGH/MEDIUM/LOW),
 *       status (TODO/IN_PROGRESS/DONE), createdAt</li>
 * </ul>
 *
 * <p>Бизнес-правила:</p>
 * <ul>
 *   <li>Нельзя перевести задачу из статуса DONE обратно в TODO</li>
 *   <li>Допустимые переходы: TODO -> IN_PROGRESS -> DONE, TODO -> DONE, IN_PROGRESS -> TODO</li>
 *   <li>Название задачи не может быть пустым</li>
 * </ul>
 *
 * <p>Уровень: Базовый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task04_todo_list/TodoListService.java
 * java -cp src/main/java com.practice.task04_todo_list.TodoListService
 * </pre>
 */
public class TodoListService {

    public enum Priority { HIGH, MEDIUM, LOW }

    public enum Status { TODO, IN_PROGRESS, DONE }

    public record Task(Long id, String title, String description, Priority priority,
                       Status status, LocalDateTime createdAt) {}

    /**
     * Создать новую задачу со статусом TODO и текущей датой создания.
     * @param title название (не пустое)
     * @param description описание
     * @param priority приоритет
     * @return созданная задача
     * @throws IllegalArgumentException если title пустой или null
     */
    public Task createTask(String title, String description, Priority priority) {
        // TODO: implement
        return null;
    }

    /**
     * Обновить статус задачи.
     * @param taskId идентификатор задачи
     * @param newStatus новый статус
     * @return обновлённая задача
     * @throws IllegalStateException если переход из DONE в TODO
     * @throws IllegalArgumentException если задача не найдена
     */
    public Task updateStatus(Long taskId, Status newStatus) {
        // TODO: implement
        return null;
    }

    /**
     * Удалить задачу по id.
     * @param taskId идентификатор задачи
     * @return true если задача была удалена
     */
    public boolean deleteTask(Long taskId) {
        // TODO: implement
        return false;
    }

    /**
     * Найти задачи по статусу.
     * @param status статус для фильтрации
     * @return список задач с указанным статусом
     */
    public List<Task> findByStatus(Status status) {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Найти задачи по приоритету.
     * @param priority приоритет для фильтрации
     * @return список задач с указанным приоритетом
     */
    public List<Task> findByPriority(Priority priority) {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Получить все задачи, отсортированные по приоритету (HIGH первый),
     * затем по дате создания (ранние первые).
     * @return отсортированный список задач
     */
    public List<Task> getAllSorted() {
        // TODO: implement
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        System.out.println("=== TodoListService: Smoke Test ===");
        // TODO: создать тестовые данные и проверить основные сценарии
    }
}
