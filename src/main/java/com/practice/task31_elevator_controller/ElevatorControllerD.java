package com.practice.task31_elevator_controller;

/**
 * ЛИФТ — ВАРИАНТ D: КОНКУРЕНТНЫЕ ЗАПРОСЫ
 *
 * <p>CORE = базовый {@link ElevatorController}.</p>
 *
 * <p><b>ВАРИАНТ D — потокобезопасная очередь запросов [prim: mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>requestElevator/selectFloor вызываются из многих потоков (кнопки на этажах) параллельно со step().</li>
 *   <li>Очередь запросов потокобезопасна; ни один запрос не потерян и не задвоен.</li>
 *   <li>Проверка: K потоков шлют запросы во время симуляции → все учтены ровно один раз.</li>
 * </ul>
 */
public class ElevatorControllerD {

    public ElevatorControllerD(int numElevators, int minFloor, int maxFloor, int capacity) {
        throw new UnsupportedOperationException("TODO");
    }

    public void requestElevator(int fromFloor, ElevatorController.Direction direction) {
        throw new UnsupportedOperationException("TODO: variant D — thread-safe request queue");
    }

    public void step() {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        System.out.println("=== ElevatorControllerD (concurrent requests): Smoke ===");
    }
}
