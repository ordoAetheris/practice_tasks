package com.practice.task90_function_decorators;

import java.util.function.Supplier;

/**
 * ДЕКОРАТОРЫ — ВАРИАНТ C: RATE-LIMIT DECORATOR
 *
 * <p>CORE = базовый {@link FunctionDecorators}.</p>
 *
 * <p><b>ВАРИАНТ C — ограничение частоты [prim: decorator, rate-limit]:</b></p>
 * <ul>
 *   <li>Декоратор оборачивает функцию/Supplier так, что вызовы сверх N/период отклоняются или блокируются (token-bucket внутри).</li>
 *   <li>Потокобезопасный учёт вызовов.</li>
 *   <li>Проверка: сверх лимита вызовы отклоняются/ждут; в пределах — проходят.</li>
 * </ul>
 */
public class FunctionDecoratorsC {
    public static <R> Supplier<R> rateLimited(Supplier<R> fn, int maxCalls, long perWindowMs){ throw new UnsupportedOperationException("TODO: variant C — rate-limit decorator"); }
    public static void main(String[] a){ System.out.println("=== FunctionDecoratorsC (rate-limit): Smoke ==="); }
}
