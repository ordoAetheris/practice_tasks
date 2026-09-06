package com.practice.task18_voting_system;

/**
 * ГОЛОСОВАНИЕ — ВАРИАНТ E: THREAD-SAFE ПОДСЧЁТ / ГРАНУЛЯРНЫЕ СЧЁТЧИКИ
 *
 * <p>CORE = базовый {@link VotingSystemService}.</p>
 *
 * <p><b>ВАРИАНТ E — конкурентный tally [prim: striping, atomicity]:</b></p>
 * <ul>
 *   <li>Голоса за РАЗНЫЕ опции инкрементятся параллельно (атомарные счётчики на опцию, не общий лок).</li>
 *   <li>getResults даёт согласованный снимок под конкурентными голосами (без «рваного» чтения).</li>
 *   <li>Проверка: массовое голосование по всем опциям → сумма счётчиков == числу принятых голосов.</li>
 * </ul>
 */
public class VotingSystemServiceE {

    public String createPoll(String question, java.util.List<String> options, java.time.LocalDateTime endDate) {
        throw new UnsupportedOperationException("TODO");
    }

    public void vote(String userId, String pollId, int optionIndex) {
        throw new UnsupportedOperationException("TODO: variant E — per-option atomic counters");
    }

    /** Согласованный снимок результатов под конкурентными голосами. */
    public java.util.Map<Integer, Long> getResults(String pollId) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        System.out.println("=== VotingSystemServiceE (thread-safe tally): Smoke ===");
    }
}
