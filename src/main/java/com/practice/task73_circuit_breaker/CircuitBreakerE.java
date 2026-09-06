package com.practice.task73_circuit_breaker;

import java.util.function.Supplier;

/**
 * CIRCUIT BREAKER — ВАРИАНТ E: HALF-OPEN THUNDERING-HERD GUARD
 *
 * <p>CORE = базовый {@link CircuitBreaker}.</p>
 *
 * <p><b>ВАРИАНТ E — защита half-open [prim: bounded-parallelism, mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>В HALF_OPEN пропускать ОГРАНИЧЕННОЕ число пробных вызовов (не всю толпу разом), иначе «стадо» добьёт восстанавливающийся сервис.</li>
 *   <li>Один/несколько пробников решают закрыть или снова открыть; остальные быстро отклоняются.</li>
 *   <li>Проверка: в half-open проходит ≤k пробных вызовов; успех закрывает, провал снова открывает.</li>
 * </ul>
 */
public class CircuitBreakerE {
    public CircuitBreakerE(int failureThreshold, long resetTimeoutMs, int halfOpenProbes){ throw new UnsupportedOperationException("TODO"); }
    public <T> T call(Supplier<T> action){ throw new UnsupportedOperationException("TODO: variant E — bounded half-open probes"); }
    public static void main(String[] a){ System.out.println("=== CircuitBreakerE (half-open guard): Smoke ==="); }
}
