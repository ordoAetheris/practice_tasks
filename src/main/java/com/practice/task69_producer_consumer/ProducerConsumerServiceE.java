package com.practice.task69_producer_consumer;

/**
 * PRODUCER-CONSUMER — ВАРИАНТ E: POISON-PILL SHUTDOWN (multi)
 *
 * <p>CORE = базовый {@link ProducerConsumerService}.</p>
 *
 * <p><b>ВАРИАНТ E — завершение [prim: shutdown ⭐, termination ⭐, poison-pill]:</b></p>
 * <ul>
 *   <li>Несколько producer/consumer; shutdown кладёт poison-pill каждому consumer (или флаг+wake all), слив остаток.</li>
 *   <li>Проверка: shutdown → все потоки завершились, буфер дренирован, никто не завис на put/take.</li>
 * </ul>
 */
public class ProducerConsumerServiceE<T> {
    public ProducerConsumerServiceE(int bufferCapacity){ throw new UnsupportedOperationException("TODO"); }
    public void shutdown(){ throw new UnsupportedOperationException("TODO: variant E — poison-pill per consumer + drain"); }
    public static void main(String[] a){ System.out.println("=== ProducerConsumerServiceE (poison-pill): Smoke ==="); }
}
