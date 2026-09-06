package com.practice.task03_user_registration;

import java.time.LocalDateTime;
import java.util.*;

/**
 * РЕГИСТРАЦИЯ — ВАРИАНТ C: АТОМАРНЫЙ CHECK-THEN-INSERT ПО ДВУМ КЛЮЧАМ
 *
 * <p>CORE: тот же сервис регистрации. Здесь — углубление МЕХАНИЗМА атомарности
 * из варианта B на случай ДВУХ независимых уникальных ключей (login И email).</p>
 *
 * <p><b>ВАРИАНТ C — atomic reserve двух ключей [prim: atomicity ⭐, mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>Есть ДВА уникальных индекса: по login и по email.</li>
 *   <li>Ловушка частичной вставки: поток занял login через putIfAbsent, а email оказался
 *       уже занят → нужно ОТКАТИТЬ резерв login, иначе login «утёк» (залочен навсегда).</li>
 *   <li>ЗАДАЧА: зарезервировать оба ключа атомарно как единое целое; при провале второго —
 *       корректный откат первого. Оба видны другим потокам либо целиком, либо никак.</li>
 *   <li>Направления: single-lock на обе вставки; либо putIfAbsent(login) → putIfAbsent(email),
 *       при неудаче второго remove(login); аккуратный порядок и обработка возвратов.</li>
 *   <li>Проверка: гонка login-занят vs email-занят; после отказа освобождённый ключ снова доступен.</li>
 * </ul>
 */
public class UserRegistrationServiceC {

    public record User(Long id, String login, String email, LocalDateTime registrationDate) {}

    /**
     * Атомарно зарезервировать login и email и создать пользователя. При занятости
     * ЛЮБОГО из ключей — отказ БЕЗ побочных эффектов (второй ключ не «протекает»).
     * @throws IllegalArgumentException валидация
     * @throws IllegalStateException login или email заняты
     */
    public User register(String login, String email) {
        // TODO: atomic reserve обоих индексов; откат первого при провале второго
        throw new UnsupportedOperationException("TODO: variant C — two-key atomic check-then-insert with rollback");
    }

    public Optional<User> findByLogin(String login) {
        throw new UnsupportedOperationException("TODO");
    }

    public Optional<User> findByEmail(String email) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        System.out.println("=== UserRegistrationServiceC (двухключевой atomic reserve): Smoke ===");
        // TODO: сценарий — login свободен, email занят → отказ, login остаётся свободным
    }
}
