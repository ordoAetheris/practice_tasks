package com.practice.task07_shopping_cart;

import java.math.BigDecimal;
import java.util.*;

/**
 * КОРЗИНА — ВАРИАНТ B: КОНКУРЕНТНЫЕ ADD / UPDATE / REMOVE (lost-update)
 *
 * <p>CORE (как в базе {@link ShoppingCartService}): createCart, addProduct (повтор → +qty),
 * removeProduct, updateQuantity, calculateTotal, clearCart.</p>
 *
 * <p><b>ВАРИАНТ B — гонка на одной корзине [prim: mutual-excl ⭐, atomicity]:</b></p>
 * <ul>
 *   <li>Несколько потоков одновременно add/update/remove ОДНУ корзину.</li>
 *   <li>Наивное «прочитал qty → +1 → записал» теряет обновления (lost-update); параллельные
 *       add одного товара дают неверное итоговое количество.</li>
 *   <li>ЗАДАЧА: операции над позициями корзины атомарны; итоговое qty под N потоками корректно.</li>
 *   <li>Направления: лок на корзину; либо ConcurrentHashMap позиций + merge/compute (atomic upsert qty);
 *       calculateTotal — консистентный снимок, а не «рваное» чтение во время записи.</li>
 *   <li>Проверка: K потоков × add(cart, P, 1) → qty ровно K; add+remove одного товара не оставляет «призрак».</li>
 * </ul>
 */
public class ShoppingCartServiceB {

    public record Product(Long id, String name, BigDecimal price) {}

    public record CartItem(Product product, int quantity) {}

    public record Cart(Long id, List<CartItem> items) {}

    /** Создать пустую корзину (потокобезопасный реестр корзин). */
    public Cart createCart() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Потокобезопасно добавить товар (повтор → атомарный +quantity). Без lost-update под гонкой.
     * @throws IllegalArgumentException корзина не найдена / quantity<=0 / price<=0
     */
    public Cart addProduct(Long cartId, Product product, int quantity) {
        // TODO: atomic upsert позиции (лок на корзину или compute/merge на карте позиций)
        throw new UnsupportedOperationException("TODO: variant B — atomic add under contention");
    }

    /** Потокобезопасно изменить количество (атомарно, без потери параллельных правок). */
    public Cart updateQuantity(Long cartId, Long productId, int newQuantity) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Потокобезопасно убрать товар целиком (без гонки с параллельным add). */
    public Cart removeProduct(Long cartId, Long productId) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Сумма по консистентному снимку корзины. */
    public BigDecimal calculateTotal(Long cartId) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        System.out.println("=== ShoppingCartServiceB (гонка add/update/remove): Smoke ===");
        // TODO: K потоков add одного товара → итоговое quantity == K
    }
}
