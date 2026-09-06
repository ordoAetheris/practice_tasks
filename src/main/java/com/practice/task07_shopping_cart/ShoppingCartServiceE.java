package com.practice.task07_shopping_cart;

import java.math.BigDecimal;
import java.util.*;

/**
 * КОРЗИНА — ВАРИАНТ E: EDGE / ПУСТАЯ КОРЗИНА / ТОЧНОСТЬ
 *
 * <p>CORE: та же корзина. Здесь — исчерпывающие границы и «грязные» входы
 * (системная дыра — выписывать edge ПИСЬМЕННО до кода).</p>
 *
 * <p><b>ВАРИАНТ E — edge/null-safety [prim: null-edge ⭐, precision]:</b></p>
 * <ul>
 *   <li>Пустая корзина: calculateTotal == 0; checkout пустой корзины — ошибка.</li>
 *   <li>quantity &lt;= 0, price &lt;= 0, null product, null cartId.</li>
 *   <li>Операции с несуществующей корзиной/товаром — IllegalArgumentException.</li>
 *   <li>remove из пустой корзины / несуществующего товара; updateQuantity в 0 — удаление или ошибка? зафиксировать.</li>
 *   <li>Точность BigDecimal: складывать без double; scale/копейки; не терять на price*quantity.</li>
 *   <li>ЗАДАЧА: ни один граничный вход не проваливает инвариант; total точен до копейки.</li>
 * </ul>
 */
public class ShoppingCartServiceE {

    public record Product(Long id, String name, BigDecimal price) {}

    public record CartItem(Product product, int quantity) {}

    public record Cart(Long id, List<CartItem> items) {}

    public Cart createCart() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Добавить товар с полной валидацией входа.
     * @throws IllegalArgumentException null/несуществующая корзина, null product, quantity<=0, price<=0
     */
    public Cart addProduct(Long cartId, Product product, int quantity) {
        throw new UnsupportedOperationException("TODO: variant E — add with full validation");
    }

    /** updateQuantity: правило для newQuantity==0 (удаление или ошибка) — зафиксировать и проверять. */
    public Cart updateQuantity(Long cartId, Long productId, int newQuantity) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Убрать товар; из пустой корзины / несуществующего товара — ошибка. */
    public Cart removeProduct(Long cartId, Long productId) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Сумма: пустая корзина → 0; точность BigDecimal (копейки), без double. */
    public BigDecimal calculateTotal(Long cartId) {
        throw new UnsupportedOperationException("TODO: variant E — precise total, empty == 0");
    }

    public static void main(String[] args) {
        System.out.println("=== ShoppingCartServiceE (edge/пустая/точность): Smoke ===");
        // TODO: прогнать таблицу границ; total пустой == 0.00; сумма копеек без потери точности
    }
}
