package com.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RegressionTests {

    @Test
    @Tag("regression")  // This must match @IncludeTags("regression") in RegressionTestSuite
    void testAddition() {
        assertEquals(5, 2 + 3);
    }
}
