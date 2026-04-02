package com.practice.task89_raft_log;

import java.util.*;

/**
 * SIMPLIFIED RAFT LOG (ЖУРНАЛ РЕПЛИКАЦИИ RAFT)
 *
 * <p>Реализовать упрощённый журнал репликации по протоколу Raft (без сетевой части).
 * Raft — алгоритм консенсуса для распределённых систем (etcd, CockroachDB, TiKV).
 * Журнал — центральная структура данных Raft: упорядоченная последовательность команд
 * с гарантиями консистентности.</p>
 *
 * <h3>LogEntry:</h3>
 * <ul>
 *   <li>term — номер эпохи (term) лидера, создавшего запись</li>
 *   <li>index — позиция в логе (строго возрастает, начиная с 1)</li>
 *   <li>command — команда для применения к state machine</li>
 * </ul>
 *
 * <h3>Основные операции:</h3>
 * <ul>
 *   <li>appendEntry(term, command) — добавить запись в конец лога</li>
 *   <li>getEntry(index) — получить запись по индексу</li>
 *   <li>getLastIndex() — индекс последней записи</li>
 *   <li>getLastTerm() — term последней записи</li>
 *   <li>deleteFrom(index) — удалить запись по индексу и все после неё (обрезка при конфликте)</li>
 *   <li>isUpToDate(lastLogIndex, lastLogTerm) — проверить, не менее актуален ли кандидат</li>
 *   <li>matchEntry(index, term) — совпадает ли запись по индексу и term</li>
 *   <li>commitTo(index) — зафиксировать записи до данного индекса включительно</li>
 * </ul>
 *
 * <h3>Инварианты Raft Log:</h3>
 * <ul>
 *   <li>Индексы строго возрастают (1, 2, 3, ...)</li>
 *   <li>Term не убывает в последовательных записях (может оставаться тем же)</li>
 *   <li>Log Matching Property: если две записи в разных логах имеют одинаковый index и term,
 *       то все предшествующие записи тоже идентичны</li>
 *   <li>При конфликте (разные записи на одном индексе) — удалить конфликтующую и все после неё</li>
 *   <li>commitIndex не может уменьшаться</li>
 *   <li>Committed записи не удаляются</li>
 * </ul>
 *
 * <p>Уровень: Продвинутый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task89_raft_log/RaftLog.java
 * java -cp src/main/java com.practice.task89_raft_log.RaftLog
 * </pre>
 */
public class RaftLog {

    /**
     * Запись в журнале Raft.
     *
     * @param term    номер эпохи (term) лидера
     * @param index   позиция в логе (начиная с 1)
     * @param command команда для state machine
     */
    public record LogEntry(int term, int index, String command) {}

    /**
     * Создаёт пустой Raft Log.
     */
    public RaftLog() {
        // TODO: implement
    }

    /**
     * Добавляет новую запись в конец лога.
     * Индекс назначается автоматически (lastIndex + 1).
     *
     * @param term    номер term (>= term последней записи)
     * @param command команда
     * @return созданная запись
     * @throws IllegalArgumentException если term меньше term последней записи
     */
    public LogEntry appendEntry(int term, String command) {
        // TODO: implement
        return null;
    }

    /**
     * Возвращает запись по индексу.
     *
     * @param index индекс записи (начиная с 1)
     * @return Optional с записью или пустой Optional
     */
    public Optional<LogEntry> getEntry(int index) {
        // TODO: implement
        return Optional.empty();
    }

    /**
     * Возвращает индекс последней записи. 0 если лог пуст.
     *
     * @return индекс последней записи
     */
    public int getLastIndex() {
        // TODO: implement
        return 0;
    }

    /**
     * Возвращает term последней записи. 0 если лог пуст.
     *
     * @return term последней записи
     */
    public int getLastTerm() {
        // TODO: implement
        return 0;
    }

    /**
     * Удаляет запись по индексу и все последующие записи.
     * Используется при обнаружении конфликта с лидером.
     * Нельзя удалять committed записи.
     *
     * @param fromIndex индекс, начиная с которого удаляются записи
     * @throws IllegalStateException если fromIndex <= commitIndex (попытка удалить committed)
     */
    public void deleteFrom(int fromIndex) {
        // TODO: implement
    }

    /**
     * Проверяет, является ли кандидат не менее актуальным, чем данный лог.
     * Правило Raft: кандидат актуальнее, если его lastTerm больше,
     * или при равных term — lastIndex >= текущий lastIndex.
     *
     * @param candidateLastIndex lastIndex кандидата
     * @param candidateLastTerm  lastTerm кандидата
     * @return true если кандидат не менее актуален
     */
    public boolean isUpToDate(int candidateLastIndex, int candidateLastTerm) {
        // TODO: implement
        return false;
    }

    /**
     * Проверяет, совпадает ли запись по индексу и term.
     * Используется для проверки Log Matching Property при AppendEntries.
     *
     * @param index индекс записи
     * @param term  ожидаемый term
     * @return true если запись существует и её term совпадает
     */
    public boolean matchEntry(int index, int term) {
        // TODO: implement
        return false;
    }

    /**
     * Фиксирует записи до данного индекса включительно.
     * commitIndex не может уменьшаться.
     *
     * @param index индекс для фиксации
     * @throws IllegalArgumentException если index > lastIndex или index < текущего commitIndex
     */
    public void commitTo(int index) {
        // TODO: implement
    }

    /**
     * Возвращает текущий commitIndex.
     *
     * @return commitIndex
     */
    public int getCommitIndex() {
        // TODO: implement
        return 0;
    }

    /**
     * Возвращает все записи лога.
     *
     * @return неизменяемый список записей
     */
    public List<LogEntry> getEntries() {
        // TODO: implement
        return List.of();
    }

    public static void main(String[] args) {
        System.out.println("=== RaftLog: Smoke Test ===");
        // TODO: smoke test — добавить записи, проверить matchEntry,
        // симулировать конфликт (deleteFrom + append новых), commitTo
    }
}
