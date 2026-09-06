package com.practice.task50_state_machine;

import java.util.Map;

/**
 * FSM-ДВИЖОК — ВАРИАНТ D: THREAD-SAFE
 *
 * <p>CORE = базовый {@link StateMachineService}.</p>
 *
 * <p><b>ВАРИАНТ D — потокобезопасность [prim: mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>Конкурентные fire не дают несогласованного состояния; переход текущего стейта атомарен (CAS/лок).</li>
 *   <li>Проверка: два потока fire из одного состояния разными событиями → ровно один переход, второй отклонён/сериализован.</li>
 * </ul>
 */
public class StateMachineServiceD {
    public void fire(String event, Map<String, Object> context){ throw new UnsupportedOperationException("TODO: variant D — atomic state transition"); }
    public static void main(String[] a){ System.out.println("=== StateMachineServiceD (thread-safe): Smoke ==="); }
}
