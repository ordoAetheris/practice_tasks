package com.practice.task64_producer_consumer;

import java.util.*;
import java.util.function.*;

/**
 * PRODUCER-CONSUMER С BACKPRESSURE
 *
 * <p>Реализовать паттерн Producer-Consumer с механизмом backpressure (обратного давления).
 * Буфер ограничен по размеру. Когда буфер полон, producer блокируется до появления
 * свободного места, а не отбрасывает элементы.</p>
 *
 * <h3>Основные операции:</h3>
 * <ul>
 *   <li>createBuffer(capacity) — создать ограниченный буфер</li>
 *   <li>produce(item) — добавить элемент в буфер (блокировка при полном буфере)</li>
 *   <li>consume() — извлечь элемент из буфера (блокировка при пустом буфере)</li>
 *   <li>startProducer(source) — запустить поток-producer с источником данных</li>
 *   <li>startConsumer(handler) — запустить поток-consumer с обработчиком</li>
 *   <li>getStats() — статистика: количество произведённых, потреблённых, отброшенных элементов</li>
 *   <li>shutdown() — корректное завершение всех потоков</li>
 * </ul>
 *
 * <h3>Требования:</h3>
 * <ul>
 *   <li>Backpressure: producer блокируется при полном буфере</li>
 *   <li>Graceful shutdown: завершение producer/consumer потоков без потери данных</li>
 *   <li>Потокобезопасность всех операций</li>
 *   <li>Подсчёт статистики produced/consumed/dropped</li>
 * </ul>
 *
 * <p>Уровень: Продвинутый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task64_producer_consumer/ProducerConsumerService.java
 * java -cp src/main/java com.practice.task64_producer_consumer.ProducerConsumerService
 * </pre>
 */
public class ProducerConsumerService<T> {

    /**
     * Статистика работы сервиса.
     */
    public record Stats(long produced, long consumed, long dropped) {}

    /**
     * Создаёт сервис с буфером указанной ёмкости.
     *
     * @param bufferCapacity максимальная ёмкость буфера
     */
    public ProducerConsumerService(int bufferCapacity) {
        // TODO: implement
    }

    /**
     * Добавляет элемент в буфер. Блокирует поток, если буфер полон (backpressure).
     *
     * @param item элемент для добавления
     * @throws InterruptedException если поток был прерван
     */
    public void produce(T item) throws InterruptedException {
        // TODO: implement
    }

    /**
     * Извлекает элемент из буфера. Блокирует поток, если буфер пуст.
     *
     * @return элемент из буфера
     * @throws InterruptedException если поток был прерван
     */
    public T consume() throws InterruptedException {
        // TODO: implement
        return null;
    }

    /**
     * Запускает поток-producer, который извлекает элементы из source и помещает в буфер.
     *
     * @param source поставщик элементов (возвращает null когда данных больше нет)
     * @return запущенный поток
     */
    public Thread startProducer(Supplier<T> source) {
        // TODO: implement
        return null;
    }

    /**
     * Запускает поток-consumer, который извлекает элементы из буфера и передаёт в handler.
     *
     * @param handler обработчик элементов
     * @return запущенный поток
     */
    public Thread startConsumer(Consumer<T> handler) {
        // TODO: implement
        return null;
    }

    /**
     * Возвращает текущую статистику: количество произведённых, потреблённых и отброшенных элементов.
     *
     * @return объект статистики
     */
    public Stats getStats() {
        // TODO: implement
        return null;
    }

    /**
     * Корректно останавливает все потоки producer и consumer.
     * Ожидает обработки оставшихся элементов в буфере.
     */
    public void shutdown() {
        // TODO: implement
    }

    public static void main(String[] args) {
        System.out.println("=== ProducerConsumerService: Smoke Test ===");
        // TODO: smoke test
    }
}
