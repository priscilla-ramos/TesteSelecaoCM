package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",  tags = "@Pesquisar_Produto", glue = {"steps"}, monochrome=true, dryRun = false, strict = false)

public class Pesquisar_Produto_Test {
	
}
