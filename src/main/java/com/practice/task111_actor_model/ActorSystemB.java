package com.practice.task111_actor_model;

/**
 * ACTOR SYSTEM — ВАРИАНТ B: GRACEFUL SHUTDOWN + BACKPRESSURE (§5)
 *
 * <p>CORE = базовый {@link ActorSystem} (акторы, мейлбоксы, обработка сообщений по одному).</p>
 * <p><b>ВАРИАНТ B [prim: shutdown ⭐, backpressure, mutual-excl ⭐]:</b> корректная остановка системы (слить мейлбоксы,
 * дождаться акторов); ограниченные мейлбоксы (backpressure медленному актору); edge: сообщение самому себе, актор падает в обработке.</p>
 */
public class ActorSystemB {
    public void shutdown(){ throw new UnsupportedOperationException("TODO: variant B — drain mailboxes + await actors"); }
    public static void main(String[] a){ System.out.println("=== ActorSystemB (§5 shutdown/backpressure): Smoke ==="); }
}
