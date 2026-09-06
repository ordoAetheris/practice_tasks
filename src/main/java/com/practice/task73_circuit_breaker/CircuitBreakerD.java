package com.practice.task73_circuit_breaker;

import java.util.function.Supplier;

/**
 * CIRCUIT BREAKER — ВАРИАНТ D: PER-ENDPOINT
 *
 * <p>CORE = базовый {@link CircuitBreaker}.</p>
 *
 * <p><b>ВАРИАНТ D — брейкер на эндпоинт [prim: per-key, striping]:</b></p>
 * <ul>
 *   <li>Отдельное состояние breaker'а на каждый endpoint/ключ; сбои одного не открывают остальные.</li>
 *   <li>Карта endpoint→breaker потокобезопасна; неактивные вычищаются.</li>
 *   <li>Проверка: открытие для /a не влияет на /b; изоляция состояний.</li>
 * </ul>
 */
public class CircuitBreakerD {
    public <T> T call(String endpoint, Supplier<T> action){ throw new UnsupportedOperationException("TODO: variant D — per-endpoint breaker map"); }
    public static void main(String[] a){ System.out.println("=== CircuitBreakerD (per-endpoint): Smoke ==="); }
}
