package com.practice.task78_inmemory_filesystem;

import java.util.List;

/**
 * IN-MEM FS — ВАРИАНТ B: ИТЕРАТИВНЫЙ ОБХОД ДЕРЕВА
 *
 * <p>CORE = базовый {@link InMemoryFileSystem} (mkdir/createFile/ls, дерево путей).</p>
 *
 * <p><b>ВАРИАНТ B — рекурсивный обход итеративно [prim: iterative-stack ⭐]:</b></p>
 * <ul>
 *   <li>ls -R / обход всего поддерева через ЯВНЫЙ стек, не рекурсию — глубокая иерархия не роняет стек.</li>
 *   <li>Проверка: рекурсивный листинг дерева глубиной 100000 без StackOverflow; порядок обхода детерминирован.</li>
 * </ul>
 */
public class InMemoryFileSystemB {
    public List<String> lsRecursive(String path){ throw new UnsupportedOperationException("TODO: variant B — iterative subtree traversal"); }
    public static void main(String[] a){ System.out.println("=== InMemoryFileSystemB (iterative traverse): Smoke ==="); }
}
