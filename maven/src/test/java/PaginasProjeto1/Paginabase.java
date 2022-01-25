package PaginasProjeto1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Paginabase {

	public WebDriver navegador;
	
	public Paginabase(WebDriver navegador){
		
	   this.navegador = navegador;	
	 
				
	}

	public String Capturartextovalidacao(){
		
		return navegador.findElement(By.xpath("//*[@id=\"my-account-user-data\"]/div[2]/div")).getText();
	    
	}
}
