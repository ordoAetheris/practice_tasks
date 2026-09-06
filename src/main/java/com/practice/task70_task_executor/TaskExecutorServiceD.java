package com.practice.task70_task_executor;

/**
 * ПУЛ ЗАДАЧ — ВАРИАНТ D: ИЗОЛЯЦИЯ ИСКЛЮЧЕНИЙ
 *
 * <p>CORE = базовый {@link TaskExecutorService}.</p>
 *
 * <p><b>ВАРИАНТ D — устойчивость воркера [prim: exception-isolation]:</b></p>
 * <ul>
 *   <li>Задача, бросившая исключение, НЕ убивает воркер-поток и не мешает другим задачам; ошибка попадает в Future/лог.</li>
 *   <li>Проверка: после падения одной задачи пул продолжает исполнять остальные; число живых потоков не уменьшилось.</li>
 * </ul>
 */
public class TaskExecutorServiceD {
    public TaskExecutorServiceD(int threadCount){ throw new UnsupportedOperationException("TODO: variant D — worker survives task exceptions"); }
    public static void main(String[] a){ System.out.println("=== TaskExecutorServiceD (exception isolation): Smoke ==="); }
}
