package com.practice.task75_event_sourcing;

import java.util.Map;

/**
 * EVENT SOURCING — ВАРИАНТ B: SNAPSHOT
 *
 * <p>CORE = базовый {@link EventSourcingStore} (append/getEvents/rebuild).</p>
 *
 * <p><b>ВАРИАНТ B — снимок состояния [prim: snapshot, replay-optimization]:</b></p>
 * <ul>
 *   <li>rebuild с последнего снимка + хвост событий, а не с нуля (при длинной истории replay всего дорог).</li>
 *   <li>snapshot(aggId) фиксирует текущее состояние и версию.</li>
 *   <li>Проверка: rebuild после снимка даёт то же состояние, но читает меньше событий.</li>
 * </ul>
 */
public class EventSourcingStoreB {
    public EventSourcingStore.Snapshot snapshot(String aggregateId){ throw new UnsupportedOperationException("TODO: variant B — snapshot"); }
    public Map<String, Object> rebuild(String aggregateId){ throw new UnsupportedOperationException("TODO: variant B — rebuild from snapshot + tail"); }
    public static void main(String[] a){ System.out.println("=== EventSourcingStoreB (snapshot): Smoke ==="); }
}
