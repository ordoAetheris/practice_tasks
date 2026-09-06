package com.practice.task70_task_executor;

/**
 * ПУЛ ЗАДАЧ — ВАРИАНТ E: ОТМЕНА ЗАДАЧ (Future.cancel)
 *
 * <p>CORE = базовый {@link TaskExecutorService}.</p>
 *
 * <p><b>ВАРИАНТ E — отмена [prim: cancellation ⭐]:</b></p>
 * <ul>
 *   <li>Future.cancel(mayInterruptIfRunning): ещё не начатую — снять из очереди; выполняющуюся — прервать (interrupt), задача реагирует на флаг.</li>
 *   <li>isCancelled/get корректны после отмены.</li>
 *   <li>Проверка: отменённая до старта не запускается; отменённая в процессе — прерывается по interrupt.</li>
 * </ul>
 */
public class TaskExecutorServiceE {
    public TaskExecutorServiceE(int threadCount){ throw new UnsupportedOperationException("TODO: variant E — cancellable futures (interrupt)"); }
    public static void main(String[] a){ System.out.println("=== TaskExecutorServiceE (cancel): Smoke ==="); }
}
