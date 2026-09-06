package com.practice.task64_route_finder;

import java.util.Optional;

/**
 * МАРШРУТЫ — ВАРИАНТ E: EDGE (несвязный граф)
 *
 * <p>CORE = базовый {@link RouteFinderService}.</p>
 *
 * <p><b>ВАРИАНТ E — edge/null-safety [prim: null-edge ⭐]:</b></p>
 * <ul>
 *   <li>Нет пути (разные компоненты) → Optional.empty, не исключение; from==to → тривиальный путь.</li>
 *   <li>Неизвестный город, нулевая/отрицательная дистанция (отклонить), одна дорога в обе стороны.</li>
 *   <li>Проверка: несвязные города → пусто; петля из одного города корректна.</li>
 * </ul>
 */
public class RouteFinderServiceE {
    public Optional<RouteFinderService.Route> findShortestPath(String fromCityId, String toCityId){ throw new UnsupportedOperationException("TODO: variant E — edge (disconnected/self/unknown)"); }
    public static void main(String[] a){ System.out.println("=== RouteFinderServiceE (edge): Smoke ==="); }
}
