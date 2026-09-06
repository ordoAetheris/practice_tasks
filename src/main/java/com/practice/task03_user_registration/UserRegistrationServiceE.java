package com.practice.task03_user_registration;

import java.time.LocalDateTime;
import java.util.*;

/**
 * РЕГИСТРАЦИЯ — ВАРИАНТ E: EDGE / ВАЛИДАЦИЯ / НОРМАЛИЗАЦИЯ
 *
 * <p>CORE: тот же сервис регистрации. Здесь — исчерпывающая обработка граничных
 * и «грязных» входов (системная дыра — писать edge ПИСЬМЕННО до кода).</p>
 *
 * <p><b>ВАРИАНТ E — edge/null-safety [prim: null-edge ⭐, normalization]:</b></p>
 * <ul>
 *   <li>null login, null email, пустые/из одних пробелов строки.</li>
 *   <li>email без @, без домена, с пробелами по краям, в разном регистре.</li>
 *   <li>Нормализация ПЕРЕД проверкой уникальности: trim, email → lower-case (иначе "A@x"/"a@x" — дубль-обход).</li>
 *   <li>login: учитывать ли регистр/пробелы? Зафиксировать правило и проверять его.</li>
 *   <li>Повторная доступность login/email после delete; автоинкремент id без дыр.</li>
 *   <li>ЗАДАЧА: register не пропускает ни один «грязный» вход и не создаёт скрытых дублей
 *       из-за регистра/пробелов.</li>
 * </ul>
 */
public class UserRegistrationServiceE {

    public record User(Long id, String login, String email, LocalDateTime registrationDate) {}

    /**
     * Регистрация с полной валидацией и нормализацией входа (trim + email lower-case)
     * перед проверкой уникальности.
     * @throws IllegalArgumentException null/пустой login, невалидный/пустой email
     * @throws IllegalStateException login/email заняты (с учётом нормализации)
     */
    public User register(String login, String email) {
        // TODO: нормализовать (trim, email→lower), провалидировать, затем уникальность
        throw new UnsupportedOperationException("TODO: variant E — edge/validation/normalization");
    }

    /** Найти по email (с той же нормализацией, что и при регистрации). */
    public Optional<User> findByEmail(String email) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Удалить по id; после удаления login/email снова доступны. */
    public boolean delete(Long userId) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        System.out.println("=== UserRegistrationServiceE (edge/валидация/нормализация): Smoke ===");
        // TODO: прогнать таблицу грязных входов; "A@X.com" и "a@x.com" — один и тот же email
    }
}
