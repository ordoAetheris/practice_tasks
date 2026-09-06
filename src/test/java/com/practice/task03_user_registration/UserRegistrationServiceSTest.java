package com.practice.task03_user_registration;

import com.practice.task03_user_registration.solution.UserRegistrationServiceS;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class UserRegistrationServiceSTest {

    private UserRegistrationServiceS registrationService;
    @BeforeEach
    public void prepareService() {
        registrationService = new UserRegistrationServiceS();
    }
    // TODO: написать тесты

    @Test
    public void register_success() {
        String login = "Test";
        String email = "Test@test.com";

        var registered = registrationService.register(login, email);
        var found = registrationService.findByLogin(login);
        var foundEmail = registrationService.findByEmail(email);

        assertThat(found)
                .as(() -> "User not found by login: " + login)
                .isPresent()
                .hasValue(registered);

        assertThat(foundEmail)
                .as(() -> "User not found by email: " + email)
                .isPresent()
                .hasValue(registered);
    }

    @Test
    public void register_failure_due_to_empty_login() {

        String login = "";
        String email = "Test@test.com";

        assertThatThrownBy(() -> registrationService.register(login, email))
                .as(() -> "registration didn't throw an IAE for empty login")
                .isInstanceOf(IllegalArgumentException.class);


    }

    @Test
    public void register_failure_due_to_null_login() {
        String email = "Test@test.com";

        assertThatThrownBy(() -> registrationService.register(null, email))
                .as(() -> "registration didn't throw an IAE for null login")
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Login");
    }

    @Test
    public void register_failure_due_to_empty_email() {
        String email = "";
        assertThatThrownBy(() -> registrationService.register(email, null))
            .as(() -> "registration didn't throw an IAE for empty email")
            .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Email");
    }

    @Test
    public void register_failure_due_to_null_email() {
        String login = "Tester";
        assertThatThrownBy(() -> registrationService.register(login, null))
        .as(() -> "registration didn't throw an IAE for null email")
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("email");
    }

    @Test
    public void register_failure_due_to_non_valid_email() {
        String login = "Tester";
        String email = "test";
        assertThatThrownBy(() -> registrationService.register(login, email))
        .as(() -> "registration didn't throw an IAE for non valid email")
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Invalid email");
    }


    @Test
    public void get_users_list_sorted_by_registration_date() {


        var found = registrationService.getAllSortedByRegistrationDate();

        assertThat(found)
                .hasSize(4);

    }

}
