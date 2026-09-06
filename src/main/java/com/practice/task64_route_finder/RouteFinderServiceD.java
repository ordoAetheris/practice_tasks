package com.practice.task64_route_finder;

import java.util.List;

/**
 * МАРШРУТЫ — ВАРИАНТ D: ИТЕРАТИВНЫЙ ПЕРЕБОР ПУТЕЙ
 *
 * <p>CORE = базовый {@link RouteFinderService}.</p>
 *
 * <p><b>ВАРИАНТ D — все простые пути итеративно [prim: iterative-stack ⭐]:</b></p>
 * <ul>
 *   <li>Перечислить все простые пути между городами через ЯВНЫЙ стек (не рекурсивный backtracking) с visited на стеке.</li>
 *   <li>Реконструкция пути без рекурсии; ограничение длины/числа путей.</li>
 *   <li>Проверка: все пути найдены итеративно; глубокий граф не роняет стек.</li>
 * </ul>
 */
public class RouteFinderServiceD {
    public List<RouteFinderService.Route> findAllPaths(String fromCityId, String toCityId){ throw new UnsupportedOperationException("TODO: variant D — iterative path enumeration (explicit stack)"); }
    public static void main(String[] a){ System.out.println("=== RouteFinderServiceD (iterative paths): Smoke ==="); }
}
