package com.practice.task94_virtual_memory;

import java.util.*;

/**
 * СИМУЛЯЦИЯ ВИРТУАЛЬНОЙ ПАМЯТИ
 *
 * <p>Реализовать симуляцию виртуальной памяти с трансляцией адресов, таблицей страниц,
 * TLB (Translation Lookaside Buffer) и алгоритмами замещения страниц.
 * Моделирует работу MMU (Memory Management Unit) в операционной системе.</p>
 *
 * <h3>Page (страница):</h3>
 * <ul>
 *   <li>pageNumber — номер виртуальной страницы</li>
 *   <li>frameNumber — номер физического фрейма (если загружена)</li>
 *   <li>present — загружена ли в физическую память</li>
 *   <li>dirty — была ли модифицирована</li>
 *   <li>referenced — была ли недавно использована (для Clock алгоритма)</li>
 * </ul>
 *
 * <h3>Основные операции:</h3>
 * <ul>
 *   <li>access(virtualAddress) — трансляция виртуального адреса в физический</li>
 *   <li>read(virtualAddress) — чтение по виртуальному адресу</li>
 *   <li>write(virtualAddress, data) — запись по виртуальному адресу (dirty=true)</li>
 *   <li>loadPage(pageNumber) — загрузить страницу в свободный фрейм</li>
 *   <li>evictPage() — вытеснить страницу по алгоритму замещения</li>
 *   <li>getPageTable() — вернуть таблицу страниц</li>
 *   <li>getTLBHitRate() — процент попаданий в TLB</li>
 *   <li>getPageFaultCount() — количество промахов страниц</li>
 * </ul>
 *
 * <h3>Алгоритмы замещения:</h3>
 * <ul>
 *   <li>FIFO — вытеснить самую старую загруженную страницу</li>
 *   <li>LRU — вытеснить наименее недавно использованную страницу</li>
 *   <li>Clock (Second Chance) — FIFO + referenced bit: если referenced=true, дать второй шанс</li>
 * </ul>
 *
 * <h3>Настройки:</h3>
 * <ul>
 *   <li>pageSize — размер страницы (степень двойки, например 4096)</li>
 *   <li>physicalFrames — количество фреймов физической памяти</li>
 *   <li>virtualPages — количество виртуальных страниц</li>
 *   <li>tlbSize — размер TLB кеша</li>
 * </ul>
 *
 * <p>Уровень: Хардкор</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task94_virtual_memory/VirtualMemoryManager.java
 * java -cp src/main/java com.practice.task94_virtual_memory.VirtualMemoryManager
 * </pre>
 */
public class VirtualMemoryManager {

    /**
     * Алгоритм замещения страниц.
     */
    public enum EvictionPolicy { FIFO, LRU, CLOCK }

    /**
     * Запись в таблице страниц.
     */
    public record PageTableEntry(int pageNumber, int frameNumber, boolean present,
                                  boolean dirty, boolean referenced) {}

    /**
     * Создаёт менеджер виртуальной памяти с заданными параметрами.
     *
     * @param pageSize       размер страницы в байтах (степень двойки)
     * @param physicalFrames количество фреймов физической памяти
     * @param virtualPages   количество виртуальных страниц
     * @param tlbSize        размер TLB кеша
     * @param policy         алгоритм замещения страниц
     */
    public VirtualMemoryManager(int pageSize, int physicalFrames, int virtualPages,
                                 int tlbSize, EvictionPolicy policy) {
        // TODO: implement
    }

    /**
     * Трансляция виртуального адреса в физический.
     * 1. Проверить TLB (если hit — вернуть сразу)
     * 2. Проверить таблицу страниц
     * 3. Если страница не загружена (page fault) — загрузить, при необходимости вытеснив другую
     * 4. Обновить TLB
     *
     * @param virtualAddress виртуальный адрес
     * @return физический адрес
     * @throws IllegalArgumentException если адрес вне допустимого диапазона
     */
    public int access(int virtualAddress) {
        // TODO: implement
        return 0;
    }

    /**
     * Чтение данных по виртуальному адресу.
     * Устанавливает referenced=true.
     *
     * @param virtualAddress виртуальный адрес
     * @return данные (byte)
     */
    public byte read(int virtualAddress) {
        // TODO: implement
        return 0;
    }

    /**
     * Запись данных по виртуальному адресу.
     * Устанавливает dirty=true и referenced=true.
     *
     * @param virtualAddress виртуальный адрес
     * @param data           данные для записи
     */
    public void write(int virtualAddress, byte data) {
        // TODO: implement
    }

    /**
     * Возвращает таблицу страниц.
     *
     * @return список записей таблицы страниц
     */
    public List<PageTableEntry> getPageTable() {
        // TODO: implement
        return List.of();
    }

    /**
     * Возвращает процент попаданий в TLB (hit rate).
     *
     * @return TLB hit rate (от 0.0 до 1.0)
     */
    public double getTLBHitRate() {
        // TODO: implement
        return 0.0;
    }

    /**
     * Возвращает количество page fault (промахов).
     *
     * @return количество page faults
     */
    public int getPageFaultCount() {
        // TODO: implement
        return 0;
    }

    /**
     * Возвращает количество вытеснений страниц.
     *
     * @return количество evictions
     */
    public int getEvictionCount() {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("=== VirtualMemoryManager: Smoke Test ===");
        // TODO: smoke test — создать менеджер, обращаться к адресам,
        // вызвать page fault, проверить TLB hit rate, сравнить алгоритмы замещения
    }
}
