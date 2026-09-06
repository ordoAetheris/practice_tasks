# Подсказки для тестирования: task80_web_crawler

Тест-фокус по каждому варианту (a/b/c/…) — в javadoc-блоке «Проверка» соответствующего класса-задания.

## Общее
- Concurrency: гонять под пулом потоков (CountDownLatch на старт), много итераций (флаки ловятся не с первого раза).
- Проверять инварианты ПОД нагрузкой (термination/shutdown/idempotency/visibility), а не только happy-path.
- web crawler (fetch→parse→map; termination/dedup/shutdown)
