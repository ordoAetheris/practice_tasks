package com.practice.task99_actor_model;

import java.util.*;
import java.util.concurrent.*;

/**
 * Actor Model.
 *
 * <p>Реализовать систему акторов: каждый актор имеет mailbox (очередь сообщений)
 * и обрабатывает их по одному (single-threaded). Поддержка send (fire-and-forget),
 * ask (с ожиданием ответа), supervisor strategy (restart/stop/escalate).</p>
 *
 * <p>Уровень: Хардкор</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task99_actor_model/ActorSystem.java
 * java -cp src/main/java com.practice.task99_actor_model.ActorSystem
 * </pre>
 */
public class ActorSystem {

    public interface Actor {
        /** Обработать входящее сообщение */
        void onReceive(Object message);
    }

    public interface ActorRef {
        String getId();
    }

    public enum SupervisorStrategy { RESTART, STOP, ESCALATE }

    /** Создать актора, вернуть ссылку */
    public ActorRef createActor(Actor actor) {
        //TODO implement
        return null;
    }

    /** Создать актора с supervisor strategy */
    public ActorRef createActor(Actor actor, SupervisorStrategy strategy) {
        //TODO implement
        return null;
    }

    /** Отправить сообщение (fire-and-forget) */
    public void send(ActorRef ref, Object message) {
        //TODO implement
    }

    /**
     * Отправить сообщение и ожидать ответ
     * @return Future с ответом
     */
    public <T> CompletableFuture<T> ask(ActorRef ref, Object message) {
        //TODO implement
        return null;
    }

    /** Остановить актора */
    public void stop(ActorRef ref) {
        //TODO implement
    }

    /** Сообщения отправленные остановленным или несуществующим акторам */
    public List<Object> getDeadLetters() {
        //TODO implement
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        System.out.println("=== ActorSystem: Smoke Test ===");
        // TODO: создать акторов, отправить сообщения, проверить обработку
    }
}
