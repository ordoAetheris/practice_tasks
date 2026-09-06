package com.practice.task103_write_ahead_log;

/**
 * WAL — ВАРИАНТ B: DURABILITY + RECOVERY + SHUTDOWN (§5)
 *
 * <p>CORE = базовый {@link WriteAheadLog} (append-only записи с LSN).</p>
 * <p><b>ВАРИАНТ B [prim: shutdown ⭐, WAL, recovery]:</b> запись ДО применения (write-ahead), группировка/flush,
 * recovery повтором с последней контрольной точки, shutdown с fsync; edge: обрыв на середине записи (torn write), дубли LSN.</p>
 */
public class WriteAheadLogB {
    public long append(WriteAheadLog.LogRecord record){ throw new UnsupportedOperationException("TODO: variant B — durable append (flush)"); }
    public void recover(){ throw new UnsupportedOperationException("TODO: variant B — replay from checkpoint"); }
    public void shutdown(){ throw new UnsupportedOperationException("TODO: variant B — fsync + close"); }
    public static void main(String[] a){ System.out.println("=== WriteAheadLogB (§5 durability/recovery): Smoke ==="); }
}
