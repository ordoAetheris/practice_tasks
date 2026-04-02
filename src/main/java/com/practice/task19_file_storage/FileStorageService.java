package com.practice.task19_file_storage;

import java.util.*;

/**
 * Хранилище файлов (метаданные).
 *
 * <p>Реализовать in-memory хранилище метаданных файлов и директорий.
 * Иерархическая структура, перемещение, рекурсивный подсчёт размера.</p>
 *
 * <p>Уровень: Базовый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task19_file_storage/FileStorageService.java
 * java -cp src/main/java com.practice.task19_file_storage.FileStorageService
 * </pre>
 */
public class FileStorageService {

    public record FileMetadata(String id, String name, String extension,
                               long size, String directoryId, String ownerId, long createdAt) {}
    public record Directory(String id, String name, String parentId, String ownerId) {}

    /** Создать директорию */
    public String createDirectory(String name, String parentId, String ownerId) {
        //TODO implement
        return null;
    }

    /**
     * Создать файл
     * @throws IllegalArgumentException если имя уже существует в директории
     */
    public String createFile(String name, String extension, long size,
                             String directoryId, String ownerId) {
        //TODO implement
        return null;
    }

    /** Переместить файл в другую директорию */
    public void moveFile(String fileId, String newDirectoryId) {
        //TODO implement
    }

    /** Удалить файл */
    public void deleteFile(String fileId) {
        //TODO implement
    }

    /** Найти файлы по имени (подстрока) */
    public List<FileMetadata> findByName(String query) {
        //TODO implement
        return Collections.emptyList();
    }

    /** Файлы в директории */
    public List<FileMetadata> listFiles(String directoryId) {
        //TODO implement
        return Collections.emptyList();
    }

    /** Общий размер директории (рекурсивно) */
    public long getDirectorySize(String directoryId) {
        //TODO implement
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("=== FileStorageService: Smoke Test ===");
        // TODO: создать директории и файлы, проверить размеры
    }
}
