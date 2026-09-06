package com.practice.task19_file_storage;

import java.util.List;

/**
 * ФАЙЛЫ — ВАРИАНТ E: SAFE-DELETE ПОД ОБХОДОМ КАТАЛОГА
 *
 * <p>CORE = базовый {@link FileStorageService}.</p>
 *
 * <p><b>ВАРИАНТ E — безопасное удаление под итерацией [prim: safe-delete ⭐, mutual-excl]:</b></p>
 * <ul>
 *   <li>Удаление файла во время listFiles/обхода каталога не должно давать ConcurrentModificationException
 *       или отдавать «висячую» ссылку.</li>
 *   <li>Направления: снимок коллекции для чтения; либо конкурентная структура; согласованное представление.</li>
 *   <li>Проверка: поток итерирует каталог, второй удаляет из него файлы → без CME; наблюдаемое множество согласовано.</li>
 * </ul>
 */
public class FileStorageServiceE {

    public String createDirectory(String name, String parentId, String ownerId) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Список файлов каталога, безопасный к параллельному удалению (snapshot/конкур-структура). */
    public List<FileStorageService.FileMetadata> listFiles(String directoryId) {
        throw new UnsupportedOperationException("TODO: variant E — safe iteration under delete");
    }

    public void deleteFile(String fileId) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        System.out.println("=== FileStorageServiceE (safe-delete под обходом): Smoke ===");
    }
}
