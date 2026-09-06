package com.practice.task73_circuit_breaker;

import java.util.function.Supplier;

/**
 * CIRCUIT BREAKER — ВАРИАНТ B: THREAD-SAFE ПЕРЕХОДЫ
 *
 * <p>CORE = базовый {@link CircuitBreaker} (CLOSED→OPEN→HALF_OPEN по порогу ошибок).</p>
 *
 * <p><b>ВАРИАНТ B — потокобезопасные переходы [prim: mutual-excl ⭐, FSM, CAS]:</b></p>
 * <ul>
 *   <li>Счётчики успех/провал и смена состояния атомарны; переход CLOSED→OPEN происходит РОВНО один раз при пересечении порога.</li>
 *   <li>Проверка: N потоков вызывают через breaker при сбоях → состояние меняется согласованно, без «дребезга».</li>
 * </ul>
 */
public class CircuitBreakerB {
    public CircuitBreakerB(int failureThreshold, long resetTimeoutMs, int successThreshold){ throw new UnsupportedOperationException("TODO"); }
    public <T> T call(Supplier<T> action){ throw new UnsupportedOperationException("TODO: variant B — atomic state transitions"); }
    public static void main(String[] a){ System.out.println("=== CircuitBreakerB (thread-safe transitions): Smoke ==="); }
}
