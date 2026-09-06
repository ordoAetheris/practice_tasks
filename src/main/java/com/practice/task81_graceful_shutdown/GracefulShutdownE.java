package com.practice.task81_graceful_shutdown;

/**
 * GRACEFUL SHUTDOWN — ВАРИАНТ E: WAL-RECOVERY
 *
 * <p>CORE = базовый {@link GracefulShutdown}.</p>
 *
 * <p><b>ВАРИАНТ E — устойчивость к КРАШУ (не graceful) [prim: shutdown ⭐⭐, WAL, recovery]:</b></p>
 * <ul>
 *   <li>Если процесс убит без graceful (kill -9): при старте восстановить незавершённое из write-ahead-log (что приняли, но не доделали).</li>
 *   <li>Идемпотентный replay; отличать доделанное от недоделанного.</li>
 *   <li>Проверка: «краш» с задачами в полёте → после рестарта recovery доигрывает их из WAL, без потерь/дублей.</li>
 * </ul>
 */
public class GracefulShutdownE {
    public void submit(Runnable task, String opId) { throw new UnsupportedOperationException("TODO: variant E — WAL-backed submit"); }
    public void recover() { throw new UnsupportedOperationException("TODO: variant E — replay unfinished from WAL"); }
    public static void main(String[] a){ System.out.println("=== GracefulShutdown E (WAL-recovery): Smoke ==="); }
}
