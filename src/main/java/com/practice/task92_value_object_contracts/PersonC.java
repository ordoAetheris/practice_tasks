package com.practice.task92_value_object_contracts;

import java.util.List;

/**
 * VALUE OBJECT — ВАРИАНТ C: BUILDER
 *
 * <p>CORE = базовый {@link Person}.</p>
 *
 * <p><b>ВАРИАНТ C — билдер [prim: builder, validation]:</b></p>
 * <ul>
 *   <li>Builder с обязательными/опциональными полями; валидация в build() (год рождения разумный, email формат), затем immutable объект.</li>
 *   <li>Читаемое конструирование без телескопических конструкторов.</li>
 *   <li>Проверка: build() с невалидными данными бросает; корректный build даёт immutable Person.</li>
 * </ul>
 */
public final class PersonC {
    private PersonC(){ throw new UnsupportedOperationException("TODO"); }
    public static final class Builder {
        public Builder firstName(String v){ throw new UnsupportedOperationException("TODO"); }
        public Builder lastName(String v){ throw new UnsupportedOperationException("TODO"); }
        public Builder birthYear(int v){ throw new UnsupportedOperationException("TODO"); }
        public Builder emails(List<String> v){ throw new UnsupportedOperationException("TODO"); }
        public PersonC build(){ throw new UnsupportedOperationException("TODO: variant C — validate then build immutable"); }
    }
    public static void main(String[] a){ System.out.println("=== PersonC (builder): Smoke ==="); }
}
