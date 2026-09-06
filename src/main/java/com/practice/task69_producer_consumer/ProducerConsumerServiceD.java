package com.practice.task69_producer_consumer;

/**
 * PRODUCER-CONSUMER — ВАРИАНТ D: С ТАЙМАУТОМ + DROP-POLICY
 *
 * <p>CORE = базовый {@link ProducerConsumerService}.</p>
 *
 * <p><b>ВАРИАНТ D — ограниченное ожидание [prim: timeout, backpressure]:</b></p>
 * <ul>
 *   <li>Producer не ждёт бесконечно: при переполнении в течение таймаута — drop (учесть в Stats.dropped).</li>
 *   <li>Проверка: при медленном consumer часть элементов дропается по таймауту, счётчик dropped растёт, дедлока нет.</li>
 * </ul>
 */
public class ProducerConsumerServiceD<T> {
    public ProducerConsumerServiceD(int bufferCapacity, long offerTimeoutMs){ throw new UnsupportedOperationException("TODO: variant D — timed offer + drop policy"); }
    public ProducerConsumerService.Stats getStats(){ throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== ProducerConsumerServiceD (timeout/drop): Smoke ==="); }
}
