package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.pt.*;


public class Pesquisar_ProdutoSteps {
	
	static WebDriver driver;
	static String url = "http://automationpractice.com/index.php";
	
	
	@Dado("^que o usuario digite a palavra \"([^\"]*)\" para pesquisar$")
	public void que_o_usuario_digite_a_palavra_para_pesquisar_um_produto(String arg1) throws Throwable {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		driver = new ChromeDriver(options);
		driver.get(url);	
		
		WebElement textbox_Pesquisar = driver.findElement(By.id("search_query_top"));		
		textbox_Pesquisar.sendKeys(arg1);   	    
	}

	@Quando("^clicar no botao search$")
	public void clicar_no_botao_search() throws Throwable {
		WebElement botao_pesquisar = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button"));		
		botao_pesquisar.submit();   
		
	}

	@Entao("^o sistema lista todos os produtos que possuam a palavra pesquisada$")
	public void o_sistema_lista_todos_os_produtos_que_possuam_a_palavra_pesquisada() throws Throwable {
		
		String result_atual = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div[2]/div[2]")).getText().replaceAll("\\n", "").replaceAll("\\r", "");		
		String result_esperado = "Showing 1 - 7 of 7 items";	
				
		assertEquals(result_esperado, result_atual);	
			
	}

	@Entao("^o sistema exibe mensagem que nao existe resultado para a palavra pesquisada$")
	public void o_sistema_exibe_mensagem_que_nao_existe_resultado_para_a_palavra_pesquisada() throws Throwable {
		
		String result_atual = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/h1/span")).getText().replaceAll("\\n", "").replaceAll("\\r", "");
		String result_esperado = "0 results have been found.";	
			
		assertEquals(result_esperado, result_atual);	    
	}

}
