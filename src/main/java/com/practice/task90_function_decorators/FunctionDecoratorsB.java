package com.practice.task90_function_decorators;

import java.util.function.Function;

/**
 * ДЕКОРАТОРЫ — ВАРИАНТ B: THREAD-SAFE MEMOIZE
 *
 * <p>CORE = базовый {@link FunctionDecorators} (timed/memoize).</p>
 *
 * <p><b>ВАРИАНТ B — потокобезопасная мемоизация [prim: mutual-excl ⭐, single-flight]:</b></p>
 * <ul>
 *   <li>memoize под конкурентой: ровно ОДНО вычисление на ключ (single-flight), остальные ждут результат (computeIfAbsent/Future), не пересчитывают.</li>
 *   <li>Проверка: N потоков с одним аргументом → базовая функция вызвана 1 раз; все получают тот же результат.</li>
 * </ul>
 */
public class FunctionDecoratorsB {
    public static <A, R> Function<A, R> memoizeThreadSafe(Function<A, R> fn){ throw new UnsupportedOperationException("TODO: variant B — single-flight memoize"); }
    public static void main(String[] a){ System.out.println("=== FunctionDecoratorsB (thread-safe memoize): Smoke ==="); }
}
