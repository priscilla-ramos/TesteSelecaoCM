package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",  tags = "@Realizar_Login", glue = {"steps"}, monochrome=true, dryRun = false, strict = false)

public class Realizar_Login_Test {

}





