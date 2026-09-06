package com.practice.task27_ticket_booking;

/**
 * БИЛЕТЫ — ВАРИАНТ B: DOUBLE-BOOKING МЕСТА
 *
 * <p>CORE = базовый {@link TicketBookingService} (та же модель Event/Section/Ticket).</p>
 *
 * <p><b>ВАРИАНТ B — доменная гонка [prim: mutual-excl ⭐, safe-delete ⭐]:</b></p>
 * <ul>
 *   <li>Два покупателя резервируют ОДНО место (event,section,seat) → наивная «свободно → занять»
 *       выдаёт двоим.</li>
 *   <li>ЗАДАЧА: под гонкой на место — ровно один reserve успешен.</li>
 *   <li>Проверка: N потоков reserve одного места → 1 успех; место уходит из доступных ровно раз.</li>
 * </ul>
 */
public class TicketBookingServiceB {

    public TicketBookingService.Ticket reserve(String eventId, String sectionId, int seatNumber, String buyerName) {
        throw new UnsupportedOperationException("TODO: variant B — no double-booking of a seat");
    }

    public static void main(String[] args) {
        System.out.println("=== TicketBookingServiceB (double-booking места): Smoke ===");
    }
}
