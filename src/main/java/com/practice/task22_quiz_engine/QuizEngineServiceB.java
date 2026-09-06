package com.practice.task22_quiz_engine;

/**
 * КВИЗ — ВАРИАНТ B: ГОНКА НА ПОПЫТКЕ (concurrent answer/finish)
 *
 * <p>CORE = базовый {@link QuizEngineService} (та же модель Quiz/QuizAttempt).</p>
 *
 * <p><b>ВАРИАНТ B — доменная гонка [prim: mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>Конкурентные answer() и finishAttempt() одной попытки → гонка на состояние (ответы теряются
 *       или засчитываются после завершения).</li>
 *   <li>ЗАДАЧА: изменения попытки под защитой; после finish ответы не принимаются.</li>
 *   <li>Проверка: параллельные answer + finish → согласованный набор ответов и балл.</li>
 * </ul>
 */
public class QuizEngineServiceB {

    public void answer(String attemptId, String questionId, int optionIndex) {
        throw new UnsupportedOperationException("TODO: variant B — attempt state under lock");
    }

    public QuizEngineService.QuizAttempt finishAttempt(String attemptId) {
        throw new UnsupportedOperationException("TODO: variant B");
    }

    public static void main(String[] args) {
        System.out.println("=== QuizEngineServiceB (гонка на попытке): Smoke ===");
    }
}
