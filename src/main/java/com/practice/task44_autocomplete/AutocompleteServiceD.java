package com.practice.task44_autocomplete;

import java.util.List;

/**
 * АВТОДОПОЛНЕНИЕ — ВАРИАНТ D: FUZZY / ОПЕЧАТКИ
 *
 * <p>CORE = базовый {@link AutocompleteService}.</p>
 *
 * <p><b>ВАРИАНТ D — толерантность к опечаткам [prim: algorithm]:</b></p>
 * <ul>
 *   <li>Подсказки при опечатке в префиксе (расстояние 1-2): обход trie с допуском ошибок.</li>
 *   <li>Проверка: префикс с одной опечаткой всё равно даёт релевантные подсказки.</li>
 * </ul>
 */
public class AutocompleteServiceD {
    public List<String> fuzzySearch(String prefix, int maxDistance){ throw new UnsupportedOperationException("TODO: variant D — fuzzy prefix"); }
    public static void main(String[] a){ System.out.println("=== AutocompleteServiceD (fuzzy): Smoke ==="); }
}
