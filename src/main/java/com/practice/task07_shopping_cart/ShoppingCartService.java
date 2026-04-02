package com.practice.task07_shopping_cart;

import java.math.BigDecimal;
import java.util.*;

/**
 * КОРЗИНА ПОКУПОК
 *
 * <p>Реализуйте сервис корзины покупок для интернет-магазина.
 * Поддерживается создание нескольких корзин, добавление/удаление товаров,
 * изменение количества и расчёт итоговой суммы.</p>
 *
 * <p>Сущности:</p>
 * <ul>
 *   <li>Product — товар: id, name, price</li>
 *   <li>CartItem — позиция в корзине: product, quantity</li>
 *   <li>Cart — корзина: id, items (список позиций)</li>
 * </ul>
 *
 * <p>Бизнес-правила:</p>
 * <ul>
 *   <li>Количество товара должно быть > 0</li>
 *   <li>Цена товара должна быть > 0</li>
 *   <li>При повторном добавлении того же товара увеличивается количество</li>
 * </ul>
 *
 * <p>Уровень: Базовый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task07_shopping_cart/ShoppingCartService.java
 * java -cp src/main/java com.practice.task07_shopping_cart.ShoppingCartService
 * </pre>
 */
public class ShoppingCartService {

    public record Product(Long id, String name, BigDecimal price) {}

    public record CartItem(Product product, int quantity) {}

    public record Cart(Long id, List<CartItem> items) {}

    /**
     * Создать новую пустую корзину.
     * @return созданная корзина
     */
    public Cart createCart() {
        // TODO: implement
        return null;
    }

    /**
     * Добавить товар в корзину. Если товар уже есть — увеличить количество.
     * @param cartId идентификатор корзины
     * @param product товар
     * @param quantity количество (> 0)
     * @return обновлённая корзина
     * @throws IllegalArgumentException если корзина не найдена, количество <= 0 или цена <= 0
     */
    public Cart addProduct(Long cartId, Product product, int quantity) {
        // TODO: implement
        return null;
    }

    /**
     * Убрать товар из корзины полностью.
     * @param cartId идентификатор корзины
     * @param productId идентификатор товара
     * @return обновлённая корзина
     * @throws IllegalArgumentException если корзина или товар не найден
     */
    public Cart removeProduct(Long cartId, Long productId) {
        // TODO: implement
        return null;
    }

    /**
     * Изменить количество товара в корзине.
     * @param cartId идентификатор корзины
     * @param productId идентификатор товара
     * @param newQuantity новое количество (> 0)
     * @return обновлённая корзина
     * @throws IllegalArgumentException если корзина/товар не найден или количество <= 0
     */
    public Cart updateQuantity(Long cartId, Long productId, int newQuantity) {
        // TODO: implement
        return null;
    }

    /**
     * Подсчитать общую сумму корзины.
     * @param cartId идентификатор корзины
     * @return сумма (price * quantity для каждого товара)
     * @throws IllegalArgumentException если корзина не найдена
     */
    public BigDecimal calculateTotal(Long cartId) {
        // TODO: implement
        return BigDecimal.ZERO;
    }

    /**
     * Очистить корзину (удалить все товары).
     * @param cartId идентификатор корзины
     * @return пустая корзина
     * @throws IllegalArgumentException если корзина не найдена
     */
    public Cart clearCart(Long cartId) {
        // TODO: implement
        return null;
    }

    public static void main(String[] args) {
        System.out.println("=== ShoppingCartService: Smoke Test ===");
        // TODO: создать тестовые данные и проверить основные сценарии
    }
}
