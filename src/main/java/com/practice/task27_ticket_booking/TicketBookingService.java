package com.practice.task27_ticket_booking;

import java.time.LocalDateTime;
import java.util.*;

/**
 * БРОНИРОВАНИЕ БИЛЕТОВ НА МЕРОПРИЯТИЯ
 *
 * <p>Реализуйте систему бронирования билетов на мероприятия. Мероприятие имеет секции
 * с ограниченным количеством мест. Билеты проходят через статусы: бронь, оплата, отмена.</p>
 *
 * <p>Сущности:</p>
 * <ul>
 *   <li>Event — мероприятие (id, name, venue, date, список секций)</li>
 *   <li>Section — секция (id, name, totalSeats, price)</li>
 *   <li>Ticket — билет (id, eventId, sectionId, seatNumber, buyerName, status RESERVED/PAID/CANCELLED, reservedAt)</li>
 * </ul>
 *
 * <p>Операции:</p>
 * <ul>
 *   <li>Создать мероприятие с секциями</li>
 *   <li>Забронировать билет на конкретное место в секции</li>
 *   <li>Оплатить забронированный билет</li>
 *   <li>Отменить билет</li>
 *   <li>Получить свободные места в секции</li>
 *   <li>Подсчитать доход от мероприятия (только PAID билеты)</li>
 * </ul>
 *
 * <p>Бизнес-правила:</p>
 * <ul>
 *   <li>Бронь сгорает через 15 минут (логическая проверка при оплате, не таймер)</li>
 *   <li>Нельзя забронировать уже занятое место</li>
 *   <li>Оплатить можно только билет со статусом RESERVED</li>
 *   <li>Номер места должен быть от 1 до totalSeats</li>
 * </ul>
 *
 * <p>Уровень: Средний</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task27_ticket_booking/TicketBookingService.java
 * java -cp src/main/java com.practice.task27_ticket_booking.TicketBookingService
 * </pre>
 */
public class TicketBookingService {

    public enum TicketStatus {
        RESERVED, PAID, CANCELLED
    }

    public record Section(
            String id,
            String name,
            int totalSeats,
            double price
    ) {}

    public record Event(
            String id,
            String name,
            String venue,
            LocalDateTime date,
            List<Section> sections
    ) {}

    public record Ticket(
            String id,
            String eventId,
            String sectionId,
            int seatNumber,
            String buyerName,
            TicketStatus status,
            LocalDateTime reservedAt
    ) {}

    /**
     * Создаёт мероприятие с указанными секциями.
     *
     * @param name     название мероприятия
     * @param venue    площадка
     * @param date     дата и время
     * @param sections список секций
     * @return созданное мероприятие
     * @throws IllegalArgumentException если секции пусты или name пустой
     */
    public Event createEvent(String name, String venue, LocalDateTime date, List<Section> sections) {
        // TODO: implement
        return null;
    }

    /**
     * Бронирует билет на указанное место в секции.
     *
     * @param eventId    идентификатор мероприятия
     * @param sectionId  идентификатор секции
     * @param seatNumber номер места (1-based)
     * @param buyerName  имя покупателя
     * @return забронированный билет
     * @throws IllegalArgumentException если мероприятие/секция не найдены или номер места невалидный
     * @throws IllegalStateException    если место уже занято
     */
    public Ticket reserve(String eventId, String sectionId, int seatNumber, String buyerName) {
        // TODO: implement
        return null;
    }

    /**
     * Оплачивает забронированный билет. Проверяет что бронь не истекла (15 минут).
     *
     * @param ticketId идентификатор билета
     * @return оплаченный билет
     * @throws IllegalStateException если билет не в статусе RESERVED или бронь истекла
     */
    public Ticket pay(String ticketId) {
        // TODO: implement
        return null;
    }

    /**
     * Отменяет билет (RESERVED или PAID).
     *
     * @param ticketId идентификатор билета
     * @return отменённый билет
     */
    public Ticket cancel(String ticketId) {
        // TODO: implement
        return null;
    }

    /**
     * Возвращает список свободных номеров мест в секции.
     *
     * @param eventId   идентификатор мероприятия
     * @param sectionId идентификатор секции
     * @return список свободных номеров мест
     */
    public List<Integer> getAvailableSeats(String eventId, String sectionId) {
        // TODO: implement
        return List.of();
    }

    /**
     * Подсчитывает общий доход от мероприятия (только PAID билеты).
     *
     * @param eventId идентификатор мероприятия
     * @return суммарный доход
     */
    public double getRevenue(String eventId) {
        // TODO: implement
        return 0.0;
    }

    public static void main(String[] args) {
        System.out.println("=== TicketBookingService: Smoke Test ===");
        // TODO: создать тестовые данные и проверить основные сценарии
    }
}
