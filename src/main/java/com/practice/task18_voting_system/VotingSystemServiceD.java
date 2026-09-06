package com.practice.task18_voting_system;

/**
 * ГОЛОСОВАНИЕ — ВАРИАНТ D: ИДЕМПОТЕНТНЫЙ ГОЛОС
 *
 * <p>CORE = базовый {@link VotingSystemService}.</p>
 *
 * <p><b>ВАРИАНТ D — идемпотентность [prim: idempotency ⭐]:</b></p>
 * <ul>
 *   <li>Повторный vote тем же userId (ретрай/двойной клик) — no-op, результат не меняется.</li>
 *   <li>Опционально: разрешить смену выбора (revote) — тогда зафиксировать правило и держать инвариант «одна запись на юзера».</li>
 *   <li>Проверка: vote дважды одним userId → счётчик +1; при revote — старая опция −1, новая +1.</li>
 * </ul>
 */
public class VotingSystemServiceD {

    public String createPoll(String question, java.util.List<String> options, java.time.LocalDateTime endDate) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Идемпотентный голос: повтор тем же userId — no-op. */
    public void vote(String userId, String pollId, int optionIndex) {
        throw new UnsupportedOperationException("TODO: variant D — idempotent vote");
    }

    public static void main(String[] args) {
        System.out.println("=== VotingSystemServiceD (идемпотентный голос): Smoke ===");
    }
}
