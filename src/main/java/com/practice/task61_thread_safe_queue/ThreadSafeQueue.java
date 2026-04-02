package com.practice.task61_thread_safe_queue;

import java.util.*;

/**
 * ПОТОКОБЕЗОПАСНАЯ ОЧЕРЕДЬ С ОГРАНИЧЕННЫМ РАЗМЕРОМ
 *
 * <p>Реализовать потокобезопасную ограниченную очередь (bounded blocking queue) с использованием
 * примитивов синхронизации synchronized/wait/notify. Запрещено использовать готовые коллекции
 * из java.util.concurrent.</p>
 *
 * <p>Очередь параметризована (generic) и поддерживает блокирующие операции:
 * put() блокирует вызывающий поток, если очередь полна, а take() блокирует, если пуста.
 * Дополнительно реализовать операции с таймаутом: offer() и poll().</p>
 *
 * <h3>Основные операции:</h3>
 * <ul>
 *   <li>put(item) — добавить элемент, блокировать если очередь полна</li>
 *   <li>take() — извлечь элемент, блокировать если очередь пуста</li>
 *   <li>offer(item, timeoutMs) — добавить с таймаутом, вернуть false если не удалось</li>
 *   <li>poll(timeoutMs) — извлечь с таймаутом, вернуть null если не удалось</li>
 *   <li>size() — текущее количество элементов</li>
 *   <li>isEmpty() — пуста ли очередь</li>
 *   <li>isFull() — полна ли очередь</li>
 * </ul>
 *
 * <h3>Требования:</h3>
 * <ul>
 *   <li>Использовать только synchronized, wait(), notify()/notifyAll()</li>
 *   <li>Корректная работа при множественных producer/consumer потоках</li>
 *   <li>Обработка InterruptedException</li>
 *   <li>FIFO порядок элементов</li>
 * </ul>
 *
 * <p>Уровень: Продвинутый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task61_thread_safe_queue/ThreadSafeQueue.java
 * java -cp src/main/java com.practice.task61_thread_safe_queue.ThreadSafeQueue
 * </pre>
 */
public class ThreadSafeQueue<T> {

    /**
     * Создаёт очередь с заданной максимальной ёмкостью.
     *
     * @param capacity максимальное количество элементов
     * @throws IllegalArgumentException если capacity <= 0
     */
    public ThreadSafeQueue(int capacity) {
        // TODO: implement
    }

    /**
     * Добавляет элемент в очередь. Если очередь полна — блокирует вызывающий поток
     * до тех пор, пока не появится свободное место.
     *
     * @param item элемент для добавления
     * @throws InterruptedException если поток был прерван во время ожидания
     */
    public void put(T item) throws InterruptedException {
        // TODO: implement
    }

    /**
     * Извлекает и возвращает элемент из головы очереди. Если очередь пуста —
     * блокирует вызывающий поток до появления элемента.
     *
     * @return элемент из головы очереди
     * @throws InterruptedException если поток был прерван во время ожидания
     */
    public T take() throws InterruptedException {
        // TODO: implement
        return null;
    }

    /**
     * Пытается добавить элемент в очередь в течение указанного таймаута.
     *
     * @param item элемент для добавления
     * @param timeoutMs максимальное время ожидания в миллисекундах
     * @return true если элемент добавлен, false если таймаут истёк
     * @throws InterruptedException если поток был прерван во время ожидания
     */
    public boolean offer(T item, long timeoutMs) throws InterruptedException {
        // TODO: implement
        return false;
    }

    /**
     * Пытается извлечь элемент из очереди в течение указанного таймаута.
     *
     * @param timeoutMs максимальное время ожидания в миллисекундах
     * @return элемент из головы очереди или null если таймаут истёк
     * @throws InterruptedException если поток был прерван во время ожидания
     */
    public T poll(long timeoutMs) throws InterruptedException {
        // TODO: implement
        return null;
    }

    /**
     * Возвращает текущее количество элементов в очереди.
     *
     * @return количество элементов
     */
    public int size() {
        // TODO: implement
        return 0;
    }

    /**
     * Проверяет, пуста ли очередь.
     *
     * @return true если очередь пуста
     */
    public boolean isEmpty() {
        // TODO: implement
        return true;
    }

    /**
     * Проверяет, полна ли очередь.
     *
     * @return true если очередь достигла максимальной ёмкости
     */
    public boolean isFull() {
        // TODO: implement
        return false;
    }

    public static void main(String[] args) {
        System.out.println("=== ThreadSafeQueue: Smoke Test ===");
        // TODO: smoke test — запустить несколько producer/consumer потоков
    }
}
