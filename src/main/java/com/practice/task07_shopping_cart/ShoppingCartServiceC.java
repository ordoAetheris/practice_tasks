package com.practice.task07_shopping_cart;

import java.math.BigDecimal;
import java.util.*;

/**
 * КОРЗИНА — ВАРИАНТ C: CHECKOUT ПОД КОНКУРЕНТОЙ (inventory race)
 *
 * <p>CORE: та же корзина. Добавляется оформление заказа checkout(), которое проверяет
 * НАЛИЧИЕ на складе на момент оформления. Склад — in-memory (без внешних систем):
 * map productId → доступное количество.</p>
 *
 * <p><b>ВАРИАНТ C — гонка на складе [prim: mutual-excl ⭐, atomicity, safe-delete]:</b></p>
 * <ul>
 *   <li>Две корзины оформляют последний экземпляр товара одновременно → наивная
 *       «проверка stock>=qty → списание» пропускает обе (oversell, склад уходит в минус).</li>
 *   <li>ЗАДАЧА: checkout атомарно проверяет-и-списывает сток; при нехватке — отказ,
 *       без частичного списания (или всё, или ничего для всей корзины).</li>
 *   <li>Цена/наличие могли измениться с момента добавления — фиксировать на момент checkout.</li>
 *   <li>Направления: атомарный compute/CAS декремент стока; при мультитоварной корзине —
 *       порядок захвата (lock-ordering) или откат уже списанных при провале одной позиции.</li>
 *   <li>Проверка: N потоков на 1 последний экземпляр → ровно 1 checkout успешен, склад >= 0.</li>
 * </ul>
 */
public class ShoppingCartServiceC {

    public record Product(Long id, String name, BigDecimal price) {}

    public record CartItem(Product product, int quantity) {}

    public record Cart(Long id, List<CartItem> items) {}

    public record Order(Long id, Long cartId, BigDecimal total) {}

    /** Задать доступный сток товара (инициализация in-memory склада). */
    public void setStock(Long productId, int available) {
        throw new UnsupportedOperationException("TODO");
    }

    public Cart createCart() {
        throw new UnsupportedOperationException("TODO");
    }

    public Cart addProduct(Long cartId, Product product, int quantity) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Оформить корзину: атомарно проверить и списать сток по ВСЕМ позициям, зафиксировать
     * цены, вернуть заказ. Без oversell и без частичного списания под конкурентой.
     * @throws IllegalStateException не хватает стока на любую позицию
     * @throws IllegalArgumentException корзина не найдена / пустая
     */
    public Order checkout(Long cartId) {
        // TODO: atomic check-and-decrement всего склада корзины; откат при провале позиции
        throw new UnsupportedOperationException("TODO: variant C — checkout with inventory race");
    }

    public static void main(String[] args) {
        System.out.println("=== ShoppingCartServiceC (гонка склада на checkout): Smoke ===");
        // TODO: сток=1, две корзины checkout одновременно → ровно один успех, сток не отрицательный
    }
}
