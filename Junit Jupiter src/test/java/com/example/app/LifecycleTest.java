package com.example.app;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class LifecycleTest {

    @BeforeAll
    void beforeAll() {
        System.out.println("Before All - Runs once before all tests");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Before Each - Runs before each test");
    }

    @Test
    void testOne() {
        System.out.println("Test 1 Running");
        Assertions.assertTrue(true);
    }

    @Test
    void testTwo() {
        System.out.println("Test 2 Running");
        Assertions.assertTrue(true);
    }

    @AfterEach
    void afterEach() {
        System.out.println("After Each - Runs after each test");
    }

    @AfterAll
    void afterAll() {
        System.out.println("After All - Runs once after all tests");
    }
}
