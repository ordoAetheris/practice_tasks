package com.practice.task62_workflow_engine;

import java.util.List;

/**
 * WORKFLOW — ВАРИАНТ E: ОБРАТНЫЙ ИНДЕКС + SNAPSHOT
 *
 * <p>CORE = базовый {@link WorkflowEngineService}.</p>
 *
 * <p><b>ВАРИАНТ E — обратный индекс [prim: aux-index, mutual-excl]:</b></p>
 * <ul>
 *   <li>Быстро находить, какие шаги ждут данный (обратные рёбра); снимок состояния инстанса для консистентного чтения.</li>
 *   <li>Проверка: при completeStep корректно «разблокируются» зависящие шаги через обратный индекс; snapshot стабилен.</li>
 * </ul>
 */
public class WorkflowEngineServiceE {
    public List<String> stepsWaitingFor(String workflowId, String stepId){ throw new UnsupportedOperationException("TODO: variant E — reverse index + snapshot"); }
    public static void main(String[] a){ System.out.println("=== WorkflowEngineServiceE (reverse index): Smoke ==="); }
}
