package com.practice.task22_quiz_engine;

/**
 * КВИЗ — ВАРИАНТ D: ИДЕМПОТЕНТНЫЙ ОТВЕТ/ЗАВЕРШЕНИЕ
 *
 * <p>CORE = базовый {@link QuizEngineService}.</p>
 *
 * <p><b>ВАРИАНТ D — идемпотентность [prim: idempotency ⭐]:</b></p>
 * <ul>
 *   <li>Повторный answer на тот же вопрос — перезапись, не второй засчёт; повторный finish — тот же результат.</li>
 *   <li>Проверка: answer дважды на один questionId → один учтённый ответ; finish дважды → один балл.</li>
 * </ul>
 */
public class QuizEngineServiceD {

    public void answer(String attemptId, String questionId, int optionIndex) {
        throw new UnsupportedOperationException("TODO: variant D — idempotent answer");
    }

    public static void main(String[] args) {
        System.out.println("=== QuizEngineServiceD (идемпотентный ответ): Smoke ===");
    }
}
