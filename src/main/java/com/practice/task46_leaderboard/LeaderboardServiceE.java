package com.practice.task46_leaderboard;

import java.util.List;

/**
 * ЛИДЕРБОРД — ВАРИАНТ E: EDGE
 *
 * <p>CORE = базовый {@link LeaderboardService}.</p>
 *
 * <p><b>ВАРИАНТ E — edge/null-safety [prim: null-edge ⭐]:</b></p>
 * <ul>
 *   <li>Пустой борд, getTopK при k&gt;размера/k=0, одинаковые очки (tie-break стабилен), отрицательные очки.</li>
 *   <li>getRank несуществующего игрока; getAroundMe у крайнего.</li>
 *   <li>Проверка: границы не роняют, ничьи разрешаются детерминированно.</li>
 * </ul>
 */
public class LeaderboardServiceE {
    public List<LeaderboardService.Entry> getTopK(int k){ throw new UnsupportedOperationException("TODO: variant E — edge (empty/ties/k bounds)"); }
    public int getRank(String userId){ throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== LeaderboardServiceE (edge): Smoke ==="); }
}
