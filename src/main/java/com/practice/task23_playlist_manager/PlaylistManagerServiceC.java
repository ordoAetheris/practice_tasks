package com.practice.task23_playlist_manager;

/**
 * ПЛЕЙЛИСТ — ВАРИАНТ C: АТОМАРНАЯ ПЕРЕСТАНОВКА (moveTrack)
 *
 * <p>CORE = базовый {@link PlaylistManagerService}.</p>
 *
 * <p><b>ВАРИАНТ C — атомарный переход [prim: atomicity]:</b></p>
 * <ul>
 *   <li>moveTrack на новую позицию — атомарный сдвиг: не должно быть промежуточного состояния
 *       с дублем/пропуском позиции.</li>
 *   <li>Проверка: конкурентные moveTrack → позиции остаются перестановкой 0..n-1 без дыр/дублей.</li>
 * </ul>
 */
public class PlaylistManagerServiceC {

    public void moveTrack(String playlistId, String trackId, int newPosition) {
        throw new UnsupportedOperationException("TODO: variant C — atomic reorder");
    }

    public static void main(String[] args) {
        System.out.println("=== PlaylistManagerServiceC (atomic reorder): Smoke ===");
    }
}
