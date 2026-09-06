package com.practice.task40_json_validator;

/**
 * JSON — ВАРИАНТ E: ВЛОЖЕННОСТЬ / ТИПЫ ЗНАЧЕНИЙ
 *
 * <p>CORE = базовый {@link JsonValidatorService}.</p>
 *
 * <p><b>ВАРИАНТ E — специфика домена [prim: parsing, types]:</b></p>
 * <ul>
 *   <li>Полный разбор в дерево: объект→Map, массив→List, строка/число/boolean/null → соответствующие типы.</li>
 *   <li>Числа (int/double/экспонента), unicode-escape \\uXXXX, вложенные структуры любой глубины.</li>
 *   <li>Проверка: parse даёт корректно типизированное дерево; значения по пути извлекаются правильного типа.</li>
 * </ul>
 */
public class JsonValidatorServiceE {

    public Object parse(String json) {
        throw new UnsupportedOperationException("TODO: variant E — full typed parse (nesting/types)");
    }

    public static void main(String[] args) {
        System.out.println("=== JsonValidatorServiceE (вложенность/типы): Smoke ===");
    }
}
