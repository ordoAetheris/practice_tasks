package com.practice.task05_phone_book;

import java.util.*;

/**
 * ТЕЛЕФОННАЯ КНИГА
 *
 * <p>Реализуйте телефонную книгу с возможностью хранения нескольких номеров
 * у одного контакта. Поддерживается поиск по имени (подстрока) и по номеру телефона.</p>
 *
 * <p>Сущности:</p>
 * <ul>
 *   <li>Contact — контакт: name, phoneNumbers (список номеров), email (опционально)</li>
 * </ul>
 *
 * <p>Бизнес-правила:</p>
 * <ul>
 *   <li>Имя контакта не может быть пустым</li>
 *   <li>Номер телефона уникален глобально (один номер — один контакт)</li>
 *   <li>У контакта должен быть хотя бы один номер телефона</li>
 * </ul>
 *
 * <p>Уровень: Базовый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task05_phone_book/PhoneBookService.java
 * java -cp src/main/java com.practice.task05_phone_book.PhoneBookService
 * </pre>
 */
public class PhoneBookService {

    public record Contact(String name, List<String> phoneNumbers, String email) {}

    /**
     * Добавить новый контакт в телефонную книгу.
     * @param name имя (не пустое)
     * @param phoneNumber первый номер телефона
     * @param email email (может быть null)
     * @return созданный контакт
     * @throws IllegalArgumentException если имя пустое
     * @throws IllegalStateException если номер уже занят другим контактом
     */
    public Contact addContact(String name, String phoneNumber, String email) {
        // TODO: implement
        return null;
    }

    /**
     * Добавить дополнительный номер телефона к существующему контакту.
     * @param name имя контакта
     * @param phoneNumber новый номер
     * @return обновлённый контакт
     * @throws IllegalArgumentException если контакт не найден
     * @throws IllegalStateException если номер уже занят
     */
    public Contact addPhoneNumber(String name, String phoneNumber) {
        // TODO: implement
        return null;
    }

    /**
     * Удалить номер телефона у контакта.
     * @param name имя контакта
     * @param phoneNumber номер для удаления
     * @return обновлённый контакт
     * @throws IllegalArgumentException если контакт не найден или номер не найден у контакта
     * @throws IllegalStateException если это последний номер контакта
     */
    public Contact removePhoneNumber(String name, String phoneNumber) {
        // TODO: implement
        return null;
    }

    /**
     * Поиск контактов по имени (подстрока, без учёта регистра).
     * @param namePart часть имени
     * @return список найденных контактов
     */
    public List<Contact> searchByName(String namePart) {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Поиск контакта по номеру телефона (точное совпадение).
     * @param phoneNumber номер телефона
     * @return Optional с контактом или пустой
     */
    public Optional<Contact> searchByPhone(String phoneNumber) {
        // TODO: implement
        return Optional.empty();
    }

    /**
     * Получить все контакты, отсортированные по имени.
     * @return список всех контактов
     */
    public List<Contact> getAllContacts() {
        // TODO: implement
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        System.out.println("=== PhoneBookService: Smoke Test ===");
        // TODO: создать тестовые данные и проверить основные сценарии
    }
}
