package com.practice.task91_game_of_life;

/**
 * GAME OF LIFE — ВАРИАНТ B: ГРАНИЦЫ (toroidal / fixed)
 *
 * <p>CORE = базовый {@link GameOfLife} (double-buffer step по правилам Конвея).</p>
 *
 * <p><b>ВАРИАНТ B — обработка границ [prim: null-edge ⭐, boundary]:</b></p>
 * <ul>
 *   <li>Режимы края: FIXED (за границей мёртвые) vs TOROIDAL (тор — левый край соседствует с правым).</li>
 *   <li>Корректный подсчёт соседей на углах/краях без выхода за массив.</li>
 *   <li>Проверка: глайдер на торе «облетает» поле; на fixed — рассыпается у края.</li>
 * </ul>
 */
public class GameOfLifeB {
    public enum Boundary { FIXED, TOROIDAL }
    public GameOfLifeB(boolean[][] initial, Boundary boundary){ throw new UnsupportedOperationException("TODO: variant B — boundary handling"); }
    public void step(){ throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== GameOfLifeB (boundary): Smoke ==="); }
}
