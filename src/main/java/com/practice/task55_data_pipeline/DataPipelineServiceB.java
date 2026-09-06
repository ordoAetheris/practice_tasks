package com.practice.task55_data_pipeline;

import java.util.List;
import java.util.Map;

/**
 * ПАЙПЛАЙН — ВАРИАНТ B: BACKPRESSURE
 *
 * <p>CORE = базовый {@link DataPipelineService} (стадии обработки, execute).</p>
 *
 * <p><b>ВАРИАНТ B — обратное давление [prim: backpressure, bounded]:</b></p>
 * <ul>
 *   <li>Между стадиями — ограниченные очереди; быстрая стадия не заваливает медленную (блок/замедление producer).</li>
 *   <li>Проверка: при медленной стадии потребление входа замедляется, память ограничена (очереди не растут бесконечно).</li>
 * </ul>
 */
public class DataPipelineServiceB {
    public List<Map<String, Object>> execute(String pipelineId, List<Map<String, Object>> data){ throw new UnsupportedOperationException("TODO: variant B — bounded inter-stage queues (backpressure)"); }
    public static void main(String[] a){ System.out.println("=== DataPipelineServiceB (backpressure): Smoke ==="); }
}
