package com.practice.task41_chat_storage;

import java.time.LocalDateTime;
import java.util.*;

/**
 * ХРАНИЛИЩЕ СООБЩЕНИЙ ЧАТА
 *
 * <p>Реализуйте сервис хранения и управления сообщениями чата.
 * Чат (Chat) содержит: id, список участников (participants).
 * Сообщение (Message) содержит: id, chatId, senderId, text, timestamp,
 * status (SENT/DELIVERED/READ), edited (boolean), deleted (boolean).</p>
 *
 * <p>Необходимо реализовать следующие операции:</p>
 * <ul>
 *   <li>createChat(participants) — создать чат с указанными участниками</li>
 *   <li>sendMessage(chatId, senderId, text) — отправить сообщение в чат</li>
 *   <li>editMessage(messageId, senderId, newText) — редактировать сообщение (только автор)</li>
 *   <li>deleteMessage(messageId, senderId) — удалить сообщение (только автор, мягкое удаление)</li>
 *   <li>getMessages(chatId, limit, offset) — получить сообщения с пагинацией</li>
 *   <li>searchMessages(chatId, query) — поиск сообщений по тексту</li>
 *   <li>markAsRead(chatId, userId) — пометить все сообщения как прочитанные</li>
 *   <li>getUnreadCount(chatId, userId) — количество непрочитанных сообщений</li>
 * </ul>
 *
 * <p>Бизнес-правила:</p>
 * <ul>
 *   <li>Редактировать и удалять сообщение может только его автор</li>
 *   <li>Удалённые сообщения не возвращаются в выборках, но занимают место (мягкое удаление)</li>
 *   <li>Отправлять сообщения может только участник чата</li>
 *   <li>Пагинация: offset — смещение от начала, limit — максимальное количество</li>
 * </ul>
 *
 * <p>Уровень: Средний</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task41_chat_storage/ChatStorageService.java
 * java -cp src/main/java com.practice.task41_chat_storage.ChatStorageService
 * </pre>
 */
public class ChatStorageService {

    public enum MessageStatus {
        SENT, DELIVERED, READ
    }

    public record Chat(
            String id,
            List<String> participants
    ) {}

    public record Message(
            String id,
            String chatId,
            String senderId,
            String text,
            LocalDateTime timestamp,
            MessageStatus status,
            boolean edited,
            boolean deleted
    ) {}

    /**
     * Создаёт новый чат с указанными участниками.
     * @param participants список идентификаторов участников (минимум 2)
     * @return созданный чат
     * @throws IllegalArgumentException если участников меньше 2
     */
    public Chat createChat(List<String> participants) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Отправляет сообщение в чат.
     * @param chatId идентификатор чата
     * @param senderId идентификатор отправителя (должен быть участником чата)
     * @param text текст сообщения
     * @return отправленное сообщение со статусом SENT
     * @throws IllegalArgumentException если отправитель не участник чата
     */
    public Message sendMessage(String chatId, String senderId, String text) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Редактирует текст сообщения. Только автор может редактировать своё сообщение.
     * @param messageId идентификатор сообщения
     * @param senderId идентификатор пользователя (должен совпадать с автором)
     * @param newText новый текст сообщения
     * @return обновлённое сообщение с флагом edited=true
     * @throws IllegalAccessException если пользователь не является автором
     */
    public Message editMessage(String messageId, String senderId, String newText) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Удаляет сообщение (мягкое удаление). Только автор может удалить своё сообщение.
     * @param messageId идентификатор сообщения
     * @param senderId идентификатор пользователя
     * @throws IllegalAccessException если пользователь не является автором
     */
    public void deleteMessage(String messageId, String senderId) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Возвращает сообщения чата с пагинацией. Удалённые сообщения не включаются.
     * @param chatId идентификатор чата
     * @param limit максимальное количество сообщений
     * @param offset смещение от начала
     * @return список сообщений
     */
    public List<Message> getMessages(String chatId, int limit, int offset) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Ищет сообщения в чате по текстовому запросу (подстрока, без учёта регистра).
     * Удалённые сообщения не включаются.
     * @param chatId идентификатор чата
     * @param query поисковый запрос
     * @return список найденных сообщений
     */
    public List<Message> searchMessages(String chatId, String query) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Помечает все сообщения в чате как прочитанные для данного пользователя.
     * @param chatId идентификатор чата
     * @param userId идентификатор пользователя
     */
    public void markAsRead(String chatId, String userId) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Возвращает количество непрочитанных сообщений в чате для данного пользователя.
     * @param chatId идентификатор чата
     * @param userId идентификатор пользователя
     * @return количество непрочитанных сообщений
     */
    public int getUnreadCount(String chatId, String userId) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    public static void main(String[] args) {
        System.out.println("=== ChatStorageService: Smoke Test ===");
        // TODO: smoke test
    }
}
