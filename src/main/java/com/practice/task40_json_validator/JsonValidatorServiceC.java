package com.practice.task40_json_validator;

/**
 * JSON — ВАРИАНТ C: EDGE / НЕВАЛИД
 *
 * <p>CORE = базовый {@link JsonValidatorService}.</p>
 *
 * <p><b>ВАРИАНТ C — edge/невалид [prim: null-edge ⭐]:</b></p>
 * <ul>
 *   <li>Незакрытые скобки/кавычки, trailing comma, дубли ключей, ведущие нули, битые escape-последовательности.</li>
 *   <li>Пустой ввод, только пробелы, голое значение (не объект/массив) — зафиксировать, валидно или нет.</li>
 *   <li>Проверка: таблица невалидных JSON → false с внятной позицией ошибки; валидные → true.</li>
 * </ul>
 */
public class JsonValidatorServiceC {

    public boolean validate(String json) {
        throw new UnsupportedOperationException("TODO: variant C — edge/invalid detection");
    }

    public static void main(String[] args) {
        System.out.println("=== JsonValidatorServiceC (edge/невалид): Smoke ===");
    }
}
