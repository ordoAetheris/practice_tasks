package com.practice.task22_quiz_engine;

/**
 * КВИЗ — ВАРИАНТ E: ГРАНУЛЯРНЫЙ ЛОК НА ПОПЫТКУ
 *
 * <p>CORE = базовый {@link QuizEngineService}.</p>
 *
 * <p><b>ВАРИАНТ E — гранулярность [prim: striping]:</b></p>
 * <ul>
 *   <li>Лок на конкретную попытку: разные попытки/пользователи проходят квиз параллельно.</li>
 *   <li>Проверка: N попыток разных юзеров идут параллельно без общей сериализации.</li>
 * </ul>
 */
public class QuizEngineServiceE {

    public void answer(String attemptId, String questionId, int optionIndex) {
        throw new UnsupportedOperationException("TODO: variant E — per-attempt lock striping");
    }

    public static void main(String[] args) {
        System.out.println("=== QuizEngineServiceE (granular lock): Smoke ===");
    }
}
