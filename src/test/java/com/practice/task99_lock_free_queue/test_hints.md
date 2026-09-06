# Подсказки для тестирования: LockFreeQueue

## Обязательно протестировать
- enqueue + dequeue одного элемента
- FIFO порядок: enqueue(1,2,3) → dequeue() = 1,2,3
- dequeue из пустой очереди → Optional.empty()
- peek не извлекает элемент
- isEmpty / size корректны после операций
- Многопоточный тест: N producers + M consumers — все элементы доставлены, нет дубликатов
- Нет использования synchronized/Lock (code review)

## Продвинутые кейсы
- Высокий contention: 8+ потоков одновременно enqueue/dequeue
- Проверка linearizability: каждый dequeue-элемент был enqueue ровно один раз
- Stress test: 1 000 000 операций из нескольких потоков — нет зависаний, нет потерь
- enqueue null → NullPointerException
- Чередование enqueue/dequeue из разных потоков — очередь не ломается
- Пустая очередь → enqueue → dequeue → пустая очередь (проверить состояние dummy node)
- ABA-проблема: сценарий, где без защиты CAS даёт некорректный результат
- Производительность: сравнить с ConcurrentLinkedQueue (должна быть сопоставима)
