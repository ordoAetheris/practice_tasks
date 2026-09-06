package com.practice.task52_transaction_log;

/**
 * ТРАНЗАКЦ-ЛОГ — ВАРИАНТ C: SHUTDOWN (flush/durability)
 *
 * <p>CORE = базовый {@link TransactionLogService}.</p>
 *
 * <p><b>ВАРИАНТ C — корректная остановка [prim: shutdown ⭐, durability]:</b></p>
 * <ul>
 *   <li>shutdown(): дописать/сбросить буфер лога (flush), не принимать новые begin, дождаться завершения фоновых записей.</li>
 *   <li>Гарантия: закоммиченное не теряется при остановке; незавершённое помечено для отката при следующем старте.</li>
 *   <li>Проверка: commit + shutdown → после «перезапуска» (recover) транзакция на месте.</li>
 * </ul>
 */
public class TransactionLogServiceC {
    public void shutdown(){ throw new UnsupportedOperationException("TODO: variant C — flush + graceful shutdown"); }
    public static void main(String[] a){ System.out.println("=== TransactionLogServiceC (shutdown): Smoke ==="); }
}
