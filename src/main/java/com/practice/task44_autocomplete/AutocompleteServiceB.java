package com.practice.task44_autocomplete;

import java.util.List;

/**
 * АВТОДОПОЛНЕНИЕ — ВАРИАНТ B: THREAD-SAFE TRIE
 *
 * <p>CORE = базовый {@link AutocompleteService} (trie, addWord/search(prefix)).</p>
 *
 * <p><b>ВАРИАНТ B — потокобезопасность [prim: mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>Конкурентные addWord/removeWord и search по trie не рвут узлы и веса.</li>
 *   <li>Проверка: K потоков добавляют слова + ищут → префиксные результаты консистентны.</li>
 * </ul>
 */
public class AutocompleteServiceB {
    public void addWord(String word, int weight){ throw new UnsupportedOperationException("TODO: variant B — thread-safe trie"); }
    public List<String> search(String prefix){ throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== AutocompleteServiceB (thread-safe): Smoke ==="); }
}
