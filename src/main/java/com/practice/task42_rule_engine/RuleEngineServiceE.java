package com.practice.task42_rule_engine;

import java.util.Map;

/**
 * ПРАВИЛА — ВАРИАНТ E: КОМПОЗИЦИЯ / ПРИОРИТЕТ (специфика)
 *
 * <p>CORE = базовый {@link RuleEngineService}.</p>
 *
 * <p><b>ВАРИАНТ E — специфика домена [prim: composition, priority]:</b></p>
 * <ul>
 *   <li>Приоритет правил (salience): при конфликте срабатывает более приоритетное; порядок результата детерминирован.</li>
 *   <li>Композиция: правило может ссылаться на группу условий; first-match vs all-match режимы.</li>
 *   <li>Проверка: набор конкурирующих правил даёт результат в порядке приоритета; first-match возвращает верхнее.</li>
 * </ul>
 */
public class RuleEngineServiceE {

    public java.util.Optional<String> evaluateFirst(Map<String, Object> facts) {
        throw new UnsupportedOperationException("TODO: variant E — priority/salience + composition");
    }

    public static void main(String[] args) { System.out.println("=== RuleEngineServiceE (композиция/приоритет): Smoke ==="); }
}
