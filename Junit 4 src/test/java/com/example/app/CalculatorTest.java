package com.example.app;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CalculatorTest {

    Calculator calc = new Calculator(); // Common object for all tests

    @Test
    public void testAddition() {
        assertEquals(5, calc.add(2, 3));  // ✅ Should return 5
    }

    @Test
    public void testSubtraction() {
        // fail("Intentional Failure to test regression");
        assertEquals(1, calc.subtract(3, 2));  // ✅ Should return 1
    }

    @Test
    public void testAssertTrue() {
        assertTrue(calc.add(2, 2) == 4);  // ✅ 2+2 should be 4
    }

    @Test
    public void testAssertFalse() {
        assertFalse(calc.subtract(5, 4) == 2);  // ✅ 5-3 is not 1
    }

    @Test
    public void testAssertNull() {
        Calculator temp = null;
        assertNull(temp);  // ✅ temp is explicitly null
    }

    @Test
    public void testAssertNotNull() {
        assertNotNull(calc);  // ✅ calc should never be null
    }
}
