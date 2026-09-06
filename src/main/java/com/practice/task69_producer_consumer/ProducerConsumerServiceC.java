package com.practice.task69_producer_consumer;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * PRODUCER-CONSUMER — ВАРИАНТ C: Lock + notFull/notEmpty Condition
 *
 * <p>CORE = базовый {@link ProducerConsumerService}.</p>
 *
 * <p><b>ВАРИАНТ C — раздельные условия [prim: Condition]:</b></p>
 * <ul>
 *   <li>ReentrantLock + два Condition; точечный signal той стороне, что ждёт; корректный await под lock.</li>
 *   <li>Проверка: та же корректность, что B, но через Lock/Condition; нет потерянных сигналов.</li>
 * </ul>
 */
public class ProducerConsumerServiceC<T> {
    public ProducerConsumerServiceC(int bufferCapacity){ throw new UnsupportedOperationException("TODO"); }
    public Thread startProducer(Supplier<T> source){ throw new UnsupportedOperationException("TODO: variant C — Lock + conditions"); }
    public Thread startConsumer(Consumer<T> handler){ throw new UnsupportedOperationException("TODO: variant C"); }
    public static void main(String[] a){ System.out.println("=== ProducerConsumerServiceC (Condition): Smoke ==="); }
}
