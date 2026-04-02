# Подсказки для тестирования: TransactionLogService

## Обязательно протестировать
- begin — транзакция создаётся со статусом PENDING
- addOperation — операция добавляется к транзакции
- commit — статус меняется на COMMITTED
- rollback — статус меняется на ROLLED_BACK
- Повторный commit — ожидать IllegalStateException
- Повторный rollback — ожидать IllegalStateException
- commit после rollback — ожидать IllegalStateException
- getCommittedAfter — возвращает только COMMITTED транзакции
- getActiveTransactions — возвращает только PENDING транзакции

## Продвинутые кейсы
- addOperation к завершённой транзакции — ожидать IllegalStateException
- getTransaction для несуществующего id — ожидать NoSuchElementException
- rollback после commit — ожидать ошибку
- Множество параллельных транзакций — изоляция данных
- getCommittedAfter не включает ROLLED_BACK транзакции
- Транзакция без операций — commit допустим
- getActiveTransactions после commit/rollback всех — пустой список
- Уникальность id транзакций
