# Подсказки для тестирования: StockTrackerService

## Обязательно протестировать
- recordPrice и getCurrentPrice — последняя записанная цена
- recordPrice с price <= 0 — ожидать IllegalArgumentException
- getMinMax — корректные минимум и максимум за период
- getMovingAverage — проверить расчёт на известных данных
- getPriceHistory — хронологический порядок, только записи за период
- getTopGainers — акции с наибольшим ростом, корректный процент
- getTopLosers — акции с наибольшим падением

## Продвинутые кейсы
- getCurrentPrice для несуществующего тикера — NoSuchElementException
- getMinMax для периода без данных — ожидать ошибку
- getMovingAverage с windowSize > количества записей — среднее всех имеющихся
- Акция без данных за день — не попадает в gainers/losers
- Несколько записей в одну миллисекунду — корректная обработка
- getTopGainers(n) где n > количества акций — вернуть все
- Цена не изменилась за день — рост = 0%
