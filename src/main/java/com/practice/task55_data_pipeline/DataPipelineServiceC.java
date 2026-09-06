package com.practice.task55_data_pipeline;

/**
 * ПАЙПЛАЙН — ВАРИАНТ C: SHUTDOWN (drain in-flight)
 *
 * <p>CORE = базовый {@link DataPipelineService}.</p>
 *
 * <p><b>ВАРИАНТ C — корректная остановка [prim: shutdown ⭐, termination ⭐]:</b></p>
 * <ul>
 *   <li>shutdown(): перестать принимать вход, дать доработать элементам «в полёте» по всем стадиям, дождаться воркеров.</li>
 *   <li>shutdownNow(): прервать, вернуть необработанное.</li>
 *   <li>Проверка: после shutdown вход отклоняется; элементы в конвейере доходят до конца; потоки завершены.</li>
 * </ul>
 */
public class DataPipelineServiceC {
    public void shutdown(){ throw new UnsupportedOperationException("TODO: variant C — drain in-flight + await workers"); }
    public static void main(String[] a){ System.out.println("=== DataPipelineServiceC (shutdown): Smoke ==="); }
}
