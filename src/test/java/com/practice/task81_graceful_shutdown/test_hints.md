# Подсказки для тестирования: task81_graceful_shutdown

Тест-фокус по каждому варианту (a/b/c/…) — в javadoc-блоке «Проверка» соответствующего класса-задания.

## Общее
- Concurrency: гонять под пулом потоков (CountDownLatch на старт), много итераций (флаки ловятся не с первого раза).
- Проверять инварианты ПОД нагрузкой (термination/shutdown/idempotency/visibility), а не только happy-path.
- graceful shutdown (hook/two-phase/checkpoint/coordinated/WAL)
