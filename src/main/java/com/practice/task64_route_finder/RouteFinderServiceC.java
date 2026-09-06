package com.practice.task64_route_finder;

import java.util.Optional;

/**
 * МАРШРУТЫ — ВАРИАНТ C: DIJKSTRA (веса)
 *
 * <p>CORE = базовый {@link RouteFinderService}.</p>
 *
 * <p><b>ВАРИАНТ C — Dijkstra [prim: Dijkstra, weighted, heap]:</b></p>
 * <ul>
 *   <li>Кратчайший путь по расстоянию/времени с PriorityQueue; неотрицательные веса.</li>
 *   <li>Проверка: минимальная суммарная дистанция/время; результат совпадает с эталоном на тест-графе.</li>
 * </ul>
 */
public class RouteFinderServiceC {
    public Optional<RouteFinderService.Route> findShortestByDistance(String fromCityId, String toCityId){ throw new UnsupportedOperationException("TODO: variant C — Dijkstra weighted"); }
    public static void main(String[] a){ System.out.println("=== RouteFinderServiceC (Dijkstra): Smoke ==="); }
}
