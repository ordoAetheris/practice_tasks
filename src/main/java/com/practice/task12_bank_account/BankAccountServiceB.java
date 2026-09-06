package com.practice.task12_bank_account;

/**
 * СЧЁТ — ВАРИАНТ B: LOST UPDATE (гонка deposit/withdraw)
 *
 * <p>CORE = базовый {@link BankAccountService} (та же модель Account/Transaction).</p>
 *
 * <p><b>ВАРИАНТ B — потеря обновления [prim: mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>Наивное «прочитал balance → посчитал → записал» под конкурентными deposit/withdraw
 *       теряет часть операций (lost update).</li>
 *   <li>ЗАДАЧА: сделать изменение баланса атомарным (лок на счёт / atomic-число).</li>
 *   <li>Проверка: K потоков × deposit(+1) и K × withdraw(-1) → итог == старт; сумма операций сходится.</li>
 * </ul>
 */
public class BankAccountServiceB {

    public String createAccount(String ownerName) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Потокобезопасное пополнение без lost-update. */
    public void deposit(String accountId, double amount) {
        throw new UnsupportedOperationException("TODO: variant B — atomic balance update");
    }

    /** Потокобезопасное снятие без lost-update; нельзя уйти в минус. */
    public void withdraw(String accountId, double amount) {
        throw new UnsupportedOperationException("TODO: variant B — atomic balance update");
    }

    public double getBalance(String accountId) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        System.out.println("=== BankAccountServiceB (lost update): Smoke ===");
    }
}
