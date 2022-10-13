package com.xyz.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        features = {"src/test/resources/com.xyz.featurefile"},
        glue = {"com/xyz/stepdefination"},
        dryRun = false,
        monochrome = true,
        tags = "@SmokeTest123",
        plugin = {"pretty",
                "html:target/HTMLReport",
                "json:target/Jsonreport/JsonReoprt.json",
                "junit:target/JunitReoprt/junitreport.xml"
        }


)

public class FeatureRunner {

}
