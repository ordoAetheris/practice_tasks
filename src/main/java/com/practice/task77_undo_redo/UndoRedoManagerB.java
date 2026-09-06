package com.practice.task77_undo_redo;

/**
 * UNDO/REDO — ВАРИАНТ B: НЮАНС UNDO (undo не отменяет undo)
 *
 * <p>CORE = базовый {@link UndoRedoManager} (execute/undo/redo, стек команд).</p>
 *
 * <p><b>ВАРИАНТ B — семантика undo [prim: stack, semantics]:</b></p>
 * <ul>
 *   <li>undo — это НЕ команда в истории: сам undo нельзя «отменить» через undo (для этого redo). undo перекладывает команду в redo-стек, не в undo-стек.</li>
 *   <li>Проверка: execute A,B → undo (откат B) → undo (откат A); последовательные undo не «отменяют предыдущий undo».</li>
 * </ul>
 */
public class UndoRedoManagerB {
    public void undo(){ throw new UnsupportedOperationException("TODO: variant B — undo moves cmd to redo-stack, not undo-stack"); }
    public static void main(String[] a){ System.out.println("=== UndoRedoManagerB (undo nuance): Smoke ==="); }
}
