package com.practice.task41_cron_parser;

import java.time.LocalDateTime;

/**
 * CRON — ВАРИАНТ E: ДИАПАЗОНЫ / ШАГИ / СПИСКИ (специфика)
 *
 * <p>CORE = базовый {@link CronParserService}.</p>
 *
 * <p><b>ВАРИАНТ E — специфика домена [prim: parsing]:</b></p>
 * <ul>
 *   <li>Полная семантика полей: диапазоны (1-5), шаги (*\/15, 10-30\/5), списки (1,3,5), '*', '?'.</li>
 *   <li>Взаимодействие day-of-month и day-of-week (OR-семантика в Unix cron); границы месяцев.</li>
 *   <li>Проверка: isMatch на наборе дат для сложного выражения совпадает с эталоном.</li>
 * </ul>
 */
public class CronParserServiceE {

    public boolean isMatch(String cronExpression, LocalDateTime dateTime) {
        throw new UnsupportedOperationException("TODO: variant E — ranges/steps/lists + dom/dow semantics");
    }

    public static void main(String[] args) { System.out.println("=== CronParserServiceE (диапазоны/шаги): Smoke ==="); }
}
