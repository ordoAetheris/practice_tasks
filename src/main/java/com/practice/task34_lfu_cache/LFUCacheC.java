package com.practice.task34_lfu_cache;

/**
 * LFU — ВАРИАНТ C: TIE-BREAK LRU ВНУТРИ ЧАСТОТЫ
 *
 * <p>CORE = базовый {@link LFUCache}.</p>
 *
 * <p><b>ВАРИАНТ C — алго-углубление [prim: algorithm, LRU-tie-break]:</b></p>
 * <ul>
 *   <li>При равной минимальной частоте вытеснять НАИМЕНЕЕ недавно использованный из этой частоты
 *       (bucket как LinkedHashSet/список порядка).</li>
 *   <li>Проверка: два ключа с freq=1, обратились к одному → вытесняется другой (LRU внутри freq).</li>
 * </ul>
 */
public class LFUCacheC<K, V> {

    public LFUCacheC(int capacity) {
        throw new UnsupportedOperationException("TODO");
    }

    public void put(K key, V value) {
        throw new UnsupportedOperationException("TODO: variant C — LRU tie-break within min freq");
    }

    public V get(K key) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        System.out.println("=== LFUCacheC (tie-break LRU): Smoke ===");
    }
}
