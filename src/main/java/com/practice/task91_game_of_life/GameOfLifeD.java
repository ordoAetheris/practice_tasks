package com.practice.task91_game_of_life;

/**
 * GAME OF LIFE — ВАРИАНТ D: PARALLEL UPDATE
 *
 * <p>CORE = базовый {@link GameOfLife}.</p>
 *
 * <p><b>ВАРИАНТ D — параллельный шаг [prim: bounded-parallelism, double-buffer]:</b></p>
 * <ul>
 *   <li>step распараллелен по строкам/блокам (все читают старый буфер, пишут в новый — нет гонок при double-buffer).</li>
 *   <li>Барьер перед свапом буферов; корректность == последовательной версии.</li>
 *   <li>Проверка: параллельный step на большом поле даёт тот же результат, что и последовательный.</li>
 * </ul>
 */
public class GameOfLifeD {
    public GameOfLifeD(boolean[][] initial, int threads){ throw new UnsupportedOperationException("TODO: variant D — parallel step (double-buffer + barrier)"); }
    public void step(){ throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== GameOfLifeD (parallel): Smoke ==="); }
}
