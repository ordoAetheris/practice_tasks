package com.practice.task85_virtual_threads;

/**
 * VIRTUAL THREADS — ВАРИАНТ D: КОГДА НЕ НАДО
 *
 * <p>CORE = базовый {@link VirtualThreads}.</p>
 *
 * <p><b>ВАРИАНТ D — границы применимости [prim: trade-off]:</b></p>
 * <ul>
 *   <li>Виртуальные потоки — для БЛОКИРУЮЩЕЙ (I/O-bound) нагрузки. Для CPU-bound выигрыша нет (упираемся в ядра) — нужен платформенный пул размером ~ числу ядер.</li>
 *   <li>Не пулить виртуальные потоки (они дешёвые, пул не нужен); осторожно с ThreadLocal (много потоков → память).</li>
 *   <li>Проверка: CPU-bound на virtual не быстрее платформенного пула; сформулировать критерий выбора.</li>
 * </ul>
 */
public class VirtualThreadsD {
    public void cpuBoundWorkload() { throw new UnsupportedOperationException("TODO: variant D — CPU-bound: platform pool ~ cores, not virtual"); }
    public static void main(String[] a){ System.out.println("=== VirtualThreads D (when NOT to): Smoke ==="); }
}
