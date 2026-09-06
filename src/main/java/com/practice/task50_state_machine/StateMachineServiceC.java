package com.practice.task50_state_machine;

import java.util.Map;

/**
 * FSM-ДВИЖОК — ВАРИАНТ C: EDGE
 *
 * <p>CORE = базовый {@link StateMachineService}.</p>
 *
 * <p><b>ВАРИАНТ C — edge/null-safety [prim: null-edge ⭐]:</b></p>
 * <ul>
 *   <li>Нет initial-состояния, неизвестное событие/состояние, self-loop, недостижимые состояния.</li>
 *   <li>fire до setInitialState, дублирующее defineState, null-контекст.</li>
 *   <li>Проверка: таблица граничных случаев не роняет движок; ошибки внятные.</li>
 * </ul>
 */
public class StateMachineServiceC {
    public void fire(String event, Map<String, Object> context){ throw new UnsupportedOperationException("TODO: variant C — edge (no-initial/unknown/self-loop)"); }
    public static void main(String[] a){ System.out.println("=== StateMachineServiceC (edge): Smoke ==="); }
}
