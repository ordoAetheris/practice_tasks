package com.practice.task67_read_write_lock;

/**
 * RW-LOCK — ВАРИАНТ C: UPGRADE / DOWNGRADE
 *
 * <p>CORE = базовый {@link ReadWriteLock}.</p>
 *
 * <p><b>ВАРИАНТ C — смена режима лока [prim: rw-lock, lock-upgrade]:</b></p>
 * <ul>
 *   <li>Downgrade (write→read) — безопасен: удержать read перед отпусканием write. Upgrade (read→write) — ОПАСЕН (deadlock двух upgrader'ов), реализовать через отпускание read или отдельный upgrade-лок.</li>
 *   <li>Проверка: downgrade не теряет эксклюзивность до захвата read; два одновременных upgrade не дедлочат.</li>
 * </ul>
 */
public class ReadWriteLockC {
    public void downgrade(){ throw new UnsupportedOperationException("TODO: variant C — write->read downgrade"); }
    public boolean tryUpgrade(){ throw new UnsupportedOperationException("TODO: variant C — read->write upgrade (deadlock-safe)"); }
    public static void main(String[] a){ System.out.println("=== ReadWriteLockC (upgrade/downgrade): Smoke ==="); }
}
