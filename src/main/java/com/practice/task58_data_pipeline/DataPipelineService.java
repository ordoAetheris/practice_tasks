package com.practice.task58_data_pipeline;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * КОНВЕЙЕР ОБРАБОТКИ ДАННЫХ
 *
 * <p>Реализуйте конвейер (pipeline) последовательной обработки табличных данных.
 * Конвейер (Pipeline) содержит: id, список стадий (stages).
 * Стадия (Stage) содержит: id, name, type (MAP/FILTER/REDUCE/SORT/GROUP_BY), конфигурация.</p>
 *
 * <p>Необходимо реализовать следующие операции:</p>
 * <ul>
 *   <li>createPipeline(stages) — создать конвейер из списка стадий</li>
 *   <li>execute(pipelineId, data) — прогнать данные через все стадии последовательно</li>
 *   <li>validatePipeline(pipelineId) — проверить совместимость стадий</li>
 *   <li>getIntermediateResults(pipelineId, stageId) — получить промежуточные результаты</li>
 * </ul>
 *
 * <p>Типы стадий:</p>
 * <ul>
 *   <li>MAP — преобразование каждой записи (добавить/изменить поле)</li>
 *   <li>FILTER — фильтрация записей по условию</li>
 *   <li>REDUCE — агрегация в одно значение (sum, count, avg по полю)</li>
 *   <li>SORT — сортировка по полю</li>
 *   <li>GROUP_BY — группировка по полю</li>
 * </ul>
 *
 * <p>Бизнес-правила:</p>
 * <ul>
 *   <li>Стадии выполняются строго последовательно</li>
 *   <li>REDUCE возвращает одну запись с результатом агрегации</li>
 *   <li>После REDUCE можно продолжить конвейер (результат — одна запись)</li>
 *   <li>Промежуточные результаты сохраняются для отладки</li>
 * </ul>
 *
 * <p>Уровень: Средний</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task58_data_pipeline/DataPipelineService.java
 * java -cp src/main/java com.practice.task58_data_pipeline.DataPipelineService
 * </pre>
 */
public class DataPipelineService {

    public enum StageType {
        MAP, FILTER, REDUCE, SORT, GROUP_BY
    }

    public record Stage(
            String id,
            String name,
            StageType type,
            Map<String, Object> configuration
    ) {}

    public record Pipeline(
            String id,
            List<Stage> stages
    ) {}

    /**
     * Создаёт конвейер из списка стадий.
     * @param stages список стадий в порядке выполнения
     * @return созданный конвейер
     */
    public Pipeline createPipeline(List<Stage> stages) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Выполняет конвейер: прогоняет данные через все стадии последовательно.
     * Промежуточные результаты сохраняются.
     * @param pipelineId идентификатор конвейера
     * @param data входные данные (список записей)
     * @return результат после всех стадий
     */
    public List<Map<String, Object>> execute(String pipelineId, List<Map<String, Object>> data) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Проверяет корректность конвейера: совместимость типов данных между стадиями.
     * @param pipelineId идентификатор конвейера
     * @return список ошибок валидации (пустой если всё корректно)
     */
    public List<String> validatePipeline(String pipelineId) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Возвращает промежуточные результаты после указанной стадии (из последнего выполнения).
     * @param pipelineId идентификатор конвейера
     * @param stageId идентификатор стадии
     * @return данные после выполнения стадии
     * @throws IllegalStateException если конвейер ещё не выполнялся
     */
    public List<Map<String, Object>> getIntermediateResults(String pipelineId, String stageId) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    public static void main(String[] args) {
        System.out.println("=== DataPipelineService: Smoke Test ===");
        // TODO: smoke test
    }
}
