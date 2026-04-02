# Подсказки для тестирования: IntervalSchedulerService

## Обязательно протестировать
- addInterval — интервал добавляется корректно
- addInterval с start >= end — ожидать IllegalArgumentException
- findOverlapping — находит все пересекающиеся интервалы
- Непересекающиеся интервалы — findOverlapping возвращает пустой список
- mergeOverlapping — два пересекающихся объединяются в один
- mergeOverlapping — цепочка пересечений (A-B, B-C) -> один интервал
- findFreeSlots — корректные свободные промежутки
- maxNonOverlapping — максимальное количество непересекающихся

## Продвинутые кейсы
- Смежные интервалы (end одного = start другого) — определить, пересекаются ли они
- findFreeSlots когда весь диапазон занят — пустой список
- findFreeSlots когда ничего не занято — один свободный слот на весь диапазон
- maxNonOverlapping — проверить что жадный алгоритм даёт оптимальный результат
- removeInterval несуществующего — ожидать NoSuchElementException
- mergeOverlapping на непересекающихся — все остаются как есть
- Один интервал — mergeOverlapping возвращает его же
- Дублирование id при addInterval — ожидать ошибку
- Большое количество интервалов — findOverlapping работает эффективно
