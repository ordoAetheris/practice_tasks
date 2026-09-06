# Подсказки для тестирования: task85_virtual_threads

Тест-фокус по каждому варианту (a/b/c/…) — в javadoc-блоке «Проверка» соответствующего класса-задания.

## Общее
- Concurrency: гонять под пулом потоков (CountDownLatch на старт), много итераций (флаки ловятся не с первого раза).
- Проверять инварианты ПОД нагрузкой (термination/shutdown/idempotency/visibility), а не только happy-path.
- virtual threads (pool→virtual/structured/pinning/когда-НЕ)
