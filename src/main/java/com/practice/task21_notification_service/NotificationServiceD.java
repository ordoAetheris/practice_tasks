package com.practice.task21_notification_service;

/**
 * УВЕДОМЛЕНИЯ — ВАРИАНТ D: THREAD-SAFE ОТПРАВКА/ЧТЕНИЕ
 *
 * <p>CORE = базовый {@link NotificationService}.</p>
 *
 * <p><b>ВАРИАНТ D — потокобезопасность [prim: mutual-excl ⭐]:</b></p>
 * <ul>
 *   <li>Конкурентные send и getUnread/markAsRead не теряют уведомления и не дают несогласованных чтений.</li>
 *   <li>Генерация id и запись в хранилище — атомарны.</li>
 *   <li>Проверка: K потоков send → ровно K уведомлений; параллельный markAsRead согласован.</li>
 * </ul>
 */
public class NotificationServiceD {

    public NotificationService.Notification send(String userId, String title, String message, NotificationService.NotificationType type) {
        throw new UnsupportedOperationException("TODO: variant D — thread-safe send");
    }

    public java.util.List<NotificationService.Notification> getUnread(String userId) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        System.out.println("=== NotificationServiceD (thread-safe): Smoke ===");
    }
}
