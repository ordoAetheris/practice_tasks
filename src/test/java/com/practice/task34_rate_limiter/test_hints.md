# Подсказки для тестирования: RateLimiterService

## Обязательно протестировать
- Token Bucket: capacity запросов разрешены, capacity+1 — отклонён
- Token Bucket: после ожидания (пополнения) запрос снова разрешён
- Sliding Window: maxRequests за windowSizeMs, следующий отклонён
- Sliding Window: после выхода старых запросов из окна — новые разрешены
- Fixed Window: maxRequests в пределах окна, затем отклонение
- Fixed Window: в новом окне счётчик сбрасывается
- getAvailablePermits — корректное количество для каждого алгоритма
- reset — состояние сброшено, запросы снова разрешены

## Продвинутые кейсы
- Разные clientId — независимые лимиты
- Token Bucket: refillRate < 1 (медленное пополнение)
- Token Bucket: пополнение не превышает capacity
- Sliding Window vs Fixed Window — разное поведение на границе окна
- Capacity/maxRequests = 1 — минимальный лимит
- Параметры <= 0 — ожидать исключение
- Нагрузочный тест — много запросов подряд
