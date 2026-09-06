package com.practice.task60_dependency_resolver;

import java.util.List;

/**
 * ЗАВИСИМОСТИ — ВАРИАНТ D: ИТЕРАТИВНЫЙ DFS
 *
 * <p>CORE = базовый {@link DependencyResolverService}.</p>
 *
 * <p><b>ВАРИАНТ D — итеративный обход [prim: iterative-stack ⭐]:</b></p>
 * <ul>
 *   <li>resolve(module) через ЯВНЫЙ стек, не рекурсию — анти-StackOverflow на глубоких цепочках зависимостей.</li>
 *   <li>Постпорядок собирается вручную на стеке; visited-множество против повторов.</li>
 *   <li>Проверка: цепочка глубиной 100000 резолвится без переполнения стека.</li>
 * </ul>
 */
public class DependencyResolverServiceD {
    public List<String> resolve(String moduleName){ throw new UnsupportedOperationException("TODO: variant D — iterative DFS (explicit stack)"); }
    public static void main(String[] a){ System.out.println("=== DependencyResolverServiceD (iterative DFS): Smoke ==="); }
}
