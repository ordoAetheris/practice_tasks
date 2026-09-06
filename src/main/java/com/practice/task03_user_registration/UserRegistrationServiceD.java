package com.practice.task03_user_registration;

import java.time.LocalDateTime;
import java.util.*;

/**
 * РЕГИСТРАЦИЯ — ВАРИАНТ D: ИДЕМПОТЕНТНЫЙ ПОВТОР (idempotency key)
 *
 * <p>CORE: тот же сервис регистрации. Здесь — устойчивость к ПОВТОРУ запроса
 * (ретрай клиента / сетевой дубль / двойной сабмит формы).</p>
 *
 * <p><b>ВАРИАНТ D — идемпотентность [prim: idempotency ⭐, dedup]:</b></p>
 * <ul>
 *   <li>Клиент шлёт register с requestId (ключ идемпотентности). Ретрай с тем же requestId
 *       НЕ должен создать второго пользователя — вернуть РЕЗУЛЬТАТ первого вызова.</li>
 *   <li>Отличать «тот же requestId» (вернуть кэшированный User) от «новый requestId, но занятый
 *       login/email» (это честный конфликт → IllegalStateException).</li>
 *   <li>ЗАДАЧА: register(requestId, login, email) идемпотентен по requestId; под гонкой двух
 *       одинаковых requestId создаётся ровно один юзер, оба вызова возвращают его.</li>
 *   <li>Направления: map requestId→User (или →результат); atomic put; аккуратно с TTL/ростом карты (edge).</li>
 * </ul>
 */
public class UserRegistrationServiceD {

    public record User(Long id, String login, String email, LocalDateTime registrationDate) {}

    /**
     * Идемпотентная регистрация по ключу requestId. Повтор с тем же requestId возвращает
     * ранее созданного пользователя без создания дубля.
     * @param requestId ключ идемпотентности (не пустой)
     * @throws IllegalArgumentException валидация login/email/requestId
     * @throws IllegalStateException login/email заняты ДРУГИМ (не идемпотентным) запросом
     */
    public User register(String requestId, String login, String email) {
        // TODO: если requestId уже виден — вернуть его результат; иначе создать атомарно и запомнить
        throw new UnsupportedOperationException("TODO: variant D — idempotent register by requestId");
    }

    public Optional<User> findByLogin(String login) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        System.out.println("=== UserRegistrationServiceD (идемпотентный повтор): Smoke ===");
        // TODO: дважды register с одним requestId → один и тот же User, размер хранилища = 1
    }
}
