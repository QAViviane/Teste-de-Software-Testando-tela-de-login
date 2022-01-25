package PaginasProjeto1;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Minhaconta extends Paginabase {

	public Minhaconta(WebDriver navegador) {
		super(navegador);
		
	}
/**
 * Metodo para clicar no icone Olá,nome de usuario 
 * @return
 * @throws InterruptedException
 */
	public Minhaconta Clicariconenomedeusuario() throws InterruptedException {
		
	           navegador.findElement(By.cssSelector("#header-account > div.header-topbar-btn.logged > div")).click();;
                   Thread.sleep(2000);	
                   return this;
     
	}
/**
 * Metodo para fazer a valicão do texto "Informe seu email"
 * @return
 */
	public Minhaconta CapturartextovalidacaoEmail(){
			
	           WebElement msg = navegador.findElement(By.cssSelector("#my-wrapper > section > div > form > div:nth-child(3) > small"));
		   String mensagem = msg.getText();       
		   assertEquals("Informe seu email",mensagem);	  		   
		   return this;	     
	 }
/**
 * Metodo para fazer a valicão do texto "Informe sua senha"
 * @return
 */
	public Minhaconta CapturartextovalidacaoSenha(){
			
	           WebElement msg = navegador.findElement(By.cssSelector("#my-wrapper > section > div > form > div:nth-child(4) > small"));
		   String mensagem = msg.getText();		       
		   assertEquals("Informe sua senha",mensagem);	  		   
		   return this;	     
    }
/**
 * Metodo para fazer a valicão do texto "Não foi possível realizar o login. Verifique seu email e senha."
 * @return
 */
	public Minhaconta CapturartextovalidacaoSenhainvalida(){
			
	           WebElement msg = navegador.findElement(By.cssSelector("#my-wrapper > section > div > div.collapsible.opened > div"));
		   String mensagem = msg.getText();    
		   assertEquals("Não foi possível realizar o login. Verifique seu email e senha.",mensagem);	  		   
		   return this;	     
    }
/**
 * Metodo para fazer a valicão de Login, caso o login ser realizado com sucesso ira ir para pagina com titulo "Pedidos"  
 * @return
 */
	public Minhaconta Capturartextovalidacaotitulopedido(){
			
	           WebElement msg = navegador.findElement(By.cssSelector("#my-account-content > div > h1"));
		   String mensagem = msg.getText();    
		   assertEquals("Pedidos",mensagem);	  		   
		   return this;	     
  }	 	 	 
/**
 * Metodo para clicar no menu bar Meus dados
 * @return
 * @throws InterruptedException
 */
	public Dadoscadastrais Cricaremmeusdados() throws InterruptedException {
		
	       navegador.findElement(By.cssSelector("#header-account > div.cr-popover-content.logged > a:nth-child(1)")).click();
               Thread.sleep(2000); 	  
	       return new Dadoscadastrais(navegador);
	     
	}	
}
