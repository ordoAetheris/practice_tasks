# Подсказки для тестирования: CircuitBreaker

## Обязательно протестировать
- CLOSED: успешные вызовы проходят, состояние не меняется
- CLOSED → OPEN: failureThreshold последовательных ошибок
- OPEN: вызовы отклоняются с CircuitBreakerOpenException
- OPEN → HALF_OPEN: после resetTimeout
- HALF_OPEN → CLOSED: successThreshold успешных вызовов
- HALF_OPEN → OPEN: одна ошибка возвращает в OPEN
- getStats корректно считает success/failure/rejected

## Продвинутые кейсы
- Успешный вызов в CLOSED сбрасывает счётчик ошибок
- reset() возвращает в CLOSED и обнуляет счётчики
- Потокобезопасность: конкурентные вызовы execute
- Исключение action корректно пробрасывается вызывающему
- Результат action корректно возвращается при успехе
- OPEN → HALF_OPEN: проверка по времени (не раньше resetTimeout)
- Множественные циклы CLOSED → OPEN → HALF_OPEN → CLOSED
