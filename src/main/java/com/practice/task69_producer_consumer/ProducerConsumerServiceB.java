package com.practice.task69_producer_consumer;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * PRODUCER-CONSUMER — ВАРИАНТ B: wait/notify + WHILE-GUARD
 *
 * <p>CORE = базовый {@link ProducerConsumerService} (bounded буфер, producer/consumer потоки).</p>
 *
 * <p><b>ВАРИАНТ B — мониторы [prim: wait-notify, spurious-wakeup]:</b></p>
 * <ul>
 *   <li>Буфер под монитором; producer ждёт !full, consumer ждёт !empty — обе в WHILE (spurious/lost wakeup).</li>
 *   <li>Проверка: produced == consumed после дренажа; ни потерь, ни дублей.</li>
 * </ul>
 */
public class ProducerConsumerServiceB<T> {
    public ProducerConsumerServiceB(int bufferCapacity){ throw new UnsupportedOperationException("TODO"); }
    public Thread startProducer(Supplier<T> source){ throw new UnsupportedOperationException("TODO: variant B — wait/notify while-guard"); }
    public Thread startConsumer(Consumer<T> handler){ throw new UnsupportedOperationException("TODO: variant B"); }
    public static void main(String[] a){ System.out.println("=== ProducerConsumerServiceB (wait/notify): Smoke ==="); }
}
