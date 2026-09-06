package com.practice.task65_social_network;

/**
 * СОЦСЕТЬ — ВАРИАНТ D: EDGE
 *
 * <p>CORE = базовый {@link SocialNetworkService}.</p>
 *
 * <p><b>ВАРИАНТ D — edge/null-safety [prim: null-edge ⭐]:</b></p>
 * <ul>
 *   <li>Дружба с самим собой (запрет), дубли дружбы (идемпотентно), удаление несуществующей дружби.</li>
 *   <li>degreesOfSeparation для несвязанных (−1), изолированный пользователь, mutual с самим собой.</li>
 *   <li>Проверка: границы не роняют; симметрия дружбы соблюдена (add/remove с обеих сторон).</li>
 * </ul>
 */
public class SocialNetworkServiceD {
    public void addFriendship(String userId1, String userId2){ throw new UnsupportedOperationException("TODO: variant D — edge (self/dup/missing/symmetry)"); }
    public static void main(String[] a){ System.out.println("=== SocialNetworkServiceD (edge): Smoke ==="); }
}
