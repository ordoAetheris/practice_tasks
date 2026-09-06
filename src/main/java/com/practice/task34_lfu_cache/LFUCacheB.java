package com.practice.task34_lfu_cache;

/**
 * LFU — ВАРИАНТ B: THREAD-SAFE
 *
 * <p>CORE = базовый {@link LFUCache} (HashMap + freq-buckets, get/put O(1), evict min-freq).</p>
 *
 * <p><b>ВАРИАНТ B — потокобезопасность [prim: mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>get/put атомарны; счётчик частот и bucket'ы обновляются согласованно (get инкрементит freq).</li>
 *   <li>minFreq-указатель не рассинхронизируется под конкурентой.</li>
 *   <li>Проверка: K потоков → размер==capacity, эвикция реально по минимальной частоте.</li>
 * </ul>
 */
public class LFUCacheB<K, V> {

    public LFUCacheB(int capacity) {
        throw new UnsupportedOperationException("TODO");
    }

    public V get(K key) {
        throw new UnsupportedOperationException("TODO: variant B — thread-safe freq bump");
    }

    public void put(K key, V value) {
        throw new UnsupportedOperationException("TODO: variant B");
    }

    public static void main(String[] args) {
        System.out.println("=== LFUCacheB (thread-safe): Smoke ===");
    }
}
