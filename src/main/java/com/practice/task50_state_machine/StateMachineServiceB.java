package com.practice.task50_state_machine;

import java.util.Map;

/**
 * FSM-ДВИЖОК — ВАРИАНТ B: ВАЛИДНЫЕ ПЕРЕХОДЫ
 *
 * <p>CORE = базовый {@link StateMachineService} (defineState/fire(event)/canFire).</p>
 *
 * <p><b>ВАРИАНТ B — валидные переходы [prim: FSM]:</b></p>
 * <ul>
 *   <li>fire(event) выполняется только если переход из текущего состояния по этому событию определён; иначе отказ.</li>
 *   <li>Guard-условия по контексту; детерминированный целевой стейт.</li>
 *   <li>Проверка: недопустимое событие в текущем состоянии отклонено; допустимое меняет состояние по матрице.</li>
 * </ul>
 */
public class StateMachineServiceB {
    public void fire(String event, Map<String, Object> context){ throw new UnsupportedOperationException("TODO: variant B — guarded valid transitions"); }
    public boolean canFire(String event, Map<String, Object> context){ throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== StateMachineServiceB (valid transitions): Smoke ==="); }
}
