package com.example.app;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

// Runs all test classes together for regression testing
@RunWith(Suite.class)
@Suite.SuiteClasses({
    CalculatorTest.class , // Add other test classes if needed
    RegressionCalculatorTest.class // Regression-specific tests

})
public class RegressionTestSuite {
    // No code needed here; this just groups tests together.
}
