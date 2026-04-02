package com.practice.task40_social_feed;

import java.time.LocalDateTime;
import java.util.*;

/**
 * ЛЕНТА НОВОСТЕЙ СОЦИАЛЬНОЙ СЕТИ
 *
 * <p>Реализуйте упрощённую ленту новостей социальной сети. Пользователи создают посты,
 * подписываются друг на друга, ставят лайки. Лента формируется из постов подписок.</p>
 *
 * <p>Сущности:</p>
 * <ul>
 *   <li>User — пользователь (id, name)</li>
 *   <li>Post — пост (id, authorId, content, timestamp, likesCount)</li>
 *   <li>Follow — подписка (followerId, followeeId)</li>
 * </ul>
 *
 * <p>Операции:</p>
 * <ul>
 *   <li>createUser(name) — создать пользователя</li>
 *   <li>createPost(authorId, content) — создать пост</li>
 *   <li>follow(followerId, followeeId) — подписаться</li>
 *   <li>unfollow(followerId, followeeId) — отписаться</li>
 *   <li>getFeed(userId, limit) — лента: посты от подписок, отсортированные по времени (новые первыми)</li>
 *   <li>likePost(userId, postId) — поставить лайк</li>
 *   <li>getUserPosts(userId) — все посты пользователя</li>
 *   <li>getMutualFollowers(userA, userB) — общие подписчики двух пользователей</li>
 * </ul>
 *
 * <p>Бизнес-правила:</p>
 * <ul>
 *   <li>Нельзя подписаться на самого себя</li>
 *   <li>Нельзя лайкнуть пост дважды одним пользователем</li>
 *   <li>Лента не включает собственные посты пользователя</li>
 *   <li>Имя пользователя не может быть пустым</li>
 *   <li>Контент поста не может быть пустым</li>
 * </ul>
 *
 * <p>Уровень: Средний</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task40_social_feed/SocialFeedService.java
 * java -cp src/main/java com.practice.task40_social_feed.SocialFeedService
 * </pre>
 */
public class SocialFeedService {

    public record User(
            String id,
            String name
    ) {}

    public record Post(
            String id,
            String authorId,
            String content,
            LocalDateTime timestamp,
            int likesCount
    ) {}

    /**
     * Создаёт нового пользователя.
     *
     * @param name имя пользователя
     * @return созданный пользователь
     * @throws IllegalArgumentException если name пустое
     */
    public User createUser(String name) {
        // TODO: implement
        return null;
    }

    /**
     * Создаёт новый пост от имени пользователя.
     *
     * @param authorId идентификатор автора
     * @param content  содержимое поста
     * @return созданный пост
     * @throws IllegalArgumentException если автор не найден или content пустой
     */
    public Post createPost(String authorId, String content) {
        // TODO: implement
        return null;
    }

    /**
     * Подписывает пользователя на другого.
     *
     * @param followerId идентификатор подписчика
     * @param followeeId идентификатор пользователя, на которого подписываются
     * @throws IllegalArgumentException если пользователь не найден
     * @throws IllegalStateException    если followerId == followeeId или подписка уже существует
     */
    public void follow(String followerId, String followeeId) {
        // TODO: implement
    }

    /**
     * Отписывает пользователя от другого.
     *
     * @param followerId идентификатор подписчика
     * @param followeeId идентификатор пользователя, от которого отписываются
     * @throws IllegalArgumentException если подписка не найдена
     */
    public void unfollow(String followerId, String followeeId) {
        // TODO: implement
    }

    /**
     * Формирует ленту новостей: посты от пользователей, на которых подписан userId.
     * Не включает собственные посты. Отсортированы по времени (новые первыми).
     *
     * @param userId идентификатор пользователя
     * @param limit  максимальное количество постов
     * @return список постов для ленты
     */
    public List<Post> getFeed(String userId, int limit) {
        // TODO: implement
        return List.of();
    }

    /**
     * Ставит лайк на пост.
     *
     * @param userId идентификатор пользователя
     * @param postId идентификатор поста
     * @throws IllegalArgumentException если пользователь или пост не найден
     * @throws IllegalStateException    если пользователь уже лайкнул этот пост
     */
    public void likePost(String userId, String postId) {
        // TODO: implement
    }

    /**
     * Возвращает все посты пользователя, отсортированные по времени (новые первыми).
     *
     * @param userId идентификатор пользователя
     * @return список постов пользователя
     */
    public List<Post> getUserPosts(String userId) {
        // TODO: implement
        return List.of();
    }

    /**
     * Возвращает список пользователей, которые подписаны и на userA, и на userB
     * (общие подписчики).
     *
     * @param userAId идентификатор первого пользователя
     * @param userBId идентификатор второго пользователя
     * @return список общих подписчиков
     */
    public List<User> getMutualFollowers(String userAId, String userBId) {
        // TODO: implement
        return List.of();
    }

    public static void main(String[] args) {
        System.out.println("=== SocialFeedService: Smoke Test ===");
        // TODO: создать тестовые данные и проверить основные сценарии
    }
}
