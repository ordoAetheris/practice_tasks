package com.practice.task31_elevator_controller;

/**
 * ЛИФТ — ВАРИАНТ C: АЛГОРИТМ SCAN
 *
 * <p>CORE = базовый {@link ElevatorController}.</p>
 *
 * <p><b>ВАРИАНТ C — планирование [prim: algorithm, SCAN]:</b></p>
 * <ul>
 *   <li>Обслуживание этажей по алгоритму SCAN («лифт»): идти в одном направлении до крайнего запроса,
 *       затем разворот — вместо наивного FIFO.</li>
 *   <li>getOptimalElevator выбирает лифт с минимальной оценкой по направлению/расстоянию.</li>
 *   <li>Проверка: набор запросов обслуживается в SCAN-порядке; меньше суммарного хода, чем FIFO.</li>
 * </ul>
 */
public class ElevatorControllerC {

    public ElevatorControllerC(int numElevators, int minFloor, int maxFloor, int capacity) {
        throw new UnsupportedOperationException("TODO");
    }

    public int getOptimalElevator(ElevatorController.Request request) {
        throw new UnsupportedOperationException("TODO: variant C — SCAN scheduling");
    }

    public void step() {
        throw new UnsupportedOperationException("TODO: variant C — serve floors in SCAN order");
    }

    public static void main(String[] args) {
        System.out.println("=== ElevatorControllerC (SCAN): Smoke ===");
    }
}
