package com.practice.task03_user_registration;

import java.time.LocalDateTime;
import java.util.*;

/**
 * РЕГИСТРАЦИЯ — ВАРИАНТ B: ГОНКА УНИКАЛЬНОСТИ (concurrent unique login/email)
 *
 * <p>CORE (как в базе {@link UserRegistrationService}): register(login,email) с
 * валидацией; login и email уникальны; поиск по login/email.</p>
 *
 * <p><b>ВАРИАНТ B — доменная гонка [prim: mutual-excl ⭐, idempotency ⭐]:</b></p>
 * <ul>
 *   <li>Два+ потока одновременно вызывают register(...) с ОДНИМ login (или email).</li>
 *   <li>Наивный «проверил, что дубля нет → вставил» под гонкой пропускает ОБА:
 *       оба потока прошли проверку до вставки → два юзера с одним email (нарушен инвариант).</li>
 *   <li>ЗАДАЧА: сделать register атомарным, чтобы уникальность держалась под N потоками.</li>
 *   <li>Направления: {@code ConcurrentHashMap.putIfAbsent} как atomic-reserve ключа;
 *       либо лок на всю секцию check-then-insert; либо один synchronized-индекс.</li>
 *   <li>Проверка (см. test_hints): M потоков × один email → РОВНО 1 успех, остальные IllegalStateException;
 *       итоговый размер хранилища = 1.</li>
 * </ul>
 */
public class UserRegistrationServiceB {

    public record User(Long id, String login, String email, LocalDateTime registrationDate) {}

    /**
     * ПОТОКОБЕЗОПАСНАЯ регистрация: при гонке на одинаковый login/email ровно один
     * поток создаёт пользователя, остальные получают отказ. Никаких дублей.
     * @throws IllegalArgumentException если логин пустой или email невалидный
     * @throws IllegalStateException если логин или email уже заняты
     */
    public User register(String login, String email) {
        // TODO: атомарный check-then-insert (putIfAbsent / лок), уникальность держится под гонкой
        throw new UnsupportedOperationException("TODO: variant B — atomic register under contention");
    }

    /** Найти по логину (потокобезопасное чтение). */
    public Optional<User> findByLogin(String login) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Найти по email (потокобезопасное чтение). */
    public Optional<User> findByEmail(String email) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        System.out.println("=== UserRegistrationServiceB (гонка уникальности): Smoke ===");
        // TODO: пул из M потоков регистрирует ОДИН email одновременно; ожидать ровно 1 успех
    }
}
