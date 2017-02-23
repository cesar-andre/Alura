import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.com.caelum.teste.LeiloesPage;
import br.com.caelum.teste.NovoLeilaoPage;
import br.com.caelum.teste.UsuariosPage;

public class LeiloesSystemTest {
	private WebDriver driver;
	private LeiloesPage leiloes;

	@Before
	public void inicializa() {
		driver = new FirefoxDriver();
		leiloes = new LeiloesPage(driver);

		UsuariosPage usuarios = new UsuariosPage(driver);
		usuarios.visita();
		usuarios.novo().cadastra("Paulo Henrique", "paulo@henrique.com.br");
	}

	@Test
	public void deveCadastrarUmLeilao() {
		leiloes.visita();
		NovoLeilaoPage novoLeilao = leiloes.novo();
		novoLeilao.preenche("Geladeira", 123, "Paulo Henrique", true);
		assertTrue(leiloes.existe("Geladeira", 123, "Paulo Henrique", true));

	}

	@Test
	public void validaLeilaoSemNomeOuSemValor() {
		leiloes.visita();
		NovoLeilaoPage novoLeilao = leiloes.novo();
		novoLeilao.preenche("", 0, "Paulo Henrique", true);
		assertTrue(driver.getPageSource().contains("Nome obrigatorio!"));
		assertTrue(driver.getPageSource().contains("Valor inicial deve ser maior que zero!"));

	}
}
