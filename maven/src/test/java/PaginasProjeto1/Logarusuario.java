package PaginasProjeto1;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logarusuario extends Paginabase {

	public Logarusuario(WebDriver navegador) {
		super(navegador);
		
	}
/**
 * Metodo para aceitar a politica de privacidade da pagina  
 * @return
 * @throws InterruptedException
 */
	
	public Logarusuario Aceitartermos() throws InterruptedException {
		
        //Aceitar termos da pagina
	    WebElement element = navegador.findElement(By.cssSelector("#confirmPolicyButton"));
	    JavascriptExecutor executor = (JavascriptExecutor)navegador; 
	    executor.executeScript("arguments[0].click()", element);
	  	return this;
	} 

/**
 * Metodo para clicar no logo da pagina para ir ate pagina principal	
 * @return
 * @throws InterruptedException
 */

	public Paginaprincipal Cricarnalogodapagina() throws InterruptedException {

		  navegador.findElement(By.cssSelector("#header-desktop-logo-wrapper > div > a.header-logo-cr.logo-cr-text")).click();	
          Thread.sleep(1000);
		  return new Paginaprincipal (navegador);
	}	     		 	    
	
/**
 * Metodo para clicar no botão Entre ou cadastre 	
 * @return
 * @throws InterruptedException
 */
	public Formulariologin Clicarnobotãoentreoucadastre() throws InterruptedException {
		
		  navegador.findElement(By.cssSelector("#header-account > a")).click();
		  Thread.sleep(1000);
	      return new Formulariologin(navegador);
	}      
}
