package com.practice.task75_pub_sub;

import java.util.*;
import java.util.function.*;

/**
 * PUBLISH-SUBSCRIBE СИСТЕМА
 *
 * <p>Реализовать потокобезопасную систему Publish-Subscribe с поддержкой топиков,
 * фильтров сообщений, истории и dead letter queue (DLQ) для ошибок обработки.</p>
 *
 * <h3>Основные операции:</h3>
 * <ul>
 *   <li>createTopic(name) — создать топик</li>
 *   <li>deleteTopic(name) — удалить топик и все подписки</li>
 *   <li>subscribe(topic, subscriber, filter) — подписаться с опциональным фильтром</li>
 *   <li>unsubscribe(topic, subscriberId) — отписаться</li>
 *   <li>publish(topic, message) — опубликовать сообщение</li>
 *   <li>getSubscribers(topic) — список подписчиков топика</li>
 *   <li>getMessageHistory(topic, limit) — история сообщений</li>
 * </ul>
 *
 * <h3>Требования:</h3>
 * <ul>
 *   <li>Фильтр — предикат на headers сообщения (если задан, доставлять только если фильтр пройден)</li>
 *   <li>Доставка всем подходящим подписчикам</li>
 *   <li>Dead Letter Queue: если обработчик бросил исключение, сообщение попадает в DLQ</li>
 *   <li>Потокобезопасность всех операций</li>
 *   <li>История сообщений с ограничением по количеству</li>
 * </ul>
 *
 * <p>Уровень: Продвинутый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task75_pub_sub/PubSubService.java
 * java -cp src/main/java com.practice.task75_pub_sub.PubSubService
 * </pre>
 */
public class PubSubService {

    /**
     * Сообщение.
     *
     * @param id уникальный идентификатор
     * @param topic имя топика
     * @param payload полезная нагрузка
     * @param timestamp время создания
     * @param headers заголовки для фильтрации
     */
    public record Message(
            String id,
            String topic,
            String payload,
            long timestamp,
            Map<String, String> headers
    ) {}

    /**
     * Подписчик.
     */
    public interface Subscriber {
        /**
         * Уникальный идентификатор подписчика.
         */
        String getId();

        /**
         * Обработчик входящего сообщения.
         *
         * @param message сообщение
         * @throws Exception если обработка не удалась
         */
        void onMessage(Message message) throws Exception;
    }

    /**
     * Запись в Dead Letter Queue.
     *
     * @param message сообщение, которое не удалось доставить
     * @param subscriberId id подписчика
     * @param error ошибка
     * @param timestamp время ошибки
     */
    public record DeadLetter(Message message, String subscriberId, String error, long timestamp) {}

    /**
     * Создаёт новый топик.
     *
     * @param topicName имя топика
     * @throws IllegalArgumentException если топик с таким именем уже существует
     */
    public void createTopic(String topicName) {
        // TODO: implement
    }

    /**
     * Удаляет топик и все его подписки.
     *
     * @param topicName имя топика
     * @throws IllegalArgumentException если топик не найден
     */
    public void deleteTopic(String topicName) {
        // TODO: implement
    }

    /**
     * Подписывает подписчика на топик с опциональным фильтром.
     *
     * @param topicName имя топика
     * @param subscriber подписчик
     * @param filter предикат на headers (null — без фильтра, получать все)
     */
    public void subscribe(String topicName, Subscriber subscriber,
                          Predicate<Map<String, String>> filter) {
        // TODO: implement
    }

    /**
     * Отписывает подписчика от топика.
     *
     * @param topicName имя топика
     * @param subscriberId id подписчика
     */
    public void unsubscribe(String topicName, String subscriberId) {
        // TODO: implement
    }

    /**
     * Публикует сообщение в топик. Доставляет всем подписчикам, чей фильтр пройден.
     * Если обработчик бросил исключение — сообщение отправляется в Dead Letter Queue.
     *
     * @param topicName имя топика
     * @param payload полезная нагрузка
     * @param headers заголовки сообщения
     */
    public void publish(String topicName, String payload, Map<String, String> headers) {
        // TODO: implement
    }

    /**
     * Возвращает список подписчиков топика.
     *
     * @param topicName имя топика
     * @return множество id подписчиков
     */
    public Set<String> getSubscribers(String topicName) {
        // TODO: implement
        return Collections.emptySet();
    }

    /**
     * Возвращает историю последних сообщений топика.
     *
     * @param topicName имя топика
     * @param limit максимальное количество сообщений
     * @return список сообщений (от новых к старым)
     */
    public List<Message> getMessageHistory(String topicName, int limit) {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Возвращает содержимое Dead Letter Queue.
     *
     * @return список недоставленных сообщений
     */
    public List<DeadLetter> getDeadLetters() {
        // TODO: implement
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        System.out.println("=== PubSubService: Smoke Test ===");
        // TODO: smoke test
    }
}
