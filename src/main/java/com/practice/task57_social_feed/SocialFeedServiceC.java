package com.practice.task57_social_feed;

import java.util.List;

/**
 * ЛЕНТА — ВАРИАНТ C: КЭШ + ИНВАЛИДАЦИЯ
 *
 * <p>CORE = базовый {@link SocialFeedService}.</p>
 *
 * <p><b>ВАРИАНТ C — кэш ленты [prim: cache, per-key-eviction, invalidation]:</b></p>
 * <ul>
 *   <li>Кэшировать собранную ленту пользователя (fan-out on read); инвалидировать при новом посте того, на кого подписан.</li>
 *   <li>Проверка: повторный getFeed из кэша; новый пост подписки инвалидирует ленту подписчиков.</li>
 * </ul>
 */
public class SocialFeedServiceC {
    public List<SocialFeedService.Post> getFeed(String userId, int limit){ throw new UnsupportedOperationException("TODO: variant C — cached feed + invalidation on new post"); }
    public static void main(String[] a){ System.out.println("=== SocialFeedServiceC (cache+invalidation): Smoke ==="); }
}
