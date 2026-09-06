package com.practice.task19_file_storage;

/**
 * ФАЙЛЫ — ВАРИАНТ D: ИДЕМПОТЕНТНОЕ УДАЛЕНИЕ
 *
 * <p>CORE = базовый {@link FileStorageService}.</p>
 *
 * <p><b>ВАРИАНТ D — идемпотентность [prim: idempotency ⭐]:</b></p>
 * <ul>
 *   <li>Повторный deleteFile уже удалённого — no-op (не исключение), эффект как от одного удаления.</li>
 *   <li>Под гонкой двух delete одного файла — один эффект, второй тихо ничего не делает.</li>
 *   <li>Проверка: delete дважды → файл отсутствует, без ошибок; размеры согласованы.</li>
 * </ul>
 */
public class FileStorageServiceD {

    public String createDirectory(String name, String parentId, String ownerId) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Идемпотентное удаление: повтор — no-op. */
    public void deleteFile(String fileId) {
        throw new UnsupportedOperationException("TODO: variant D — idempotent delete");
    }

    public static void main(String[] args) {
        System.out.println("=== FileStorageServiceD (идемпотентное удаление): Smoke ===");
    }
}
