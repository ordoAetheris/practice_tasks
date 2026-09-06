package com.practice.task33_lru_cache;

/**
 * LRU — ВАРИАНТ B: THREAD-SAFE
 *
 * <p>CORE = базовый {@link LRUCache} (HashMap + двусвязный список, get/put O(1)).</p>
 *
 * <p><b>ВАРИАНТ B — потокобезопасность [prim: mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>get/put/remove атомарны; порядок использования (recency) согласован под конкурентой.</li>
 *   <li>Ловушка: get МЕНЯЕТ структуру (перемещает узел) → тоже под защитой, не только put.</li>
 *   <li>Проверка: K потоков put/get → размер == capacity, нет гонок/потерь, корректная эвикция LRU.</li>
 * </ul>
 */
public class LRUCacheB<K, V> {

    public LRUCacheB(int capacity) {
        throw new UnsupportedOperationException("TODO");
    }

    public V get(K key) {
        throw new UnsupportedOperationException("TODO: variant B — thread-safe get (moves node)");
    }

    public void put(K key, V value) {
        throw new UnsupportedOperationException("TODO: variant B — thread-safe put");
    }

    public static void main(String[] args) {
        System.out.println("=== LRUCacheB (thread-safe): Smoke ===");
    }
}
