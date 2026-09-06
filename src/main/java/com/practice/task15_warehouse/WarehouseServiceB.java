package com.practice.task15_warehouse;

/**
 * СКЛАД — ВАРИАНТ B: OVERSELL (гонка списания остатка)
 *
 * <p>CORE = базовый {@link WarehouseService} (та же модель Product/StockRecord).</p>
 *
 * <p><b>ВАРИАНТ B — доменная гонка [prim: mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>Наивное outgoing «проверил stock&gt;=qty → списал» под гонкой уводит остаток в минус (oversell).</li>
 *   <li>ЗАДАЧА: списание атомарно, остаток не отрицательный.</li>
 *   <li>Проверка: stock=M, N потоков outgoing(1) → ровно M успешных, getStock()==0, минуса нет.</li>
 * </ul>
 */
public class WarehouseServiceB {

    public void addProduct(WarehouseService.Product product) {
        throw new UnsupportedOperationException("TODO");
    }

    public void incoming(String productId, int quantity) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Потокобезопасное списание: без ухода остатка в минус под гонкой. */
    public void outgoing(String productId, int quantity) {
        throw new UnsupportedOperationException("TODO: variant B — no oversell under contention");
    }

    public int getStock(String productId) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        System.out.println("=== WarehouseServiceB (oversell): Smoke ===");
    }
}
