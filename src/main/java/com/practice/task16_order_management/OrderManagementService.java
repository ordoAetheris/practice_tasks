package com.practice.task16_order_management;

import java.util.*;

/**
 * Управление заказами.
 *
 * <p>Реализовать in-memory систему управления заказами с жизненным циклом:
 * CREATED -> PAID -> SHIPPED -> DELIVERED. Отмена возможна до доставки.</p>
 *
 * <p>Уровень: Базовый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task16_order_management/OrderManagementService.java
 * java -cp src/main/java com.practice.task16_order_management.OrderManagementService
 * </pre>
 */
public class OrderManagementService {

    public enum OrderStatus { CREATED, PAID, SHIPPED, DELIVERED, CANCELLED }

    public record Customer(String id, String name) {}
    public record OrderItem(String productName, int quantity, double price) {}
    public record Order(String id, String customerId, List<OrderItem> items,
                        OrderStatus status, long createdAt) {}

    /** Зарегистрировать клиента */
    public void registerCustomer(Customer customer) {
        //TODO implement
    }

    /** Создать заказ */
    public String createOrder(String customerId, List<OrderItem> items) {
        //TODO implement
        return null;
    }

    /** Оплатить заказ. @throws IllegalStateException если статус не CREATED */
    public void payOrder(String orderId) {
        //TODO implement
    }

    /** Отправить заказ. @throws IllegalStateException если статус не PAID */
    public void shipOrder(String orderId) {
        //TODO implement
    }

    /** Доставить заказ. @throws IllegalStateException если статус не SHIPPED */
    public void deliverOrder(String orderId) {
        //TODO implement
    }

    /** Отменить заказ. @throws IllegalStateException если заказ уже доставлен */
    public void cancelOrder(String orderId) {
        //TODO implement
    }

    /** Заказы клиента */
    public List<Order> getOrdersByCustomer(String customerId) {
        //TODO implement
        return Collections.emptyList();
    }

    /** Заказы по статусу */
    public List<Order> getOrdersByStatus(OrderStatus status) {
        //TODO implement
        return Collections.emptyList();
    }

    /** Общая сумма заказа */
    public double getOrderTotal(String orderId) {
        //TODO implement
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("=== OrderManagementService: Smoke Test ===");
        // TODO: создать клиента, заказ, провести по статусам
    }
}
