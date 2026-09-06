package com.practice.task67_read_write_lock;

/**
 * RW-LOCK — ВАРИАНТ D: REENTRANCY
 *
 * <p>CORE = базовый {@link ReadWriteLock}.</p>
 *
 * <p><b>ВАРИАНТ D — повторный вход [prim: rw-lock, reentrancy]:</b></p>
 * <ul>
 *   <li>Тот же поток может повторно взять read/write (счётчики удержаний per-thread через ThreadLocal); релиз по числу захватов.</li>
 *   <li>Проверка: вложенные acquireWrite/acquireRead тем же потоком не дедлочат; лок отпускается только после парного числа release.</li>
 * </ul>
 */
public class ReadWriteLockD {
    public void acquireRead(){ throw new UnsupportedOperationException("TODO: variant D — reentrant read (per-thread hold count)"); }
    public void acquireWrite(){ throw new UnsupportedOperationException("TODO: variant D — reentrant write"); }
    public static void main(String[] a){ System.out.println("=== ReadWriteLockD (reentrancy): Smoke ==="); }
}
