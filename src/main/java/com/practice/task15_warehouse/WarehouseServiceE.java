package com.practice.task15_warehouse;

/**
 * СКЛАД — ВАРИАНТ E: LOCK-ORDERING ПЕРЕВОД МЕЖДУ ДВУМЯ СКЛАДАМИ
 *
 * <p>CORE = базовый {@link WarehouseService}, но теперь склад идентифицируется warehouseId
 * (несколько складов). Перевод товара со склада A на склад B.</p>
 *
 * <p><b>ВАРИАНТ E — порядок захвата [prim: lock-ordering ⭐]:</b></p>
 * <ul>
 *   <li>transfer(A→B) и transfer(B→A) одновременно, при лочении «сначала источник, потом приёмник»,
 *       дают deadlock. Захватывать локи складов в ЕДИНОМ порядке (по id).</li>
 *   <li>Перевод атомарен: списал с A и зачислил на B как единое целое (или всё, или ничего).</li>
 *   <li>Проверка: встречные переводы в цикле не зависают; суммарный остаток по двум складам инвариант.</li>
 * </ul>
 */
public class WarehouseServiceE {

    public void addStock(String warehouseId, String productId, int quantity) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Перевод между складами с единым порядком захвата локов (анти-deadlock), атомарно. */
    public void transfer(String fromWarehouseId, String toWarehouseId, String productId, int quantity) {
        throw new UnsupportedOperationException("TODO: variant E — consistent lock ordering across warehouses");
    }

    public int getStock(String warehouseId, String productId) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        System.out.println("=== WarehouseServiceE (lock-ordering перевод): Smoke ===");
    }
}
