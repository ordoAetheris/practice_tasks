package com.practice.task27_ticket_booking;

/**
 * БИЛЕТЫ — ВАРИАНТ C: HOLD-EXPIRY + RELEASE
 *
 * <p>CORE = базовый {@link TicketBookingService}.</p>
 *
 * <p><b>ВАРИАНТ C — временный резерв с TTL [prim: per-key-eviction, shutdown ⭐]:</b></p>
 * <ul>
 *   <li>reserve удерживает место с TTL; если не оплачено вовремя — место автоматически освобождается (release).</li>
 *   <li>Фоновый reaper/ленивая проверка истечения; корректный shutdown фонового потока.</li>
 *   <li>Проверка: зарезервировал, не оплатил → спустя TTL место снова доступно; оплата до TTL фиксирует.</li>
 * </ul>
 */
public class TicketBookingServiceC {

    public TicketBookingService.Ticket reserve(String eventId, String sectionId, int seatNumber, String buyerName) {
        throw new UnsupportedOperationException("TODO: variant C — hold with TTL");
    }

    /** Освободить протухшие резервы (вызывается reaper'ом или лениво). */
    public int releaseExpired() {
        throw new UnsupportedOperationException("TODO: variant C — release expired holds");
    }

    public static void main(String[] args) {
        System.out.println("=== TicketBookingServiceC (hold-expiry + release): Smoke ===");
    }
}
