package com.practice.task18_voting_system;

import java.util.*;
import java.time.*;

/**
 * Система голосования.
 *
 * <p>Реализовать in-memory систему голосования: создание опросов,
 * голосование, подсчёт результатов, управление жизненным циклом.</p>
 *
 * <p>Уровень: Базовый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task18_voting_system/VotingSystemService.java
 * java -cp src/main/java com.practice.task18_voting_system.VotingSystemService
 * </pre>
 */
public class VotingSystemService {

    public record Poll(String id, String question, List<String> options,
                       LocalDateTime startDate, LocalDateTime endDate, boolean closed) {}
    public record Vote(String userId, String pollId, int optionIndex, LocalDateTime timestamp) {}

    /**
     * Создать голосование
     * @param question вопрос
     * @param options варианты ответов (минимум 2)
     * @param endDate дата окончания
     */
    public String createPoll(String question, List<String> options, LocalDateTime endDate) {
        //TODO implement
        return null;
    }

    /**
     * Проголосовать
     * @throws IllegalStateException если уже голосовал, голосование закрыто или просрочено
     */
    public void vote(String userId, String pollId, int optionIndex) {
        //TODO implement
    }

    /** Результаты: индекс варианта -> количество голосов */
    public Map<Integer, Long> getResults(String pollId) {
        //TODO implement
        return Collections.emptyMap();
    }

    /** Закрыть голосование вручную */
    public void closePoll(String pollId) {
        //TODO implement
    }

    /** Активные голосования */
    public List<Poll> getActivePolls() {
        //TODO implement
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        System.out.println("=== VotingSystemService: Smoke Test ===");
        // TODO: создать опрос, проголосовать, проверить результаты
    }
}
