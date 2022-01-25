package PaginasProjeto1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Formulariologin extends Paginabase {

	public Formulariologin(WebDriver navegador) {
		super(navegador);	
	}
/**
 * Metodo para digitar o E-mail do usuario	
 * @param email
 * @return
 */
	public Formulariologin Digitaremail(String email) {
		
		navegador.findElement(By.name("email")).sendKeys(email);		
		return this;
	}
/**
 * Metodo para digitar a senha do usuario
 * @param senha
 * @return
 */
	public Formulariologin Digitasenha(String senha) {
		
		navegador.findElement(By.name("password")).sendKeys(senha);;		
		return this;
	}
 /**
  * Metodo parar clicar no botão entrar para realizar o login  
  * @return
  * @throws InterruptedException
  */
	public Minhaconta Clicarnobotãoentrar() throws InterruptedException {
	
    	navegador.findElement(By.cssSelector("#my-wrapper > section > div > form > div:nth-child(7) > button")).click();
        Thread.sleep(4000);		
		return new Minhaconta(navegador) ;
	}
   
	
}
