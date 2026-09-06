package com.practice.task77_undo_redo;

/**
 * UNDO/REDO — ВАРИАНТ E: EDGE
 *
 * <p>CORE = базовый {@link UndoRedoManager}.</p>
 *
 * <p><b>ВАРИАНТ E — edge/null-safety [prim: null-edge ⭐]:</b></p>
 * <ul>
 *   <li>undo при пустом undo-стеке — no-op/false (не исключение); redo при пустом redo-стеке — no-op/false.</li>
 *   <li>execute null-команды, undo сразу после инициализации, чередование undo/redo на границах.</li>
 *   <li>Проверка: canUndo/canRedo корректны на границах; операции на пустых стеках безопасны.</li>
 * </ul>
 */
public class UndoRedoManagerE {
    public void undo(){ throw new UnsupportedOperationException("TODO: variant E — safe on empty (no-op)"); }
    public void redo(){ throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== UndoRedoManagerE (edge): Smoke ==="); }
}
