package com.example.app;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AAAExampleTest {

    Calculator calc = new Calculator(); // Shared instance for all tests

    // Example for Addition
    @Test
    public void testAdditionWithAAA() {
        // Arrange
        int a = 2;
        int b = 3;
        int expected = 5;
        
        // Act
        int result = calc.add(a, b);

        System.out.println("Test Case: testAdditionWithOutput");
        System.out.println("Input values: a = " + a + ", b = " + b);
        System.out.println("Expected result: " + expected);
        System.out.println("Actual result: " + result);
        
        // Assert
        assertEquals("Addition should return 5", expected, result);
    }

    // Example for Subtraction
    @Test
    public void testSubtractionWithAAA() {
        // Arrange
        int a = 5;
        int b = 3;
        int expected = 7;
        
        // Act
        int result = calc.subtract(a, b);
        
        // Assert
        assertEquals("Subtraction should return 2", expected, result);
    }

    // Example for Negative Numbers Addition
    @Test
    public void testNegativeAdditionWithAAA() {
        // Arrange
        int a = -2;
        int b = -3;
        int expected = -5;
        
        // Act
        int result = calc.add(a, b);
        
        // Assert
        assertEquals("Negative addition should return -5", expected, result);
    }

    // Example for Zero Addition
    @Test
    public void testZeroAdditionWithAAA() {
        // Arrange
        int a = 7;
        int b = 0;
        int expected = 7;
        
        // Act
        int result = calc.add(a, b);
        
        // Assert
        assertEquals("Zero addition should return the same number", expected, result);
    }
}
