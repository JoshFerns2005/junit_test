package com.example.app;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTest {
    private static Counter sharedCounter;
    private Counter counter;

    @BeforeAll
    public static void setUpBeforeClass() {
        // Initialize a shared counter before all tests
        sharedCounter = new Counter();
        sharedCounter.increment();
        sharedCounter.increment();
        System.out.println("Shared counter initialized to " + sharedCounter.getCount());
    }

    @BeforeEach
    public void setUp() {
        // Initialize the counter
        counter = new Counter();
        System.out.println("Counter reset before each test.");
        counter.reset();
        System.out.println("Counter value after reset: " + counter.getCount());
    }

    @Test
    public void testIncrement() {
        // Perform increment operation and check the result
        counter.increment();
        System.out.println("Executing testIncrement.");
        assertEquals(1, counter.getCount());
        System.out.println("Counter value after increment: " + counter.getCount());
    }

    @Test
    public void testDecrement() {
        // Perform decrement operation and check the result
        counter.increment();
        counter.decrement();
        System.out.println("Executing testDecrement.");
        System.out.println("Counter value after decrement: " + counter.getCount());
        assertEquals(0, counter.getCount());
    }

    @AfterEach
    public void tearDown() {
        // Reset the counter's state
        System.out.println("Counter reset after each test.");
        counter.reset();
        System.out.println("Counter value after reset: " + counter.getCount());
    }

    @AfterAll
    public static void tearDownAfterClass() {
        // Clear the shared counter after all tests
        sharedCounter.reset();
        System.out.println("Shared counter reset to " + sharedCounter.getCount());
    }
}
