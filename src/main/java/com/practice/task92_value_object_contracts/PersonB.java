package com.practice.task92_value_object_contracts;

import java.util.List;

/**
 * VALUE OBJECT — ВАРИАНТ B: IMMUTABILITY
 *
 * <p>CORE = базовый {@link Person} (equals/hashCode/Comparable контракты).</p>
 *
 * <p><b>ВАРИАНТ B — неизменяемость [prim: immutability, defensive-copy]:</b></p>
 * <ul>
 *   <li>Полностью immutable: final-поля, НЕТ сеттеров, защитная копия изменяемых аргументов (List emails) в конструкторе И в геттере (или unmodifiable).</li>
 *   <li>Проверка: изменение исходного списка после создания НЕ меняет объект; геттер не даёт мутировать внутренний список.</li>
 * </ul>
 */
public final class PersonB {
    public PersonB(String firstName, String lastName, int birthYear, List<String> emails){ throw new UnsupportedOperationException("TODO: variant B — defensive copies, no setters"); }
    public List<String> emails(){ throw new UnsupportedOperationException("TODO: variant B — return unmodifiable/copy"); }
    public static void main(String[] a){ System.out.println("=== PersonB (immutability): Smoke ==="); }
}
