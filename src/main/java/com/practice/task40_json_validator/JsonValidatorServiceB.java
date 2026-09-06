package com.practice.task40_json_validator;

import java.util.Map;

/**
 * JSON — ВАРИАНТ B: РАСШИРЯЕМОСТЬ (strategy валидаторов)
 *
 * <p>CORE = базовый {@link JsonValidatorService} (validate(json) / parse(json)).</p>
 *
 * <p><b>ВАРИАНТ B — правила как стратегии [prim: strategy, open-closed]:</b></p>
 * <ul>
 *   <li>Валидаторы полей (required, type, min/max, regex) регистрируются и композируются, без правки ядра.</li>
 *   <li>Проверка схемы = набор правил; добавление правила не трогает парсер.</li>
 *   <li>Проверка: зарегистрировал правило "age: int &gt;= 0" → невалидный age отлавливается.</li>
 * </ul>
 */
public class JsonValidatorServiceB {

    public interface Rule {
        boolean check(Object value);
    }

    public java.util.List<String> validateSchema(String json, Map<String, Rule> rules) {
        throw new UnsupportedOperationException("TODO: variant B — pluggable field rules");
    }

    public static void main(String[] args) {
        System.out.println("=== JsonValidatorServiceB (strategy): Smoke ===");
    }
}
