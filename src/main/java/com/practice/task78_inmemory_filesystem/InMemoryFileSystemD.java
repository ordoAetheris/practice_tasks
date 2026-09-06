package com.practice.task78_inmemory_filesystem;

/**
 * IN-MEM FS — ВАРИАНТ D: PATH-EDGE
 *
 * <p>CORE = базовый {@link InMemoryFileSystem}.</p>
 *
 * <p><b>ВАРИАНТ D — edge путей [prim: null-edge ⭐]:</b></p>
 * <ul>
 *   <li>Нормализация ".", "..", хвостовой "/", двойные слэши, корень "/"; createFile без существующего родителя.</li>
 *   <li>delete непустой директории (рекурсивно или запрет — зафиксировать), readFile директории, mkdir существующего.</li>
 *   <li>Проверка: таблица «злых» путей нормализуется/отклоняется корректно, не роняет FS.</li>
 * </ul>
 */
public class InMemoryFileSystemD {
    public void createFile(String path, String content){ throw new UnsupportedOperationException("TODO: variant D — path normalization + edge"); }
    public void delete(String path){ throw new UnsupportedOperationException("TODO: variant D — non-empty dir policy"); }
    public static void main(String[] a){ System.out.println("=== InMemoryFileSystemD (path-edge): Smoke ==="); }
}
