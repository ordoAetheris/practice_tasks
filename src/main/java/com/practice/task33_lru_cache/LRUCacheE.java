package com.practice.task33_lru_cache;

/**
 * LRU — ВАРИАНТ E: НАЙТИ БАГИ И ПОЧИНИТЬ
 *
 * <p>CORE = базовый {@link LRUCache}.</p>
 *
 * <p><b>ВАРИАНТ E — чтение+отладка [prim: debug]:</b></p>
 * <ul>
 *   <li>Дрилл: взять «почти рабочую» LRU-реализацию с классическими багами и починить их:</li>
 *   <li>(1) get НЕ обновляет recency (узел не перемещается в голову);</li>
 *   <li>(2) при put существующего ключа создаётся дубль-узел (утечка/двойной учёт размера);</li>
 *   <li>(3) эвикция удаляет из списка, но не из map (memory leak) — или наоборот.</li>
 *   <li>Проверка: тест на recency-порядок и размер ловит каждый баг; после починки — зелёный.</li>
 * </ul>
 */
public class LRUCacheE<K, V> {

    public LRUCacheE(int capacity) {
        throw new UnsupportedOperationException("TODO: variant E — вставь баги-ловушки и почини (см. javadoc)");
    }

    public V get(K key) {
        throw new UnsupportedOperationException("TODO");
    }

    public void put(K key, V value) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        System.out.println("=== LRUCacheE (найти баги): Smoke ===");
    }
}
