package com.practice.task97_query_optimizer;

import java.util.*;

/**
 * Упрощённый оптимизатор запросов.
 *
 * <p>Реализовать оптимизатор SQL-подобных запросов: парсинг простого синтаксиса,
 * построение плана выполнения, оценка стоимости, выбор индексов,
 * оптимальный порядок JOIN, push down predicates.</p>
 *
 * <p>Уровень: Хардкор</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task97_query_optimizer/QueryOptimizer.java
 * java -cp src/main/java com.practice.task97_query_optimizer.QueryOptimizer
 * </pre>
 */
public class QueryOptimizer {

    public record Column(String name, String type) {}
    public record Index(String name, List<String> columns) {}
    public record Table(String name, List<Column> columns, long rowCount, List<Index> indexes) {}

    public enum ConditionOp { EQ, GT, LT, GTE, LTE, LIKE }
    public record Condition(String table, String column, ConditionOp op, String value) {}

    public record Query(List<String> selectColumns, List<String> fromTables,
                        List<Condition> conditions, List<String> joinOn,
                        List<String> orderBy) {}

    public record PlanStep(String description, double estimatedCost) {}
    public record QueryPlan(List<PlanStep> steps, double totalCost) {}

    /** Зарегистрировать таблицу с метаданными */
    public void registerTable(Table table) {
        //TODO implement
    }

    /**
     * Распарсить упрощённый SQL-подобный запрос
     * Формат: SELECT col1,col2 FROM t1,t2 WHERE t1.col=val AND t1.id=t2.id ORDER BY col
     */
    public Query parse(String queryString) {
        //TODO implement
        return null;
    }

    /** Построить оптимальный план выполнения */
    public QueryPlan optimize(Query query) {
        //TODO implement
        return null;
    }

    /** Оценить стоимость плана */
    public double estimateCost(QueryPlan plan) {
        //TODO implement
        return 0;
    }

    /** Человекочитаемое описание плана */
    public String explain(Query query) {
        //TODO implement
        return "";
    }

    public static void main(String[] args) {
        System.out.println("=== QueryOptimizer: Smoke Test ===");
        // TODO: зарегистрировать таблицы, выполнить запрос, посмотреть план
    }
}
