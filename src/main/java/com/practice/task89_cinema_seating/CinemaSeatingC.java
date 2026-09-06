package com.practice.task89_cinema_seating;

/**
 * КИНОЗАЛ — ВАРИАНТ C: EDGE
 *
 * <p>CORE = базовый {@link CinemaSeating}.</p>
 *
 * <p><b>ВАРИАНТ C — edge/null-safety [prim: null-edge ⭐]:</b></p>
 * <ul>
 *   <li>Все места заняты (нет места → сигнал), все свободны (первый выбор — обычно край), один ряд/одно место.</li>
 *   <li>Пустой массив, места по краям (расстояние считается от края), чередование занятых.</li>
 *   <li>Проверка: таблица конфигураций даёт корректную позицию max-distance; полностью занятый зал → отказ, не исключение.</li>
 * </ul>
 */
public class CinemaSeatingC {
    public static int maxDistanceSeat(int[] seats){ throw new UnsupportedOperationException("TODO: variant C — edge (full/empty/single/edges)"); }
    public static void main(String[] a){ System.out.println("=== CinemaSeatingC (edge): Smoke ==="); }
}
