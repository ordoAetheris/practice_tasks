package com.practice.task90_function_decorators;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * ФУНКЦИИ-ДЕКОРАТОРЫ (higher-order): замер времени + мемоизация/кэш
 *
 * <p>Контекст: реальная задача техсекции (СВЕРЕНО: Хабр 764176 — «написать декоратор
 * подсчёта времени работы функции или кэширования вызова функции»). Проверяют владение
 * высшими функциями (функция, принимающая/возвращающая функцию), дженериками и — для кэша —
 * потокобезопасностью.</p>
 *
 * <p>Реализовать (обёртки, НЕ меняющие сигнатуру оборачиваемой функции):</p>
 * <ul>
 *   <li>{@code timed(Supplier<T> fn)} — вернуть обёртку, которая при вызове выполняет fn,
 *       и куда-то отдаёт затраченное время (через callback {@code LongConsumer} или поле).</li>
 *   <li>{@code memoize(Function<A,R> fn)} — вернуть обёртку, которая кэширует результат по аргументу:
 *       первый вызов с данным аргументом считает и запоминает, повторный — берёт из кэша.
 *       ГЛАВНОЕ: потокобезопасность — при конкурентных вызовах с одним аргументом fn вызывается
 *       РОВНО ОДИН раз (compute-once), без гонки. Подумай про {@code ConcurrentHashMap.computeIfAbsent}
 *       и подводные камни (реентрантность, null-значения).</li>
 *   <li>(опц.) {@code memoizeWithTtl(fn, ttlMillis)} — кэш с истечением.</li>
 *   <li>(опц.) {@code compose(f, g)} — композиция как отдельная демонстрация higher-order.</li>
 * </ul>
 *
 * <p>Уровень: Средний. Ловушки: гонка в memoize (двойной счёт), null-значения в кэше,
 * исключения внутри fn (не кэшировать провал), неизменность оборачиваемой сигнатуры.</p>
 */
public class FunctionDecorators {

    /**
     * Обёртка, замеряющая время выполнения fn. Результат fn возвращается как есть,
     * затраченное время (нс/мс) отдаётся через elapsedSink.
     */
    public static <T> Supplier<T> timed(Supplier<T> fn, java.util.function.LongConsumer elapsedSink) {
        // TODO: implement
        return null;
    }

    /**
     * Потокобезопасная мемоизация: fn для одного аргумента вызывается ровно один раз.
     */
    public static <A, R> Function<A, R> memoize(Function<A, R> fn) {
        // TODO: implement (compute-once под конкурентностью)
        return null;
    }

    public static void main(String[] args) {
        System.out.println("=== FunctionDecorators: Smoke Test ===");
        // TODO: timed — время > 0; memoize — тяжёлую fn зовём дважды одним аргументом → вычисление одно.
    }
}
