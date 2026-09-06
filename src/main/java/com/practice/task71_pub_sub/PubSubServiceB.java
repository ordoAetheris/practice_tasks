package com.practice.task71_pub_sub;

import java.util.Map;

/**
 * PUB/SUB — ВАРИАНТ B: SAFE UNSUBSCRIBE ВО ВРЕМЯ PUBLISH
 *
 * <p>CORE = базовый {@link PubSubService} (topics, subscribe/publish).</p>
 *
 * <p><b>ВАРИАНТ B — безопасная модификация подписчиков [prim: safe-delete ⭐, mutual-excl]:</b></p>
 * <ul>
 *   <li>unsubscribe/subscribe во время итерации подписчиков в publish → без ConcurrentModificationException.</li>
 *   <li>Направления: снимок списка подписчиков на момент публикации; либо CopyOnWriteArrayList.</li>
 *   <li>Проверка: подписчик, отписавшийся в ходе publish, не получает сообщение (или получает текущее, но без CME).</li>
 * </ul>
 */
public class PubSubServiceB {
    public void subscribe(String topicName, PubSubService.Subscriber sub){ throw new UnsupportedOperationException("TODO"); }
    public void unsubscribe(String topicName, String subscriberId){ throw new UnsupportedOperationException("TODO: variant B — safe during publish"); }
    public void publish(String topicName, String payload, Map<String, String> headers){ throw new UnsupportedOperationException("TODO: variant B — iterate snapshot"); }
    public static void main(String[] a){ System.out.println("=== PubSubServiceB (safe unsubscribe): Smoke ==="); }
}
