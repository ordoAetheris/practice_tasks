package com.practice.task08_movie_collection;

import java.util.*;

/**
 * КАТАЛОГ ФИЛЬМОВ
 *
 * <p>Реализуйте сервис каталога фильмов с возможностью фильтрации и рейтингами.
 * Фильмы могут принадлежать нескольким жанрам. Поддерживается поиск, фильтрация
 * и формирование рейтингов.</p>
 *
 * <p>Сущности:</p>
 * <ul>
 *   <li>Movie — фильм: id, title, director, year, genres (список жанров), rating (0.0-10.0)</li>
 * </ul>
 *
 * <p>Бизнес-правила:</p>
 * <ul>
 *   <li>Рейтинг от 0.0 до 10.0</li>
 *   <li>Год выпуска должен быть положительным</li>
 *   <li>Название не может быть пустым</li>
 * </ul>
 *
 * <p>Уровень: Базовый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task08_movie_collection/MovieCollectionService.java
 * java -cp src/main/java com.practice.task08_movie_collection.MovieCollectionService
 * </pre>
 */
public class MovieCollectionService {

    public record Movie(Long id, String title, String director, int year,
                        List<String> genres, double rating) {}

    /**
     * Добавить фильм в каталог.
     * @param movie фильм
     * @throws IllegalArgumentException если фильм с таким id уже существует или данные невалидны
     */
    public void addMovie(Movie movie) {
        // TODO: implement
    }

    /**
     * Удалить фильм по id.
     * @param movieId идентификатор фильма
     * @return true если фильм удалён
     */
    public boolean removeMovie(Long movieId) {
        // TODO: implement
        return false;
    }

    /**
     * Поиск фильмов по названию (подстрока, без учёта регистра).
     * @param titlePart часть названия
     * @return список найденных фильмов
     */
    public List<Movie> searchByTitle(String titlePart) {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Фильтр фильмов по жанру.
     * @param genre жанр
     * @return список фильмов данного жанра
     */
    public List<Movie> filterByGenre(String genre) {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Фильтр фильмов по году выпуска.
     * @param year год
     * @return список фильмов указанного года
     */
    public List<Movie> filterByYear(int year) {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Фильтр фильмов по минимальному рейтингу (>=).
     * @param minRating минимальный рейтинг (включительно)
     * @return список фильмов с рейтингом >= minRating
     */
    public List<Movie> filterByMinRating(double minRating) {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Топ-N фильмов по рейтингу (от наибольшего к наименьшему).
     * @param n количество фильмов
     * @return список топ-N фильмов
     */
    public List<Movie> getTopRated(int n) {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Средний рейтинг фильмов указанного жанра.
     * @param genre жанр
     * @return средний рейтинг или 0.0 если фильмов нет
     */
    public double getAverageRatingByGenre(String genre) {
        // TODO: implement
        return 0.0;
    }

    public static void main(String[] args) {
        System.out.println("=== MovieCollectionService: Smoke Test ===");
        // TODO: создать тестовые данные и проверить основные сценарии
    }
}
