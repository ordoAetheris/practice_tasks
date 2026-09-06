package com.practice.task75_event_sourcing;

import java.util.Map;

/**
 * EVENT SOURCING — ВАРИАНТ C: THREAD-SAFE (optimistic version)
 *
 * <p>CORE = базовый {@link EventSourcingStore}.</p>
 *
 * <p><b>ВАРИАНТ C — конкурентный append [prim: mutual-excl ⭐, CAS, optimistic-lock]:</b></p>
 * <ul>
 *   <li>append с expectedVersion: если версия агрегата изменилась (конкурентный append) — конфликт, отказ/retry (оптимистичная блокировка).</li>
 *   <li>Порядок и версии событий агрегата строго монотонны под гонкой.</li>
 *   <li>Проверка: два потока append с одной expectedVersion → один успех, второй ловит конфликт версии.</li>
 * </ul>
 */
public class EventSourcingStoreC {
    public EventSourcingStore.Event append(String aggregateId, String type, Map<String, Object> data, long expectedVersion){ throw new UnsupportedOperationException("TODO: variant C — optimistic-version append"); }
    public static void main(String[] a){ System.out.println("=== EventSourcingStoreC (thread-safe): Smoke ==="); }
}
