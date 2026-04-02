package com.practice.task98_distributed_lock;

import java.util.*;

/**
 * Менеджер распределённых блокировок (симуляция).
 *
 * <p>Реализовать менеджер блокировок с fencing token, TTL, re-entrant семантикой.
 * Fencing token строго возрастает. Expired блокировки автоматически освобождаются.</p>
 *
 * <p>Уровень: Хардкор</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task98_distributed_lock/DistributedLockManager.java
 * java -cp src/main/java com.practice.task98_distributed_lock.DistributedLockManager
 * </pre>
 */
public class DistributedLockManager {

    public record Lock(String resource, String owner, long acquiredAt,
                       long ttlMillis, long fencingToken) {}

    /**
     * Захватить блокировку
     * @param resource имя ресурса
     * @param owner владелец
     * @param ttlMillis время жизни блокировки
     * @return fencing token
     * @throws IllegalStateException если ресурс заблокирован другим владельцем
     */
    public long acquire(String resource, String owner, long ttlMillis) {
        //TODO implement
        return 0;
    }

    /**
     * Освободить блокировку
     * @param fencingToken токен полученный при acquire
     * @throws IllegalArgumentException если токен невалиден
     */
    public void release(String resource, String owner, long fencingToken) {
        //TODO implement
    }

    /**
     * Попытаться захватить с таймаутом
     * @return fencing token или -1 если не удалось
     */
    public long tryAcquire(String resource, String owner, long ttlMillis, long timeoutMillis) {
        //TODO implement
        return -1;
    }

    /** Заблокирован ли ресурс */
    public boolean isLocked(String resource) {
        //TODO implement
        return false;
    }

    /** Продлить TTL блокировки */
    public void refresh(String resource, String owner, long newTtlMillis) {
        //TODO implement
    }

    /** Все активные блокировки */
    public List<Lock> getActiveLocks() {
        //TODO implement
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        System.out.println("=== DistributedLockManager: Smoke Test ===");
        // TODO: acquire, release, проверить fencing token
    }
}
