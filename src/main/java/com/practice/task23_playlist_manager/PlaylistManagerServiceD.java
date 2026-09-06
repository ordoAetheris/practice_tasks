package com.practice.task23_playlist_manager;

/**
 * ПЛЕЙЛИСТ — ВАРИАНТ D: ИДЕМПОТЕНТНЫЕ ADD/REMOVE
 *
 * <p>CORE = базовый {@link PlaylistManagerService}.</p>
 *
 * <p><b>ВАРИАНТ D — идемпотентность [prim: idempotency ⭐]:</b></p>
 * <ul>
 *   <li>Повторный addTrack того же трека — не дублирует; повторный removeTrack отсутствующего — no-op.</li>
 *   <li>Проверка: add дважды → один трек; remove дважды → без ошибок, трека нет.</li>
 * </ul>
 */
public class PlaylistManagerServiceD {

    public void addTrack(String playlistId, PlaylistManagerService.Track track) {
        throw new UnsupportedOperationException("TODO: variant D — idempotent add");
    }

    public void removeTrack(String playlistId, String trackId) {
        throw new UnsupportedOperationException("TODO: variant D — idempotent remove");
    }

    public static void main(String[] args) {
        System.out.println("=== PlaylistManagerServiceD (идемпотентные add/remove): Smoke ===");
    }
}
