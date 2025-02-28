package com.example.app;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import org.junit.jupiter.api.Test;

public class CalculatorAssertJTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        int result = calculator.add(5, 3);
        System.out.println("Result of addition: " + result);

        // AssertJ assertion
        assertThat(result)
            .as("Addition of 5 and 3 should equal 8") // Custom message
            .isEqualTo(8);
    }

    @Test
    void testSubtraction() {
        int result = calculator.subtract(10, 4);
        System.out.println("Result of subtraction: " + result);

        // AssertJ assertion
        assertThat(result)
            .as("Subtraction of 10 and 4 should equal 6")
            .isEqualTo(6);
    }

    @Test
    void testMultiply() {
        int result = calculator.multiply(7, 6);
        System.out.println("Result of multiplication: " + result);

        // AssertJ assertion
        assertThat(result)
            .as("Multiplication of 7 and 6 should equal 42")
            .isEqualTo(42);
    }

    @Test
    void testDivide() {
        int result = calculator.divide(10, 2);
        System.out.println("Result of division: " + result);

        // AssertJ assertion
        assertThat(result)
            .as("Division of 10 by 2 should equal 5")
            .isEqualTo(5);
    }

    @Test
    void testDivideByZero() {
        // AssertJ assertion for exceptions
        System.out.println("Testing division by zero");
        assertThatThrownBy(() -> calculator.divide(10, 0))
            .as("Division by zero should throw IllegalArgumentException")
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Cannot divide by zero!");
    }
}