package com.practice.task02_product_catalog;

import java.util.*;

/**
 * КАТАЛОГ ТОВАРОВ ПО КАТЕГОРИЯМ
 *
 * <p>Реализуйте сервис каталога товаров с привязкой к категориям (типичное задание X5).
 * Каждый товар может принадлежать нескольким категориям.
 * Метод init() вызывается ровно один раз для инициализации внутренних структур данных.</p>
 *
 * <p>Сущности:</p>
 * <ul>
 *   <li>Category — категория товара: id, name</li>
 *   <li>Product — товар: id, name, categories (список категорий)</li>
 * </ul>
 *
 * <p>Ключевое требование: после вызова init() методы isProductInCategory и getProductsByCategory
 * должны работать максимально быстро (подумайте о правильных структурах данных).</p>
 *
 * <p>Уровень: Базовый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task02_product_catalog/ProductCatalogService.java
 * java -cp src/main/java com.practice.task02_product_catalog.ProductCatalogService
 * </pre>
 */
public class ProductCatalogService {

    public interface Category {
        Long getId();
        String getName();
    }

    public interface Product {
        Long getId();
        String getName();
        List<Category> getCategories();
    }

    public record CategoryImpl(Long id, String name) implements Category {
        @Override public Long getId() { return id; }
        @Override public String getName() { return name; }
    }

    public record ProductImpl(Long id, String name, List<Category> categories) implements Product {
        @Override public Long getId() { return id; }
        @Override public String getName() { return name; }
        @Override public List<Category> getCategories() { return categories; }
    }

    /**
     * Инициализация сервиса списком категорий и товаров.
     * Вызывается ровно один раз. Должен подготовить внутренние структуры
     * для быстрого поиска.
     * @param categories список категорий
     * @param products список товаров
     */
    public void init(List<Category> categories, List<Product> products) {
        // TODO: implement
    }

    /**
     * Проверить, принадлежит ли товар указанной категории.
     * @param productId идентификатор товара
     * @param categoryId идентификатор категории
     * @return true если товар принадлежит категории
     */
    public boolean isProductInCategory(Long productId, Long categoryId) {
        // TODO: implement
        return false;
    }

    /**
     * Получить список товаров в категории, отсортированный по id товара.
     * @param categoryId идентификатор категории
     * @return отсортированный список товаров
     */
    public List<Product> getProductsByCategory(Long categoryId) {
        // TODO: implement
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        System.out.println("=== ProductCatalogService: Smoke Test ===");
        // TODO: создать тестовые данные и проверить основные сценарии
    }
}
