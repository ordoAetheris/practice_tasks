package com.practice.task65_social_network;

import java.util.Set;

/**
 * СОЦСЕТЬ — ВАРИАНТ C: THREAD-SAFE SNAPSHOT
 *
 * <p>CORE = базовый {@link SocialNetworkService}.</p>
 *
 * <p><b>ВАРИАНТ C — снимок под конкурентой [prim: mutual-excl ⭐, snapshot]:</b></p>
 * <ul>
 *   <li>getFriends/getMutualFriends отдают консистентный снимок при конкурентных addFriendship/removeFriendship.</li>
 *   <li>Граф дружбы (симметричные рёбра) обновляется атомарно с обеих сторон.</li>
 *   <li>Проверка: параллельное добавление/удаление дружбы + чтение → без CME, снимок согласован.</li>
 * </ul>
 */
public class SocialNetworkServiceC {
    public Set<SocialNetworkService.User> getFriends(String userId){ throw new UnsupportedOperationException("TODO: variant C — thread-safe snapshot"); }
    public static void main(String[] a){ System.out.println("=== SocialNetworkServiceC (thread-safe snapshot): Smoke ==="); }
}
