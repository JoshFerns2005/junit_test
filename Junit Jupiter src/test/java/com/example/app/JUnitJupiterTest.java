package com.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class JUnitJupiterTest {

    @Test
    void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        System.out.println("Result for addition: " + result); // Print to console
        assertEquals(5, result, "2 + 3 should equal 5");
    }
    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(5, 3);
        System.out.println("Result for subtraction: " + result); // Print to console
        assertEquals(2, result, "5 - 3 should equal 2");
    }

    @Test
    void testMultiply(){
        Calculator calculator = new Calculator();
        int result = calculator.multiply(5, 3);
        System.out.println("Result for multiplication: " + result); // Print to console
        assertEquals(15, result, "5 * 3 should equal 15");
    }
}
