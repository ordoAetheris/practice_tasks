package com.practice.task65_social_network;

/**
 * СОЦСЕТЬ — ВАРИАНТ B: СТЕПЕНИ РАЗДЕЛЕНИЯ (BFS)
 *
 * <p>CORE = базовый {@link SocialNetworkService} (друзья, degreesOfSeparation).</p>
 *
 * <p><b>ВАРИАНТ B — BFS [prim: BFS, shortest-path-unweighted]:</b></p>
 * <ul>
 *   <li>degreesOfSeparation = кратчайшее число рёбер между пользователями (BFS); suggestFriends = друзья-друзей (2-й уровень).</li>
 *   <li>Проверка: расстояние в графе дружбы корректно; -1/∞ если нет связи.</li>
 * </ul>
 */
public class SocialNetworkServiceB {
    public int degreesOfSeparation(String userId1, String userId2){ throw new UnsupportedOperationException("TODO: variant B — BFS degrees"); }
    public static void main(String[] a){ System.out.println("=== SocialNetworkServiceB (BFS degrees): Smoke ==="); }
}
