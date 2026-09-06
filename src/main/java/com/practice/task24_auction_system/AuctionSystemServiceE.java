package com.practice.task24_auction_system;

/**
 * АУКЦИОН — ВАРИАНТ E: ANTI-SNIPE (продление при поздней ставке)
 *
 * <p>CORE = базовый {@link AuctionSystemService}.</p>
 *
 * <p><b>ВАРИАНТ E — анти-снайпинг [prim: mutual-excl ⭐, atomicity]:</b></p>
 * <ul>
 *   <li>Ставка в последние T секунд продлевает время окончания лота на T (чтобы нельзя было «снять» в самом конце).</li>
 *   <li>Продление и приём ставки согласованы под конкурентой (не потерять продление / не закрыть раньше).</li>
 *   <li>Проверка: серия поздних ставок отодвигает дедлайн; закрытие только после «тихого» окна.</li>
 * </ul>
 */
public class AuctionSystemServiceE {

    public AuctionSystemService.Bid placeBid(String lotId, String bidderId, double amount) {
        throw new UnsupportedOperationException("TODO: variant E — anti-snipe deadline extension");
    }

    public static void main(String[] args) {
        System.out.println("=== AuctionSystemServiceE (anti-snipe): Smoke ===");
    }
}
