# Practical Java

100 практических задач для подготовки к Java-собеседованиям в российских компаниях.

Формат взят с реальных собесов: Sber, X5, Tinkoff, VK, Яндекс и др.

## Быстрый старт

```bash
git clone <repo-url>
cd practical_java

# Открой задачу — прочитай javadoc
cat src/main/java/com/practice/task01_library_service/LibraryService.java

# Реализуй в пакете solution/
# Запусти тесты
mvn test -Dtest="com.practice.task01_library_service.*"
```

## Структура

```
practical_java/
├── src/main/java/com/practice/
│   ├── task01_library_service/
│   │   ├── LibraryService.java          # задание (javadoc + TODO)
│   │   └── solution/                    # твоё решение (gitignored)
│   ├── task02_product_catalog/
│   └── ...                              # 100 задач
├── src/test/java/com/practice/
│   ├── task01_library_service/
│   │   ├── LibraryServiceTest.java      # тестовый класс (пустой)
│   │   └── test_hints.md               # подсказки что тестировать
│   └── ...
├── doc/
│   ├── REVIEW_PROMPT.md                 # промпт для ревью в нейросети
│   ├── CHECKLIST.md                     # чек-лист самопроверки
│   └── HOW_TO_REVIEW.md                # инструкция по подготовке данных
├── GUIDE.md                             # подробное руководство
└── pom.xml                              # Maven, Java 21, JUnit 5, AssertJ
```

## Как работать

1. **Прочитай задание** — javadoc в файле задачи описывает что реализовать
2. **Реализуй** — создай пакет `solution/` внутри задачи, вынеси модели, интерфейсы, сервисы
3. **Напиши тесты** — тестовый класс создан, подсказки в `test_hints.md`
4. **Проверь** — `mvn test`
5. **Оцени себя** — чек-лист в `doc/CHECKLIST.md`, ревью через `doc/REVIEW_PROMPT.md`

## Уровни сложности

| Задачи | Уровень     | Ориентир             |
|--------|-------------|----------------------|
| 1-30   | Базовый     | Sber, X5, Ozon       |
| 31-60  | Средний     | Tinkoff, Avito       |
| 61-80  | Продвинутый | VK, Яндекс           |
| 81-100 | Хардкор     | Экспертный уровень   |

## Что оценивается

- Декомпозиция и SOLID
- Выбор структур данных
- Чистота кода и именование
- Тесты: покрытие, граничные случаи
- Обработка ошибок

Подробнее: [GUIDE.md](GUIDE.md) | [CHECKLIST.md](doc/CHECKLIST.md)

## Требования

- Java 21+
- Maven 3.9+
