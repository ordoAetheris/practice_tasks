package com.practice.task56_transaction_log;

import java.time.LocalDateTime;
import java.util.*;

/**
 * ЖУРНАЛ ТРАНЗАКЦИЙ С ГАРАНТИЯМИ
 *
 * <p>Реализуйте журнал транзакций с поддержкой commit/rollback.
 * Транзакция (Transaction) содержит: id, type, data (Map), timestamp,
 * status (PENDING/COMMITTED/ROLLED_BACK), список операций.</p>
 *
 * <p>Необходимо реализовать следующие операции:</p>
 * <ul>
 *   <li>begin() — начать транзакцию, вернуть txId</li>
 *   <li>addOperation(txId, operation) — добавить операцию в транзакцию</li>
 *   <li>commit(txId) — зафиксировать транзакцию</li>
 *   <li>rollback(txId) — откатить транзакцию</li>
 *   <li>getTransaction(txId) — получить информацию о транзакции</li>
 *   <li>getCommittedAfter(timestamp) — все зафиксированные транзакции после указанного момента</li>
 *   <li>getActiveTransactions() — все незавершённые (PENDING) транзакции</li>
 * </ul>
 *
 * <p>Бизнес-правила:</p>
 * <ul>
 *   <li>Операции откаченной транзакции не видны (не возвращаются в выборках данных)</li>
 *   <li>commit и rollback — финальные операции, повторный вызов — ошибка</li>
 *   <li>Нельзя добавлять операции в завершённую транзакцию</li>
 *   <li>Каждая транзакция имеет уникальный id</li>
 * </ul>
 *
 * <p>Уровень: Средний</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task56_transaction_log/TransactionLogService.java
 * java -cp src/main/java com.practice.task56_transaction_log.TransactionLogService
 * </pre>
 */
public class TransactionLogService {

    public enum TransactionStatus {
        PENDING, COMMITTED, ROLLED_BACK
    }

    public record Operation(
            String type,
            Map<String, Object> data
    ) {}

    public record Transaction(
            String id,
            String type,
            Map<String, Object> data,
            LocalDateTime timestamp,
            TransactionStatus status,
            List<Operation> operations
    ) {}

    /**
     * Начинает новую транзакцию.
     * @param type тип транзакции
     * @param data начальные данные транзакции
     * @return идентификатор транзакции
     */
    public String begin(String type, Map<String, Object> data) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Добавляет операцию в транзакцию.
     * @param txId идентификатор транзакции
     * @param operation операция
     * @throws IllegalStateException если транзакция уже завершена (COMMITTED или ROLLED_BACK)
     */
    public void addOperation(String txId, Operation operation) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Фиксирует транзакцию. После commit операции становятся видимы.
     * @param txId идентификатор транзакции
     * @throws IllegalStateException если транзакция уже завершена
     */
    public void commit(String txId) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Откатывает транзакцию. Операции становятся невидимы.
     * @param txId идентификатор транзакции
     * @throws IllegalStateException если транзакция уже завершена
     */
    public void rollback(String txId) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Возвращает информацию о транзакции.
     * @param txId идентификатор транзакции
     * @return транзакция
     * @throws NoSuchElementException если транзакция не найдена
     */
    public Transaction getTransaction(String txId) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Возвращает все зафиксированные транзакции после указанного момента.
     * @param timestamp временная метка (строго после)
     * @return список транзакций
     */
    public List<Transaction> getCommittedAfter(LocalDateTime timestamp) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Возвращает все активные (PENDING) транзакции.
     * @return список активных транзакций
     */
    public List<Transaction> getActiveTransactions() {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    public static void main(String[] args) {
        System.out.println("=== TransactionLogService: Smoke Test ===");
        // TODO: smoke test
    }
}
