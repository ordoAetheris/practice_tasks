package com.practice.task46_leaderboard;

import java.util.List;

/**
 * ЛИДЕРБОРД — ВАРИАНТ C: ОКНО (недавние очки)
 *
 * <p>CORE = базовый {@link LeaderboardService}.</p>
 *
 * <p><b>ВАРИАНТ C — временное окно [prim: ring-buffer, running-aggregate]:</b></p>
 * <ul>
 *   <li>Рейтинг по очкам за последнее окно (например, час): старые записи выпадают (ring/deque по времени).</li>
 *   <li>Проверка: очки старше окна не учитываются в топе; агрегат обновляется при сдвиге окна.</li>
 * </ul>
 */
public class LeaderboardServiceC {
    public LeaderboardService.Entry submitScore(String userId, long score, long timestampMs){ throw new UnsupportedOperationException("TODO: variant C — time-windowed leaderboard"); }
    public List<LeaderboardService.Entry> getTopKInWindow(int k, long windowMs){ throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== LeaderboardServiceC (window): Smoke ==="); }
}
