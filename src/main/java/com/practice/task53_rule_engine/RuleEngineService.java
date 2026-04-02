package com.practice.task53_rule_engine;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * ДВИЖОК БИЗНЕС-ПРАВИЛ
 *
 * <p>Реализуйте движок бизнес-правил (Rule Engine).
 * Правило (Rule) содержит: id, name, priority (чем больше число — тем выше приоритет),
 * condition (предикат проверки), action (действие при срабатывании).
 * Факты (Fact) — Map&lt;String, Object&gt;.</p>
 *
 * <p>Необходимо реализовать следующие операции:</p>
 * <ul>
 *   <li>addRule(rule) — добавить правило</li>
 *   <li>removeRule(ruleId) — удалить правило</li>
 *   <li>evaluate(facts) — применить все подходящие правила по приоритету (от высокого к низкому)</li>
 *   <li>evaluateFirst(facts) — применить только первое сработавшее правило</li>
 *   <li>getMatchingRules(facts) — получить список сработавших правил без выполнения действий</li>
 * </ul>
 *
 * <p>Бизнес-правила:</p>
 * <ul>
 *   <li>Правила применяются от высокого приоритета к низкому</li>
 *   <li>Правило может модифицировать facts (действие меняет Map)</li>
 *   <li>Цепочки правил: результат одного правила может активировать другое</li>
 *   <li>При одинаковом приоритете порядок не гарантирован</li>
 * </ul>
 *
 * <p>Уровень: Средний</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task53_rule_engine/RuleEngineService.java
 * java -cp src/main/java com.practice.task53_rule_engine.RuleEngineService
 * </pre>
 */
public class RuleEngineService {

    public record Rule(
            String id,
            String name,
            int priority,
            Predicate<Map<String, Object>> condition,
            Consumer<Map<String, Object>> action
    ) {}

    /**
     * Добавляет правило в движок.
     * @param rule правило
     * @throws IllegalArgumentException если правило с таким id уже существует
     */
    public void addRule(Rule rule) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Удаляет правило из движка.
     * @param ruleId идентификатор правила
     * @throws NoSuchElementException если правило не найдено
     */
    public void removeRule(String ruleId) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Применяет все подходящие правила к фактам в порядке приоритета (от высокого к низкому).
     * Каждое правило может модифицировать facts, и последующие правила видят изменения.
     * @param facts карта фактов
     * @return список id применённых правил
     */
    public List<String> evaluate(Map<String, Object> facts) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Применяет только первое сработавшее правило (с наивысшим приоритетом).
     * @param facts карта фактов
     * @return id сработавшего правила или Optional.empty()
     */
    public Optional<String> evaluateFirst(Map<String, Object> facts) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    /**
     * Возвращает список правил, условия которых выполняются для данных фактов.
     * Действия правил НЕ выполняются.
     * @param facts карта фактов
     * @return список подходящих правил (отсортированных по приоритету)
     */
    public List<Rule> getMatchingRules(Map<String, Object> facts) {
        // TODO: implement
        throw new UnsupportedOperationException("Не реализовано");
    }

    public static void main(String[] args) {
        System.out.println("=== RuleEngineService: Smoke Test ===");
        // TODO: smoke test
    }
}
