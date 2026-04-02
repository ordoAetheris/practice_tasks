package com.practice.task90_mvcc_store;

import java.util.*;

/**
 * MVCC KEY-VALUE STORE (МНОГОВЕРСИОННОЕ УПРАВЛЕНИЕ КОНКУРЕНТНЫМ ДОСТУПОМ)
 *
 * <p>Реализовать key-value хранилище с многоверсионным управлением конкурентным доступом (MVCC).
 * Каждое значение хранится в нескольких версиях, привязанных к транзакциям. Читатели не блокируют
 * писателей и наоборот — каждая транзакция видит консистентный snapshot данных.</p>
 *
 * <p>MVCC используется в PostgreSQL, MySQL InnoDB, Oracle, CockroachDB и других СУБД.</p>
 *
 * <h3>Version:</h3>
 * <ul>
 *   <li>txId — идентификатор транзакции, создавшей версию</li>
 *   <li>value — значение (null для удалённых)</li>
 *   <li>deleted — флаг tombstone</li>
 * </ul>
 *
 * <h3>Основные операции:</h3>
 * <ul>
 *   <li>begin() — начать транзакцию, вернуть txId</li>
 *   <li>get(txId, key) — прочитать видимую версию (последнюю committed до начала транзакции)</li>
 *   <li>put(txId, key, value) — записать новую версию</li>
 *   <li>delete(txId, key) — пометить как удалённое (tombstone)</li>
 *   <li>commit(txId) — зафиксировать транзакцию</li>
 *   <li>rollback(txId) — откатить транзакцию (удалить все её версии)</li>
 *   <li>snapshot(txId) — вернуть видимый snapshot всех данных</li>
 * </ul>
 *
 * <h3>Уровни изоляции (реализовать Read Committed):</h3>
 * <ul>
 *   <li>Read Committed: транзакция видит только committed значения на момент каждого чтения</li>
 *   <li>Uncommitted записи других транзакций невидимы</li>
 *   <li>Write-write конфликт: если две транзакции пишут в один ключ — вторая получает исключение</li>
 * </ul>
 *
 * <h3>Дополнительно:</h3>
 * <ul>
 *   <li>GC старых версий: удалять версии, невидимые ни одной активной транзакции</li>
 *   <li>Потокобезопасность (транзакции могут работать параллельно)</li>
 * </ul>
 *
 * <p>Уровень: Хардкор</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task90_mvcc_store/MVCCStore.java
 * java -cp src/main/java com.practice.task90_mvcc_store.MVCCStore
 * </pre>
 */
public class MVCCStore {

    /**
     * Версия значения, привязанная к транзакции.
     */
    public record Version(long txId, String value, boolean deleted) {}

    /**
     * Создаёт пустое MVCC хранилище.
     */
    public MVCCStore() {
        // TODO: implement
    }

    /**
     * Начинает новую транзакцию. Возвращает уникальный монотонно возрастающий txId.
     *
     * @return идентификатор транзакции
     */
    public long begin() {
        // TODO: implement
        return 0;
    }

    /**
     * Читает значение по ключу, видимое для данной транзакции.
     * Read Committed: возвращает последнюю committed версию.
     * Uncommitted записи других транзакций невидимы.
     * Собственные uncommitted записи видимы.
     *
     * @param txId идентификатор транзакции
     * @param key  ключ
     * @return Optional со значением или пустой (если не существует или удалено)
     * @throws IllegalStateException если транзакция не активна
     */
    public Optional<String> get(long txId, String key) {
        // TODO: implement
        return Optional.empty();
    }

    /**
     * Записывает новую версию значения в рамках транзакции.
     * При write-write конфликте (другая активная транзакция уже писала в этот ключ)
     * бросает исключение.
     *
     * @param txId  идентификатор транзакции
     * @param key   ключ
     * @param value значение
     * @throws IllegalStateException если транзакция не активна
     * @throws IllegalStateException если write-write конфликт
     */
    public void put(long txId, String key, String value) {
        // TODO: implement
    }

    /**
     * Помечает ключ как удалённый (tombstone) в рамках транзакции.
     *
     * @param txId идентификатор транзакции
     * @param key  ключ
     * @throws IllegalStateException если транзакция не активна или write-write конфликт
     */
    public void delete(long txId, String key) {
        // TODO: implement
    }

    /**
     * Фиксирует транзакцию. Все её записи становятся видимыми для будущих транзакций.
     *
     * @param txId идентификатор транзакции
     * @throws IllegalStateException если транзакция не активна
     */
    public void commit(long txId) {
        // TODO: implement
    }

    /**
     * Откатывает транзакцию. Все её записи удаляются.
     *
     * @param txId идентификатор транзакции
     * @throws IllegalStateException если транзакция не активна
     */
    public void rollback(long txId) {
        // TODO: implement
    }

    /**
     * Возвращает snapshot всех данных, видимых для данной транзакции.
     *
     * @param txId идентификатор транзакции
     * @return Map ключ → значение (только существующие, не удалённые)
     */
    public Map<String, String> snapshot(long txId) {
        // TODO: implement
        return Map.of();
    }

    /**
     * Сборка мусора: удаляет старые версии, невидимые ни одной активной транзакции.
     *
     * @return количество удалённых версий
     */
    public int gc() {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("=== MVCCStore: Smoke Test ===");
        // TODO: smoke test — begin, put, get (видимость), commit, snapshot,
        // write-write конфликт, rollback
    }
}
