package com.practice.task29_contact_deduplication;

/**
 * ДЕДУП КОНТАКТОВ — ВАРИАНТ D: MERGE-СТРАТЕГИЯ
 *
 * <p>CORE = базовый {@link ContactDeduplicationService}.</p>
 *
 * <p><b>ВАРИАНТ D — стратегия слияния [prim: strategy, open-closed]:</b></p>
 * <ul>
 *   <li>При merge дублей — правило, какое поле побеждает (непустое; более свежее; более длинное; предпочесть источник).</li>
 *   <li>Стратегия вынесена (интерфейс/функция), легко заменить — не хардкод в merge.</li>
 *   <li>Проверка: merge двух контактов по стратегии «непустое побеждает» / «свежее побеждает» даёт ожидаемый результат.</li>
 * </ul>
 */
public class ContactDeduplicationServiceD {

    /** Стратегия слияния полей двух дублей. */
    public interface MergeStrategy {
        ContactDeduplicationService.Contact merge(ContactDeduplicationService.Contact a, ContactDeduplicationService.Contact b);
    }

    public ContactDeduplicationService.Contact merge(long contactId1, long contactId2, MergeStrategy strategy) {
        throw new UnsupportedOperationException("TODO: variant D — pluggable merge strategy");
    }

    public static void main(String[] args) {
        System.out.println("=== ContactDeduplicationServiceD (merge-стратегия): Smoke ===");
    }
}
