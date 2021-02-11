package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import cucumber.api.java.pt.*;

public class Manter_CarrinhoSteps {
	
	static WebDriver driver;
	static String url = "http://automationpractice.com/index.php";
	
	@Dado("^que o usuario escolha um produto na pagina principal$")
	public void que_o_usuario_escolha_um_produto_na_pagina_principal() throws Throwable {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		driver = new ChromeDriver(options);
		driver.get(url);
		
		WebElement produtoescolhido = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[1]/div/div[1]/div/a[1]/img"));
		produtoescolhido.click();		 	    
	}
	
	@Quando("^clica em \"([^\"]*)\"$")
	public void clica_em(String arg1) throws Throwable {
		WebElement botao_addCart = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button"));			
		botao_addCart.submit();

	}

	@Entao("^o sistema inclui o produto no carrinho$")
	public void o_sistema_inclui_o_produto_no_carrinho() throws Throwable {
		
		String result_atual = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/h1/span/span")).getText().replaceAll("\\n", "").replaceAll("\\r", "");
		String result_esperado = "1 Product";	
				
		assertEquals(result_esperado, result_atual);					
	    
	}

}
