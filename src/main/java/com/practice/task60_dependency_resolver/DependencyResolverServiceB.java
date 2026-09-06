package com.practice.task60_dependency_resolver;

import java.util.List;

/**
 * ЗАВИСИМОСТИ — ВАРИАНТ B: ДЕТЕКЦИЯ ЦИКЛОВ
 *
 * <p>CORE = базовый {@link DependencyResolverService} (addModule/resolve/detectCycle).</p>
 *
 * <p><b>ВАРИАНТ B — цикл [prim: cycle-detect, graph]:</b></p>
 * <ul>
 *   <li>Найти цикл в графе зависимостей (три цвета/стек рекурсии) и ВЕРНУТЬ конкретный путь цикла, не просто boolean.</li>
 *   <li>Проверка: A→B→C→A обнаруживается, путь цикла возвращён; ацикличный граф — цикла нет.</li>
 * </ul>
 */
public class DependencyResolverServiceB {
    public List<String> findCyclePath(){ throw new UnsupportedOperationException("TODO: variant B — detect cycle + return path"); }
    public static void main(String[] a){ System.out.println("=== DependencyResolverServiceB (cycle-detect): Smoke ==="); }
}
