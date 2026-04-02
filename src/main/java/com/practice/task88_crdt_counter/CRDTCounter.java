package com.practice.task88_crdt_counter;

import java.util.*;

/**
 * CRDT СЧЁТЧИК (G-COUNTER И PN-COUNTER)
 *
 * <p>Реализовать CRDT (Conflict-free Replicated Data Type) счётчики — структуры данных,
 * которые можно реплицировать на нескольких узлах и объединять (merge) без конфликтов.
 * Гарантируют eventual consistency без координации между узлами.</p>
 *
 * <p>Используются в распределённых системах: Riak, Redis CRDT, Cassandra counters,
 * распределённые метрики, offline-first приложения.</p>
 *
 * <h3>G-Counter (Grow-only Counter):</h3>
 * <ul>
 *   <li>Каждый узел имеет свой счётчик в векторе</li>
 *   <li>increment(nodeId) — увеличить свой счётчик на 1</li>
 *   <li>value() — сумма всех счётчиков в векторе</li>
 *   <li>merge(other) — поэлементный max</li>
 * </ul>
 *
 * <h3>PN-Counter (Positive-Negative Counter):</h3>
 * <ul>
 *   <li>Два G-Counter: P (increments) и N (decrements)</li>
 *   <li>increment(nodeId) — увеличить P-counter</li>
 *   <li>decrement(nodeId) — увеличить N-counter</li>
 *   <li>value() — P.value() - N.value()</li>
 *   <li>merge(other) — merge обоих G-Counter</li>
 * </ul>
 *
 * <h3>Свойства CRDT (обязательно для merge):</h3>
 * <ul>
 *   <li>Коммутативность: merge(a, b) == merge(b, a)</li>
 *   <li>Ассоциативность: merge(merge(a, b), c) == merge(a, merge(b, c))</li>
 *   <li>Идемпотентность: merge(a, a) == a</li>
 *   <li>Конвергенция: после обмена всеми обновлениями все реплики сходятся к одному значению</li>
 * </ul>
 *
 * <p>Уровень: Продвинутый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task88_crdt_counter/CRDTCounter.java
 * java -cp src/main/java com.practice.task88_crdt_counter.CRDTCounter
 * </pre>
 */
public class CRDTCounter {

    /**
     * G-Counter (Grow-only Counter). Только инкремент.
     * Внутренне: Map nodeId → count.
     */
    public static class GCounter {

        /**
         * Создаёт пустой G-Counter.
         */
        public GCounter() {
            // TODO: implement
        }

        /**
         * Увеличивает счётчик для данного узла на 1.
         *
         * @param nodeId идентификатор узла
         */
        public void increment(String nodeId) {
            // TODO: implement
        }

        /**
         * Увеличивает счётчик для данного узла на заданное значение.
         *
         * @param nodeId идентификатор узла
         * @param amount значение для прибавления (> 0)
         * @throws IllegalArgumentException если amount <= 0
         */
        public void increment(String nodeId, long amount) {
            // TODO: implement
        }

        /**
         * Возвращает текущее значение счётчика (сумма по всем узлам).
         *
         * @return значение счётчика
         */
        public long value() {
            // TODO: implement
            return 0;
        }

        /**
         * Объединяет с другим G-Counter. Для каждого nodeId берётся max.
         * merge(a, b) = {nodeId: max(a[nodeId], b[nodeId])}
         *
         * @param other другой G-Counter
         * @return новый G-Counter — результат merge
         */
        public GCounter merge(GCounter other) {
            // TODO: implement
            return new GCounter();
        }

        /**
         * Возвращает копию внутреннего состояния (для тестирования).
         *
         * @return Map nodeId → count
         */
        public Map<String, Long> getState() {
            // TODO: implement
            return Map.of();
        }
    }

    /**
     * PN-Counter (Positive-Negative Counter). Поддерживает инкремент и декремент.
     * Внутренне: два G-Counter (P и N). Значение = P.value() - N.value().
     */
    public static class PNCounter {

        /**
         * Создаёт пустой PN-Counter.
         */
        public PNCounter() {
            // TODO: implement
        }

        /**
         * Увеличивает счётчик на 1 (инкрементирует P-counter).
         *
         * @param nodeId идентификатор узла
         */
        public void increment(String nodeId) {
            // TODO: implement
        }

        /**
         * Уменьшает счётчик на 1 (инкрементирует N-counter).
         *
         * @param nodeId идентификатор узла
         */
        public void decrement(String nodeId) {
            // TODO: implement
        }

        /**
         * Возвращает текущее значение: P.value() - N.value().
         * Может быть отрицательным.
         *
         * @return значение счётчика
         */
        public long value() {
            // TODO: implement
            return 0;
        }

        /**
         * Объединяет с другим PN-Counter: merge P-counters и merge N-counters.
         *
         * @param other другой PN-Counter
         * @return новый PN-Counter — результат merge
         */
        public PNCounter merge(PNCounter other) {
            // TODO: implement
            return new PNCounter();
        }
    }

    public static void main(String[] args) {
        System.out.println("=== CRDTCounter: Smoke Test ===");
        // TODO: smoke test — создать реплики GCounter и PNCounter,
        // инкрементировать на разных узлах, merge, проверить конвергенцию
    }
}
