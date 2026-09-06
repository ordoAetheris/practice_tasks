package com.practice.task19_file_storage;

/**
 * ФАЙЛЫ — ВАРИАНТ B: КОНКУРЕНТНАЯ МОДИФИКАЦИЯ ДЕРЕВА
 *
 * <p>CORE = базовый {@link FileStorageService} (та же модель FileMetadata/Directory).</p>
 *
 * <p><b>ВАРИАНТ B — доменная гонка [prim: mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>Параллельные move/delete одного файла → несогласованное дерево (файл и там, и там / потерян).</li>
 *   <li>ЗАДАЧА: модификации структуры под защитой; дерево всегда согласовано.</li>
 *   <li>Проверка: конкурентные move и delete одного файла → ровно один эффект, без «файла-призрака».</li>
 * </ul>
 */
public class FileStorageServiceB {

    public String createDirectory(String name, String parentId, String ownerId) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Потокобезопасное перемещение (репарентинг под локом). */
    public void moveFile(String fileId, String newDirectoryId) {
        throw new UnsupportedOperationException("TODO: variant B — consistent tree under contention");
    }

    public void deleteFile(String fileId) {
        throw new UnsupportedOperationException("TODO: variant B — consistent tree under contention");
    }

    public static void main(String[] args) {
        System.out.println("=== FileStorageServiceB (конкур-модификация): Smoke ===");
    }
}
