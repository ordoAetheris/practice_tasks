package com.practice.task24_auction_system;

/**
 * АУКЦИОН — ВАРИАНТ D: ГОНКА НА ЗАКРЫТИИ (bid vs finish)
 *
 * <p>CORE = базовый {@link AuctionSystemService}.</p>
 *
 * <p><b>ВАРИАНТ D — гонка терминального перехода [prim: mutual-excl ⭐, FSM]:</b></p>
 * <ul>
 *   <li>placeBid и finishAuction одновременно → ставка, пришедшая ПОСЛЕ закрытия, не должна учитываться;
 *       пришедшая ДО — должна. Согласованная граница.</li>
 *   <li>Проверка: гонка bid/finish → победитель лота определён по ставкам строго до закрытия; поздние отклонены.</li>
 * </ul>
 */
public class AuctionSystemServiceD {

    public AuctionSystemService.Bid placeBid(String lotId, String bidderId, double amount) {
        throw new UnsupportedOperationException("TODO: variant D — bid rejected after close (consistent boundary)");
    }

    public AuctionSystemService.Lot finishAuction(String lotId) {
        throw new UnsupportedOperationException("TODO: variant D");
    }

    public static void main(String[] args) {
        System.out.println("=== AuctionSystemServiceD (гонка на закрытии): Smoke ===");
    }
}
