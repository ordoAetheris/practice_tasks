package com.practice.task52_transaction_log;

/**
 * ТРАНЗАКЦ-ЛОГ — ВАРИАНТ B: RECOVERY (replay WAL)
 *
 * <p>CORE = базовый {@link TransactionLogService} (begin/addOperation/commit/rollback).</p>
 *
 * <p><b>ВАРИАНТ B — восстановление [prim: WAL, recovery]:</b></p>
 * <ul>
 *   <li>После «краха» восстановить состояние повтором лога: применить только COMMITTED, откатить незавершённые.</li>
 *   <li>Идемпотентный replay (повторное восстановление даёт то же состояние).</li>
 *   <li>Проверка: begin→addOp (без commit) + краш → recovery откатывает; commit + краш → recovery применяет.</li>
 * </ul>
 */
public class TransactionLogServiceB {
    public void recover(){ throw new UnsupportedOperationException("TODO: variant B — replay WAL (commit-apply / uncommitted-rollback)"); }
    public static void main(String[] a){ System.out.println("=== TransactionLogServiceB (recovery/WAL): Smoke ==="); }
}
