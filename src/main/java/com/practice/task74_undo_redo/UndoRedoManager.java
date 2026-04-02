package com.practice.task74_undo_redo;

import java.util.*;

/**
 * МЕНЕДЖЕР ОТМЕНЫ/ПОВТОРА (UNDO/REDO MANAGER)
 *
 * <p>Реализовать менеджер отмены и повтора операций на основе паттерна Command.
 * Каждая команда умеет выполняться (execute) и отменяться (undo). Поддерживается
 * группировка команд (batch) и ограничение размера истории.</p>
 *
 * <h3>Основные операции:</h3>
 * <ul>
 *   <li>execute(command) — выполнить команду и добавить в историю</li>
 *   <li>undo() — отменить последнюю команду</li>
 *   <li>redo() — повторить отменённую команду</li>
 *   <li>canUndo() / canRedo() — проверка доступности операции</li>
 *   <li>getHistory() — список выполненных команд</li>
 *   <li>clear() — очистить всю историю</li>
 *   <li>getUndoStack() / getRedoStack() — содержимое стеков</li>
 * </ul>
 *
 * <h3>Требования:</h3>
 * <ul>
 *   <li>Redo стек очищается при выполнении новой команды</li>
 *   <li>Поддержка batch-команд: несколько команд группируются в одну для undo/redo</li>
 *   <li>Ограничение размера истории (maxHistorySize): при превышении старые команды удаляются</li>
 *   <li>Command — интерфейс с методами execute(), undo(), getDescription()</li>
 * </ul>
 *
 * <p>Уровень: Продвинутый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task74_undo_redo/UndoRedoManager.java
 * java -cp src/main/java com.practice.task74_undo_redo.UndoRedoManager
 * </pre>
 */
public class UndoRedoManager {

    /**
     * Интерфейс команды. Каждая команда должна уметь выполняться и отменяться.
     */
    public interface Command {
        /**
         * Выполняет команду.
         */
        void execute();

        /**
         * Отменяет команду (обратная операция к execute).
         */
        void undo();

        /**
         * Возвращает описание команды.
         *
         * @return описание
         */
        String getDescription();
    }

    /**
     * Создаёт менеджер с неограниченной историей.
     */
    public UndoRedoManager() {
        // TODO: implement
    }

    /**
     * Создаёт менеджер с ограниченным размером истории.
     *
     * @param maxHistorySize максимальное количество команд в истории
     */
    public UndoRedoManager(int maxHistorySize) {
        // TODO: implement
    }

    /**
     * Выполняет команду и добавляет её в undo-стек.
     * Очищает redo-стек (новая команда сбрасывает redo).
     *
     * @param command команда для выполнения
     */
    public void execute(Command command) {
        // TODO: implement
    }

    /**
     * Выполняет группу команд как одну batch-операцию.
     * Undo/redo для batch отменяет/повторяет все команды группы.
     *
     * @param commands список команд для группового выполнения
     * @param description описание групповой операции
     */
    public void executeBatch(List<Command> commands, String description) {
        // TODO: implement
    }

    /**
     * Отменяет последнюю выполненную команду.
     *
     * @throws IllegalStateException если undo-стек пуст
     */
    public void undo() {
        // TODO: implement
    }

    /**
     * Повторяет последнюю отменённую команду.
     *
     * @throws IllegalStateException если redo-стек пуст
     */
    public void redo() {
        // TODO: implement
    }

    /**
     * Проверяет, можно ли выполнить undo.
     *
     * @return true если undo-стек не пуст
     */
    public boolean canUndo() {
        // TODO: implement
        return false;
    }

    /**
     * Проверяет, можно ли выполнить redo.
     *
     * @return true если redo-стек не пуст
     */
    public boolean canRedo() {
        // TODO: implement
        return false;
    }

    /**
     * Возвращает историю выполненных команд (описания).
     *
     * @return список описаний команд в порядке выполнения
     */
    public List<String> getHistory() {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Возвращает содержимое undo-стека (описания, от старых к новым).
     *
     * @return список описаний команд в undo-стеке
     */
    public List<String> getUndoStack() {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Возвращает содержимое redo-стека (описания).
     *
     * @return список описаний команд в redo-стеке
     */
    public List<String> getRedoStack() {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Очищает всю историю (undo и redo стеки).
     */
    public void clear() {
        // TODO: implement
    }

    public static void main(String[] args) {
        System.out.println("=== UndoRedoManager: Smoke Test ===");
        // TODO: smoke test
    }
}
