package com.practice.task29_contact_deduplication;

import java.util.*;

/**
 * ДЕДУПЛИКАЦИЯ КОНТАКТОВ
 *
 * <p>Реализуйте сервис управления контактами с функцией поиска и объединения
 * дубликатов. Дубликаты определяются по совпадению email или телефона.</p>
 *
 * <p>Сущности:</p>
 * <ul>
 *   <li>Contact — контакт (id, firstName, lastName, email, phone, address)</li>
 * </ul>
 *
 * <p>Операции:</p>
 * <ul>
 *   <li>Добавить контакт</li>
 *   <li>Найти дубликаты (контакты с совпадающим email ИЛИ телефоном)</li>
 *   <li>Объединить два контакта (merge) — сохраняется контакт с меньшим id</li>
 *   <li>Поиск по имени (нечёткий — игнорируя регистр и лишние пробелы)</li>
 *   <li>Получить все контакты</li>
 *   <li>Удалить контакт</li>
 * </ul>
 *
 * <p>Бизнес-правила при merge:</p>
 * <ul>
 *   <li>Сохраняется контакт с меньшим id (числовым)</li>
 *   <li>Пустые поля заполняются из второго контакта</li>
 *   <li>Если оба поля заполнены — приоритет у контакта с меньшим id</li>
 *   <li>Второй контакт удаляется</li>
 * </ul>
 *
 * <p>Уровень: Средний</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task29_contact_deduplication/ContactDeduplicationService.java
 * java -cp src/main/java com.practice.task29_contact_deduplication.ContactDeduplicationService
 * </pre>
 */
public class ContactDeduplicationService {

    public record Contact(
            long id,
            String firstName,
            String lastName,
            String email,
            String phone,
            String address
    ) {}

    /**
     * Добавляет новый контакт.
     *
     * @param firstName имя
     * @param lastName  фамилия
     * @param email     электронная почта (может быть null)
     * @param phone     телефон (может быть null)
     * @param address   адрес (может быть null)
     * @return созданный контакт с автоинкрементным id
     * @throws IllegalArgumentException если и email, и phone равны null
     */
    public Contact addContact(String firstName, String lastName, String email, String phone, String address) {
        // TODO: implement
        return null;
    }

    /**
     * Находит группы дубликатов. Два контакта считаются дубликатами,
     * если совпадает email ИЛИ телефон (не null).
     *
     * @return список групп дубликатов (каждая группа — список контактов)
     */
    public List<List<Contact>> findDuplicates() {
        // TODO: implement
        return List.of();
    }

    /**
     * Объединяет два контакта. Сохраняется контакт с меньшим id,
     * пустые поля заполняются из второго контакта.
     *
     * @param contactId1 идентификатор первого контакта
     * @param contactId2 идентификатор второго контакта
     * @return объединённый контакт
     * @throws IllegalArgumentException если один из контактов не найден
     */
    public Contact merge(long contactId1, long contactId2) {
        // TODO: implement
        return null;
    }

    /**
     * Нечёткий поиск по имени: игнорирует регистр и лишние пробелы.
     * Ищет совпадение в firstName или lastName.
     *
     * @param query строка поиска
     * @return список найденных контактов
     */
    public List<Contact> searchByName(String query) {
        // TODO: implement
        return List.of();
    }

    /**
     * Возвращает все контакты.
     *
     * @return список всех контактов
     */
    public List<Contact> getAll() {
        // TODO: implement
        return List.of();
    }

    /**
     * Удаляет контакт по id.
     *
     * @param contactId идентификатор контакта
     * @throws IllegalArgumentException если контакт не найден
     */
    public void delete(long contactId) {
        // TODO: implement
    }

    public static void main(String[] args) {
        System.out.println("=== ContactDeduplicationService: Smoke Test ===");
        // TODO: создать тестовые данные и проверить основные сценарии
    }
}
