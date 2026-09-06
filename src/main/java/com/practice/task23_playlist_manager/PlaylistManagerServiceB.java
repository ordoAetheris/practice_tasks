package com.practice.task23_playlist_manager;

/**
 * ПЛЕЙЛИСТ — ВАРИАНТ B: КОНКУРЕНТНАЯ МОДИФИКАЦИЯ СПИСКА
 *
 * <p>CORE = базовый {@link PlaylistManagerService} (та же модель Track/Playlist).</p>
 *
 * <p><b>ВАРИАНТ B — доменная гонка [prim: mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>Параллельные addTrack/removeTrack/moveTrack → рассинхрон позиций, потерянные треки.</li>
 *   <li>ЗАДАЧА: модификации списка под защитой; позиции согласованы.</li>
 *   <li>Проверка: K потоков add → размер == K; порядок/позиции без дыр.</li>
 * </ul>
 */
public class PlaylistManagerServiceB {

    public void addTrack(String playlistId, PlaylistManagerService.Track track) {
        throw new UnsupportedOperationException("TODO: variant B — list modification under lock");
    }

    public void removeTrack(String playlistId, String trackId) {
        throw new UnsupportedOperationException("TODO: variant B");
    }

    public static void main(String[] args) {
        System.out.println("=== PlaylistManagerServiceB (конкур-модификация): Smoke ===");
    }
}
