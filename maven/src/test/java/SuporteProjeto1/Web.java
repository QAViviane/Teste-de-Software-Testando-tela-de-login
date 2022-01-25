package SuporteProjeto1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {

	public static WebDriver CriarChrome() {
		
		  //Abrindo o navegador
		   System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe" );
		   WebDriver navegador = new ChromeDriver();
		        
		  //Navegando ate a pagina
		   navegador.get("https://chicorei.com/");
		
		   navegador.manage().window().maximize();
		   
		  
		   
		   return navegador;
		
	}
	
	
}
