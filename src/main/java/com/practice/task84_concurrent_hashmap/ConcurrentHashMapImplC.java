package com.practice.task84_concurrent_hashmap;

/**
 * CONCURRENT HASHMAP — ВАРИАНТ C: RESIZE ПОД КОНКУРЕНТОЙ
 *
 * <p>CORE = базовый {@link ConcurrentHashMapImpl}.</p>
 *
 * <p><b>ВАРИАНТ C — потокобезопасный рост [prim: mutual-excl ⭐, resize]:</b></p>
 * <ul>
 *   <li>При превышении load factor — увеличить число бакетов и перехэшировать БЕЗ потери элементов и без блокировки всей карты (посегментно/помощь потоков).</li>
 *   <li>Ловушка: put во время resize должен видеть корректную таблицу (старую или новую), не потеряться.</li>
 *   <li>Проверка: массовые put, триггерящие resize под N потоков → все элементы на месте, get корректен во время роста.</li>
 * </ul>
 */
public class ConcurrentHashMapImplC<K, V> {
    public V put(K key, V value) { throw new UnsupportedOperationException("TODO: variant C — concurrent resize/rehash without loss"); }
    public static void main(String[] a){ System.out.println("=== ConcurrentHashMap C (resize): Smoke ==="); }
}
