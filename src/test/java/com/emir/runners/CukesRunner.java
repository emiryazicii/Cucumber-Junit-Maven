package com.emir.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * JUnit runner class for executing Cucumber tests.
 */
@RunWith(Cucumber.class) // Indicates that this class should be run with JUnit
@CucumberOptions(
        // Specifies the location of feature files
        features = "src/test/resources/features",
        // Specifies the package where step definitions are located
        glue = "com/emir/step_definitions",
        // Whether to execute a dry run of the feature files
        dryRun = false,
        // Specifies the tags to include/exclude specific scenarios or features
        tags = "@librarian and @smoke"
)
public class CukesRunner {
}
