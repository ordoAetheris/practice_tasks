package com.practice.task57_social_feed;

import java.util.List;

/**
 * ЛЕНТА — ВАРИАНТ D: THREAD-SAFE
 *
 * <p>CORE = базовый {@link SocialFeedService}.</p>
 *
 * <p><b>ВАРИАНТ D — потокобезопасность [prim: mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>Конкурентные createPost/follow/unfollow/getFeed согласованы; граф подписок и посты не рвутся.</li>
 *   <li>Проверка: параллельная публикация + чтение ленты → согласованный набор, без потерь/дублей.</li>
 * </ul>
 */
public class SocialFeedServiceD {
    public List<SocialFeedService.Post> getFeed(String userId, int limit){ throw new UnsupportedOperationException("TODO: variant D — thread-safe feed/graph"); }
    public static void main(String[] a){ System.out.println("=== SocialFeedServiceD (thread-safe): Smoke ==="); }
}
