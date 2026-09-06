package com.practice.task71_pub_sub;

import java.util.Map;

/**
 * PUB/SUB — ВАРИАНТ C: BACKPRESSURE (медленный подписчик)
 *
 * <p>CORE = базовый {@link PubSubService}.</p>
 *
 * <p><b>ВАРИАНТ C — медленный потребитель [prim: backpressure, bounded]:</b></p>
 * <ul>
 *   <li>У каждого подписчика ограниченная очередь; медленный не тормозит publisher бесконечно: политика (block/drop/dead-letter).</li>
 *   <li>Проверка: медленный подписчик переполняет свою очередь → срабатывает политика, остальные получают сообщения вовремя.</li>
 * </ul>
 */
public class PubSubServiceC {
    public void publish(String topicName, String payload, Map<String, String> headers){ throw new UnsupportedOperationException("TODO: variant C — per-subscriber bounded queue + policy"); }
    public static void main(String[] a){ System.out.println("=== PubSubServiceC (backpressure): Smoke ==="); }
}
