package com.practice.task58_chat_storage;

/**
 * ЧАТ — ВАРИАНТ D: THREAD-SAFE APPEND + УПОРЯДОЧИВАНИЕ
 *
 * <p>CORE = базовый {@link ChatStorageService}.</p>
 *
 * <p><b>ВАРИАНТ D — потокобезопасная дозапись [prim: mutual-excl ⭐, ordering]:</b></p>
 * <ul>
 *   <li>Конкурентные sendMessage в один чат добавляются атомарно и в согласованном порядке (монотонный seq/id).</li>
 *   <li>Проверка: K потоков шлют в один чат → все сообщения на месте, порядок детерминирован (по seq), без гонок.</li>
 * </ul>
 */
public class ChatStorageServiceD {
    public ChatStorageService.Message sendMessage(String chatId, String senderId, String text){ throw new UnsupportedOperationException("TODO: variant D — thread-safe append + ordering (seq)"); }
    public static void main(String[] a){ System.out.println("=== ChatStorageServiceD (thread-safe append): Smoke ==="); }
}
