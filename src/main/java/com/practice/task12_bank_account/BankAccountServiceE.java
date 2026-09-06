package com.practice.task12_bank_account;

/**
 * СЧЁТ — ВАРИАНТ E: ОПТИМИСТИЧНАЯ БЛОКИРОВКА (version + CAS + retry)
 *
 * <p>CORE = базовый {@link BankAccountService}.</p>
 *
 * <p><b>ВАРИАНТ E — оптимистичная версия [prim: CAS, optimistic-lock]:</b></p>
 * <ul>
 *   <li>У счёта есть version. Изменение: прочитать (balance,version) → посчитать →
 *       CAS применить только если version не изменилась; иначе перечитать и повторить.</li>
 *   <li>Без блокировок в счастливом пути; корректно под конкурентой (retry-петля).</li>
 *   <li>Проверка: K потоков конкурентно меняют баланс через CAS → итог верен, версия += число успешных операций.</li>
 * </ul>
 */
public class BankAccountServiceE {

    public String createAccount(String ownerName) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Снятие через оптимистичную версию: CAS(balance,version), при конфликте — retry. */
    public void withdraw(String accountId, double amount) {
        throw new UnsupportedOperationException("TODO: variant E — optimistic version CAS + retry");
    }

    public long getVersion(String accountId) {
        throw new UnsupportedOperationException("TODO");
    }

    public double getBalance(String accountId) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        System.out.println("=== BankAccountServiceE (optimistic version): Smoke ===");
    }
}
