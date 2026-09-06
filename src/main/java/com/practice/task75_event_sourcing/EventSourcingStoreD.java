package com.practice.task75_event_sourcing;

/**
 * EVENT SOURCING — ВАРИАНТ D: RETENTION / EVICTION
 *
 * <p>CORE = базовый {@link EventSourcingStore}.</p>
 *
 * <p><b>ВАРИАНТ D — усечение истории [prim: per-key-eviction, retention]:</b></p>
 * <ul>
 *   <li>После снимка события до его версии можно усечь (retention): не хранить бесконечный лог.</li>
 *   <li>Гарантия: rebuild всё ещё возможен (снимок + оставшийся хвост); усечение не ломает восстановление.</li>
 *   <li>Проверка: старые события до снимка удаляются; rebuild корректен; память ограничена.</li>
 * </ul>
 */
public class EventSourcingStoreD {
    public int truncateBeforeSnapshot(String aggregateId){ throw new UnsupportedOperationException("TODO: variant D — retention after snapshot"); }
    public static void main(String[] a){ System.out.println("=== EventSourcingStoreD (retention): Smoke ==="); }
}
