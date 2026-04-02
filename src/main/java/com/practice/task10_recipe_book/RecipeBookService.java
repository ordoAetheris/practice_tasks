package com.practice.task10_recipe_book;

import java.util.*;

/**
 * КНИГА РЕЦЕПТОВ
 *
 * <p>Реализуйте сервис книги рецептов с возможностью поиска и фильтрации.
 * Каждый рецепт содержит список ингредиентов с количеством и единицей измерения.
 * Поддерживается поиск рецептов по доступным ингредиентам.</p>
 *
 * <p>Сущности:</p>
 * <ul>
 *   <li>Ingredient — ингредиент: name, amount, unit</li>
 *   <li>Recipe — рецепт: id, name, ingredients (список), cookingTimeMinutes,
 *       difficulty (EASY/MEDIUM/HARD)</li>
 * </ul>
 *
 * <p>Бизнес-правила:</p>
 * <ul>
 *   <li>Название рецепта не может быть пустым</li>
 *   <li>Время приготовления > 0</li>
 *   <li>Рецепт должен содержать хотя бы один ингредиент</li>
 * </ul>
 *
 * <p>Уровень: Базовый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task10_recipe_book/RecipeBookService.java
 * java -cp src/main/java com.practice.task10_recipe_book.RecipeBookService
 * </pre>
 */
public class RecipeBookService {

    public enum Difficulty { EASY, MEDIUM, HARD }

    public record Ingredient(String name, double amount, String unit) {}

    public record Recipe(Long id, String name, List<Ingredient> ingredients,
                         int cookingTimeMinutes, Difficulty difficulty) {}

    /**
     * Добавить рецепт.
     * @param recipe рецепт
     * @throws IllegalArgumentException если данные невалидны
     */
    public void addRecipe(Recipe recipe) {
        // TODO: implement
    }

    /**
     * Удалить рецепт по id.
     * @param recipeId идентификатор рецепта
     * @return true если рецепт удалён
     */
    public boolean removeRecipe(Long recipeId) {
        // TODO: implement
        return false;
    }

    /**
     * Поиск рецептов по названию (подстрока, без учёта регистра).
     * @param namePart часть названия
     * @return список найденных рецептов
     */
    public List<Recipe> searchByName(String namePart) {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Поиск рецептов, содержащих указанный ингредиент (по имени, без учёта регистра).
     * @param ingredientName название ингредиента
     * @return список рецептов
     */
    public List<Recipe> searchByIngredient(String ingredientName) {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Фильтр рецептов по сложности.
     * @param difficulty сложность
     * @return список рецептов
     */
    public List<Recipe> filterByDifficulty(Difficulty difficulty) {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Фильтр рецептов по максимальному времени приготовления (<=).
     * @param maxMinutes максимальное время в минутах
     * @return список рецептов с временем приготовления <= maxMinutes
     */
    public List<Recipe> filterByMaxCookingTime(int maxMinutes) {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Найти рецепты, которые можно приготовить из заданного набора ингредиентов.
     * Рецепт подходит, если ВСЕ его ингредиенты содержатся в заданном списке
     * (сравнение по имени, без учёта регистра).
     * @param availableIngredients список доступных ингредиентов (по именам)
     * @return список подходящих рецептов
     */
    public List<Recipe> findRecipesWithIngredients(List<String> availableIngredients) {
        // TODO: implement
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        System.out.println("=== RecipeBookService: Smoke Test ===");
        // TODO: создать тестовые данные и проверить основные сценарии
    }
}
