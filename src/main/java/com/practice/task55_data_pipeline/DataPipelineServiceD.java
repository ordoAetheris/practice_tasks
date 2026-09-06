package com.practice.task55_data_pipeline;

import java.util.List;
import java.util.Map;

/**
 * ПАЙПЛАЙН — ВАРИАНТ D: EDGE (изоляция сбоя стадии)
 *
 * <p>CORE = базовый {@link DataPipelineService}.</p>
 *
 * <p><b>ВАРИАНТ D — edge/null-safety [prim: null-edge ⭐, typed-errors]:</b></p>
 * <ul>
 *   <li>Пустой пайплайн, пустой вход, стадия бросает исключение (изолировать элемент/стадию, не рушить весь конвейер).</li>
 *   <li>null-элемент данных, стадия-фильтр отсеивает всё, некорректная конфигурация стадий.</li>
 *   <li>Проверка: сбой на одном элементе не роняет обработку остальных; ошибки типизированы.</li>
 * </ul>
 */
public class DataPipelineServiceD {
    public List<Map<String, Object>> execute(String pipelineId, List<Map<String, Object>> data){ throw new UnsupportedOperationException("TODO: variant D — edge + per-element failure isolation"); }
    public static void main(String[] a){ System.out.println("=== DataPipelineServiceD (edge): Smoke ==="); }
}
