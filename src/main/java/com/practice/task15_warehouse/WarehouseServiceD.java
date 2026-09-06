package com.practice.task15_warehouse;

/**
 * СКЛАД — ВАРИАНТ D: ИДЕМПОТЕНТНАЯ ОПЕРАЦИЯ (opId)
 *
 * <p>CORE = базовый {@link WarehouseService}.</p>
 *
 * <p><b>ВАРИАНТ D — идемпотентность [prim: idempotency ⭐, dedup]:</b></p>
 * <ul>
 *   <li>incoming/outgoing с opId: ретрай той же операции (сетевой дубль) не должен применить движение дважды.</li>
 *   <li>Проверка: outgoing(opId,5) дважды → остаток уменьшился на 5, а не на 10; в истории одна запись opId.</li>
 * </ul>
 */
public class WarehouseServiceD {

    public void addProduct(WarehouseService.Product product) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Идемпотентное движение по opId (повтор — no-op). */
    public void outgoing(String opId, String productId, int quantity) {
        throw new UnsupportedOperationException("TODO: variant D — idempotent movement by opId");
    }

    public int getStock(String productId) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        System.out.println("=== WarehouseServiceD (идемпотентная операция): Smoke ===");
    }
}
