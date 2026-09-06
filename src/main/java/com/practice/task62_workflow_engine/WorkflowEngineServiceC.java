package com.practice.task62_workflow_engine;

import java.util.List;

/**
 * WORKFLOW — ВАРИАНТ C: TOPO-ПОРЯДОК ВЫПОЛНЕНИЯ
 *
 * <p>CORE = базовый {@link WorkflowEngineService}.</p>
 *
 * <p><b>ВАРИАНТ C — топосорт [prim: topo-sort]:</b></p>
 * <ul>
 *   <li>Порядок выполнения шагов = топосорт графа зависимостей шагов; параллельные ветки допустимы.</li>
 *   <li>Проверка: шаг стартует только когда все предшественники завершены; порядок валиден для DAG.</li>
 * </ul>
 */
public class WorkflowEngineServiceC {
    public List<String> executionOrder(String workflowId){ throw new UnsupportedOperationException("TODO: variant C — topological execution order"); }
    public static void main(String[] a){ System.out.println("=== WorkflowEngineServiceC (topo-sort): Smoke ==="); }
}
