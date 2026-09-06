package com.practice.task42_rule_engine;

import java.util.Map;

/**
 * ПРАВИЛА — ВАРИАНТ D: РЕКУРСИЯ → ИТЕРАТИВНО (дерево условий)
 *
 * <p>CORE = базовый {@link RuleEngineService}.</p>
 *
 * <p><b>ВАРИАНТ D — итеративный обход дерева условий [prim: iterative-stack ⭐]:</b></p>
 * <ul>
 *   <li>Вложенные AND/OR/NOT — это дерево; вычислять его ЯВНЫМ стеком, а не рекурсией (анти-переполнение
 *       на глубоко вложенных условиях).</li>
 *   <li>Короткое замыкание (short-circuit) AND/OR сохраняется при итеративном обходе.</li>
 *   <li>Проверка: глубоко вложенное условие вычисляется без StackOverflow; short-circuit не ломается.</li>
 * </ul>
 */
public class RuleEngineServiceD {

    public java.util.List<String> evaluate(Map<String, Object> facts) {
        throw new UnsupportedOperationException("TODO: variant D — iterative condition-tree eval (explicit stack)");
    }

    public static void main(String[] args) { System.out.println("=== RuleEngineServiceD (итеративно): Smoke ==="); }
}
