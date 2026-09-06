package com.practice.task38_expression_evaluator;

/**
 * ВЫРАЖЕНИЯ — ВАРИАНТ D: РЕКУРСИЯ → ИТЕРАТИВНО (два стека)
 *
 * <p>CORE = базовый {@link ExpressionEvaluatorService}.</p>
 *
 * <p><b>ВАРИАНТ D — итеративный разбор [prim: iterative-stack ⭐]:</b></p>
 * <ul>
 *   <li>Вместо рекурсивного спуска — итеративно через ДВА стека (значения + операторы), алгоритм
 *       сортировочной станции (shunting-yard) / вычисление на месте.</li>
 *   <li>Снимает риск StackOverflow на длинных/глубоко-вложенных выражениях.</li>
 *   <li>Проверка: очень длинная цепочка операций и глубокая вложенность скобок не роняют стек.</li>
 * </ul>
 */
public class ExpressionEvaluatorServiceD {

    public double evaluate(String expression) {
        throw new UnsupportedOperationException("TODO: variant D — iterative two-stack (shunting-yard)");
    }

    public static void main(String[] args) {
        System.out.println("=== ExpressionEvaluatorServiceD (итеративно, 2 стека): Smoke ===");
    }
}
