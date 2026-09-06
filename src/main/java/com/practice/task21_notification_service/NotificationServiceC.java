package com.practice.task21_notification_service;

import java.util.List;

/**
 * УВЕДОМЛЕНИЯ — ВАРИАНТ C: ИНТЕРФЕЙСЫ РЕПОЗИТОРИЕВ + IN-MEM СТАБ
 *
 * <p>CORE = базовый {@link NotificationService}.</p>
 *
 * <p><b>ВАРИАНТ C — абстракция хранилища [prim: interface-stub, open-closed]:</b></p>
 * <ul>
 *   <li>Вынести хранение за интерфейс {@code NotificationRepository}; сервис не зависит от конкретного
 *       стораджа. In-memory реализация — как стаб (без внешних систем; «БД» подменяется в тестах).</li>
 *   <li>Это грунт greatsokol: репозитории-интерфейсы + возможность подменить реализацию.</li>
 *   <li>Проверка: сервис работает с любой реализацией репозитория; in-mem стаб проходит те же тесты.</li>
 * </ul>
 */
public class NotificationServiceC {

    /** Абстракция хранилища уведомлений — реализуется in-mem стабом (или иным). */
    public interface NotificationRepository {
        void save(NotificationService.Notification n);
        List<NotificationService.Notification> findByUser(String userId);
    }

    private final NotificationRepository repo;

    public NotificationServiceC(NotificationRepository repo) {
        this.repo = repo;
    }

    public NotificationService.Notification send(String userId, String title, String message, NotificationService.NotificationType type) {
        throw new UnsupportedOperationException("TODO: variant C — via repository interface");
    }

    public static void main(String[] args) {
        System.out.println("=== NotificationServiceC (repo interface + in-mem stub): Smoke ===");
    }
}
