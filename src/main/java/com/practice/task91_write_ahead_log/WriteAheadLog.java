package com.practice.task91_write_ahead_log;

import java.util.*;

/**
 * Write-Ahead Log.
 *
 * <p>Реализовать WAL — журнал упреждающей записи для обеспечения атомарности и durability.
 * Запись в лог ПЕРЕД применением изменений. Поддержка recovery (ARIES-подобный:
 * analysis, redo, undo) и checkpoint.</p>
 *
 * <p>Уровень: Хардкор</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task91_write_ahead_log/WriteAheadLog.java
 * java -cp src/main/java com.practice.task91_write_ahead_log.WriteAheadLog
 * </pre>
 */
public class WriteAheadLog {

    public enum RecordType { BEGIN, UPDATE, COMMIT, ABORT, CHECKPOINT }

    public record LogRecord(long lsn, String txId, RecordType type, Map<String, Object> data) {}

    /** Добавить запись в лог, вернуть LSN */
    public long append(LogRecord record) {
        //TODO implement
        return 0;
    }

    /**
     * Восстановить состояние после "сбоя"
     * Analysis -> Redo -> Undo
     * @return восстановленное состояние (ключ -> значение)
     */
    public Map<String, Object> recover() {
        //TODO implement
        return Collections.emptyMap();
    }

    /** Создать контрольную точку */
    public void checkpoint() {
        //TODO implement
    }

    /** Удалить записи до указанного LSN */
    public void truncate(long lsn) {
        //TODO implement
    }

    /** Получить запись по LSN */
    public LogRecord getRecord(long lsn) {
        //TODO implement
        return null;
    }

    /** Все записи транзакции */
    public List<LogRecord> getTransactionRecords(String txId) {
        //TODO implement
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        System.out.println("=== WriteAheadLog: Smoke Test ===");
        // TODO: записать транзакции, симулировать сбой, восстановить
    }
}
