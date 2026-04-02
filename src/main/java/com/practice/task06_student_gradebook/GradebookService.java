package com.practice.task06_student_gradebook;

import java.time.LocalDate;
import java.util.*;

/**
 * ЖУРНАЛ ОЦЕНОК СТУДЕНТОВ
 *
 * <p>Реализуйте журнал оценок для учебного заведения. Система хранит студентов,
 * предметы и оценки. Поддерживает расчёт средних баллов и формирование рейтингов.</p>
 *
 * <p>Сущности:</p>
 * <ul>
 *   <li>Student — студент: id, name</li>
 *   <li>Subject — предмет: id, name</li>
 *   <li>Grade — оценка: student, subject, value (1-5), date</li>
 * </ul>
 *
 * <p>Бизнес-правила:</p>
 * <ul>
 *   <li>Оценка должна быть в диапазоне от 1 до 5</li>
 *   <li>Студент и предмет должны существовать при выставлении оценки</li>
 *   <li>У одного студента может быть несколько оценок по одному предмету</li>
 * </ul>
 *
 * <p>Уровень: Базовый</p>
 *
 * <h3>Запуск из терминала:</h3>
 * <pre>
 * javac src/main/java/com/practice/task06_student_gradebook/GradebookService.java
 * java -cp src/main/java com.practice.task06_student_gradebook.GradebookService
 * </pre>
 */
public class GradebookService {

    public record Student(Long id, String name) {}

    public record Subject(Long id, String name) {}

    public record Grade(Student student, Subject subject, int value, LocalDate date) {}

    /**
     * Добавить студента.
     * @param student студент
     * @throws IllegalArgumentException если студент с таким id уже существует
     */
    public void addStudent(Student student) {
        // TODO: implement
    }

    /**
     * Добавить предмет.
     * @param subject предмет
     * @throws IllegalArgumentException если предмет с таким id уже существует
     */
    public void addSubject(Subject subject) {
        // TODO: implement
    }

    /**
     * Выставить оценку студенту по предмету.
     * @param studentId идентификатор студента
     * @param subjectId идентификатор предмета
     * @param value значение оценки (1-5)
     * @param date дата выставления
     * @return созданная оценка
     * @throws IllegalArgumentException если студент/предмет не найден или оценка вне диапазона
     */
    public Grade addGrade(Long studentId, Long subjectId, int value, LocalDate date) {
        // TODO: implement
        return null;
    }

    /**
     * Средний балл студента по всем предметам.
     * @param studentId идентификатор студента
     * @return средний балл или 0.0 если оценок нет
     */
    public double getAverageGrade(Long studentId) {
        // TODO: implement
        return 0.0;
    }

    /**
     * Средний балл по предмету среди всех студентов.
     * @param subjectId идентификатор предмета
     * @return средний балл или 0.0 если оценок нет
     */
    public double getAverageBySubject(Long subjectId) {
        // TODO: implement
        return 0.0;
    }

    /**
     * Топ-N студентов по среднему баллу (от наибольшего к наименьшему).
     * @param n количество студентов в топе
     * @return список студентов
     */
    public List<Student> getTopStudents(int n) {
        // TODO: implement
        return Collections.emptyList();
    }

    /**
     * Все оценки студента по конкретному предмету, отсортированные по дате.
     * @param studentId идентификатор студента
     * @param subjectId идентификатор предмета
     * @return список оценок
     */
    public List<Grade> getGrades(Long studentId, Long subjectId) {
        // TODO: implement
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        System.out.println("=== GradebookService: Smoke Test ===");
        // TODO: создать тестовые данные и проверить основные сценарии
    }
}
