package com.example.app;  // Use your actual package name

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("com.example.app")  // Change this if your tests are in a different package
@IncludeTags("regression")  // Runs only tests tagged as "regression"
public class RegressionTestSuite {
}
