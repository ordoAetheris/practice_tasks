package com.practice.task41_cron_parser;

import java.time.LocalDateTime;

/**
 * CRON — ВАРИАНТ D: РЕКУРСИЯ → ИТЕРАТИВНО
 *
 * <p>CORE = базовый {@link CronParserService}.</p>
 *
 * <p><b>ВАРИАНТ D — итеративный поиск следующего запуска [prim: iterative-stack ⭐]:</b></p>
 * <ul>
 *   <li>getNextExecution без рекурсивного «попробуй, не подошло — рекурсивно дальше»: итеративно инкрементировать
 *       время по полям (от старшего к младшему), проверяя совпадение — без риска глубокой рекурсии.</li>
 *   <li>Раскрытие диапазонов/шагов в множества значений — тоже итеративно.</li>
 *   <li>Проверка: next для редкого выражения (29 февраля) находится за конечное число итераций без переполнения стека.</li>
 * </ul>
 */
public class CronParserServiceD {

    public LocalDateTime getNextExecution(String cronExpression, LocalDateTime from) {
        throw new UnsupportedOperationException("TODO: variant D — iterative next-time search");
    }

    public static void main(String[] args) { System.out.println("=== CronParserServiceD (итеративно): Smoke ==="); }
}
