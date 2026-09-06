package com.practice.task77_undo_redo;

/**
 * UNDO/REDO — ВАРИАНТ D: BOUNDED HISTORY
 *
 * <p>CORE = базовый {@link UndoRedoManager}.</p>
 *
 * <p><b>ВАРИАНТ D — ограниченная история [prim: ring-buffer, bounded]:</b></p>
 * <ul>
 *   <li>maxHistorySize: при переполнении вытеснять САМУЮ СТАРУЮ команду (её уже нельзя отменить).</li>
 *   <li>Проверка: после maxHistorySize+1 команд самая старая недоступна для undo; глубина undo == лимиту.</li>
 * </ul>
 */
public class UndoRedoManagerD {
    public UndoRedoManagerD(int maxHistorySize){ throw new UnsupportedOperationException("TODO: variant D — bounded history (drop oldest)"); }
    public void execute(UndoRedoManager.Command command){ throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== UndoRedoManagerD (bounded history): Smoke ==="); }
}
