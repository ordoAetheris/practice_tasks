# Подсказки для тестирования: LSMTree

## Обязательно протестировать
- put/get из MemTable (до flush)
- put, flush, get из SSTable
- delete (tombstone) — get возвращает null
- range запрос корректен
- Автоматический flush при переполнении MemTable

## Продвинутые кейсы
- Обновление ключа — новое значение перекрывает старое
- Compaction: несколько SSTables сливаются корректно
- Delete + compaction: tombstone удаляет старые записи
- Большой объём данных, множество flush + compact
