# Подсказки для тестирования: RaftLog

## Обязательно протестировать
- appendEntry увеличивает lastIndex на 1
- getEntry по валидному индексу — возвращает запись
- getEntry по невалидному индексу — Optional.empty()
- getLastIndex/getLastTerm для пустого и непустого лога
- deleteFrom — записи удалены, lastIndex уменьшился
- matchEntry — true для совпадающей записи, false для несовпадающей
- isUpToDate — корректное сравнение по term и index
- commitTo — commitIndex обновлён
- deleteFrom committed записей — IllegalStateException

## Продвинутые кейсы
- appendEntry с term < предыдущего — IllegalArgumentException
- deleteFrom(1) — полная очистка лога (если нет committed)
- commitTo с уменьшением commitIndex — исключение
- commitTo(index > lastIndex) — исключение
- Симуляция конфликта: лог [1:1, 2:1, 3:2], deleteFrom(2), append(2, term=3)
- isUpToDate: больший term при меньшем index — всё равно актуальнее
- Множественные append → delete → append циклы — индексы корректны
- Пустой лог: getLastIndex=0, getLastTerm=0, isUpToDate(0,0)=true
