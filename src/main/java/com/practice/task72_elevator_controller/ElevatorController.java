package com.practice.task72_elevator_controller;

import java.util.*;

/**
 * КОНТРОЛЛЕР ЛИФТОВ (ELEVATOR CONTROLLER)
 *
 * <p>Реализовать контроллер для системы из нескольких лифтов с использованием
 * алгоритма SCAN (лифт едет в одном направлении, пока есть запросы в этом направлении,
 * затем разворачивается). Контроллер выбирает оптимальный лифт для каждого запроса.</p>
 *
 * <h3>Основные операции:</h3>
 * <ul>
 *   <li>requestElevator(fromFloor, direction) — вызвать лифт на этаж</li>
 *   <li>selectFloor(elevatorId, floor) — нажать кнопку этажа внутри лифта</li>
 *   <li>step() — один шаг симуляции (лифты перемещаются на один этаж)</li>
 *   <li>getStatus() — текущее состояние всех лифтов</li>
 *   <li>getOptimalElevator(request) — выбрать лучший лифт для запроса</li>
 * </ul>
 *
 * <h3>Алгоритм SCAN:</h3>
 * <ul>
 *   <li>Лифт движется в текущем направлении, обслуживая запросы по пути</li>
 *   <li>Когда запросов в текущем направлении нет — разворачивается</li>
 *   <li>Когда нет запросов вообще — состояние IDLE</li>
 * </ul>
 *
 * <h3>Выбор оптимального лифта:</h3>
 * <ul>
 *   <li>Предпочтение лифту, который едет в нужном направлении и проезжает мимо этажа</li>
 *   <li>Затем — ближайшему IDLE лифту</li>
 *   <li>В крайнем случае — любому, который ближе всего</li>
 * </ul>
 *
 * <p>Уровень: Продвинутый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task72_elevator_controller/ElevatorController.java
 * java -cp src/main/java com.practice.task72_elevator_controller.ElevatorController
 * </pre>
 */
public class ElevatorController {

    /**
     * Направление движения лифта.
     */
    public enum Direction {
        UP, DOWN, IDLE
    }

    /**
     * Состояние лифта.
     *
     * @param id идентификатор лифта
     * @param currentFloor текущий этаж
     * @param direction текущее направление
     * @param capacity максимальная вместимость
     * @param currentPassengers текущее количество пассажиров
     * @param targetFloors множество целевых этажей
     */
    public record ElevatorStatus(
            int id,
            int currentFloor,
            Direction direction,
            int capacity,
            int currentPassengers,
            Set<Integer> targetFloors
    ) {}

    /**
     * Запрос на вызов лифта.
     *
     * @param fromFloor этаж вызова
     * @param direction желаемое направление
     * @param timestamp время запроса
     */
    public record Request(int fromFloor, Direction direction, long timestamp) {}

    /**
     * Создаёт контроллер для указанного количества лифтов.
     *
     * @param numElevators количество лифтов
     * @param minFloor минимальный этаж (обычно 1)
     * @param maxFloor максимальный этаж
     * @param capacity вместимость каждого лифта
     */
    public ElevatorController(int numElevators, int minFloor, int maxFloor, int capacity) {
        // TODO: implement
    }

    /**
     * Регистрирует запрос на вызов лифта на указанный этаж.
     *
     * @param fromFloor этаж вызова
     * @param direction желаемое направление (UP или DOWN)
     */
    public void requestElevator(int fromFloor, Direction direction) {
        // TODO: implement
    }

    /**
     * Регистрирует нажатие кнопки этажа внутри лифта (пассажир выбрал целевой этаж).
     *
     * @param elevatorId идентификатор лифта
     * @param floor целевой этаж
     */
    public void selectFloor(int elevatorId, int floor) {
        // TODO: implement
    }

    /**
     * Выполняет один шаг симуляции: каждый лифт перемещается на один этаж
     * в текущем направлении, обслуживает запросы на текущем этаже.
     * Если запросов в текущем направлении нет — разворачивается.
     */
    public void step() {
        // TODO: implement — алгоритм SCAN
    }

    /**
     * Возвращает текущее состояние всех лифтов.
     *
     * @return список состояний лифтов
     */
    public List<ElevatorStatus> getStatus() {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Выбирает оптимальный лифт для обработки запроса.
     *
     * @param request запрос на вызов
     * @return id оптимального лифта
     */
    public int getOptimalElevator(Request request) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("=== ElevatorController: Smoke Test ===");
        // TODO: smoke test — симуляция нескольких шагов
    }
}
