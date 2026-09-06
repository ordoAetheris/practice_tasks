package com.practice.task92_value_object_contracts;

/**
 * КОНТРАКТЫ VALUE-ОБЪЕКТА: equals / hashCode / Comparable / сериализация / defensive copy
 *
 * <p>Контекст: техническая секция Яндекс/Сбер спрашивает это ПОСТОЯННО (СВЕРЕНО:
 * Хабр 995600 — «найди 8 багов в классе Person» с equals/hashCode/Serializable/clone;
 * ты уже ловил follow-up по hashCode на Яндексе). Формат на собесе часто — code-review:
 * дают класс с багами, просят найти и объяснить каждый. Здесь ты реализуешь ПРАВИЛЬНО,
 * а в test_hints перечислены классические баги, которые надо не допустить и уметь объяснить.</p>
 *
 * <p>Задача: реализовать неизменяемый (immutable) value-класс {@code Person} так, чтобы он
 * корректно жил в {@code HashSet}/{@code HashMap} (как ключ) и в {@code TreeSet}/{@code TreeMap}.</p>
 *
 * <p>Поля: {@code firstName}, {@code lastName}, {@code birthYear}, {@code emails} (список).</p>
 *
 * <p>Реализовать:</p>
 * <ul>
 *   <li>{@code equals(Object)} — по значимым полям, с корректной проверкой типа и null.</li>
 *   <li>{@code hashCode()} — согласован с equals (equal объекты → равный hash).</li>
 *   <li>{@code Comparable<Person>} — упорядочивание (lastName, потом firstName, потом birthYear),
 *       согласованное с equals (compareTo==0 ⇔ equals==true — иначе TreeSet «потеряет» элементы).</li>
 *   <li>Неизменяемость: поля {@code final}, defensive copy списка {@code emails} в конструкторе И в геттере.</li>
 *   <li>{@code toString()} — читаемый.</li>
 *   <li>(опц.) корректная сериализация: {@code Serializable} + осмысленный {@code serialVersionUID}.</li>
 * </ul>
 *
 * <p>Уровень: Средний (главное — контракты и умение объяснить каждый баг).</p>
 */
public final class Person {

    // TODO: объявить final-поля: firstName, lastName, birthYear, emails (List<String>)

    /**
     * Создаёт Person. Делает defensive copy списка emails (внешний список не должен
     * влиять на состояние объекта).
     *
     * @throws IllegalArgumentException если обязательные поля null/пустые
     */
    public Person(String firstName, String lastName, int birthYear, java.util.List<String> emails) {
        // TODO: implement (валидация + defensive copy emails)
    }

    // TODO: геттеры (для emails — возвращать неизменяемую копию/view, не внутренний список)

    // TODO: equals(Object) — по значимым полям, instanceof/getClass, null-safe

    // TODO: hashCode() — согласован с equals

    // TODO: compareTo(Person) — согласован с equals (lastName, firstName, birthYear)

    // TODO: toString()

    public static void main(String[] args) {
        System.out.println("=== Person contracts: Smoke Test ===");
        // TODO: положить одинаковые по значению Person в HashSet → размер 1;
        //       положить в TreeSet → порядок корректный, дубликат по значению не задваивается.
    }
}
