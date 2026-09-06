package com.practice.task60_dependency_resolver;

import java.util.List;

/**
 * ЗАВИСИМОСТИ — ВАРИАНТ E: ОБРАТНЫЙ ИНДЕКС + SNAPSHOT
 *
 * <p>CORE = базовый {@link DependencyResolverService}.</p>
 *
 * <p><b>ВАРИАНТ E — обратный индекс [prim: aux-index, mutual-excl]:</b></p>
 * <ul>
 *   <li>getDependents(x) за O(1) через ОБРАТНЫЙ индекс (кто зависит от x), поддерживаемый при add/remove.</li>
 *   <li>Потокобезопасный снимок графа для консистентного чтения при конкурентных изменениях.</li>
 *   <li>Проверка: dependents мгновенны; snapshot не «рвётся» при параллельном addModule.</li>
 * </ul>
 */
public class DependencyResolverServiceE {
    public List<String> getDependents(String name){ throw new UnsupportedOperationException("TODO: variant E — reverse index + thread-safe snapshot"); }
    public static void main(String[] a){ System.out.println("=== DependencyResolverServiceE (reverse index): Smoke ==="); }
}
