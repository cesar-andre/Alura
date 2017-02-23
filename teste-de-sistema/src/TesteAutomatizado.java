import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.com.caelum.teste.UsuariosPage;

public class TesteAutomatizado {
	private WebDriver driver;
	private UsuariosPage usuarios;

	@Before
	public void inicializa() {
		driver = new FirefoxDriver();
		usuarios = new UsuariosPage(driver);
	}

	@After
	public void finaliza() {
		driver.close();
	}

	@Test
	public void deveAdicionarUmUsuario() {
		usuarios.visita();
		usuarios.novo().cadastra("Ronaldo", "ronaldo@terra.com.br");
		assertTrue(usuarios.existeNaListagem("Ronaldo", "ronaldo@terra.com.br"));
	}

	@Test
	public void naoDeveAdicionarUmUsuarioSemNome() {
		usuarios.visita();
		usuarios.novo().cadastra("", "ronaldo@terra.com.br");
		assertTrue(driver.getPageSource().contains("Nome obrigatorio!"));
	}

	@Test
	public void naoDeveAdicionarUmUsuarioSemNomeOuEmail() {
		usuarios.visita();
		usuarios.novo().cadastra("", "");
		assertTrue(driver.getPageSource().contains("Nome obrigatorio!"));
		assertTrue(driver.getPageSource().contains("E-mail obrigatorio!"));

	}
	
	@Test
	public void deveDeletarUmUsuario() {
		deveAdicionarUmUsuario();
		usuarios.deletaUsuarioNaPosicao(1);
		assertFalse(usuarios.existeNaListagem("Ronaldo Luiz de Albuquerque", "ronaldo2009@terra.com.br"));
		
		
	}
}
