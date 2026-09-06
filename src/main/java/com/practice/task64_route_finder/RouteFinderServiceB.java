package com.practice.task64_route_finder;

import java.util.Optional;

/**
 * МАРШРУТЫ — ВАРИАНТ B: BFS (минимум пересадок)
 *
 * <p>CORE = базовый {@link RouteFinderService} (города/дороги, findShortestPath).</p>
 *
 * <p><b>ВАРИАНТ B — BFS [prim: BFS, unweighted]:</b></p>
 * <ul>
 *   <li>Маршрут с МИНИМАЛЬНЫМ числом рёбер (пересадок), игнорируя веса — обычный BFS по графу.</li>
 *   <li>Проверка: путь с наименьшим числом дорог найден, даже если он длиннее по километрам.</li>
 * </ul>
 */
public class RouteFinderServiceB {
    public Optional<RouteFinderService.Route> findFewestHops(String fromCityId, String toCityId){ throw new UnsupportedOperationException("TODO: variant B — BFS fewest hops"); }
    public static void main(String[] a){ System.out.println("=== RouteFinderServiceB (BFS): Smoke ==="); }
}
