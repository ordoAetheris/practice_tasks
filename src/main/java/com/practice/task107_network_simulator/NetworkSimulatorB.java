package com.practice.task107_network_simulator;

/**
 * NETWORK SIMULATOR — ВАРИАНТ B: CONCURRENT EVENTS + EDGE (§5)
 *
 * <p>CORE = базовый {@link NetworkSimulator} (узлы, доставка сообщений по времени).</p>
 * <p><b>ВАРИАНТ B [prim: mutual-excl ⭐, null-edge ⭐]:</b> потокобезопасная очередь событий по времени;
 * edge: партиция сети (недоставка), задержки/переупорядочивание, петля/недостижимый узел, дубли доставки.</p>
 */
public class NetworkSimulatorB {
    public void send(String fromId, String toId, String payload, long delayMs){ throw new UnsupportedOperationException("TODO: variant B — timed event queue"); }
    public void step(){ throw new UnsupportedOperationException("TODO"); }
    public static void main(String[] a){ System.out.println("=== NetworkSimulatorB (§5 concurrent/partition): Smoke ==="); }
}
