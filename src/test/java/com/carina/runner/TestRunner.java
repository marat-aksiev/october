package com.carina.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        publish = true,
        features = "src/test/resources/features",
        glue = "src/test/java/com/carina/step_definitions",
        dryRun = true,
        tags = ""
)
public class TestRunner {}
