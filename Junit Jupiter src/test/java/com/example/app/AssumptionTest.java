package com.example.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.*;

public class AssumptionTest {

    @Test
    void testWithAssumeTrue() {
        System.out.println("Running testWithAssumeTrue...");

        // Assume that the condition is true
        assumeTrue(5 < 3, "This assumption should pass because 5 > 3");

        // This code will run only if the assumption passes
        assertEquals(5, 5, "This assertion should pass.");
    }

    @Test
    void testWithAssumeFalse() {
        System.out.println("Running testWithAssumeFalse...");

        // Assume that the condition is false
        assumeFalse(5 < 3, "This assumption should pass because 5 is not less than 3");

        // This code will run only if the assumption passes
        assertTrue(true, "This assertion should pass.");
    }

    @Test
    void testWithAssumingThat() {
        System.out.println("Running testWithAssumingThat...");

        // Execute the block only if the condition is true
        assumingThat(
            "DEV".equals(System.getenv("ENV")), // Condition: Check if ENV is "DEV"
            () -> {
                System.out.println("Environment is DEV. Running DEV-specific test logic.");
                assertEquals(10, 10, "This assertion should pass in DEV environment.");
            }
        );

        // This code will always run, regardless of the assumption
        System.out.println("This part of the test runs regardless of the assumption.");
        assertEquals(20, 20, "This assertion should always pass.");
    }

    @Test
    void testAbort() {
        System.out.println("Running testAbort...");

        // Abort the test unconditionally
        abort("Aborting this test intentionally.");

        // This code will never run
        fail("This line should never be reached.");
    }
}