package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",  tags = "@Manter_Carrinho", glue = {"steps"}, monochrome=true, dryRun = false, strict = false)

public class Manter_Carrinho_Test {

}
