package com.practice.task18_voting_system;

/**
 * ГОЛОСОВАНИЕ — ВАРИАНТ B: ДВОЙНОЙ ГОЛОС (гонка vote)
 *
 * <p>CORE = базовый {@link VotingSystemService} (та же модель Poll/Vote).</p>
 *
 * <p><b>ВАРИАНТ B — доменная гонка [prim: mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>Один пользователь голосует из двух потоков одновременно → наивная «проверка не-голосовал → учесть»
 *       засчитывает два голоса.</li>
 *   <li>ЗАДАЧА: один пользователь — максимум один голос, даже под гонкой.</li>
 *   <li>Проверка: N потоков vote одним userId → счётчик +1, повторные отклонены.</li>
 * </ul>
 */
public class VotingSystemServiceB {

    public String createPoll(String question, java.util.List<String> options, java.time.LocalDateTime endDate) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Потокобезопасный голос: один userId — один голос под гонкой. */
    public void vote(String userId, String pollId, int optionIndex) {
        throw new UnsupportedOperationException("TODO: variant B — one vote per user under contention");
    }

    public java.util.Map<Integer, Long> getResults(String pollId) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        System.out.println("=== VotingSystemServiceB (двойной голос): Smoke ===");
    }
}
