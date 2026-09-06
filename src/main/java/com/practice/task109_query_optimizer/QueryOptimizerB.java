package com.practice.task109_query_optimizer;

/**
 * QUERY OPTIMIZER — ВАРИАНТ B: COST-BASED + EDGE (§5)
 *
 * <p>CORE = базовый {@link QueryOptimizer} (план запроса, порядок джойнов).</p>
 * <p><b>ВАРИАНТ B [prim: dynamic-programming, null-edge ⭐]:</b> cost-based выбор порядка джойнов (DP по подмножествам,
 * оценка кардинальностей); edge: один/ноль таблиц, декартово произведение, отсутствующая статистика (дефолт-оценка).</p>
 */
public class QueryOptimizerB {
    public String optimize(String query){ throw new UnsupportedOperationException("TODO: variant B — cost-based join ordering (DP)"); }
    public static void main(String[] a){ System.out.println("=== QueryOptimizerB (§5 cost-based/edge): Smoke ==="); }
}
