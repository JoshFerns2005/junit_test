package com.example.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SystemTest {
    @Test
    void testUserLogin() {
        UserRepository repository = new UserRepository();
        UserService service = new UserService(repository);

       // service.createUser("Josh", "joshh@example.com", "joshua");

        // Test Login with correct credentials
        boolean loginSuccess = service.loginUser("joshh@example.com", "joshua");
        if (loginSuccess) {
            System.out.println("Login successful with correct credentials.");
        } else {
            System.out.println("Login failed unexpectedly with correct credentials.");
        }
        assertTrue(loginSuccess, "Login should succeed with correct credentials");

        // Test Login with incorrect credentials
        boolean loginFail = service.loginUser("joshh@example.com", "WrongPass");
        if (!loginFail) {
            System.out.println("Login failed as expected with incorrect credentials.");
        } else {
            System.out.println("Login succeeded unexpectedly with incorrect credentials.");
        }
        assertFalse(loginFail, "Login should fail with incorrect credentials");
    }
}