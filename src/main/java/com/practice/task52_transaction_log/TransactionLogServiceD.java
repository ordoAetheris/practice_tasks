package com.practice.task52_transaction_log;

import java.util.Map;

/**
 * ТРАНЗАКЦ-ЛОГ — ВАРИАНТ D: EDGE
 *
 * <p>CORE = базовый {@link TransactionLogService}.</p>
 *
 * <p><b>ВАРИАНТ D — edge/null-safety [prim: null-edge ⭐]:</b></p>
 * <ul>
 *   <li>commit несуществующего/уже закоммиченного txId, rollback закоммиченного, addOperation после commit.</li>
 *   <li>Двойной begin, пустая транзакция (commit без операций), null-данные операции.</li>
 *   <li>Проверка: недопустимые переходы статуса транзакции отклонены внятно, без порчи лога.</li>
 * </ul>
 */
public class TransactionLogServiceD {
    public String begin(String type, Map<String, Object> data){ throw new UnsupportedOperationException("TODO: variant D — edge (double-commit/rollback-committed/op-after-commit)"); }
    public void commit(String txId){ throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== TransactionLogServiceD (edge): Smoke ==="); }
}
