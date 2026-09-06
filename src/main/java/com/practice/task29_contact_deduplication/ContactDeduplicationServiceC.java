package com.practice.task29_contact_deduplication;

import java.util.List;

/**
 * ДЕДУП КОНТАКТОВ — ВАРИАНТ C: THREAD-SAFE
 *
 * <p>CORE = базовый {@link ContactDeduplicationService}.</p>
 *
 * <p><b>ВАРИАНТ C — потокобезопасность [prim: mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>Конкурентные addContact + findDuplicates не теряют контакты и дают согласованный результат.</li>
 *   <li>Индекс ключей дедупа обновляется атомарно.</li>
 *   <li>Проверка: K потоков addContact (часть — дубли) → размер и группы дублей корректны.</li>
 * </ul>
 */
public class ContactDeduplicationServiceC {

    public ContactDeduplicationService.Contact addContact(String firstName, String lastName, String email, String phone, String address) {
        throw new UnsupportedOperationException("TODO: variant C — thread-safe add + index");
    }

    public List<List<ContactDeduplicationService.Contact>> findDuplicates() {
        throw new UnsupportedOperationException("TODO: variant C");
    }

    public static void main(String[] args) {
        System.out.println("=== ContactDeduplicationServiceC (thread-safe): Smoke ===");
    }
}
