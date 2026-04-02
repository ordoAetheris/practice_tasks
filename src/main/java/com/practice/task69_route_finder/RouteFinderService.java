package com.practice.task69_route_finder;

import java.util.*;

/**
 * ПОИСК МАРШРУТОВ (ROUTE FINDER)
 *
 * <p>Реализовать сервис поиска маршрутов на графе городов и дорог. Использовать алгоритм
 * Дейкстры для поиска кратчайшего/быстрейшего пути. Дороги могут быть односторонними.</p>
 *
 * <h3>Основные операции:</h3>
 * <ul>
 *   <li>addCity(city) — добавить город</li>
 *   <li>addRoad(road) — добавить дорогу (возможно одностороннюю)</li>
 *   <li>findShortestPath(from, to) — кратчайший путь по расстоянию (Dijkstra)</li>
 *   <li>findFastestPath(from, to) — быстрейший путь по времени (Dijkstra)</li>
 *   <li>findAllPaths(from, to, maxStops) — все пути с ограничением на количество остановок</li>
 *   <li>getReachableCities(from, maxDistance) — все достижимые города в пределах расстояния</li>
 *   <li>findNearestCity(from, exclude) — ближайший город (кроме исключённых)</li>
 * </ul>
 *
 * <h3>Требования:</h3>
 * <ul>
 *   <li>Дороги могут быть односторонними (directed graph)</li>
 *   <li>Расстояние и время > 0</li>
 *   <li>Dijkstra для оптимальных путей</li>
 *   <li>findAllPaths — DFS/BFS с ограничением глубины</li>
 *   <li>Результат пути включает: маршрут (список городов), общее расстояние, общее время</li>
 * </ul>
 *
 * <p>Уровень: Продвинутый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task69_route_finder/RouteFinderService.java
 * java -cp src/main/java com.practice.task69_route_finder.RouteFinderService
 * </pre>
 */
public class RouteFinderService {

    /**
     * Город.
     *
     * @param id уникальный идентификатор
     * @param name название города
     * @param latitude широта
     * @param longitude долгота
     */
    public record City(String id, String name, double latitude, double longitude) {}

    /**
     * Дорога между городами.
     *
     * @param fromCityId id города отправления
     * @param toCityId id города назначения
     * @param distanceKm расстояние в километрах (> 0)
     * @param travelTimeMinutes время в пути в минутах (> 0)
     */
    public record Road(String fromCityId, String toCityId, double distanceKm, int travelTimeMinutes) {}

    /**
     * Результат поиска маршрута.
     *
     * @param cities упорядоченный список городов маршрута
     * @param totalDistanceKm суммарное расстояние
     * @param totalTimeMinutes суммарное время
     */
    public record Route(List<City> cities, double totalDistanceKm, int totalTimeMinutes) {}

    /**
     * Добавляет город в граф.
     *
     * @param city город
     */
    public void addCity(City city) {
        // TODO: implement
    }

    /**
     * Добавляет дорогу в граф (односторонняя).
     *
     * @param road дорога
     * @throws IllegalArgumentException если расстояние или время <= 0,
     *         или города не существуют
     */
    public void addRoad(Road road) {
        // TODO: implement
    }

    /**
     * Находит кратчайший путь по расстоянию с помощью алгоритма Дейкстры.
     *
     * @param fromCityId id города отправления
     * @param toCityId id города назначения
     * @return маршрут или Optional.empty() если пути нет
     */
    public Optional<Route> findShortestPath(String fromCityId, String toCityId) {
        // TODO: implement — алгоритм Дейкстры по расстоянию
        return Optional.empty();
    }

    /**
     * Находит быстрейший путь по времени с помощью алгоритма Дейкстры.
     *
     * @param fromCityId id города отправления
     * @param toCityId id города назначения
     * @return маршрут или Optional.empty() если пути нет
     */
    public Optional<Route> findFastestPath(String fromCityId, String toCityId) {
        // TODO: implement — алгоритм Дейкстры по времени
        return Optional.empty();
    }

    /**
     * Находит все возможные пути между городами с ограничением на количество остановок.
     *
     * @param fromCityId id города отправления
     * @param toCityId id города назначения
     * @param maxStops максимальное количество промежуточных остановок
     * @return список всех найденных маршрутов
     */
    public List<Route> findAllPaths(String fromCityId, String toCityId, int maxStops) {
        // TODO: implement — DFS с ограничением глубины
        return Collections.emptyList();
    }

    /**
     * Возвращает все города, достижимые из данного в пределах указанного расстояния.
     *
     * @param fromCityId id исходного города
     * @param maxDistanceKm максимальное расстояние
     * @return множество достижимых городов
     */
    public Set<City> getReachableCities(String fromCityId, double maxDistanceKm) {
        // TODO: implement
        return Collections.emptySet();
    }

    /**
     * Находит ближайший город (по расстоянию кратчайшего пути), исключая указанные.
     *
     * @param fromCityId id исходного города
     * @param excludeCityIds id городов, которые нужно исключить
     * @return ближайший город или Optional.empty()
     */
    public Optional<City> findNearestCity(String fromCityId, Set<String> excludeCityIds) {
        // TODO: implement
        return Optional.empty();
    }

    public static void main(String[] args) {
        System.out.println("=== RouteFinderService: Smoke Test ===");
        // TODO: smoke test
    }
}
