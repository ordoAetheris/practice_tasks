package com.practice.task101_raft_log;

/**
 * RAFT LOG — ВАРИАНТ B: CONFLICT TRUNCATION + THREAD-SAFE (§5)
 *
 * <p>CORE = базовый {@link RaftLog} (записи term/index/command).</p>
 * <p><b>ВАРИАНТ B [prim: mutual-excl ⭐, null-edge ⭐]:</b> appendEntries с проверкой prevLogTerm/Index — при конфликте
 * усечь хвост и дописать (Raft §5.3); потокобезопасный доступ; edge: пустой лог, дырки в индексах, устаревший term.</p>
 */
public class RaftLogB {
    public boolean appendEntries(long prevLogIndex, int prevLogTerm, RaftLog.LogEntry[] entries){ throw new UnsupportedOperationException("TODO: variant B — consistency check + conflict truncation"); }
    public static void main(String[] a){ System.out.println("=== RaftLogB (§5 truncation/thread-safe): Smoke ==="); }
}
