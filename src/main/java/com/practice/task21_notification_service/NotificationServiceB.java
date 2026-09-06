package com.practice.task21_notification_service;

/**
 * УВЕДОМЛЕНИЯ — ВАРИАНТ B: DEDUP В ОКНЕ 24Ч
 *
 * <p>CORE = базовый {@link NotificationService} (та же модель Notification/NotificationType).</p>
 *
 * <p><b>ВАРИАНТ B — идемпотентность/дедуп [prim: idempotency ⭐, per-key-eviction]:</b></p>
 * <ul>
 *   <li>Одинаковое уведомление (userId+title+message[+type]) в пределах 24ч не слать повторно.</li>
 *   <li>Ключ дедупа + отметка времени; протухшие записи вычищать (окно не растёт бесконечно).</li>
 *   <li>Проверка: send того же дубля дважды подряд → одно доставленное; спустя окно — снова можно.</li>
 * </ul>
 */
public class NotificationServiceB {

    /** Отправить с дедупом в окне 24ч (повтор в окне — подавляется). */
    public NotificationService.Notification send(String userId, String title, String message, NotificationService.NotificationType type) {
        throw new UnsupportedOperationException("TODO: variant B — 24h dedup window");
    }

    public static void main(String[] args) {
        System.out.println("=== NotificationServiceB (dedup 24h): Smoke ===");
    }
}
