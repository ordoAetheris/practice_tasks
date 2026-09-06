package com.practice.task38_expression_evaluator;

/**
 * ВЫРАЖЕНИЯ — ВАРИАНТ E: ПРИОРИТЕТЫ + СКОБКИ + УНАРНЫЙ МИНУС
 *
 * <p>CORE = базовый {@link ExpressionEvaluatorService}.</p>
 *
 * <p><b>ВАРИАНТ E — специфика домена [prim: precedence, parsing]:</b></p>
 * <ul>
 *   <li>Полная таблица приоритетов и левой/правой ассоциативности; вложенные скобки любой глубины.</li>
 *   <li>Унарный минус/плюс (различать бинарный "-" и унарный "-3"); пробелы в любом месте.</li>
 *   <li>Проверка: "-3 + 2 * (1 - -4)" == корректному значению; приоритеты и унарный разобраны верно.</li>
 * </ul>
 */
public class ExpressionEvaluatorServiceE {

    public double evaluate(String expression) {
        throw new UnsupportedOperationException("TODO: variant E — precedence + parens + unary minus");
    }

    public static void main(String[] args) {
        System.out.println("=== ExpressionEvaluatorServiceE (приоритеты/унарный): Smoke ===");
    }
}
