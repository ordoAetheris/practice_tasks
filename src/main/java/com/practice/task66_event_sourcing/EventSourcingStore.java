package com.practice.task66_event_sourcing;

import java.util.*;

/**
 * EVENT SOURCING ХРАНИЛИЩЕ
 *
 * <p>Реализовать хранилище событий по паттерну Event Sourcing. Вместо хранения текущего
 * состояния, хранится последовательность событий (event log). Текущее состояние
 * восстанавливается путём воспроизведения (replay) всех событий агрегата.</p>
 *
 * <h3>Основные операции:</h3>
 * <ul>
 *   <li>append(aggregateId, event) — добавить событие в журнал агрегата</li>
 *   <li>getEvents(aggregateId) — все события агрегата</li>
 *   <li>getEvents(aggregateId, fromVersion, toVersion) — события в диапазоне версий</li>
 *   <li>rebuild(aggregateId) — восстановить текущее состояние из событий</li>
 *   <li>snapshot(aggregateId) — сохранить снимок текущего состояния</li>
 *   <li>getEventsAfter(timestamp) — все события после указанного времени</li>
 * </ul>
 *
 * <h3>Требования:</h3>
 * <ul>
 *   <li>Версии событий строго инкрементальны (1, 2, 3, ...)</li>
 *   <li>Optimistic Concurrency: при конфликте версий (ожидаемая != фактическая) — исключение</li>
 *   <li>Событие неизменяемо после добавления</li>
 *   <li>Снимок (snapshot) ускоряет rebuild: восстановление от снимка + новые события</li>
 *   <li>Потокобезопасность</li>
 * </ul>
 *
 * <p>Уровень: Продвинутый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task66_event_sourcing/EventSourcingStore.java
 * java -cp src/main/java com.practice.task66_event_sourcing.EventSourcingStore
 * </pre>
 */
public class EventSourcingStore {

    /**
     * Событие в журнале.
     *
     * @param id уникальный идентификатор события
     * @param aggregateId идентификатор агрегата
     * @param type тип события (например, "CREATED", "UPDATED", "DELETED")
     * @param data данные события
     * @param timestamp время создания события
     * @param version версия события в рамках агрегата
     */
    public record Event(
            String id,
            String aggregateId,
            String type,
            Map<String, Object> data,
            long timestamp,
            long version
    ) {}

    /**
     * Снимок состояния агрегата.
     *
     * @param aggregateId идентификатор агрегата
     * @param state текущее состояние
     * @param version версия, на которой сделан снимок
     * @param timestamp время создания снимка
     */
    public record Snapshot(
            String aggregateId,
            Map<String, Object> state,
            long version,
            long timestamp
    ) {}

    /**
     * Добавляет событие в журнал агрегата. Версия должна быть следующей после последней.
     *
     * @param aggregateId идентификатор агрегата
     * @param type тип события
     * @param data данные события
     * @param expectedVersion ожидаемая текущая версия агрегата (для optimistic concurrency)
     * @return созданное событие
     * @throws IllegalStateException если expectedVersion не совпадает с фактической (конфликт)
     */
    public Event append(String aggregateId, String type, Map<String, Object> data, long expectedVersion) {
        // TODO: implement
        return null;
    }

    /**
     * Возвращает все события агрегата в порядке версий.
     *
     * @param aggregateId идентификатор агрегата
     * @return список событий
     */
    public List<Event> getEvents(String aggregateId) {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Возвращает события агрегата в указанном диапазоне версий (включительно).
     *
     * @param aggregateId идентификатор агрегата
     * @param fromVersion начальная версия (включительно)
     * @param toVersion конечная версия (включительно)
     * @return список событий в диапазоне
     */
    public List<Event> getEvents(String aggregateId, long fromVersion, long toVersion) {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Восстанавливает текущее состояние агрегата путём воспроизведения всех событий.
     * Если есть снимок — начинает от снимка и применяет только новые события.
     *
     * @param aggregateId идентификатор агрегата
     * @return текущее состояние агрегата (Map с полями)
     */
    public Map<String, Object> rebuild(String aggregateId) {
        // TODO: implement
        return Collections.emptyMap();
    }

    /**
     * Сохраняет снимок текущего состояния агрегата для ускорения последующих rebuild.
     *
     * @param aggregateId идентификатор агрегата
     * @return созданный снимок
     */
    public Snapshot snapshot(String aggregateId) {
        // TODO: implement
        return null;
    }

    /**
     * Возвращает все события всех агрегатов после указанного timestamp.
     *
     * @param timestamp время (эпоха миллисекунды)
     * @return список событий после указанного времени
     */
    public List<Event> getEventsAfter(long timestamp) {
        // TODO: implement
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        System.out.println("=== EventSourcingStore: Smoke Test ===");
        // TODO: smoke test
    }
}
