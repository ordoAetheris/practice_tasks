package com.practice.task80_skip_list;

import java.util.*;

/**
 * Skip List.
 *
 * <p>Реализовать вероятностную структуру данных Skip List —
 * упорядоченный ассоциативный массив с ожидаемым O(log n) на поиск/вставку/удаление.
 * Рандомизированные уровни.</p>
 *
 * <p>Уровень: Продвинутый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task80_skip_list/SkipList.java
 * java -cp src/main/java com.practice.task80_skip_list.SkipList
 * </pre>
 */
public class SkipList<K extends Comparable<K>, V> {

    /** Добавить или обновить элемент */
    public void add(K key, V value) {
        //TODO implement
    }

    /** Получить значение по ключу или null */
    public V get(K key) {
        //TODO implement
        return null;
    }

    /** Удалить элемент, вернуть true если был */
    public boolean remove(K key) {
        //TODO implement
        return false;
    }

    /** Содержит ли ключ */
    public boolean contains(K key) {
        //TODO implement
        return false;
    }

    /** Количество элементов */
    public int size() {
        //TODO implement
        return 0;
    }

    /** Наибольший ключ <= заданного или null */
    public K floor(K key) {
        //TODO implement
        return null;
    }

    /** Наименьший ключ >= заданного или null */
    public K ceiling(K key) {
        //TODO implement
        return null;
    }

    /** Все пары в диапазоне [fromKey, toKey] */
    public List<Map.Entry<K, V>> range(K fromKey, K toKey) {
        //TODO implement
        return Collections.emptyList();
    }

    /** Текущее максимальное количество уровней */
    public int getLevel() {
        //TODO implement
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("=== SkipList: Smoke Test ===");
        // TODO: вставить элементы, проверить поиск, range, floor/ceiling
    }
}
