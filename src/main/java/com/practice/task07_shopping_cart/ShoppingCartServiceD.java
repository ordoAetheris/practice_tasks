package com.practice.task07_shopping_cart;

import java.math.BigDecimal;
import java.util.*;

/**
 * КОРЗИНА — ВАРИАНТ D: ИДЕМПОТЕНТНЫЙ CHECKOUT (double-submit)
 *
 * <p>CORE: та же корзина + оформление. Здесь — устойчивость checkout к ПОВТОРУ
 * (двойной клик «Оплатить» / ретрай / сетевой дубль).</p>
 *
 * <p><b>ВАРИАНТ D — идемпотентность оплаты [prim: idempotency ⭐, dedup]:</b></p>
 * <ul>
 *   <li>checkout(cartId, requestId): повтор с тем же requestId НЕ создаёт второй заказ и НЕ
 *       списывает деньги/сток дважды — возвращает ранее созданный Order.</li>
 *   <li>Под гонкой двух одинаковых requestId создаётся ровно один заказ; оба вызова видят его.</li>
 *   <li>Отличать идемпотентный повтор (вернуть тот же Order) от нового requestId на уже
 *       оформленной/пустой корзине (это ошибка).</li>
 *   <li>Направления: map requestId→Order; atomic putIfAbsent результата вокруг реального оформления.</li>
 * </ul>
 */
public class ShoppingCartServiceD {

    public record Product(Long id, String name, BigDecimal price) {}

    public record CartItem(Product product, int quantity) {}

    public record Cart(Long id, List<CartItem> items) {}

    public record Order(Long id, Long cartId, BigDecimal total) {}

    public Cart createCart() {
        throw new UnsupportedOperationException("TODO");
    }

    public Cart addProduct(Long cartId, Product product, int quantity) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Идемпотентно оформить корзину по ключу requestId. Повтор с тем же requestId возвращает
     * ранее созданный заказ без повторного списания.
     * @param requestId ключ идемпотентности (не пустой)
     * @throws IllegalArgumentException корзина не найдена/пустая, requestId пустой
     */
    public Order checkout(Long cartId, String requestId) {
        // TODO: если requestId уже оформлялся — вернуть его Order; иначе оформить атомарно и запомнить
        throw new UnsupportedOperationException("TODO: variant D — idempotent checkout by requestId");
    }

    public static void main(String[] args) {
        System.out.println("=== ShoppingCartServiceD (идемпотентный checkout): Smoke ===");
        // TODO: дважды checkout с одним requestId → один и тот же Order, ровно одно списание
    }
}
