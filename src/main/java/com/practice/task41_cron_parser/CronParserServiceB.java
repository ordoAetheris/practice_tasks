package com.practice.task41_cron_parser;

/**
 * CRON — ВАРИАНТ B: РАСШИРЯЕМОСТЬ (strategy)
 *
 * <p>CORE = базовый {@link CronParserService} (parse/getNextExecution/isMatch cron-выражений).</p>
 *
 * <p><b>ВАРИАНТ B — открытость к расширению [prim: strategy, open-closed]:</b></p>
 * <ul>
 *   <li>Псевдонимы (@daily, @hourly, @weekly) и кастомные поля добавляются регистрацией, без правки ядра.</li>
 *   <li>Парсер поля = стратегия (диапазон/список/шаг/алиас); легко добавить новый тип поля.</li>
 *   <li>Проверка: зарегистрировал @daily → эквивалент "0 0 * * *"; ядро не менялось.</li>
 * </ul>
 */
public class CronParserServiceB {

    public void registerAlias(String alias, String expansion) {
        throw new UnsupportedOperationException("TODO: variant B — pluggable aliases/field parsers");
    }

    public Object parse(String cronExpression) {
        throw new UnsupportedOperationException("TODO: variant B");
    }

    public static void main(String[] args) { System.out.println("=== CronParserServiceB (strategy): Smoke ==="); }
}
