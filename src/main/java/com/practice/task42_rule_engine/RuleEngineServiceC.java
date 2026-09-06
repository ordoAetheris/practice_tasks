package com.practice.task42_rule_engine;

import java.util.Map;

/**
 * ПРАВИЛА — ВАРИАНТ C: EDGE / НЕВАЛИД
 *
 * <p>CORE = базовый {@link RuleEngineService}.</p>
 *
 * <p><b>ВАРИАНТ C — edge/null-safety [prim: null-edge ⭐]:</b></p>
 * <ul>
 *   <li>Отсутствующий факт (нет ключа), null-значение факта, несовместимые типы (строка vs число).</li>
 *   <li>Пустой набор правил, ни одно не сработало, дублирующиеся id правил.</li>
 *   <li>Проверка: отсутствующий факт не роняет движок (правило не матчится, а не NPE); типы приводятся/отклоняются осознанно.</li>
 * </ul>
 */
public class RuleEngineServiceC {

    public java.util.List<String> evaluate(Map<String, Object> facts) {
        throw new UnsupportedOperationException("TODO: variant C — missing/null facts, type edges");
    }

    public static void main(String[] args) { System.out.println("=== RuleEngineServiceC (edge/невалид): Smoke ==="); }
}
