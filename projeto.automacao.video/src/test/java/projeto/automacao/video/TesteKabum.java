package projeto.automacao.video;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import metodos.MetodosKabum;

public class TesteKabum {

	MetodosKabum metodos = new MetodosKabum();
	By pesquisar = By.xpath("//input[@id='input-busca']");

	@Before 
	public void setUp() throws Exception {

		metodos.abrirNavegador("https://kabum.com.br");
	}

	@After 
	public void tearDown() throws Exception {
		metodos.fecharNavegador();
	}

	@Test
	public void validarTitle() throws IOException {
		metodos.validarTitle("KaBuM! | Maior E-commerce de Tecnologia e Games da América Latina");
		metodos.evidenciarTeste("CT01 Validando titulo");
	}

	@Test
	public void textoProduto() throws IOException {
		metodos.escrever(pesquisar, "smart tv");
		metodos.evidenciarTeste("CT02 Buscar Texto");

	}

	@Test
	public void buscarProduto() throws IOException {
		metodos.escrever(pesquisar, "Smart TV LED LG 75 Polegadas HD 75UP801C");
		metodos.evidenciarTeste("CT03 Buscar Produto");

	}
}
