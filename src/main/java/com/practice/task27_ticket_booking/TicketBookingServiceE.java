package com.practice.task27_ticket_booking;

/**
 * БИЛЕТЫ — ВАРИАНТ E: ГРАНУЛЯРНЫЙ ЛОК НА МЕСТО
 *
 * <p>CORE = базовый {@link TicketBookingService}.</p>
 *
 * <p><b>ВАРИАНТ E — гранулярность [prim: striping]:</b></p>
 * <ul>
 *   <li>Лок на конкретное место (event,section,seat), а не на событие целиком: резервы РАЗНЫХ мест параллельны.</li>
 *   <li>Проверка: N потоков резервируют N разных мест параллельно (нет глобальной сериализации по событию).</li>
 * </ul>
 */
public class TicketBookingServiceE {

    public TicketBookingService.Ticket reserve(String eventId, String sectionId, int seatNumber, String buyerName) {
        throw new UnsupportedOperationException("TODO: variant E — per-seat lock striping");
    }

    public static void main(String[] args) {
        System.out.println("=== TicketBookingServiceE (granular per-seat lock): Smoke ===");
    }
}
