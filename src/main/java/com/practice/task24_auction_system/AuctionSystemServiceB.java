package com.practice.task24_auction_system;

/**
 * АУКЦИОН — ВАРИАНТ B: КОНКУРЕНТНЫЕ СТАВКИ (lost-update highest)
 *
 * <p>CORE = базовый {@link AuctionSystemService} (та же модель Lot/Bid).</p>
 *
 * <p><b>ВАРИАНТ B — доменная гонка [prim: mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>Параллельные placeBid → «прочитал max → сравнил → записал» теряет ставки, максимум неверен.</li>
 *   <li>ЗАДАЧА: обновление текущей максимальной ставки атомарно.</li>
 *   <li>Проверка: N потоков ставят растущие суммы → итоговый highest == реальному максимуму.</li>
 * </ul>
 */
public class AuctionSystemServiceB {

    public AuctionSystemService.Bid placeBid(String lotId, String bidderId, double amount) {
        throw new UnsupportedOperationException("TODO: variant B — atomic highest-bid update");
    }

    public static void main(String[] args) {
        System.out.println("=== AuctionSystemServiceB (конкур-ставки): Smoke ===");
    }
}
