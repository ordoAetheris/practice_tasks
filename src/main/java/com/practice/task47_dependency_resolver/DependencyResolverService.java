package com.practice.task47_dependency_resolver;

import java.util.*;

/**
 * РЕЗОЛВЕР ЗАВИСИМОСТЕЙ
 *
 * <p>Реализуйте сервис разрешения зависимостей между модулями.
 * Модуль (Module) содержит: name, список зависимостей (dependencies — имена других модулей).</p>
 *
 * <p>Необходимо реализовать следующие операции:</p>
 * <ul>
 *   <li>addModule(name, dependencies) — добавить модуль с зависимостями</li>
 *   <li>resolve(moduleName) — вернуть все зависимости в порядке установки (topological sort)</li>
 *   <li>detectCycle() — проверить наличие циклической зависимости в графе</li>
 *   <li>removeModule(name) — удалить модуль (если от него никто не зависит)</li>
 *   <li>getDependents(name) — получить список модулей, которые зависят от данного</li>
 * </ul>
 *
 * <p>Бизнес-правила:</p>
 * <ul>
 *   <li>Циклические зависимости — ошибка (при resolve бросать исключение)</li>
 *   <li>Нельзя удалить модуль, от которого зависят другие модули</li>
 *   <li>resolve возвращает зависимости в порядке, при котором каждый модуль стоит после своих зависимостей</li>
 *   <li>Зависимость на несуществующий модуль — ошибка</li>
 * </ul>
 *
 * <p>Уровень: Средний</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task47_dependency_resolver/DependencyResolverService.java
 * java -cp src/main/java com.practice.task47_dependency_resolver.DependencyResolverService
 * </pre>
 */
public class DependencyResolverService {

    public record Module(
            String name,
            List<String> dependencies
    ) {}

    /**
     * Добавляет модуль с указанными зависимостями.
     * @param name имя модуля
     * @param dependencies список имён зависимостей
     * @throws IllegalArgumentException если зависимость ссылается на несуществующий модуль
     */
    public void addModule(String name, List<String> dependencies) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Разрешает все зависимости модуля и возвращает их в порядке установки
     * (топологическая сортировка). Включает сам модуль последним.
     * @param moduleName имя модуля
     * @return список модулей в порядке установки
     * @throws IllegalStateException если обнаружена циклическая зависимость
     */
    public List<String> resolve(String moduleName) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Проверяет, есть ли циклические зависимости во всём графе модулей.
     * @return true если обнаружен цикл
     */
    public boolean detectCycle() {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Удаляет модуль из графа.
     * @param name имя модуля
     * @throws IllegalStateException если от модуля зависят другие модули
     */
    public void removeModule(String name) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Возвращает список модулей, которые зависят от указанного модуля.
     * @param name имя модуля
     * @return список зависимых модулей
     */
    public List<String> getDependents(String name) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    public static void main(String[] args) {
        System.out.println("=== DependencyResolverService: Smoke Test ===");
        // TODO: smoke test
    }
}
