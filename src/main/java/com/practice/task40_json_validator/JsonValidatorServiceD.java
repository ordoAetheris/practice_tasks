package com.practice.task40_json_validator;

/**
 * JSON — ВАРИАНТ D: ИТЕРАТИВНЫЙ ПАРСЕР (явный стек)
 *
 * <p>CORE = базовый {@link JsonValidatorService}.</p>
 *
 * <p><b>ВАРИАНТ D — итеративный разбор [prim: iterative-stack ⭐]:</b></p>
 * <ul>
 *   <li>Проверка вложенности через ЯВНЫЙ стек скобок ({ [ ), а не рекурсию — анти-StackOverflow
 *       на глубоко вложенном JSON.</li>
 *   <li>Стек контекстов (в объекте ждём ключ/двоеточие/значение; в массиве — значение/запятую).</li>
 *   <li>Проверка: JSON глубиной 100000 уровней валидируется без переполнения стека.</li>
 * </ul>
 */
public class JsonValidatorServiceD {

    public boolean validate(String json) {
        throw new UnsupportedOperationException("TODO: variant D — iterative stack-based validation");
    }

    public static void main(String[] args) {
        System.out.println("=== JsonValidatorServiceD (итеративный стек): Smoke ===");
    }
}
