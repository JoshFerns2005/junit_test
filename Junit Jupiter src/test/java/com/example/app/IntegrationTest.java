package com.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

class IntegrationTest {

    @Test
    void testUserCreationWithDatabase() {
        UserRepository repository = new UserRepository();
        UserService service = new UserService(repository);

        service.createUser("ryan", "ryan@example.com", "password123");
        User user = service.getUserByEmail("ryan@example.com");

        assertNotNull(user);
        assertEquals("ryanrahul123", user.getName());
        assertEquals("ryan@example.com", user.getEmail());
    }
}
