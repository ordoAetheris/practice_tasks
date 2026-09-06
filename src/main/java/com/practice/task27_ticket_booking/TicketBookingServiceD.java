package com.practice.task27_ticket_booking;

/**
 * БИЛЕТЫ — ВАРИАНТ D: ИДЕМПОТЕНТНАЯ ОПЛАТА
 *
 * <p>CORE = базовый {@link TicketBookingService}.</p>
 *
 * <p><b>ВАРИАНТ D — идемпотентность [prim: idempotency ⭐]:</b></p>
 * <ul>
 *   <li>Повторный pay того же билета (двойной клик/ретрай) — no-op, деньги списываются один раз.</li>
 *   <li>Под гонкой двух pay — один эффект.</li>
 *   <li>Проверка: pay дважды → статус PAID один раз; выручка +цена один раз.</li>
 * </ul>
 */
public class TicketBookingServiceD {

    public TicketBookingService.Ticket pay(String ticketId) {
        throw new UnsupportedOperationException("TODO: variant D — idempotent pay");
    }

    public static void main(String[] args) {
        System.out.println("=== TicketBookingServiceD (идемпотентная оплата): Smoke ===");
    }
}
