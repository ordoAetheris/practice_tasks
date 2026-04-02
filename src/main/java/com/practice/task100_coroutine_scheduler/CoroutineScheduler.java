package com.practice.task100_coroutine_scheduler;

import java.util.*;

/**
 * Планировщик корутин (cooperative multitasking).
 *
 * <p>Реализовать невытесняющую многозадачность: корутины добровольно отдают
 * управление планировщику через yield(). Планировщик выбирает следующую
 * корутину по round-robin.</p>
 *
 * <p>Уровень: Хардкор</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task100_coroutine_scheduler/CoroutineScheduler.java
 * java -cp src/main/java com.practice.task100_coroutine_scheduler.CoroutineScheduler
 * </pre>
 */
public class CoroutineScheduler {

    public enum CoroutineStatus { READY, RUNNING, SUSPENDED, COMPLETED }

    public record CoroutineInfo(String id, CoroutineStatus status) {}

    /**
     * Создать корутину
     * @param body тело корутины (может вызывать yield())
     * @return идентификатор корутины
     */
    public String create(Runnable body) {
        //TODO implement
        return null;
    }

    /**
     * Возобновить выполнение корутины
     * @param id идентификатор корутины
     * @throws IllegalStateException если корутина завершена
     */
    public void resume(String id) {
        //TODO implement
    }

    /**
     * Приостановить текущую корутину и отдать управление планировщику.
     * Вызывается изнутри корутины.
     */
    public void yield() {
        //TODO implement
    }

    /** Выбрать следующую корутину (round-robin) и возобновить */
    public void schedule() {
        //TODO implement
    }

    /** Статус корутины */
    public CoroutineStatus getStatus(String id) {
        //TODO implement
        return null;
    }

    /** Все корутины */
    public List<CoroutineInfo> getAll() {
        //TODO implement
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        System.out.println("=== CoroutineScheduler: Smoke Test ===");
        // TODO: создать корутины, запустить планировщик, проверить чередование
    }
}
