package com.practice.task41_cron_parser;

/**
 * CRON — ВАРИАНТ C: EDGE / НЕВАЛИД
 *
 * <p>CORE = базовый {@link CronParserService}.</p>
 *
 * <p><b>ВАРИАНТ C — edge/невалид [prim: null-edge ⭐, typed-errors]:</b></p>
 * <ul>
 *   <li>Неверное число полей, значения вне диапазона (минута 60, месяц 13), пустые/битые поля.</li>
 *   <li>Шаг с нулём (*\/0), диапазон в обратном порядке (5-1), список с дубликатами.</li>
 *   <li>Проверка: таблица невалидных выражений → внятная ошибка с указанием поля; валидные — ок.</li>
 * </ul>
 */
public class CronParserServiceC {

    public Object parse(String cronExpression) {
        throw new UnsupportedOperationException("TODO: variant C — validate fields/ranges/steps");
    }

    public static void main(String[] args) { System.out.println("=== CronParserServiceC (edge/невалид): Smoke ==="); }
}
