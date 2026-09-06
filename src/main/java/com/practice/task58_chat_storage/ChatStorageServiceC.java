package com.practice.task58_chat_storage;

import java.util.List;

/**
 * ЧАТ — ВАРИАНТ C: ПАГИНАЦИЯ ИСТОРИИ
 *
 * <p>CORE = базовый {@link ChatStorageService}.</p>
 *
 * <p><b>ВАРИАНТ C — пагинация [prim: keyset-pagination]:</b></p>
 * <ul>
 *   <li>getMessages по курсору (id/время последнего) вместо offset — стабильно при дозаписи новых сообщений.</li>
 *   <li>Листание «вверх» (более старые) и «вниз» (новые).</li>
 *   <li>Проверка: страницы не пропускают/не дублируют при параллельной отправке.</li>
 * </ul>
 */
public class ChatStorageServiceC {
    public List<ChatStorageService.Message> getMessagesBefore(String chatId, String cursorMessageId, int limit){ throw new UnsupportedOperationException("TODO: variant C — keyset pagination"); }
    public static void main(String[] a){ System.out.println("=== ChatStorageServiceC (pagination): Smoke ==="); }
}
