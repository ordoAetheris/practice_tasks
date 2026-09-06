package com.practice.task58_chat_storage;

/**
 * ЧАТ — ВАРИАНТ B: DEDUP СООБЩЕНИЙ
 *
 * <p>CORE = базовый {@link ChatStorageService} (sendMessage/getMessages).</p>
 *
 * <p><b>ВАРИАНТ B — дедупликация [prim: idempotency ⭐]:</b></p>
 * <ul>
 *   <li>sendMessage с clientMsgId: ретрай/дубль (нестабильная сеть) не создаёт второе сообщение.</li>
 *   <li>Проверка: два send с одним clientMsgId → одно сообщение в истории.</li>
 * </ul>
 */
public class ChatStorageServiceB {
    public ChatStorageService.Message sendMessage(String chatId, String senderId, String text, String clientMsgId){ throw new UnsupportedOperationException("TODO: variant B — dedup by clientMsgId"); }
    public static void main(String[] a){ System.out.println("=== ChatStorageServiceB (dedup): Smoke ==="); }
}
