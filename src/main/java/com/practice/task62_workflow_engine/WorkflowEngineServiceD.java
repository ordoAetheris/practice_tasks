package com.practice.task62_workflow_engine;

import java.util.List;

/**
 * WORKFLOW — ВАРИАНТ D: ИТЕРАТИВНЫЙ ОБХОД ГРАФА ШАГОВ
 *
 * <p>CORE = базовый {@link WorkflowEngineService}.</p>
 *
 * <p><b>ВАРИАНТ D — итеративно [prim: iterative-stack ⭐]:</b></p>
 * <ul>
 *   <li>Обход/валидация достижимости шагов через явный стек, не рекурсию — большие воркфлоу не роняют стек.</li>
 *   <li>Проверка: достижимость финального шага из старта на глубоком графе вычисляется итеративно.</li>
 * </ul>
 */
public class WorkflowEngineServiceD {
    public List<String> reachableSteps(String workflowId, String fromStepId){ throw new UnsupportedOperationException("TODO: variant D — iterative reachability"); }
    public static void main(String[] a){ System.out.println("=== WorkflowEngineServiceD (iterative): Smoke ==="); }
}
