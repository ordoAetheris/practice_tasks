# Как получить ревью от нейросети

Если нет ментора рядом — используй любую нейросеть (ChatGPT, Claude, YandexGPT, GigaChat, Qwen).
Готовый промпт лежит в `REVIEW_PROMPT.md`.

Ниже — как подготовить данные для вставки в чат.

---

## Шаг 1. Убедись что тесты проходят

```bash
TASK=task01_library_service

mvn test -Dtest="com.practice.$TASK.*"
```

Нейросеть **не запускает** код — она оценивает только архитектуру.
Но если тесты красные, сначала починить их.

## Шаг 2. Скопируй задание

```bash
TASK=task01_library_service

cat src/main/java/com/practice/$TASK/*.java
```

Это исходная заготовка с javadoc и `// TODO: implement`.

## Шаг 3. Сними публичные сигнатуры решения

### Вариант А: из исходников (компиляция не нужна)

```bash
TASK=task01_library_service

grep -rn --include="*.java" \
  -E "^\s*(public|protected|private)?\s*(class |interface |record |enum |.*\()" \
  src/main/java/com/practice/$TASK/solution/
```

### Вариант Б: через javap (точнее, но нужен `mvn compile`)

```bash
TASK=task01_library_service

find target/classes/com/practice/$TASK/solution -name "*.class" \
  ! -name "*\$*" \
  -exec javap -public {} \;
```

## Шаг 4. Скопируй код решения

```bash
TASK=task01_library_service

find src/main/java/com/practice/$TASK/solution -name "*.java" \
  -exec echo "===== {} =====" \; -exec cat {} \;
```

## Шаг 5. Скопируй тесты

```bash
TASK=task01_library_service

cat src/test/java/com/practice/$TASK/*Test.java
```

## Шаг 6. Собери всё в чат

1. Скопируй промпт из `REVIEW_PROMPT.md` (текст между линиями ═══)
2. После промпта вставь с заголовками:

```
## Задание
(вывод шага 2)

## Сигнатуры
(вывод шага 3)

## Код решения
(вывод шага 4)

## Тесты
(вывод шага 5)
```

3. Отправь. Получишь оценку по 6 критериям и конкретные рекомендации.

---

**Совет:** Перед ревью пройди чек-лист из `CHECKLIST.md` — часть проблем найдёшь сам.
