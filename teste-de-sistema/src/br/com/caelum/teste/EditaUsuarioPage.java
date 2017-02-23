package br.com.caelum.teste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditaUsuarioPage {

	private WebDriver driver;

	public EditaUsuarioPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void alterarUsuario(String nome, String email) {
		WebElement txtNome = driver.findElement(By.name("usuario.nome"));
		WebElement txtEmail = driver.findElement(By.name("usuario.email"));
		
		txtNome.clear();
		txtEmail.clear();

		txtNome.sendKeys(nome);
		txtEmail.sendKeys(email);

		txtNome.submit();
	}

}
