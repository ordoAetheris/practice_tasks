package com.practice.task46_leaderboard;

import java.util.List;

/**
 * ЛИДЕРБОРД — ВАРИАНТ B: THREAD-SAFE ЗАПИСЬ
 *
 * <p>CORE = базовый {@link LeaderboardService} (submitScore/getTopK/getRank).</p>
 *
 * <p><b>ВАРИАНТ B — потокобезопасность [prim: mutual-excl ⭐, striping]:</b></p>
 * <ul>
 *   <li>Конкурентные submitScore не теряют обновления; ранги/топ согласованы под гонкой.</li>
 *   <li>Проверка: K потоков submit → сумма/максимумы верны, getTopK консистентен.</li>
 * </ul>
 */
public class LeaderboardServiceB {
    public LeaderboardService.Entry submitScore(String userId, long score){ throw new UnsupportedOperationException("TODO: variant B — thread-safe writes"); }
    public List<LeaderboardService.Entry> getTopK(int k){ throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== LeaderboardServiceB (thread-safe): Smoke ==="); }
}
