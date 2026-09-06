package com.practice.task24_auction_system;

/**
 * АУКЦИОН — ВАРИАНТ C: АТОМАРНАЯ ВАЛИДАЦИЯ СТАВКИ
 *
 * <p>CORE = базовый {@link AuctionSystemService}.</p>
 *
 * <p><b>ВАРИАНТ C — атомарный переход [prim: atomicity, CAS]:</b></p>
 * <ul>
 *   <li>«ставка &gt; текущего максимума → принять и стать новым максимумом» — единая атомарная операция
 *       (CAS-петля/лок на лот); проигравшие ниже максимума отклоняются.</li>
 *   <li>Проверка: конкурентные равные/меньшие ставки корректно отклоняются; принимается только строго большая.</li>
 * </ul>
 */
public class AuctionSystemServiceC {

    public AuctionSystemService.Bid placeBid(String lotId, String bidderId, double amount) {
        throw new UnsupportedOperationException("TODO: variant C — atomic validate-and-set highest");
    }

    public static void main(String[] args) {
        System.out.println("=== AuctionSystemServiceC (валидация ставки): Smoke ===");
    }
}
