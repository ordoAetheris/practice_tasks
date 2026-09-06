package com.practice.task23_playlist_manager;

/**
 * ПЛЕЙЛИСТ — ВАРИАНТ E: SAFE-DELETE ПОД ОБХОДОМ
 *
 * <p>CORE = базовый {@link PlaylistManagerService}.</p>
 *
 * <p><b>ВАРИАНТ E — безопасное удаление под итерацией [prim: safe-delete ⭐]:</b></p>
 * <ul>
 *   <li>removeTrack во время обхода (getTotalDuration/findByArtist/проигрывание) → без ConcurrentModificationException
 *       и без обращения к удалённому.</li>
 *   <li>Направления: снимок для чтения; конкурентная коллекция; согласованное представление.</li>
 *   <li>Проверка: поток считает длительность, второй удаляет треки → без CME, результат согласован.</li>
 * </ul>
 */
public class PlaylistManagerServiceE {

    public int getTotalDuration(String playlistId) {
        throw new UnsupportedOperationException("TODO: variant E — safe iteration under delete");
    }

    public void removeTrack(String playlistId, String trackId) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        System.out.println("=== PlaylistManagerServiceE (safe-delete под обходом): Smoke ===");
    }
}
