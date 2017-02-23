import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.com.caelum.teste.UsuariosPage;

public class EditaUsuarioTest {

	private WebDriver driver;
	private UsuariosPage usuariosPage;

	@Before
	public void inicializa() {
		driver = new FirefoxDriver();
		driver.get("http://localhost:8080/apenas-teste/limpa");
		usuariosPage = new UsuariosPage(driver);
		usuariosPage.visita();
		usuariosPage.novo().cadastra("Paulo Sérgio", "paulo@sergio.com.br");
	}
	
	@Test
	public void editarUsuario() {
		usuariosPage.visita();
		usuariosPage.edita(1).alterarUsuario("Paulo Henrique Ganso", "phganso@santos.com.br");
		assertFalse(driver.getPageSource().contains("Paulo Sérgio"));
		assertFalse(driver.getPageSource().contains("paulo@sergio.com.br"));
		assertTrue(driver.getPageSource().contains("Paulo Henrique Ganso"));
		assertTrue(driver.getPageSource().contains("phganso@santos.com.br"));
	}
	
}
