package com.practice.task78_inmemory_filesystem;

/**
 * IN-MEM FS — ВАРИАНТ C: CONCURRENT MKDIR/RM (thread-safe)
 *
 * <p>CORE = базовый {@link InMemoryFileSystem}.</p>
 *
 * <p><b>ВАРИАНТ C — конкурентные операции над деревом [prim: mutual-excl ⭐, safe-delete ⭐]:</b></p>
 * <ul>
 *   <li>Параллельные mkdir/createFile/delete по дереву без гонок; удаление узла во время обхода/создания в нём — согласовано.</li>
 *   <li>Гранулярность: лок на узел/поддерево, а не глобальный (по возможности), корректный порядок захвата.</li>
 *   <li>Проверка: конкурентные mkdir одного пути → создан один раз; delete во время ls не даёт «висячих» узлов.</li>
 * </ul>
 */
public class InMemoryFileSystemC {
    public void mkdirp(String path){ throw new UnsupportedOperationException("TODO: variant C — thread-safe mkdir"); }
    public void delete(String path){ throw new UnsupportedOperationException("TODO: variant C — safe concurrent delete"); }
    public static void main(String[] a){ System.out.println("=== InMemoryFileSystemC (concurrent): Smoke ==="); }
}
