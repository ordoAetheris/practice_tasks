package com.practice.task19_file_storage;

/**
 * ФАЙЛЫ — ВАРИАНТ C: АТОМАРНЫЙ РЕПАРЕНТИНГ (move)
 *
 * <p>CORE = базовый {@link FileStorageService}.</p>
 *
 * <p><b>ВАРИАНТ C — атомарный переход [prim: atomicity]:</b></p>
 * <ul>
 *   <li>move = атомарно «отвязать от старого каталога + привязать к новому»; промежуточного состояния
 *       (файл нигде / в двух каталогах) быть не должно.</li>
 *   <li>Проверка: конкурентные move в разные каталоги → файл ровно в одном; размеры каталогов согласованы.</li>
 * </ul>
 */
public class FileStorageServiceC {

    public String createDirectory(String name, String parentId, String ownerId) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Атомарный реупарентинг: unlink+link как единое целое. */
    public void moveFile(String fileId, String newDirectoryId) {
        throw new UnsupportedOperationException("TODO: variant C — atomic reparent");
    }

    public long getDirectorySize(String directoryId) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        System.out.println("=== FileStorageServiceC (atomic reparent): Smoke ===");
    }
}
