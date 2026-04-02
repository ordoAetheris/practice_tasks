package com.practice.task28_currency_converter;

import java.time.LocalDateTime;
import java.util.*;

/**
 * КОНВЕРТЕР ВАЛЮТ
 *
 * <p>Реализуйте сервис конвертации валют с поддержкой обменных курсов,
 * истории курсов и поиска лучшего курса через промежуточную валюту.</p>
 *
 * <p>Сущности:</p>
 * <ul>
 *   <li>ExchangeRate — обменный курс (from, to, rate, updatedAt)</li>
 * </ul>
 *
 * <p>Операции:</p>
 * <ul>
 *   <li>Добавить или обновить курс валютной пары</li>
 *   <li>Конвертировать сумму из одной валюты в другую</li>
 *   <li>Получить текущий курс пары</li>
 *   <li>Получить все доступные валюты</li>
 *   <li>Найти лучший курс через промежуточную валюту (A->C->B vs A->B)</li>
 *   <li>Получить историю курса пары</li>
 * </ul>
 *
 * <p>Бизнес-правила:</p>
 * <ul>
 *   <li>Курс должен быть строго больше 0</li>
 *   <li>Обратный курс вычисляется автоматически (1/rate)</li>
 *   <li>При обновлении курса предыдущее значение сохраняется в истории</li>
 *   <li>Конвертация одинаковых валют возвращает ту же сумму</li>
 * </ul>
 *
 * <p>Уровень: Средний</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task28_currency_converter/CurrencyConverterService.java
 * java -cp src/main/java com.practice.task28_currency_converter.CurrencyConverterService
 * </pre>
 */
public class CurrencyConverterService {

    public record ExchangeRate(
            String from,
            String to,
            double rate,
            LocalDateTime updatedAt
    ) {}

    /**
     * Добавляет или обновляет курс валютной пары. Автоматически создаёт обратный курс.
     *
     * @param from валюта-источник (например "USD")
     * @param to   валюта-цель (например "EUR")
     * @param rate курс обмена
     * @throws IllegalArgumentException если rate <= 0 или валюты пустые/одинаковые
     */
    public void setRate(String from, String to, double rate) {
        // TODO: implement
    }

    /**
     * Конвертирует сумму из одной валюты в другую по текущему курсу.
     *
     * @param from   валюта-источник
     * @param to     валюта-цель
     * @param amount сумма для конвертации
     * @return сконвертированная сумма
     * @throws IllegalArgumentException если курс не найден или amount < 0
     */
    public double convert(String from, String to, double amount) {
        // TODO: implement
        return 0.0;
    }

    /**
     * Возвращает текущий курс валютной пары.
     *
     * @param from валюта-источник
     * @param to   валюта-цель
     * @return текущий курс или пустой Optional
     */
    public Optional<Double> getRate(String from, String to) {
        // TODO: implement
        return Optional.empty();
    }

    /**
     * Возвращает множество всех доступных валют.
     *
     * @return множество кодов валют
     */
    public Set<String> getAvailableCurrencies() {
        // TODO: implement
        return Set.of();
    }

    /**
     * Ищет лучший курс конвертации A->B, рассматривая как прямой курс,
     * так и все варианты через одну промежуточную валюту (A->C->B).
     * Возвращает наилучший (максимальный) итоговый курс.
     *
     * @param from валюта-источник
     * @param to   валюта-цель
     * @return лучший курс или пустой Optional если путь не найден
     */
    public Optional<Double> findBestRate(String from, String to) {
        // TODO: implement
        return Optional.empty();
    }

    /**
     * Возвращает историю курса пары, отсортированную по дате (новые первыми).
     *
     * @param from валюта-источник
     * @param to   валюта-цель
     * @return список исторических курсов
     */
    public List<ExchangeRate> getRateHistory(String from, String to) {
        // TODO: implement
        return List.of();
    }

    public static void main(String[] args) {
        System.out.println("=== CurrencyConverterService: Smoke Test ===");
        // TODO: создать тестовые данные и проверить основные сценарии
    }
}
