package com.practice.task93_garbage_collector;

import java.util.*;

/**
 * Симуляция Mark-and-Sweep Garbage Collector.
 *
 * <p>Реализовать симуляцию сборщика мусора: хип с объектами, ссылки между ними,
 * корневое множество. Mark фаза — обход от корней. Sweep фаза — удаление непомеченных.
 * Корректная обработка циклических ссылок.</p>
 *
 * <p>Уровень: Хардкор</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task93_garbage_collector/MarkAndSweepGC.java
 * java -cp src/main/java com.practice.task93_garbage_collector.MarkAndSweepGC
 * </pre>
 */
public class MarkAndSweepGC {

    public record GCObject(String id, Set<String> references) {}

    /** Выделить объект на хипе, вернуть id */
    public String allocate() {
        //TODO implement
        return null;
    }

    /** Добавить ссылку между объектами */
    public void addReference(String fromId, String toId) {
        //TODO implement
    }

    /** Удалить ссылку */
    public void removeReference(String fromId, String toId) {
        //TODO implement
    }

    /** Добавить объект в корневое множество */
    public void addRoot(String id) {
        //TODO implement
    }

    /** Убрать объект из корневого множества */
    public void removeRoot(String id) {
        //TODO implement
    }

    /**
     * Выполнить сборку мусора (mark & sweep)
     * @return количество собранных объектов
     */
    public int gc() {
        //TODO implement
        return 0;
    }

    /** Общее количество объектов на хипе */
    public int getHeapSize() {
        //TODO implement
        return 0;
    }

    /** Количество живых объектов (достижимых от корней) */
    public int getLiveCount() {
        //TODO implement
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("=== MarkAndSweepGC: Smoke Test ===");
        // TODO: создать объекты, ссылки, корни, запустить GC
    }
}
