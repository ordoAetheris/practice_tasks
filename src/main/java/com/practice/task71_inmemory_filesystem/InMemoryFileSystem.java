package com.practice.task71_inmemory_filesystem;

import java.util.*;

/**
 * IN-MEMORY ФАЙЛОВАЯ СИСТЕМА
 *
 * <p>Реализовать виртуальную файловую систему в памяти с Unix-подобными путями.
 * Поддерживать файлы и директории, рекурсивные операции, поиск по шаблону (glob),
 * перемещение, копирование и подсчёт размера.</p>
 *
 * <h3>Основные операции:</h3>
 * <ul>
 *   <li>mkdir(path) — создать директорию (родительская должна существовать)</li>
 *   <li>mkdirp(path) — создать директорию рекурсивно (создаёт все промежуточные)</li>
 *   <li>createFile(path, content) — создать файл</li>
 *   <li>readFile(path) — прочитать содержимое файла</li>
 *   <li>writeFile(path, content) — перезаписать содержимое файла</li>
 *   <li>delete(path) — удалить файл или директорию (рекурсивно)</li>
 *   <li>ls(path) — содержимое директории</li>
 *   <li>find(path, pattern) — поиск по glob-шаблону (*, ?)</li>
 *   <li>mv(src, dst) — переместить файл/директорию</li>
 *   <li>cp(src, dst) — копировать файл/директорию</li>
 *   <li>du(path) — суммарный размер (в символах содержимого) файла или директории</li>
 * </ul>
 *
 * <h3>Требования:</h3>
 * <ul>
 *   <li>Пути в Unix-стиле: /a/b/c (начинаются с /)</li>
 *   <li>mkdir бросает исключение если родительская директория не существует</li>
 *   <li>mkdirp создаёт все промежуточные директории</li>
 *   <li>Нельзя создать файл, если родительская директория не существует</li>
 *   <li>delete рекурсивно удаляет содержимое директории</li>
 *   <li>find поддерживает * (любые символы) и ? (один символ)</li>
 * </ul>
 *
 * <p>Уровень: Продвинутый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task71_inmemory_filesystem/InMemoryFileSystem.java
 * java -cp src/main/java com.practice.task71_inmemory_filesystem.InMemoryFileSystem
 * </pre>
 */
public class InMemoryFileSystem {

    /**
     * Создаёт файловую систему с корневой директорией /.
     */
    public InMemoryFileSystem() {
        // TODO: implement
    }

    /**
     * Создаёт директорию. Родительская директория должна существовать.
     *
     * @param path абсолютный путь к директории
     * @throws IllegalArgumentException если родительская директория не существует
     * @throws IllegalStateException если по этому пути уже что-то есть
     */
    public void mkdir(String path) {
        // TODO: implement
    }

    /**
     * Создаёт директорию рекурсивно, включая все промежуточные.
     *
     * @param path абсолютный путь к директории
     */
    public void mkdirp(String path) {
        // TODO: implement
    }

    /**
     * Создаёт файл с указанным содержимым. Родительская директория должна существовать.
     *
     * @param path абсолютный путь к файлу
     * @param content содержимое файла
     * @throws IllegalArgumentException если родительская директория не существует
     */
    public void createFile(String path, String content) {
        // TODO: implement
    }

    /**
     * Читает содержимое файла.
     *
     * @param path абсолютный путь к файлу
     * @return содержимое файла
     * @throws IllegalArgumentException если файл не найден или путь указывает на директорию
     */
    public String readFile(String path) {
        // TODO: implement
        return null;
    }

    /**
     * Перезаписывает содержимое существующего файла.
     *
     * @param path абсолютный путь к файлу
     * @param content новое содержимое
     * @throws IllegalArgumentException если файл не найден
     */
    public void writeFile(String path, String content) {
        // TODO: implement
    }

    /**
     * Удаляет файл или директорию. Директория удаляется рекурсивно со всем содержимым.
     *
     * @param path абсолютный путь
     * @throws IllegalArgumentException если путь не найден
     */
    public void delete(String path) {
        // TODO: implement
    }

    /**
     * Возвращает содержимое директории (имена файлов и поддиректорий).
     *
     * @param path абсолютный путь к директории
     * @return список имён элементов в директории
     * @throws IllegalArgumentException если директория не найдена
     */
    public List<String> ls(String path) {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Ищет файлы и директории по glob-шаблону рекурсивно от указанного пути.
     * Поддерживает * (любые символы) и ? (один символ) в имени.
     *
     * @param path начальная директория для поиска
     * @param pattern glob-шаблон (например, "*.txt", "file?.dat")
     * @return список абсолютных путей к найденным элементам
     */
    public List<String> find(String path, String pattern) {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Перемещает файл или директорию.
     *
     * @param srcPath исходный путь
     * @param dstPath целевой путь
     * @throws IllegalArgumentException если источник не найден или целевой путь некорректен
     */
    public void mv(String srcPath, String dstPath) {
        // TODO: implement
    }

    /**
     * Копирует файл или директорию (рекурсивно для директорий).
     *
     * @param srcPath исходный путь
     * @param dstPath целевой путь
     * @throws IllegalArgumentException если источник не найден
     */
    public void cp(String srcPath, String dstPath) {
        // TODO: implement
    }

    /**
     * Вычисляет суммарный размер (количество символов в содержимом всех файлов).
     * Для файла — длина содержимого, для директории — сумма рекурсивно.
     *
     * @param path абсолютный путь
     * @return размер в символах
     */
    public long du(String path) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("=== InMemoryFileSystem: Smoke Test ===");
        // TODO: smoke test
    }
}
