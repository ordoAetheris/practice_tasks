package com.practice.task12_bank_account;

/**
 * СЧЁТ — ВАРИАНТ C: LOCK-ORDERING ПРИ ПЕРЕВОДЕ (anti-deadlock)
 *
 * <p>CORE = базовый {@link BankAccountService}.</p>
 *
 * <p><b>ВАРИАНТ C — порядок захвата локов [prim: lock-ordering ⭐]:</b></p>
 * <ul>
 *   <li>transfer(A→B) и transfer(B→A) одновременно, если лочить «сначала from, потом to»,
 *       дают классический deadlock.</li>
 *   <li>ЗАДАЧА: захватывать локи двух счетов в ЕДИНОМ глобальном порядке (по id/hash),
 *       перевод атомарен и без взаимоблокировки.</li>
 *   <li>Проверка: два потока гоняют встречные переводы в цикле → без зависания; сумма балансов инвариант.</li>
 * </ul>
 */
public class BankAccountServiceC {

    public String createAccount(String ownerName) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Перевод с захватом локов обоих счетов в едином порядке (анти-deadlock), атомарно. */
    public void transfer(String fromId, String toId, double amount) {
        throw new UnsupportedOperationException("TODO: variant C — consistent lock ordering");
    }

    public double getBalance(String accountId) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        System.out.println("=== BankAccountServiceC (lock-ordering перевод): Smoke ===");
    }
}
