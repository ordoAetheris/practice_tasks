package com.practice.task22_quiz_engine;

/**
 * КВИЗ — ВАРИАНТ C: АТОМАРНОЕ ЗАВЕРШЕНИЕ ПОПЫТКИ
 *
 * <p>CORE = базовый {@link QuizEngineService}.</p>
 *
 * <p><b>ВАРИАНТ C — атомарный переход [prim: atomicity, CAS, FSM]:</b></p>
 * <ul>
 *   <li>finishAttempt переводит попытку IN_PROGRESS→FINISHED ровно один раз (CAS), балл считается однажды.</li>
 *   <li>Проверка: два параллельных finishAttempt → один посчитанный балл, второй возвращает тот же результат/отказ.</li>
 * </ul>
 */
public class QuizEngineServiceC {

    public QuizEngineService.QuizAttempt finishAttempt(String attemptId) {
        throw new UnsupportedOperationException("TODO: variant C — atomic finish (CAS IN_PROGRESS->FINISHED)");
    }

    public static void main(String[] args) {
        System.out.println("=== QuizEngineServiceC (atomic finish): Smoke ===");
    }
}
