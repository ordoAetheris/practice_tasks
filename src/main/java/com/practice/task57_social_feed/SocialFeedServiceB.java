package com.practice.task57_social_feed;

import java.util.List;

/**
 * ЛЕНТА — ВАРИАНТ B: КУРСОРНАЯ ПАГИНАЦИЯ
 *
 * <p>CORE = базовый {@link SocialFeedService} (follow/createPost/getFeed).</p>
 *
 * <p><b>ВАРИАНТ B — курсорная пагинация [prim: keyset-pagination]:</b></p>
 * <ul>
 *   <li>getFeed(userId, cursor, limit): страницы по курсору (timestamp/id последнего), а не offset — стабильно при новых постах.</li>
 *   <li>Проверка: листание не пропускает/не дублирует посты при вставке новых во время пагинации.</li>
 * </ul>
 */
public class SocialFeedServiceB {
    public List<SocialFeedService.Post> getFeed(String userId, String cursor, int limit){ throw new UnsupportedOperationException("TODO: variant B — keyset/cursor pagination"); }
    public static void main(String[] a){ System.out.println("=== SocialFeedServiceB (cursor pagination): Smoke ==="); }
}
