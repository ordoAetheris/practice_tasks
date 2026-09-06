package com.practice.task38_expression_evaluator;

/**
 * ВЫРАЖЕНИЯ — ВАРИАНТ B: РАСШИРЯЕМОСТЬ (strategy)
 *
 * <p>CORE = базовый {@link ExpressionEvaluatorService} (evaluate(expr) с +-*\/, скобками, приоритетами).</p>
 *
 * <p><b>ВАРИАНТ B — открытость к расширению [prim: strategy, open-closed]:</b></p>
 * <ul>
 *   <li>Новые операторы/функции (%, ^, min, max, abs) добавляются РЕГИСТРАЦИЕЙ, без правки ядра парсера.</li>
 *   <li>Оператор = (символ, приоритет, ассоциативность, бинарная функция); функция = (имя, арность, реализация).</li>
 *   <li>Проверка: зарегистрировал ^ (правая ассоц.) → 2^3^2==512; ядро не менялось.</li>
 * </ul>
 */
public class ExpressionEvaluatorServiceB {

    /** Зарегистрировать бинарный оператор с приоритетом и ассоциативностью. */
    public void registerOperator(char symbol, int precedence, boolean rightAssoc, java.util.function.DoubleBinaryOperator op) {
        throw new UnsupportedOperationException("TODO: variant B — pluggable operators");
    }

    public double evaluate(String expression) {
        throw new UnsupportedOperationException("TODO: variant B");
    }

    public static void main(String[] args) {
        System.out.println("=== ExpressionEvaluatorServiceB (strategy): Smoke ===");
    }
}
