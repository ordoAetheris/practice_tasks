package com.practice.task01_library_service;

import java.time.LocalDate;
import java.util.*;

/**
 * БИБЛИОТЕЧНЫЙ СЕРВИС (IN-MEMORY)
 *
 * <p>Реализуйте in-memory сервис управления библиотекой (типичное задание Сбера).
 * Система хранит информацию о книгах, пользователях и выдачах книг.</p>
 *
 * <p>Сущности:</p>
 * <ul>
 *   <li>Book — книга с полями: id, name, author, genre, totalCopies (общее кол-во экземпляров)</li>
 *   <li>User — пользователь библиотеки: id, name</li>
 *   <li>BookLoan — выдача книги: book, user, issueDate, dueDate, returnDate (null если не возвращена)</li>
 * </ul>
 *
 * <p>Бизнес-правила:</p>
 * <ul>
 *   <li>Нельзя выдать книгу, если нет свободных экземпляров (все totalCopies уже на руках)</li>
 *   <li>Нельзя вернуть книгу дважды (returnDate уже заполнен)</li>
 *   <li>Просрочка = текущая дата после dueDate и книга ещё не возвращена (returnDate == null)</li>
 * </ul>
 *
 * <p>Уровень: Базовый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task01_library_service/LibraryService.java
 * java -cp src/main/java com.practice.task01_library_service.LibraryService
 * </pre>
 */
public class LibraryService {

    public record Book(Long id, String name, String author, String genre, int totalCopies) {}

    public record User(Long id, String name) {}

    public record BookLoan(Book book, User user, LocalDate issueDate, LocalDate dueDate, LocalDate returnDate) {}

    /**
     * Добавить книгу в библиотеку.
     * @param book книга для добавления
     * @throws IllegalArgumentException если книга с таким id уже существует
     */
    public void addBook(Book book) {
        // TODO: implement
    }

    /**
     * Зарегистрировать пользователя библиотеки.
     * @param user пользователь
     * @throws IllegalArgumentException если пользователь с таким id уже существует
     */
    public void addUser(User user) {
        // TODO: implement
    }

    /**
     * Поиск книг по автору (точное совпадение, без учёта регистра).
     * @param author имя автора
     * @return список найденных книг
     */
    public List<Book> findBooksByAuthor(String author) {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Поиск книг по жанру.
     * @param genre жанр
     * @return список книг данного жанра
     */
    public List<Book> findBooksByGenre(String genre) {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Поиск книг по названию (подстрока, без учёта регистра).
     * @param namePart часть названия
     * @return список книг, название которых содержит подстроку
     */
    public List<Book> findBooksByName(String namePart) {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Выдать книгу пользователю. Срок выдачи — 14 дней от текущей даты.
     * @param bookId идентификатор книги
     * @param userId идентификатор пользователя
     * @param issueDate дата выдачи
     * @return созданная запись о выдаче
     * @throws IllegalStateException если нет свободных экземпляров
     * @throws IllegalArgumentException если книга или пользователь не найдены
     */
    public BookLoan issueBook(Long bookId, Long userId, LocalDate issueDate) {
        // TODO: implement
        return null;
    }

    /**
     * Вернуть книгу. Устанавливает returnDate на текущую дату.
     * @param loan запись о выдаче, которую нужно закрыть
     * @param returnDate дата возврата
     * @return обновлённая запись о выдаче
     * @throws IllegalStateException если книга уже была возвращена
     */
    public BookLoan returnBook(BookLoan loan, LocalDate returnDate) {
        // TODO: implement
        return null;
    }

    /**
     * Получить список книг, у которых есть хотя бы один свободный экземпляр.
     * @return список доступных книг
     */
    public List<Book> getAvailableBooks() {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Получить список просроченных выдач на указанную дату.
     * Просрочка: currentDate > dueDate и returnDate == null.
     * @param currentDate дата, на которую проверяется просрочка
     * @return список просроченных выдач
     */
    public List<BookLoan> getOverdueLoans(LocalDate currentDate) {
        // TODO: implement
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        System.out.println("=== LibraryService: Smoke Test ===");
        // TODO: создать тестовые данные и проверить основные сценарии
    }
}
