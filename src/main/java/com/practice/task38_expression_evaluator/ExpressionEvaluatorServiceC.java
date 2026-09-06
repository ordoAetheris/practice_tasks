package com.practice.task38_expression_evaluator;

/**
 * ВЫРАЖЕНИЯ — ВАРИАНТ C: EDGE / НЕВАЛИД / DIV-0
 *
 * <p>CORE = базовый {@link ExpressionEvaluatorService}.</p>
 *
 * <p><b>ВАРИАНТ C — edge/типизированные ошибки [prim: null-edge ⭐, typed-errors]:</b></p>
 * <ul>
 *   <li>Несбалансированные скобки, лишние/недостающие операнды, пустой ввод, двойные операторы.</li>
 *   <li>Деление на ноль → внятная ошибка (не Infinity/NaN втихую).</li>
 *   <li>Различать классы ошибок (лексическая/синтаксическая/вычислительная) — не общий RuntimeException.</li>
 *   <li>Проверка: таблица невалидных выражений даёт ожидаемый тип ошибки; "1/0" — ArithmeticException/своя.</li>
 * </ul>
 */
public class ExpressionEvaluatorServiceC {

    public double evaluate(String expression) {
        throw new UnsupportedOperationException("TODO: variant C — edge/invalid/div-0 typed errors");
    }

    public static void main(String[] args) {
        System.out.println("=== ExpressionEvaluatorServiceC (edge/div0): Smoke ===");
    }
}
