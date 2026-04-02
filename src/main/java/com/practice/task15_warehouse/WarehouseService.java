package com.practice.task15_warehouse;

import java.util.*;

/**
 * Складской учёт.
 *
 * <p>Реализовать in-memory систему складского учёта: приход, расход, остатки,
 * история движения товаров.</p>
 *
 * <p>Уровень: Базовый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task15_warehouse/WarehouseService.java
 * java -cp src/main/java com.practice.task15_warehouse.WarehouseService
 * </pre>
 */
public class WarehouseService {

    public enum Operation { INCOMING, OUTGOING }

    public record Product(String id, String name, String category) {}
    public record StockRecord(String productId, int quantity, Operation operation, long timestamp) {}

    /** Добавить товар в каталог */
    public void addProduct(Product product) {
        //TODO implement
    }

    /**
     * Приход товара
     * @param productId идентификатор товара
     * @param quantity количество (> 0)
     */
    public void incoming(String productId, int quantity) {
        //TODO implement
    }

    /**
     * Расход товара
     * @param productId идентификатор товара
     * @param quantity количество (> 0)
     * @throws IllegalStateException если остаток < quantity
     */
    public void outgoing(String productId, int quantity) {
        //TODO implement
    }

    /** Текущий остаток товара */
    public int getStock(String productId) {
        //TODO implement
        return 0;
    }

    /** История движения товара */
    public List<StockRecord> getHistory(String productId) {
        //TODO implement
        return Collections.emptyList();
    }

    /** Товары с остатком ниже минимума */
    public List<Product> getLowStock(int minQuantity) {
        //TODO implement
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        System.out.println("=== WarehouseService: Smoke Test ===");
        // TODO: добавить товары, приход/расход, проверить остатки
    }
}
