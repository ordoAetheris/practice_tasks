package com.practice.task54_workflow_engine;

import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Predicate;

/**
 * ДВИЖОК БИЗНЕС-ПРОЦЕССОВ
 *
 * <p>Реализуйте движок выполнения бизнес-процессов (Workflow Engine).
 * Бизнес-процесс (Workflow) содержит: id, name, список шагов (steps).
 * Шаг (Step) содержит: id, name, type (MANUAL/AUTOMATIC), список следующих шагов (nextSteps),
 * condition (условие перехода, опционально).
 * Экземпляр процесса (WorkflowInstance) содержит: id, workflowId, currentStep,
 * data (Map), status (RUNNING/COMPLETED/FAILED/PAUSED).</p>
 *
 * <p>Необходимо реализовать следующие операции:</p>
 * <ul>
 *   <li>defineWorkflow(workflow) — определить бизнес-процесс</li>
 *   <li>startInstance(workflowId, initialData) — запустить экземпляр процесса</li>
 *   <li>completeStep(instanceId, stepId, data) — завершить шаг (для MANUAL)</li>
 *   <li>getStatus(instanceId) — получить текущий статус экземпляра</li>
 *   <li>pause(instanceId) — приостановить экземпляр</li>
 *   <li>resume(instanceId) — возобновить экземпляр</li>
 *   <li>getHistory(instanceId) — получить историю выполнения шагов</li>
 * </ul>
 *
 * <p>Бизнес-правила:</p>
 * <ul>
 *   <li>Шаги выполняются в порядке зависимостей</li>
 *   <li>AUTOMATIC-шаги выполняются сразу после предыдущего</li>
 *   <li>MANUAL-шаги ждут явного вызова completeStep</li>
 *   <li>Ветвления: из шага может быть несколько nextSteps с условиями</li>
 *   <li>Когда нет следующих шагов — процесс завершён (COMPLETED)</li>
 * </ul>
 *
 * <p>Уровень: Средний</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task54_workflow_engine/WorkflowEngineService.java
 * java -cp src/main/java com.practice.task54_workflow_engine.WorkflowEngineService
 * </pre>
 */
public class WorkflowEngineService {

    public enum StepType {
        MANUAL, AUTOMATIC
    }

    public enum InstanceStatus {
        RUNNING, COMPLETED, FAILED, PAUSED
    }

    public record Step(
            String id,
            String name,
            StepType type,
            List<String> nextSteps,
            Predicate<Map<String, Object>> condition
    ) {}

    public record Workflow(
            String id,
            String name,
            List<Step> steps,
            String firstStepId
    ) {}

    public record HistoryEntry(
            String stepId,
            String stepName,
            LocalDateTime startedAt,
            LocalDateTime completedAt,
            Map<String, Object> data
    ) {}

    /**
     * Определяет бизнес-процесс.
     * @param workflow описание бизнес-процесса
     * @throws IllegalArgumentException если процесс с таким id уже существует
     */
    public void defineWorkflow(Workflow workflow) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Запускает новый экземпляр бизнес-процесса.
     * AUTOMATIC-шаги в начале выполняются немедленно.
     * @param workflowId идентификатор процесса
     * @param initialData начальные данные
     * @return идентификатор экземпляра
     */
    public String startInstance(String workflowId, Map<String, Object> initialData) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Завершает MANUAL-шаг экземпляра процесса и переходит к следующему.
     * @param instanceId идентификатор экземпляра
     * @param stepId идентификатор шага
     * @param data данные, полученные на шаге
     * @throws IllegalStateException если шаг не является текущим или экземпляр не RUNNING
     */
    public void completeStep(String instanceId, String stepId, Map<String, Object> data) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Возвращает текущий статус экземпляра процесса.
     * @param instanceId идентификатор экземпляра
     * @return статус экземпляра
     */
    public InstanceStatus getStatus(String instanceId) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Приостанавливает экземпляр процесса.
     * @param instanceId идентификатор экземпляра
     * @throws IllegalStateException если экземпляр не в статусе RUNNING
     */
    public void pause(String instanceId) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Возобновляет приостановленный экземпляр процесса.
     * @param instanceId идентификатор экземпляра
     * @throws IllegalStateException если экземпляр не в статусе PAUSED
     */
    public void resume(String instanceId) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Возвращает историю выполнения шагов экземпляра.
     * @param instanceId идентификатор экземпляра
     * @return список записей истории
     */
    public List<HistoryEntry> getHistory(String instanceId) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    public static void main(String[] args) {
        System.out.println("=== WorkflowEngineService: Smoke Test ===");
        // TODO: smoke test
    }
}
