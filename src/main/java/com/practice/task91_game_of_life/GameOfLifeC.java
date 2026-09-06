package com.practice.task91_game_of_life;

import java.util.Set;

/**
 * GAME OF LIFE — ВАРИАНТ C: SPARSE / БЕСКОНЕЧНОЕ ПОЛЕ
 *
 * <p>CORE = базовый {@link GameOfLife}.</p>
 *
 * <p><b>ВАРИАНТ C — разреженное представление [prim: sparse-set]:</b></p>
 * <ul>
 *   <li>Хранить только ЖИВЫЕ клетки как множество координат (Set&lt;(r,c)&gt;) → бесконечное поле без матрицы.</li>
 *   <li>step пересчитывает только живые и их соседей (кандидатов), а не весь grid.</li>
 *   <li>Проверка: паттерн, уходящий далеко за исходные границы, живёт корректно; память ∝ числу живых.</li>
 * </ul>
 */
public class GameOfLifeC {
    public GameOfLifeC(Set<long[]> aliveCells){ throw new UnsupportedOperationException("TODO: variant C — sparse infinite grid"); }
    public void step(){ throw new UnsupportedOperationException("TODO: variant C — recompute only live + neighbors"); }
    public static void main(String[] a){ System.out.println("=== GameOfLifeC (sparse/infinite): Smoke ==="); }
}
