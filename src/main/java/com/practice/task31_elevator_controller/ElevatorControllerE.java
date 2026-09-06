package com.practice.task31_elevator_controller;

/**
 * ЛИФТ — ВАРИАНТ E: EDGE / ГРАНИЦЫ
 *
 * <p>CORE = базовый {@link ElevatorController}.</p>
 *
 * <p><b>ВАРИАНТ E — edge/null-safety [prim: null-edge ⭐]:</b></p>
 * <ul>
 *   <li>Запрос этажа вне [minFloor,maxFloor]; выбор того же этажа; capacity overflow (лифт полон).</li>
 *   <li>Все лифты заняты/движутся не в ту сторону; запрос при нулевом числе лифтов.</li>
 *   <li>Проверка: таблица граничных запросов не роняет контроллер, невалидные — отклонены.</li>
 * </ul>
 */
public class ElevatorControllerE {

    public ElevatorControllerE(int numElevators, int minFloor, int maxFloor, int capacity) {
        throw new UnsupportedOperationException("TODO");
    }

    public void requestElevator(int fromFloor, ElevatorController.Direction direction) {
        throw new UnsupportedOperationException("TODO: variant E — validate floor bounds / capacity");
    }

    public static void main(String[] args) {
        System.out.println("=== ElevatorControllerE (edge/границы): Smoke ===");
    }
}
