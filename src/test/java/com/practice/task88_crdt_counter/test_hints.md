# Подсказки для тестирования: CRDTCounter

## Обязательно протестировать
- GCounter: increment + value
- GCounter: merge двух реплик — значение = сумма уникальных инкрементов
- GCounter: коммутативность merge(a,b).value() == merge(b,a).value()
- GCounter: ассоциативность merge(merge(a,b),c) == merge(a,merge(b,c))
- GCounter: идемпотентность merge(a,a).value() == a.value()
- PNCounter: increment + decrement + value
- PNCounter: value может быть отрицательным
- PNCounter: merge корректно объединяет P и N counters
- Конвергенция: после полного обмена все реплики дают одинаковый value()

## Продвинутые кейсы
- Множество узлов (5+) с независимыми инкрементами — merge всех даёт правильный итог
- GCounter: increment с amount > 1
- GCounter: increment с amount <= 0 — исключение
- Partial merge: merge только части реплик — промежуточное значение
- PNCounter: много инкрементов и декрементов на разных узлах — значение корректно
- Concurrent increments на разных репликах — merge не теряет обновления
- Merge с пустым counter — без изменений
- getState возвращает корректное внутреннее состояние
