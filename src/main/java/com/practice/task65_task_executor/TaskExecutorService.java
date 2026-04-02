package com.practice.task65_task_executor;

import java.util.*;
import java.util.concurrent.*;

/**
 * Пул потоков (ThreadPool).
 *
 * <p>Реализовать собственный пул потоков с очередью задач.
 * НЕ использовать ExecutorService, ThreadPoolExecutor и другие готовые реализации из java.util.concurrent.</p>
 *
 * <p>Уровень: Продвинутый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task65_task_executor/TaskExecutorService.java
 * java -cp src/main/java com.practice.task65_task_executor.TaskExecutorService
 * </pre>
 */
public class TaskExecutorService {

    public interface Future<T> {
        T get() throws InterruptedException;
        T get(long timeout, TimeUnit unit) throws InterruptedException, TimeoutException;
        boolean isDone();
        boolean isCancelled();
        boolean cancel();
    }

    /**
     * Создать пул с фиксированным количеством потоков
     * @param threadCount количество рабочих потоков
     */
    public TaskExecutorService(int threadCount) {
        //TODO implement
    }

    /**
     * Отправить задачу на выполнение
     * @param task задача
     * @return Future для отслеживания результата
     */
    public Future<?> submit(Runnable task) {
        //TODO implement
        return null;
    }

    /**
     * Отправить задачу с результатом
     * @param task задача
     * @return Future с результатом
     */
    public <T> Future<T> submit(Callable<T> task) {
        //TODO implement
        return null;
    }

    /** Завершить работу — дождаться выполнения всех задач в очереди */
    public void shutdown() {
        //TODO implement
    }

    /** Немедленная остановка — прервать текущие задачи */
    public void shutdownNow() {
        //TODO implement
    }

    /** Ожидать завершения всех задач */
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        //TODO implement
        return false;
    }

    /** Количество активных (выполняющихся) задач */
    public int getActiveCount() {
        //TODO implement
        return 0;
    }

    /** Размер очереди ожидающих задач */
    public int getQueueSize() {
        //TODO implement
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("=== TaskExecutorService: Smoke Test ===");
        // TODO: создать пул, отправить задачи, дождаться результатов
    }
}
