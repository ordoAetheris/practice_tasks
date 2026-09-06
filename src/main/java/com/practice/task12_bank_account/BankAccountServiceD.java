package com.practice.task12_bank_account;

/**
 * СЧЁТ — ВАРИАНТ D: ИДЕМПОТЕНТНАЯ ТРАНЗАКЦИЯ (txnId)
 *
 * <p>CORE = базовый {@link BankAccountService}.</p>
 *
 * <p><b>ВАРИАНТ D — идемпотентность [prim: idempotency ⭐, dedup]:</b></p>
 * <ul>
 *   <li>transfer с txnId: ретрай с тем же txnId НЕ должен применить перевод дважды.</li>
 *   <li>Под гонкой двух одинаковых txnId — ровно одно применение.</li>
 *   <li>Проверка: transfer(txnId) дважды → баланс изменился один раз; журнал содержит одну запись txnId.</li>
 * </ul>
 */
public class BankAccountServiceD {

    public String createAccount(String ownerName) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Идемпотентный перевод по txnId: повтор с тем же txnId — no-op, вернуть прежний результат. */
    public void transfer(String txnId, String fromId, String toId, double amount) {
        throw new UnsupportedOperationException("TODO: variant D — idempotent transfer by txnId");
    }

    public double getBalance(String accountId) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        System.out.println("=== BankAccountServiceD (идемпотентная txn): Smoke ===");
    }
}
