package Projeto1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import PaginasProjeto1.Logarusuario;
import SuporteProjeto1.Web;

public class Logar {

	public WebDriver navegador;
			
	@Before
	public void setUp() throws Exception {
	
	  navegador = Web.CriarChrome();
		
	}
	@Test
	public void TC001_Deve_retornar_a_mensagem_informe_o_email_e_senha() throws InterruptedException {
	      new Logarusuario(navegador)
		 .Aceitartermos()
		 .Clicarnobotãoentreoucadastre()
		 .Digitaremail("").Digitasenha("")
	     .Clicarnobotãoentrar()
	     .CapturartextovalidacaoEmail()
	     .CapturartextovalidacaoSenha();
	   		
	}
	@Test
	public void TC002_Deve_retornar_a_mensagem_informe_a_senha() throws InterruptedException {
	      new Logarusuario(navegador)
		 .Aceitartermos()
		 .Clicarnobotãoentreoucadastre()
		 .Digitaremail("teste@hotmail.com").Digitasenha("")
	     .Clicarnobotãoentrar()
	     .CapturartextovalidacaoSenha();
	   		
	}
	@Test
	public void TC003_Deve_retornar_a_mensagem_informe_o_email() throws InterruptedException {
	      new Logarusuario(navegador)
		 .Aceitartermos()
		 .Clicarnobotãoentreoucadastre()
		 .Digitaremail("").Digitasenha("teste1234")
	     .Clicarnobotãoentrar()
	     .CapturartextovalidacaoEmail();
	   		
	}	
	@Test
	public void TC004_Deve_retornar_a_mensagem_Não_foi_possível_realizar_o_login_Verifique_seu_email_e_senha() throws InterruptedException {
	      new Logarusuario(navegador)
		 .Aceitartermos()
		 .Clicarnobotãoentreoucadastre()
		 .Digitaremail("vivianealves240498@hotmail.com").Digitasenha("teste1234")
	     .Clicarnobotãoentrar()
	     .CapturartextovalidacaoSenhainvalida();
	   		
	}	
	@Test
	public void TC005_Deve_ir_para_pagina_pedidos() throws InterruptedException {
	      new Logarusuario(navegador)
		 .Aceitartermos()
		 .Clicarnobotãoentreoucadastre()
		 .Digitaremail("vivianealves240498@hotmail.com").Digitasenha("Nintendo64")
	     .Clicarnobotãoentrar()
	     .Capturartextovalidacaotitulopedido();
	        		
	}		
	@After
	public void tearDown() throws Exception {
	
		navegador.close();
	
	}

	
}
