package com.example.app;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class RegressionCalculatorTest {

    Calculator calc = new Calculator(); // Common object for testing

    @Test
    public void testAdditionRegression() {
        assertEquals("Addition should return 5", 5, calc.add(6, 3));
    }

    @Test
    public void testSubtractionRegression() {
        assertEquals("Subtraction should return 1", 1, calc.subtract(3, 2));
    }

    @Test
    public void testZeroAddition() {
        assertEquals("Adding zero should return the same number", 7, calc.add(7, 0));
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals("Addition of negative numbers should be correct", -5, calc.add(-2, -3));
    }

    @Test
    public void testAssertNotNullForCalculator() {
        assertNotNull("Calculator instance should not be null", calc);
    }
}
