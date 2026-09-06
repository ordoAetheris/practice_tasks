package com.practice.task42_rule_engine;

import java.util.Map;

/**
 * ПРАВИЛА — ВАРИАНТ B: РАСШИРЯЕМОСТЬ (strategy операторов)
 *
 * <p>CORE = базовый {@link RuleEngineService} (Rule + evaluate(facts)).</p>
 *
 * <p><b>ВАРИАНТ B — открытость к расширению [prim: strategy, open-closed]:</b></p>
 * <ul>
 *   <li>Операторы условий (eq, gt, lt, in, contains, regex) регистрируются и композируются, без правки ядра.</li>
 *   <li>Добавление нового оператора = регистрация функции, не switch в движке.</li>
 *   <li>Проверка: зарегистрировал оператор "between" → правило с ним срабатывает; ядро не тронуто.</li>
 * </ul>
 */
public class RuleEngineServiceB {

    public interface Operator {
        boolean apply(Object factValue, Object ruleValue);
    }

    public void registerOperator(String name, Operator op) {
        throw new UnsupportedOperationException("TODO: variant B — pluggable operators");
    }

    public java.util.List<String> evaluate(Map<String, Object> facts) {
        throw new UnsupportedOperationException("TODO: variant B");
    }

    public static void main(String[] args) { System.out.println("=== RuleEngineServiceB (strategy): Smoke ==="); }
}
