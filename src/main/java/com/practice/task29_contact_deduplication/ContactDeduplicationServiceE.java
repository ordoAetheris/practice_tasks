package com.practice.task29_contact_deduplication;

/**
 * ДЕДУП КОНТАКТОВ — ВАРИАНТ E: EDGE / НОРМАЛИЗАЦИЯ
 *
 * <p>CORE = базовый {@link ContactDeduplicationService}.</p>
 *
 * <p><b>ВАРИАНТ E — edge/null-safety [prim: null-edge ⭐, normalization]:</b></p>
 * <ul>
 *   <li>Пустые/частичные поля (нет email, нет phone), один контакт, дубли по РАЗНЫМ ключам.</li>
 *   <li>Нормализация перед сравнением: email lower/trim, phone → только цифры, регистр имени.</li>
 *   <li>Проверка: "+7 (999) 000" и "79990000..." — один телефон; пустой email не матчит другой пустой.</li>
 * </ul>
 */
public class ContactDeduplicationServiceE {

    public ContactDeduplicationService.Contact addContact(String firstName, String lastName, String email, String phone, String address) {
        throw new UnsupportedOperationException("TODO: variant E — normalization + edge dedup");
    }

    public static void main(String[] args) {
        System.out.println("=== ContactDeduplicationServiceE (edge/нормализация): Smoke ===");
    }
}
