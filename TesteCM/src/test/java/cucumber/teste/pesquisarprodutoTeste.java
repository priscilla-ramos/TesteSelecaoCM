package cucumber.teste;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", tags = "@pesquisarproduto",
glue = "cucumber.teste.passos", monochrome = true, dryRun = false)

public class pesquisarprodutoTeste {

}
