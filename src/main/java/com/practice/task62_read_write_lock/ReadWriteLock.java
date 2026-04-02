package com.practice.task62_read_write_lock;

import java.util.*;

/**
 * READ-WRITE LOCK (БЛОКИРОВКА ЧТЕНИЯ-ЗАПИСИ)
 *
 * <p>Реализовать механизм блокировки чтения-записи (Read-Write Lock) с использованием
 * примитивов synchronized/wait/notify. Запрещено использовать java.util.concurrent.locks.</p>
 *
 * <p>Основной принцип: множество потоков могут одновременно удерживать блокировку на чтение,
 * но блокировка на запись — эксклюзивная (никто другой не может читать или писать).</p>
 *
 * <h3>Основные операции:</h3>
 * <ul>
 *   <li>acquireRead() — захватить блокировку на чтение (блокирует если есть писатель)</li>
 *   <li>releaseRead() — освободить блокировку на чтение</li>
 *   <li>acquireWrite() — захватить блокировку на запись (блокирует если есть читатели или писатель)</li>
 *   <li>releaseWrite() — освободить блокировку на запись</li>
 * </ul>
 *
 * <h3>Требования:</h3>
 * <ul>
 *   <li>Множество читателей одновременно</li>
 *   <li>Писатель — эксклюзивный доступ</li>
 *   <li>Предотвращение голодания писателей (writer starvation): если писатель ожидает,
 *       новые читатели не должны получать блокировку до его завершения</li>
 *   <li>Использовать только synchronized, wait(), notify()/notifyAll()</li>
 *   <li>Корректная обработка InterruptedException</li>
 * </ul>
 *
 * <p>Уровень: Продвинутый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task62_read_write_lock/ReadWriteLock.java
 * java -cp src/main/java com.practice.task62_read_write_lock.ReadWriteLock
 * </pre>
 */
public class ReadWriteLock {

    /**
     * Захватывает блокировку на чтение. Блокирует вызывающий поток, если в данный момент
     * есть активный писатель или ожидающий писатель (для предотвращения writer starvation).
     *
     * @throws InterruptedException если поток был прерван во время ожидания
     */
    public void acquireRead() throws InterruptedException {
        // TODO: implement
    }

    /**
     * Освобождает блокировку на чтение. Если это был последний читатель,
     * уведомляет ожидающих писателей.
     */
    public void releaseRead() {
        // TODO: implement
    }

    /**
     * Захватывает блокировку на запись. Блокирует вызывающий поток, пока есть
     * активные читатели или другой активный писатель.
     *
     * @throws InterruptedException если поток был прерван во время ожидания
     */
    public void acquireWrite() throws InterruptedException {
        // TODO: implement
    }

    /**
     * Освобождает блокировку на запись. Уведомляет всех ожидающих читателей и писателей.
     */
    public void releaseWrite() {
        // TODO: implement
    }

    /**
     * Возвращает текущее количество активных читателей.
     *
     * @return количество активных читателей
     */
    public int getReadersCount() {
        // TODO: implement
        return 0;
    }

    /**
     * Проверяет, захвачена ли блокировка на запись.
     *
     * @return true если блокировка на запись активна
     */
    public boolean isWriteLocked() {
        // TODO: implement
        return false;
    }

    /**
     * Возвращает количество ожидающих писателей.
     *
     * @return количество потоков, ожидающих захвата блокировки на запись
     */
    public int getWaitingWritersCount() {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("=== ReadWriteLock: Smoke Test ===");
        // TODO: smoke test — запустить потоки-читатели и потоки-писатели
    }
}
