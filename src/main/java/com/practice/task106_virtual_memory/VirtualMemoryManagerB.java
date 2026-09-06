package com.practice.task106_virtual_memory;

/**
 * VIRTUAL MEMORY — ВАРИАНТ B: THREAD-SAFE PAGE TABLE + EVICTION (§5)
 *
 * <p>CORE = базовый {@link VirtualMemoryManager} (трансляция адреса, page fault, замещение).</p>
 * <p><b>ВАРИАНТ B [prim: mutual-excl ⭐, per-key-eviction]:</b> потокобезопасная таблица страниц; политика замещения
 * (LRU/clock) при page fault; edge: адрес вне диапазона, dirty-страница (запись перед вытеснением), TLB-промах.</p>
 */
public class VirtualMemoryManagerB {
    public int access(int virtualAddress){ throw new UnsupportedOperationException("TODO: variant B — thread-safe translate + fault + eviction"); }
    public static void main(String[] a){ System.out.println("=== VirtualMemoryManagerB (§5 page-table/eviction): Smoke ==="); }
}
