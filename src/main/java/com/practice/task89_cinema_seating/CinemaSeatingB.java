package com.practice.task89_cinema_seating;

/**
 * КИНОЗАЛ — ВАРИАНТ B: THREAD-SAFE БРОНИРОВАНИЕ
 *
 * <p>CORE = базовый {@link CinemaSeating} (maxDistanceSeat — выбор места максимально далеко от занятых).</p>
 *
 * <p><b>ВАРИАНТ B — конкурентная бронь [prim: mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>Состояние зала (занятые места) + bookBestSeat(): атомарно выбрать «лучшее» свободное место и занять его.</li>
 *   <li>Под гонкой два клиента не получают одно место; выбор пересчитывается по актуальному состоянию.</li>
 *   <li>Проверка: N потоков bookBestSeat при M свободных → ровно M успешных броней, без дублей мест.</li>
 * </ul>
 */
public class CinemaSeatingB {
    public CinemaSeatingB(int totalSeats){ throw new UnsupportedOperationException("TODO"); }
    public int bookBestSeat(){ throw new UnsupportedOperationException("TODO: variant B — atomic pick+occupy best seat"); }
    public static void main(String[] a){ System.out.println("=== CinemaSeatingB (thread-safe booking): Smoke ==="); }
}
