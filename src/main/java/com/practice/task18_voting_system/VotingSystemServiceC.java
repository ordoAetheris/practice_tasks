package com.practice.task18_voting_system;

/**
 * ГОЛОСОВАНИЕ — ВАРИАНТ C: АТОМАРНЫЙ ОДИН-ГОЛОС-НА-ЮЗЕРА
 *
 * <p>CORE = базовый {@link VotingSystemService}.</p>
 *
 * <p><b>ВАРИАНТ C — атомарный переход [prim: atomicity, CAS]:</b></p>
 * <ul>
 *   <li>Резерв факта «userId проголосовал» — атомарно (Set/Map.putIfAbsent); только победивший
 *       инкрементит счётчик опции.</li>
 *   <li>Проверка: гонка на один userId — ровно один putIfAbsent успешен → ровно один +1.</li>
 * </ul>
 */
public class VotingSystemServiceC {

    public String createPoll(String question, java.util.List<String> options, java.time.LocalDateTime endDate) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Атомарный putIfAbsent(userId) → только победитель учитывает голос. */
    public void vote(String userId, String pollId, int optionIndex) {
        throw new UnsupportedOperationException("TODO: variant C — atomic putIfAbsent voter");
    }

    public static void main(String[] args) {
        System.out.println("=== VotingSystemServiceC (atomic one-vote): Smoke ===");
    }
}
