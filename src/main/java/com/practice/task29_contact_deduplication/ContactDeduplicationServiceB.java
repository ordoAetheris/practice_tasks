package com.practice.task29_contact_deduplication;

/**
 * ДЕДУП КОНТАКТОВ — ВАРИАНТ B: ОКНО TTL
 *
 * <p>CORE = базовый {@link ContactDeduplicationService} (та же модель Contact).</p>
 *
 * <p><b>ВАРИАНТ B — дедуп в окне [prim: per-key-eviction, idempotency]:</b></p>
 * <ul>
 *   <li>Считать дублем только контакты, добавленные в пределах окна (например, 24ч): ключ дедупа + TTL.</li>
 *   <li>Старые записи ключей вычищаются (карта не растёт бесконечно).</li>
 *   <li>Проверка: дубль в окне ловится; за пределами окна — уже не считается дублем.</li>
 * </ul>
 */
public class ContactDeduplicationServiceB {

    public ContactDeduplicationService.Contact addContact(String firstName, String lastName, String email, String phone, String address) {
        throw new UnsupportedOperationException("TODO: variant B — dedup within TTL window");
    }

    public static void main(String[] args) {
        System.out.println("=== ContactDeduplicationServiceB (окно TTL): Smoke ===");
    }
}
