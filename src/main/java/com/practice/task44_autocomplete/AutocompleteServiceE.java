package com.practice.task44_autocomplete;

import java.util.List;

/**
 * АВТОДОПОЛНЕНИЕ — ВАРИАНТ E: EDGE
 *
 * <p>CORE = базовый {@link AutocompleteService}.</p>
 *
 * <p><b>ВАРИАНТ E — edge/null-safety [prim: null-edge ⭐]:</b></p>
 * <ul>
 *   <li>Пустой префикс (вернуть top глобально или ничего — зафиксировать), unicode, регистр, дубли слов с разным весом.</li>
 *   <li>Проверка: граничные префиксы не роняют trie; поведение на пустом префиксе определено.</li>
 * </ul>
 */
public class AutocompleteServiceE {
    public List<String> search(String prefix){ throw new UnsupportedOperationException("TODO: variant E — edge (empty prefix/unicode/case)"); }
    public static void main(String[] a){ System.out.println("=== AutocompleteServiceE (edge): Smoke ==="); }
}
