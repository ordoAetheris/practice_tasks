package com.practice.task31_elevator_controller;

/**
 * ЛИФТ — ВАРИАНТ B: FSM СОСТОЯНИЙ
 *
 * <p>CORE = базовый {@link ElevatorController} (та же модель Direction/Request/ElevatorStatus).</p>
 *
 * <p><b>ВАРИАНТ B — конечный автомат [prim: FSM]:</b></p>
 * <ul>
 *   <li>Явные состояния лифта: IDLE / MOVING_UP / MOVING_DOWN / DOORS_OPEN и валидные переходы в step().</li>
 *   <li>Нельзя открыть двери в движении; смена направления только в IDLE/на концах маршрута.</li>
 *   <li>Проверка: последовательность step() проходит корректный цикл состояний; недопустимые переходы отсекаются.</li>
 * </ul>
 */
public class ElevatorControllerB {

    public ElevatorControllerB(int numElevators, int minFloor, int maxFloor, int capacity) {
        throw new UnsupportedOperationException("TODO");
    }

    public void requestElevator(int fromFloor, ElevatorController.Direction direction) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Шаг симуляции с явными переходами FSM. */
    public void step() {
        throw new UnsupportedOperationException("TODO: variant B — explicit state machine transitions");
    }

    public static void main(String[] args) {
        System.out.println("=== ElevatorControllerB (FSM): Smoke ===");
    }
}
