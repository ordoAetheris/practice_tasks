package com.practice.task46_leaderboard;

import java.util.List;

/**
 * ЛИДЕРБОРД — ВАРИАНТ D: TOP-N ЧЕРЕЗ КУЧУ
 *
 * <p>CORE = базовый {@link LeaderboardService}.</p>
 *
 * <p><b>ВАРИАНТ D — top-n [prim: heap, top-k]:</b></p>
 * <ul>
 *   <li>getTopK через min-heap размера k (O(n log k)), не сортируя всех игроков.</li>
 *   <li>Проверка: top-10 из миллиона игроков без полной сортировки; результат совпадает с эталоном.</li>
 * </ul>
 */
public class LeaderboardServiceD {
    public List<LeaderboardService.Entry> getTopK(int k){ throw new UnsupportedOperationException("TODO: variant D — top-k via min-heap"); }
    public static void main(String[] a){ System.out.println("=== LeaderboardServiceD (top-n heap): Smoke ==="); }
}
