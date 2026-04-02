package com.practice.task49_state_machine;

import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Predicate;
import java.util.function.Consumer;

/**
 * КОНЕЧНЫЙ АВТОМАТ
 *
 * <p>Реализуйте универсальный конечный автомат (State Machine).
 * Состояние (State) содержит: name.
 * Переход (Transition) содержит: from (имя состояния), to (имя состояния),
 * event (строка), guard (предикат, опциональный), action (действие при переходе, опциональное).</p>
 *
 * <p>Необходимо реализовать следующие операции:</p>
 * <ul>
 *   <li>defineState(name) — определить состояние</li>
 *   <li>defineTransition(from, to, event, guard, action) — определить переход</li>
 *   <li>setInitialState(name) — установить начальное состояние</li>
 *   <li>fire(event) — выполнить переход по событию (если возможно)</li>
 *   <li>getCurrentState() — получить текущее состояние</li>
 *   <li>canFire(event) — проверить, возможен ли переход по событию</li>
 *   <li>getAvailableEvents() — получить доступные события из текущего состояния</li>
 *   <li>getTransitionHistory() — получить историю переходов</li>
 * </ul>
 *
 * <p>Бизнес-правила:</p>
 * <ul>
 *   <li>Из одного состояния по одному событию — ровно один переход</li>
 *   <li>Guard-предикат может запретить переход (canFire вернёт false)</li>
 *   <li>Недопустимый переход — бросить IllegalStateException</li>
 *   <li>Action выполняется при успешном переходе</li>
 * </ul>
 *
 * <p>Уровень: Средний</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task49_state_machine/StateMachineService.java
 * java -cp src/main/java com.practice.task49_state_machine.StateMachineService
 * </pre>
 */
public class StateMachineService {

    public record TransitionRecord(
            String fromState,
            String toState,
            String event,
            LocalDateTime timestamp
    ) {}

    /**
     * Определяет новое состояние автомата.
     * @param name имя состояния
     * @throws IllegalArgumentException если состояние с таким именем уже существует
     */
    public void defineState(String name) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Определяет переход между состояниями.
     * @param from имя исходного состояния
     * @param to имя целевого состояния
     * @param event событие, вызывающее переход
     * @param guard предикат-условие (null если без условия)
     * @param action действие при переходе (null если без действия)
     * @throws IllegalArgumentException если состояния не определены или переход дублируется
     */
    public void defineTransition(String from, String to, String event,
                                  Predicate<Map<String, Object>> guard,
                                  Consumer<Map<String, Object>> action) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Устанавливает начальное состояние автомата.
     * @param name имя начального состояния
     * @throws IllegalArgumentException если состояние не определено
     */
    public void setInitialState(String name) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Выполняет переход по событию. Guard проверяется с переданным контекстом.
     * @param event событие
     * @param context контекст для guard и action (может быть пустым)
     * @throws IllegalStateException если переход невозможен
     */
    public void fire(String event, Map<String, Object> context) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Возвращает имя текущего состояния.
     * @return текущее состояние
     */
    public String getCurrentState() {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Проверяет, возможен ли переход по указанному событию из текущего состояния.
     * Учитывает guard-предикат.
     * @param event событие
     * @param context контекст для guard
     * @return true если переход возможен
     */
    public boolean canFire(String event, Map<String, Object> context) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Возвращает список доступных событий из текущего состояния (без учёта guard).
     * @return список событий
     */
    public List<String> getAvailableEvents() {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Возвращает историю всех выполненных переходов.
     * @return список записей переходов в хронологическом порядке
     */
    public List<TransitionRecord> getTransitionHistory() {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    public static void main(String[] args) {
        System.out.println("=== StateMachineService: Smoke Test ===");
        // TODO: smoke test
    }
}
