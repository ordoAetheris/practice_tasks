package com.practice.task15_warehouse;

/**
 * СКЛАД — ВАРИАНТ C: АТОМАРНЫЙ CHECK-AND-DECREMENT
 *
 * <p>CORE = базовый {@link WarehouseService}.</p>
 *
 * <p><b>ВАРИАНТ C — атомарный переход [prim: atomicity, CAS]:</b></p>
 * <ul>
 *   <li>outgoing = единая атомарная операция «если хватает → вычесть» (compute/CAS-петля/лок на товар).</li>
 *   <li>Проверка: stock=M, N&gt;M потоков → ровно M списаний прошли, остальные — отказ; остаток корректен.</li>
 * </ul>
 */
public class WarehouseServiceC {

    public void addProduct(WarehouseService.Product product) {
        throw new UnsupportedOperationException("TODO");
    }

    public void incoming(String productId, int quantity) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Атомарный check-and-decrement остатка; при нехватке — отказ без побочек. */
    public boolean outgoing(String productId, int quantity) {
        throw new UnsupportedOperationException("TODO: variant C — atomic check-and-decrement");
    }

    public static void main(String[] args) {
        System.out.println("=== WarehouseServiceC (atomic decrement): Smoke ===");
    }
}
