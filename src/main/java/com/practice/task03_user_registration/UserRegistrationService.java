package com.practice.task03_user_registration;

import java.time.LocalDateTime;
import java.util.*;

/**
 * СЕРВИС РЕГИСТРАЦИИ И УПРАВЛЕНИЯ ПОЛЬЗОВАТЕЛЯМИ
 *
 * <p>Реализуйте сервис регистрации пользователей с валидацией данных.
 * Система должна обеспечивать уникальность логинов и email-адресов,
 * а также базовую валидацию входных данных.</p>
 *
 * <p>Сущности:</p>
 * <ul>
 *   <li>User — пользователь: id, login, email, registrationDate</li>
 * </ul>
 *
 * <p>Бизнес-правила:</p>
 * <ul>
 *   <li>Логин должен быть уникальным и не пустым</li>
 *   <li>Email должен быть валидным (содержать @ и домен) и уникальным</li>
 *   <li>Нельзя зарегистрировать пользователя с пустым логином</li>
 *   <li>Нельзя зарегистрировать пользователя с дублирующимся email</li>
 * </ul>
 *
 * <p>Уровень: Базовый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task03_user_registration/UserRegistrationService.java
 * java -cp src/main/java com.practice.task03_user_registration.UserRegistrationService
 * </pre>
 */
public class UserRegistrationService {

    public record User(Long id, String login, String email, LocalDateTime registrationDate) {}

    /**
     * Зарегистрировать нового пользователя.
     * @param login логин (уникальный, не пустой)
     * @param email email (валидный, уникальный)
     * @return созданный пользователь с присвоенным id и текущей датой регистрации
     * @throws IllegalArgumentException если логин пустой или email невалидный
     * @throws IllegalStateException если логин или email уже заняты
     */
    public User register(String login, String email) {
        // TODO: implement
        return null;
    }

    /**
     * Найти пользователя по логину.
     * @param login логин
     * @return Optional с пользователем или пустой
     */
    public Optional<User> findByLogin(String login) {
        // TODO: implement
        return Optional.empty();
    }

    /**
     * Найти пользователя по email.
     * @param email email
     * @return Optional с пользователем или пустой
     */
    public Optional<User> findByEmail(String email) {
        // TODO: implement
        return Optional.empty();
    }

    /**
     * Удалить пользователя по id.
     * @param userId идентификатор пользователя
     * @return true если пользователь был удалён, false если не найден
     */
    public boolean delete(Long userId) {
        // TODO: implement
        return false;
    }

    /**
     * Получить всех пользователей, отсортированных по дате регистрации (от ранних к поздним).
     * @return отсортированный список пользователей
     */
    public List<User> getAllSortedByRegistrationDate() {
        // TODO: implement
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        System.out.println("=== UserRegistrationService: Smoke Test ===");
        // TODO: создать тестовые данные и проверить основные сценарии
    }
}
