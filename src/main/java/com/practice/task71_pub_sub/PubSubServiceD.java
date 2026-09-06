package com.practice.task71_pub_sub;

import java.util.Map;

/**
 * PUB/SUB — ВАРИАНТ D: ASYNC DELIVERY + SHUTDOWN
 *
 * <p>CORE = базовый {@link PubSubService}.</p>
 *
 * <p><b>ВАРИАНТ D — асинхронная доставка [prim: shutdown ⭐, termination ⭐]:</b></p>
 * <ul>
 *   <li>Доставка подписчикам в фоновом пуле (publish не блокирует publisher); корректный shutdown — слить недоставленное, дождаться воркеров.</li>
 *   <li>Проверка: publish возвращается быстро; после shutdown все принятые сообщения доставлены, потоки завершены.</li>
 * </ul>
 */
public class PubSubServiceD {
    public void publish(String topicName, String payload, Map<String, String> headers){ throw new UnsupportedOperationException("TODO: variant D — async delivery"); }
    public void shutdown(){ throw new UnsupportedOperationException("TODO: variant D — drain + await delivery workers"); }
    public static void main(String[] a){ System.out.println("=== PubSubServiceD (async+shutdown): Smoke ==="); }
}
