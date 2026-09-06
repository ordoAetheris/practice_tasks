package com.practice.task04_todo_list;

import com.practice.task04_todo_list.solution.TodoListServiceS;
import com.practice.task04_todo_list.solution.data.Priority;
import com.practice.task04_todo_list.solution.data.Status;
import com.practice.task04_todo_list.solution.data.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TodoListServiceSTest {

    private TodoListServiceS todoService;
    @BeforeEach
    void setUp() {
        TodoListServiceS todoService = new TodoListServiceS();
    }
    // TODO: написать тесты

    @Test
    public void create_task_happy_path() {
        Task reference = new Task(
                1L,
                "Test",
                "Testing",
                Priority.MEDIUM,
                Status.TODO,
                null
        );

        String title = "Test";
        String description = "Testing";
        Priority priority = Priority.MEDIUM;

        var returned = todoService.createTask(title,description,priority);

        assertThat(returned).isNotNull();
        assertThat(returned).
                usingRecursiveComparison()
                .ignoringFields("createdAt")
                .isEqualTo(reference);
    }

    @Test
    public void create_task_corrupted_title_throws_IAE() {
        String blankTittle = "    ";

        assertThrows(IllegalArgumentException.class, () -> {
            todoService.createTask(null,"test",Priority.LOW);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            todoService.createTask(blankTittle, "test", Priority.LOW);
        });
    }

    @Test
    public void update_status_happy_path() {
        Task reference = new Task(
                1L,
                "Test",
                "Testing",
                Priority.LOW,
                Status.TODO,
                null
        );
        var returned = todoService.createTask("Test", "Testing", Priority.LOW);

        assertThat(returned).isNotNull();
        assertThat(returned)
                .usingRecursiveComparison()
                .ignoringFields("createdAt")
                .isEqualTo(reference);

    }

    @Test
    public void update_status_wrong_status_transition_throws_ISE() {

    }

    @Test
    public void update_status_non_existing_task_throws_IAE() {}

    @Test
    public void delete_task_happy_path() {}

    @Test
    public void delete_task_not_existing_returns_null() {}

    @Test
    public void find_by_status_happy_path() {}

    @Test
    public void find_by_status_null_returns_null() {}

    @Test
    public void find_by_status_with_non_existing_in_status() {}

    @Test
    public void find_by_priority_happy_path() {}

    @Test
    public void find_by_priority_null_returns_null() {}

    @Test
    public void find_by_priority_with_non_existing_in_priority() {}

    @Test
    //Это единственный возможный тест?
    public void get_all_happy_path() {}

}
