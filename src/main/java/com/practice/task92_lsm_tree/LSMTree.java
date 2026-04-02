package com.practice.task92_lsm_tree;

import java.util.*;

/**
 * LSM Tree (Log-Structured Merge Tree).
 *
 * <p>Реализовать упрощённый LSM Tree: MemTable (in-memory sorted),
 * SSTable (immutable sorted, симуляция в памяти), flush, compaction.
 * Bloom filter на SSTable для быстрого отсечения.</p>
 *
 * <p>Уровень: Хардкор</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task92_lsm_tree/LSMTree.java
 * java -cp src/main/java com.practice.task92_lsm_tree.LSMTree
 * </pre>
 */
public class LSMTree<K extends Comparable<K>, V> {

    /**
     * @param memTableMaxSize максимальный размер MemTable перед flush
     */
    public LSMTree(int memTableMaxSize) {
        //TODO implement
    }

    /** Записать ключ-значение (сначала в MemTable) */
    public void put(K key, V value) {
        //TODO implement
    }

    /**
     * Прочитать значение: сначала MemTable, потом SSTables от новых к старым
     * @return значение или null (в т.ч. если tombstone)
     */
    public V get(K key) {
        //TODO implement
        return null;
    }

    /** Удалить ключ (записать tombstone) */
    public void delete(K key) {
        //TODO implement
    }

    /** Сбросить MemTable в SSTable */
    public void flush() {
        //TODO implement
    }

    /** Объединить SSTables (compaction) */
    public void compact() {
        //TODO implement
    }

    /** Диапазонный запрос [from, to] */
    public List<Map.Entry<K, V>> range(K from, K to) {
        //TODO implement
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        System.out.println("=== LSMTree: Smoke Test ===");
        // TODO: put, get, delete, flush, compact, range
    }
}
