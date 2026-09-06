package com.practice.task77_undo_redo;

/**
 * UNDO/REDO — ВАРИАНТ C: REDO + ИНВАЛИДАЦИЯ
 *
 * <p>CORE = базовый {@link UndoRedoManager}.</p>
 *
 * <p><b>ВАРИАНТ C — redo [prim: stack, invalidation]:</b></p>
 * <ul>
 *   <li>redo повторяет отменённую команду; НОВЫЙ execute очищает redo-стек (ветка истории обрывается).</li>
 *   <li>Проверка: undo→redo восстанавливает; undo→новый execute→redo невозможен (redo-стек очищен).</li>
 * </ul>
 */
public class UndoRedoManagerC {
    public void redo(){ throw new UnsupportedOperationException("TODO: variant C — redo"); }
    public void execute(UndoRedoManager.Command command){ throw new UnsupportedOperationException("TODO: variant C — new execute clears redo stack"); }
    public static void main(String[] a){ System.out.println("=== UndoRedoManagerC (redo): Smoke ==="); }
}
