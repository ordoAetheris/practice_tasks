package com.practice.task38_expression_evaluator;

import java.util.*;

/**
 * ВЫЧИСЛИТЕЛЬ МАТЕМАТИЧЕСКИХ ВЫРАЖЕНИЙ
 *
 * <p>Реализуйте калькулятор, который принимает строку с математическим выражением
 * и вычисляет результат. Поддерживаются стандартные арифметические операции,
 * скобки и унарный минус.</p>
 *
 * <p>Поддерживаемые операции:</p>
 * <ul>
 *   <li>+ (сложение)</li>
 *   <li>- (вычитание)</li>
 *   <li>* (умножение)</li>
 *   <li>/ (деление)</li>
 *   <li>() (скобки для изменения приоритета)</li>
 *   <li>Унарный минус: -5, -(3+2)</li>
 * </ul>
 *
 * <p>Примеры:</p>
 * <ul>
 *   <li>"2 + 3 * 4" = 14.0</li>
 *   <li>"(2 + 3) * 4" = 20.0</li>
 *   <li>"-5 + 3" = -2.0</li>
 *   <li>"10 / (2 + 3)" = 2.0</li>
 *   <li>"2.5 * 4" = 10.0</li>
 * </ul>
 *
 * <p>Бизнес-правила:</p>
 * <ul>
 *   <li>Деление на ноль — выбросить ArithmeticException</li>
 *   <li>Стандартный приоритет операций: * и / выше + и -</li>
 *   <li>Пробелы в выражении игнорируются</li>
 *   <li>Некорректное выражение — выбросить IllegalArgumentException</li>
 * </ul>
 *
 * <p>Рекомендуемый подход: алгоритм Shunting Yard (Дейкстры) или рекурсивный спуск.</p>
 *
 * <p>Уровень: Средний</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task38_expression_evaluator/ExpressionEvaluatorService.java
 * java -cp src/main/java com.practice.task38_expression_evaluator.ExpressionEvaluatorService
 * </pre>
 */
public class ExpressionEvaluatorService {

    /**
     * Вычисляет значение математического выражения.
     *
     * @param expression строка с выражением (например "2 + 3 * 4")
     * @return результат вычисления
     * @throws IllegalArgumentException если выражение некорректно (пустое, несбалансированные скобки и т.д.)
     * @throws ArithmeticException      при делении на ноль
     */
    public double evaluate(String expression) {
        // TODO: implement
        return 0.0;
    }

    public static void main(String[] args) {
        System.out.println("=== ExpressionEvaluatorService: Smoke Test ===");
        // TODO: создать тестовые данные и проверить основные сценарии
    }
}
