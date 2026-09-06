package com.practice.task62_workflow_engine;

import java.util.List;

/**
 * WORKFLOW — ВАРИАНТ B: ДЕТЕКЦИЯ ЦИКЛА
 *
 * <p>CORE = базовый {@link WorkflowEngineService} (граф шагов, defineWorkflow/startInstance).</p>
 *
 * <p><b>ВАРИАНТ B — цикл [prim: cycle-detect]:</b></p>
 * <ul>
 *   <li>При defineWorkflow проверить граф шагов на циклы (иначе инстанс зациклится); вернуть путь цикла.</li>
 *   <li>Проверка: воркфлоу с циклом шагов отклоняется на определении; DAG принимается.</li>
 * </ul>
 */
public class WorkflowEngineServiceB {
    public List<String> validateAcyclic(String workflowId){ throw new UnsupportedOperationException("TODO: variant B — cycle detection in step graph"); }
    public static void main(String[] a){ System.out.println("=== WorkflowEngineServiceB (cycle-detect): Smoke ==="); }
}
