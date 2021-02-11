package steps;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.pt.*;

public class Realizar_LoginSteps {
	
	static WebDriver driver;
	static String url = "http://automationpractice.com/index.php";

	@SuppressWarnings("deprecation")
	@Dado("^que o usuario queira fazer sign in na aplicacao$")
	public void que_o_usuario_queira_fazer_sign_in_na_aplicacao() throws Throwable {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		
		driver = new ChromeDriver(options);
		driver.get(url);
		
		WebElement botao_Login = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"));		
		botao_Login.click(); 	
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Quando("^o usuario informa o email \"([^\"]*)\"$")
	public void o_usuario_informa_o_email(String arg1) throws Throwable {
		WebElement textbox_Email = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[2]/input"));		
		textbox_Email.sendKeys(arg1);		
	}
	
	
	@Quando("^clica no botao \"([^\"]*)\"$")
	public void clica_no_botao(String arg1) throws Throwable {
		switch (arg1) {
		case "create an account":
			WebElement botao_create = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[3]/button/span"));
			botao_create.click();
			break;
		case "Sign in":
			WebElement botao_Login = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span"));
			botao_Login.click();
			break;
		case "Register":
			WebElement botao_register = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[4]/button/span"));			
			botao_register.click();
			break;
		default:
			break;
		}	

	}
	
	
	@SuppressWarnings("deprecation")
	@Quando("^informa os dados obrigatorios do cadastro$")
	public void informa_os_dados_obrigatorios_do_cadastro() throws Throwable {
		WebElement textbox_primeironome = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[2]/input"));
		WebElement textbox_ultimonome = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[3]/input"));
		WebElement textbox_senha = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[5]/input"));
		WebElement textbox_endereco = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[4]/input"));
		WebElement textbox_cidade = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[6]/input"));
		Select combobox_estado = new Select(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[7]/div/select")));
		WebElement textbox_cep = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[8]/input"));
		WebElement textbox_mobile = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[13]/input"));
		
		
		textbox_primeironome.sendKeys("Casa");		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		textbox_ultimonome.sendKeys("Magalhães");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		textbox_senha.sendKeys("12345");		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		textbox_endereco.sendKeys("Rua Magalhães, 115");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		textbox_cidade.sendKeys("Fortaleza");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		combobox_estado.selectByIndex(9);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		textbox_cep.sendKeys("12345");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		textbox_mobile.sendKeys("1245687");	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	
	@Entao("^o sistema faz o login automatico e exibe a pagina my account$")
	public void o_sistema_faz_o_login_automatico_e_exibe_a_pagina_my_account() throws Throwable {
		String result_atual = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a/span")).getText().replaceAll("\\n", "").replaceAll("\\r", "");
		String result_esperado = "Casa Magalhães";	
				
		assertEquals(result_esperado, result_atual);
		
		result_atual = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/h1")).getText().replaceAll("\\n", "").replaceAll("\\r", "");
		result_esperado = "MY ACCOUNT";	
				
		assertEquals(result_esperado, result_atual);
	}
	
	
	@Quando("^informa o login \"([^\"]*)\" e insere a senha \"([^\"]*)\"$")
	public void informa_o_login_e_insere_a_senha(String arg1, String arg2) throws Throwable {
		WebElement textbox_Email = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[1]/input"));		
		textbox_Email.sendKeys(arg1);
		
		WebElement textbox_senha = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[2]/span/input"));		
		textbox_senha.sendKeys(arg2);
	}
	
	@Entao("^o sistema exibe mensagem que a autenticacao falhou$")
	public void o_sistema_exibe_mensagem_que_a_autenticacao_falhou() throws Throwable {
		String result_atual = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[1]/ol/li")).getText().replaceAll("\\n", "").replaceAll("\\r", "");
		String result_esperado = "Authentication failed.";	
				
		assertEquals(result_esperado, result_atual);	
	}
	
	
}
