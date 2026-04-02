package com.practice.task68_social_network;

import java.util.*;

/**
 * СОЦИАЛЬНАЯ СЕТЬ (ГРАФ ДРУЖБЫ)
 *
 * <p>Реализовать сервис социальной сети на основе графа. Пользователи — вершины,
 * дружба — рёбра (двунаправленные). Реализовать алгоритмы поиска на графе:
 * BFS для кратчайшего расстояния, поиск сообществ (connected components).</p>
 *
 * <h3>Основные операции:</h3>
 * <ul>
 *   <li>addUser(user) — добавить пользователя</li>
 *   <li>addFriendship(userA, userB) — добавить дружбу (симметричная связь)</li>
 *   <li>removeFriendship(userA, userB) — удалить дружбу</li>
 *   <li>getFriends(userId) — список друзей пользователя</li>
 *   <li>getMutualFriends(userA, userB) — общие друзья двух пользователей</li>
 *   <li>suggestFriends(userId) — друзья друзей, которые ещё не являются друзьями</li>
 *   <li>degreesOfSeparation(userA, userB) — кратчайшее расстояние (BFS)</li>
 *   <li>findCommunities() — группы связных пользователей (connected components)</li>
 * </ul>
 *
 * <h3>Требования:</h3>
 * <ul>
 *   <li>Дружба всегда симметрична (A друг B ⟺ B друг A)</li>
 *   <li>Нельзя добавить дружбу с самим собой</li>
 *   <li>suggestFriends ранжирует по количеству общих друзей</li>
 *   <li>degreesOfSeparation использует BFS (кратчайший путь)</li>
 *   <li>findCommunities находит все компоненты связности</li>
 * </ul>
 *
 * <p>Уровень: Продвинутый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task68_social_network/SocialNetworkService.java
 * java -cp src/main/java com.practice.task68_social_network.SocialNetworkService
 * </pre>
 */
public class SocialNetworkService {

    /**
     * Пользователь социальной сети.
     *
     * @param id уникальный идентификатор
     * @param name имя пользователя
     * @param interests список интересов
     */
    public record User(String id, String name, List<String> interests) {}

    /**
     * Добавляет пользователя в сеть.
     *
     * @param user пользователь
     * @throws IllegalArgumentException если пользователь с таким id уже существует
     */
    public void addUser(User user) {
        // TODO: implement
    }

    /**
     * Добавляет двустороннюю дружбу между пользователями.
     *
     * @param userId1 id первого пользователя
     * @param userId2 id второго пользователя
     * @throws IllegalArgumentException если пользователь пытается добавить дружбу с самим собой
     *         или один из пользователей не существует
     */
    public void addFriendship(String userId1, String userId2) {
        // TODO: implement
    }

    /**
     * Удаляет дружбу между пользователями.
     *
     * @param userId1 id первого пользователя
     * @param userId2 id второго пользователя
     */
    public void removeFriendship(String userId1, String userId2) {
        // TODO: implement
    }

    /**
     * Возвращает список друзей пользователя.
     *
     * @param userId id пользователя
     * @return множество друзей
     */
    public Set<User> getFriends(String userId) {
        // TODO: implement
        return Collections.emptySet();
    }

    /**
     * Возвращает общих друзей двух пользователей.
     *
     * @param userId1 id первого пользователя
     * @param userId2 id второго пользователя
     * @return множество общих друзей
     */
    public Set<User> getMutualFriends(String userId1, String userId2) {
        // TODO: implement
        return Collections.emptySet();
    }

    /**
     * Рекомендует друзей: друзья друзей, которые ещё не являются прямыми друзьями.
     * Ранжировано по количеству общих друзей (по убыванию).
     *
     * @param userId id пользователя
     * @return список рекомендованных пользователей
     */
    public List<User> suggestFriends(String userId) {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Вычисляет кратчайшее расстояние (количество рёбер) между двумя пользователями.
     * Использует алгоритм BFS.
     *
     * @param userId1 id первого пользователя
     * @param userId2 id второго пользователя
     * @return количество рёбер на кратчайшем пути, или -1 если пути нет
     */
    public int degreesOfSeparation(String userId1, String userId2) {
        // TODO: implement
        return -1;
    }

    /**
     * Находит все сообщества (компоненты связности графа).
     * Каждое сообщество — множество пользователей, связанных цепочкой дружб.
     *
     * @return список сообществ
     */
    public List<Set<User>> findCommunities() {
        // TODO: implement
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        System.out.println("=== SocialNetworkService: Smoke Test ===");
        // TODO: smoke test
    }
}
